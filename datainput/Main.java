import java.io.DataInputStream;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {
public static void main(String [] args) throws IOException{
      InputStream f = new FileInputStream("../h1.txt");
      DataInputStream din = new DataInputStream(f);
      int count = f.available();
      byte b[] = new byte[count];
      din.read(b);
      for(byte bt : b){
        char k =  (char) bt;
        System.out.print(k +"-");
      }            
}
}