package chapter22_exploring_nio;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class ExplicitChannelWrite {
    public static void main(String[] args) {

        try (FileChannel fChan = (FileChannel) Files.newByteChannel(Path.of("test.txt"), StandardOpenOption.WRITE, StandardOpenOption.CREATE)) {
            ByteBuffer mBuf = ByteBuffer.allocate(26);

            for (int i=0; i < 26; i++)
                mBuf.put((byte)('A' + i));

            mBuf.rewind();

            fChan.write(mBuf);
        } catch (InvalidPathException ipe) {
            System.out.println("Path Error " + ipe);
        } catch (IOException ioe) {
            System.out.println("I/O Error: " + ioe);
            System.exit(1);
        }
    }
}
