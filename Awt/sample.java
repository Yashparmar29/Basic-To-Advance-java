import java.awt.*;
import java.awt.event.*;
import java.util.*;

class method extends Frame implements ActionListener
{
    Label lbl_id,lbl_name,lbl_sub,lbl_mark;
    TextField txt_name,txt_id,txt_sub,txt_mark;
    Button btn_enter;

    method()
    {
        super("User Information");
        this.setLayout(new FlowLayout());
        this.setSize(400,400);

        lbl_id = new Label("Id :- ");
        add(lbl_id);
        txt_id = new TextField(5);
        add(txt_id);

        lbl_name = new Label("Name :- ");
        add(lbl_name);
        txt_name = new TextField(5);
        add(txt_name);

        lbl_sub = new Label("Subject :- ");
        add(lbl_sub);
        txt_sub = new TextField(5);
        add(txt_sub);

        lbl_mark = new Label("mark :- ");
        add(lbl_mark);
        txt_mark = new TextField(5);
        add(txt_mark);

        btn_enter = new Button("Enter");
        add(btn_enter);
        btn_enter.addActionListener(this);

        this.setVisible(true);

        this.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        }
        );
    }
    public void actionPerformed(ActionEvent ae)
    {
        String id = txt_id.getText();
        String name = txt_id.getText();
        String sub = txt_sub.getText();
        String mark = txt_mark.getText();
        
        System.out.println("Student Id :- " + id);
        System.out.println("Student Name :- " + name);
        System.out.println("Subject :- " + sub);
        System.out.println("Mark :- " + mark);

    }
}
public class sample
{
    Scanner sc = new Scanner(System.in);
    String ch;
    void display()
    {
        System.out.print(" Enter next subject marks or not :- ");
        ch = sc.next();
        if(ch.equalsIgnoreCase("yes"))
        {
            new method();
        }
        else if(ch.equalsIgnoreCase("not")) 
        {
            System.exit(0);    
        }
        else
        {
            System.out.println("Enter right choice......");
        }
    }
    public static void main(String[] args)
    {
        method m = new method();
        new sample().display();   
    }
}