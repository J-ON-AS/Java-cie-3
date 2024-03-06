import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Myframe extends JFrame implements KeyListener{
  JLabel label;
  JLabel label1;
  Myframe(){
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(200,150);
    this.setLayout(null);
    this.addKeyListener(this);
    label = new JLabel();
    label1 = new JLabel();
    label.setBounds(0,0,100,100);
    label1.setBounds(500,500,100,100);
    label.setOpaque(true);
    label1.setOpaque(true);
    label.setBackground(Color.PINK);
    label1.setBackground(Color.RED);
    this.add(label);
    this.add(label1);
    this.setVisible(true);

  }
  @Override
  public void keyTyped(KeyEvent e) {
   System.out.println(e.getKeyChar());
    // switch (e.getKeyChar()) {
    //   case 'a': label.setLocation(label.getX()-1 , label.getY());       
    //     break;
    //   case 's': label.setLocation(label.getX() , label.getY()+1);       
    //     break;
    //   case 'd': label.setLocation(label.getX()+1 , label.getY());       
    //     break;
    //   case 'w': label.setLocation(label.getX() , label.getY()-1);       
    //     break;
    
    //   default:
    //     break;
    // }
  }
  
  @Override
  public void keyPressed(KeyEvent e) {
    switch (e.getKeyCode()) {
      case 83: label.setLocation(label.getX()-1 , label.getY());       
        break;
      case 68: label.setLocation(label.getX() , label.getY()+1);       
        break;
      case 65: label.setLocation(label.getX()+1 , label.getY());       
        break;
      case 87: label.setLocation(label.getX() , label.getY()-1);       
        break;
    }
    
  }
  
  @Override
  public void keyReleased(KeyEvent e) {
    System.out.println(e.getKeyChar());

  }
  
}
