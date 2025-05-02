import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ItemListener{
    Label l;
    Button b;
    Checkbox c1,c2,c3;

    public MyFrame(){
        super("checkbox demo");

    l=new Label("nothing is selected");

    c1=new Checkbox("java");
    c2=new Checkbox("python");
    c3=new Checkbox("c++");

    c1.addItemListener(this);
    c2.addItemListener(this);
    c3.addItemListener(this);


    setLayout(new FlowLayout());

    
    add(l);
    add(c1);
    add(c2);
    add(c3);
    }

    public void itemStateChanged(ItemEvent e){
        String str="";
            
            if(c1.getState())
                str=str+" "+c1.getLabel();
            if(c2.getState())
                str=str+" "+c2.getLabel();
            if(c3.getState())
                str=str+" "+c3.getLabel();
            if(str.isEmpty())
                str="Nothing is Selected";
            
            l.setText(str);
    }
    }
public class p2
{
        
    public static void main(String[] args) 
    {
        MyFrame f=new MyFrame();
        f.setSize(400,400);
        f.setVisible(true);
        
    }   
}
    
