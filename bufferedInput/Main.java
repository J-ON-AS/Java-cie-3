import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.FileInputStream;
public class Main {
public static void main(String [] args) throws IOException{
     FileInputStream f = new FileInputStream("../h1.txt");
     BufferedInputStream buf = new BufferedInputStream(f);
     int i = 0;
     while((i=buf.read())!= -1){
      System.out.print((char)i);
     }
}
}