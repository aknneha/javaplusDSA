import java.awt.*;
public class p1{
    public static void main (String []args){
        Frame f= new Frame("FIRST APP");
        f.setLayout(new FlowLayout());
        
        Button b = new Button("OK");
        Label l = new Label("NAME");
        TextField tf = new TextField(20);

        f.add(b);
        f.add(l);
        f.add(tf);

        f.setSize(300,300);
        f.setVisible(true);
    }}

       