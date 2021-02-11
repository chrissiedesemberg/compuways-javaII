package lesson4.Lesson4_3;

public class Main {
  public static void main(String[] args) {
    
      PeerSingleton peerList01 =  PeerSingleton.getInstance();
      PeerSingleton peerList02 =  PeerSingleton.getInstance();
      int i;
      
      for (String hostName: peerList01.getHostNames()) {
          System.out.println("Host : " + hostName);}
      
      for (String hostName: peerList02.getHostNames()) {
          System.out.println("Host : " + hostName);}
     
  }  
}
