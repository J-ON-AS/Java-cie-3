import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.FileInputStream;
public class Main {
public static void main(String [] args) throws  IOException{
    FileInputStream f = new FileInputStream("../h1.txt");
    byte bt[] = new byte[f.available()];
    f.read(bt);
    ByteArrayInputStream b = new ByteArrayInputStream(bt);
    int i = 0;
    while((i=b.read())!= -1){
      System.out.print((char)i);
    }
    b.close();
}
}