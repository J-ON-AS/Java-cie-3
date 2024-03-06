import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class Main {
public static void main(String [] args) throws IOException{
      FileOutputStream f = new FileOutputStream("../h1.txt");
      BufferedOutputStream b = new BufferedOutputStream(f);

      String s = "VR bohot sundar ha";
      byte bt[] = s.getBytes();
      b.write(bt);
      b.flush();
      b.close();
} 
}