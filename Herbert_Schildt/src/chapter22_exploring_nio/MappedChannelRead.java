package chapter22_exploring_nio;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;

public class MappedChannelRead {

    public static void main(String[] args) {

        try ( FileChannel fChan = (FileChannel) Files.newByteChannel(Path.of("test.txt")))
        {
            long fSize = fChan.size();

            MappedByteBuffer mBuf = fChan.map(FileChannel.MapMode.READ_ONLY, 0, fSize);

            for(int i=0; i< fSize; i++) System.out.print((char) mBuf.get());
            System.out.println();
        }catch (IOException ioe) {
            System.out.print("I/O Error: " + ioe);
        } catch (InvalidPathException ie) {
            System.out.print("Path Error: " + ie);
        }



    }


}
