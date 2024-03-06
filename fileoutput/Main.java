import java.io.FileOutputStream;
public class Main {
public static void main(String [] args){
      try{FileOutputStream f = new FileOutputStream("../h1.txt");
      String s = "Kumar";
      byte b[] = s.getBytes();
      f.write(b);
      f.close();}
      catch(Exception e){
        e.printStackTrace();
      }
}
}