import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TempConversionWindow extends JFrame implements ActionListener{
    private Container pane;
    private JButton CtoF;
    private JButton FtoC;
    private JLabel l;
    private JTextField t;

    public TempConversionWindow(){
	this.setTitle("Temp Converter");
	this.setSize(600,400);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	pane=this.getContentPane();
	pane.setLayout(new FlowLayout());
	CtoF=new JButton("C to F");
	CtoF.addActionListener(this);
	CtoF.setActionCommand("c2f");
	FtoC=new JButton("F to C");
	FtoC.addActionListener(this);
	FtoC.setActionCommand("f2c");
	l=new JLabel(" ");
	t=new JTextField(5);
	pane.add(CtoF);
	pane.add(FtoC);
	pane.add(l);
	pane.add(t);
    }

    public void actionPerformed(ActionEvent e){
	String event=e.getActionCommand();
	int n=Integer.parseInt(t.getText()); 
	if(event.equals("c2f")){
	    l.setText(""+CtoF(n));
	}
	if(event.equals("f2c")){
	    l.setText(""+FtoC(n));
	}
    }

    public static double CtoF(double c){
	return c*9/5+32;
    }

    public static double FtoC(double f){
	return (f-32)*5/9;
    }

}
