import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame implements ActionListener
{
    private JLabel l;
    private JTextField t1, t2, t3;
    private JButton b;

    public MyFrame()
    {
    	this.setTitle("My Calculator");
        this.setLayout(new GridLayout(5, 2));

        l = new JLabel("Enter First Number: ");
        this.add(l);

        t1 = new JTextField();
        this.add(t1);

        l = new JLabel("Enter Second Number: ");
        this.add(l);

        t2 = new JTextField();
        this.add(t2);

        String str[] = {"ADD", "SUB", "MUL", "DIV"};
        for (int i = 0; i < str.length; i++)
        {
            b = new JButton(str[i]);
            this.add(b);
            b.addActionListener(this);
        }

        l = new JLabel("RESULT");
        this.add(l);

        t3 = new JTextField();
        this.add(t3);

        t3.setEditable(false);

        this.setVisible(true);
        this.setSize(300, 200);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        int x = Integer.parseInt(t1.getText());
        int y = Integer.parseInt(t2.getText());
        double z;

        String caption = e.getActionCommand();

        switch(caption)
        {
            case "ADD": z = x + y;
                break;

            case "SUB": z = x - y;
                break;

            case "MUL": z = x * y;
                break;

            case "DIV": z = x / (double) y;
                break;

            default: z = 0;
                break;
        }

        //t3.setText(z+"");
        t3.setText(Double.toString(z));
    }
}

class MyTextField
{
    public static void main(String[] args)
    {
        MyFrame f = new MyFrame();
    }
}
