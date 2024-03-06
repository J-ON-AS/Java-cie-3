import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.FileOutputStream;

public class Main {
public static void main(String [] args)throws IOException{
      FileOutputStream f = new FileOutputStream("../h1.txt");
      ByteArrayOutputStream bout = new ByteArrayOutputStream();
      String s = "VR bohot bohot bohot sundar ha";
      byte b[] = s.getBytes();
      bout.write(b);
      bout.writeTo(f);
      bout.close();
}
}