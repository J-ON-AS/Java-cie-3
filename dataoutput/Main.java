import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class Main {
public static void main(String [] args) throws IOException{
      FileOutputStream f = new FileOutputStream("../h1.txt");
      DataOutputStream dout = new DataOutputStream(f);

      String s = "VR sundar ha";
      dout.writeChars(s);
      dout.flush();
      dout.close();
}
}