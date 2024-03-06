import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MyFrame extends JFrame implements MouseListener,MouseMotionListener{
  JLabel label ;
  MyFrame(){
    label = new JLabel();
    label.setBounds(0,0,100,100);
    label.setBackground(Color.PINK);
    label.setOpaque(true);
    label.addMouseListener(this);
    label.addMouseMotionListener(this);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(250,100);
    this.setLayout(null);
    this.add(label);
    this.setVisible(true);

  }
  int i = 0;
  public void mouseDragged(MouseEvent e){
    i= i+1;
    System.out.println(i);
  }
  public void mouseMoved(MouseEvent e){
    i= i-1;
    System.out.println(i);

  }
  public void mouseEntered(MouseEvent e){
    System.out.println("Mouse entered into the label");
  }
  public void mouseExited(MouseEvent e){
    System.out.println("Mouse exited into the label");
    
  }
  public void mousePressed(MouseEvent e){
   label.setBackground(Color.BLUE);
   
  }
  public void mouseReleased(MouseEvent e){
    label.setBackground(Color.PINK);

  }
  public void mouseClicked(MouseEvent e){

  }
}
