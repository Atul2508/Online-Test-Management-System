package Code;

import java.awt.event.*;
import javax.swing.*;
public class Online extends JFrame implements ActionListener {

	
	
JLabel I;
JRadioButton jb[]= new JRadioButton[5];
JButton b1, b2;
ButtonGroup bg;
int count= 0, current= 0, x=1, y= 1, now= 0;
int m[]= new int[10];

Online  (String s) {
	super(s);
	I= new JLabel();
	add(I);
	bg= new ButtonGroup();
	for (int i=0; i<5; i++) {
		jb[i] =new JRadioButton();
		add(jb[i]);
	}
	
	b1=new JButton("Next");
	b2=new JButton("Save");
	b1.addActionListener(this);
	b2.addActionListener(this);
	
	add(b1);
	add(b2);
	set ();
	I.setBounds(40, 40, 450, 200);
	
	
								
	jb[0].setBounds(50, 80, 100, 200);
	jb[1].setBounds(50, 110, 100, 20);
	jb[2].setBounds(50, 140, 100, 20);
	jb[3].setBounds(50, 170, 100, 20);
	b1.setBounds(100, 240, 100, 30);
	b2.setBounds(270, 240, 100, 30);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setLayout(null);
	setLocation(250, 100);
	setVisible(true);
	setSize(600,350);
}
	public void actionPerformed1(ActionEvent e) {
		if(e.getSource()==b1) {
			if(check())
				count= count+1;
			current++;
			set();
			if (current==9) {
				b1.setEnabled(false);
				b2.setText("Result");
			}
		}
		
		if(e.getActionCommand().equals("Save")) {
			JButton bk= new JButton ("Save"+x);
			bk.setBounds(480,20+30*x, 100, 30);
			add(bk);
			bk.addActionListener(this);
			m[x]= current;
			x++;
			current++;
			set();
			if(current==9)
				b2.setText("Result");
			setVisible(false);
			setVisible(true);
		}
		
		for (int  i=0, y=1; i<x; i++, y++) {
			if(e.getActionCommand().equals("Save"+y)) {
				if(check())
					count=count+1;
				now=current;
				current=m[y];
				set();
				((JButton)e.getSource()).setEnabled(false);
				current= now;
			}
		}
		if(e.getActionCommand().equals("Result")) {
			if(check())
				count= count+1;
			current++;
			JOptionPane.showMessageDialog(this, "correcct ans="+ count);
			System.exit(0);
		}
		
		
	}
	
	void set() {
		jb[4].setSelected(true);
		if (current==0) {
			I.setText("Question 1: What is the capital of India ?" );
			jb[0].setText("Mumbai");
			jb[1].setText("Kolkata");
			jb[2].setText("Delhi");
			jb[3].setText("Lucknow");
		}
		
		
		if(current==1) {
			I.setText("Question 2: What is the name of the national Sports of India ?");
				jb[0].setText("Cricket");
				jb[1].setText("Hockey");
				jb[2].setText("Chess");
				jb[3].setText("Football");
		}
	
		if (current==2) {
			I.setText("Question 3: What is the currency of India ?" );
			jb[0].setText("Rupees");
			jb[1].setText("Dollar");
			jb[2].setText("Euro");
			jb[3].setText("Pound");
		}
		
		if (current==3) {
			I.setText("Question 4: Who is the Prime Minister of India ?" );
			jb[0].setText("Manmohan Singh");
			jb[1].setText("Narendra Modi");
			jb[2].setText("APJ Abdul Kalam");
			jb[3].setText("Rajiv Gandhi");
		}
	
		if (current==4) {
			I.setText("Question 5: When is republic day celebrated in India ?" );
			jb[0].setText("15 August");
			jb[1].setText("26 January");
			jb[2].setText("10 February");
			jb[3].setText("25 December");
		}
		
		if (current==5) {
			I.setText("Question 6: What is the economic capital of India ?" );
			jb[0].setText("Mumbai");
			jb[1].setText("Kolkata");
			jb[2].setText("Amritsar");
			jb[3].setText("Lucknow");
		}
		
		if (current==6) {
			I.setText("Question 7: What is the national animal of India ?" );
			jb[0].setText("Tiger");
			jb[1].setText("Elephant");
			jb[2].setText("Wolf");
			jb[3].setText("Bear");
		}
		
		if (current==7) {
			I.setText("Question 8: When did india got Independence ?" );
			jb[0].setText("1945");
			jb[1].setText("1947");
			jb[2].setText("1991");
			jb[3].setText("1950");
		}
		
		if (current==8) {
			I.setText("Question 9: Which country is not the neighbour of India ?" );
			jb[0].setText("Nepal");
			jb[1].setText("Pakistan");
			jb[2].setText("Burma");
			jb[3].setText("Iran");
		}
		if (current==9) {
			I.setText("Question 9: Which initiative is not started by India ?" );
			jb[0].setText("Make in India");
			jb[1].setText("Sab Padho Sab Badho");
			jb[2].setText("Swachh Bharat Abhiyan");
			jb[3].setText("Black Lives Matter");
		}
		
		I.setBounds(30, 40, 450, 20);
		for(int i=0,j=0; i<=90; i+=30,j++)
			jb[j].setBounds(50, 80+i, 200, 20);
	}
	
	boolean check() {
		if(current==0)
			return(jb[2].isSelected());
		if(current==1)
			return(jb[0].isSelected());
		if(current==2)
			return(jb[0].isSelected());
		if(current==3)
			return(jb[1].isSelected());
		if(current==4)
			return(jb[1].isSelected());
		if(current==5)
			return(jb[0].isSelected());
		if(current==6)
			return(jb[0].isSelected());
		if(current==7)
			return(jb[1].isSelected());
		if(current==8)
			return(jb[3].isSelected());
		if(current==9)
			return(jb[3].isSelected());
		return rootPaneCheckingEnabled;
		

		
	}
	
	public static void main(String args[]) {
	new Online("Online Test");	
	
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
		
	
}











