
import java.awt.*;

public class mohak extends Frame
{
    Label l;
    TextField tf;
    Button b;
    
    public mohak()
    {
        super("My App");
        
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
        mohak f=new mohak();
        f.setSize(400,400);
        f.setVisible(true);
    } 
}