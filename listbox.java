//ItemListener ->select an item
//ActionListener ->select an item and hit enter


import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ItemListener,ActionListener
{
    List l;//listbox
    Choice c;//for dropdown
    TextArea ta;
    
    MyFrame()
    {
        super("ListBox Demo");
        
        l=new List(4,true);//4-->4 items will be selected.true-->multiple items can be selected
        c=new Choice();
        ta=new TextArea(20,30);//20 lines and 30 alphabets
        
        l.add("Monday");
        l.add("TuesDay");
        l.add("Wednesday");
        l.add("Thursday");
        l.add("Friday");
        l.add("Saturday");
        l.add("Sunday");
        
        c.add("Juanuary");
        c.add("February");
        c.add("March");
        c.add("April");
        
        setLayout(new FlowLayout());
        add(l);
        add(c);
        add(ta);
        
        l.addItemListener(this);
        c.addItemListener(this);
        l.addActionListener(this);
        
    }
    
    public void itemStateChanged(ItemEvent ie)
    {
        if(ie.getSource()==l)//reference of component which was selected
            ta.setText(l.getSelectedItem());
        else
            ta.setText(c.getSelectedItem());
    }//one item is selected at a time 
    
    public void actionPerformed(ActionEvent ae)
    {
        String list[]=l.getSelectedItems();
        
        String txt="";
        
        for(String x:list)
            txt+=x+"\n";//all the selected item
        
        ta.setText(txt);
        
        l.addItem(txt);
    }
    
}

public class listbox
{
    public static void main(String[] args) 
    {
        MyFrame f=new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);
    }   
}