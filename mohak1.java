import java.awt.*;

public class mohak1 extends Frame
{
    Label l;
    TextField tf;
    Button b;
    
    public mohak1()
    {
        super("My App neha");
        
        setLayout(new FlowLayout());
        
        l=new Label("Name");
        tf=new TextField(20);
        b=new Button("OK");
        
        add(l);
        add(tf);
        add(b);   
        
    }  
    public static void main(String[] args) 
    {
        mohak1 f=new mohak1();
        f.setSize(400,400);
        f.setVisible(true);
    } 
}