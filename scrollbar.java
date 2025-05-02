import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements AdjustmentListener
{
    Scrollbar red,green,blue;
    TextField tf;
    
    public MyFrame()
    {
        super("Scroll bar demo");
        
        red=new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,255);
        blue=new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,255);//256 colours of red
        green=new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,255);//(orientation,value,visible,min,max)-->constructor
        tf=new TextField(20);//20 size
        
        tf.setBounds(50,50,300,50);
        red.setBounds(50,150,300,30);
        blue.setBounds(50,200,300,30);
        green.setBounds(50,250,300,30);
        
        
        setLayout(null);//we deciding our own layout
        add(tf);
        add(red);
        add(blue);
        add(green);
        
        red.addAdjustmentListener(this);
        blue.addAdjustmentListener(this);
        green.addAdjustmentListener(this);
    }

    @Override
    public void adjustmentValueChanged(AdjustmentEvent e) {
        tf.setBackground(new Color(red.getValue(),blue.getValue(),green.getValue()));//colour is implemented
  
    }
}
public class scrollbar {

    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);
        // TODO code application logic here
    }
    
}