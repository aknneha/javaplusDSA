

import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ActionListener
{
    TextArea ta;
    TextField tf;
    Label l;
    Button b;
    
    MyFrame()
    {
        super("TextArea Demo");
        
        l=new Label("No Text Entered ");
        ta=new TextArea(10,30);//just like a notepad with scrollbar
        tf=new TextField(20);
        b=new Button("Click");
        
        setLayout(new FlowLayout());
        
        add(ta);
        add(l);
        add(tf);
        add(b);
        b.addActionListener(this);
        
        
    }
    
    public void actionPerformed(ActionEvent ae)
    {
       // l.setText(ta.getSelectedText());//text in text area gets printed in label IG
       
        ta.insert(tf.getText(), ta.getCaretPosition());
        //insert takes 2 things one is string ->getText()and a postion--->getCaretPosition()
        //tatefield text is added in textarea 

        //ta.append(tf.getText());//enetr some text inside the text field and that text should  be included in text area
        
    }
    
    
}

public class textarea 
{
    public static void main(String[] args) 
    {
        MyFrame f=new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);
        
              
    }
}