package set;
import javax.swing.*;
import java.awt.event.*;
public class Burger {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lb=new JLabel("Burger:");
		lb.setSize(200,50);
		lb.setLocation(200,0);
		
		JLabel lb2=new JLabel("Extra:");
		lb2.setSize(200,50);
		lb2.setLocation(0,100);
		
		
		JRadioButton rb1=new JRadioButton("Bacon");
		rb1.setSize(200,50);
		rb1.setLocation(0,150);
		
	
		JRadioButton rb2=new JRadioButton("Cheese");
		rb2.setSize(200,50);
		rb2.setLocation(0,200);

		JComboBox cb=new JComboBox();
		
		cb.addItem("Spicy Chicken");
		cb.addItem("Vegeterian");
		cb.addItem("Roast Beef");
		cb.setLocation(250,0);
		cb.setSize(200,50);
		
		
		JTextArea jta=new JTextArea();
		jta.setSize(300,300);
		jta.setLocation(200,100);
		jta.setEnabled(false);
		cb.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
			        if(cb.getSelectedIndex()==0) {
			        	jta.setText("Spicy Chicken\t18.00\n\nTotal\t18.00");
			        	rb1.setEnabled(true);
			        	rb1.setSelected(false);
			        	rb2.setSelected(false);
			        }
			        else if(cb.getSelectedIndex()==1) {
			        	jta.setText("Vegeterian\t15.00\n\nTotal\t15.00");
			        	rb1.setEnabled(false);
			        	rb1.setSelected(false);
			        	rb2.setSelected(false);
			        }
			        else if(cb.getSelectedIndex()==2) {
			        	jta.setText("Roast Beef\t20.00\n\nTotal\t20.00");
			        	rb1.setEnabled(true);
			        	rb1.setSelected(false);
			        	rb2.setSelected(false);
			        }
			        else {
			        	jta.setText("");
			        }
			    }
		});
		
		rb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        if(cb.getSelectedIndex()==0 && rb1.isSelected()) {
		        	jta.setText("Spicy Chicken\t18.00\n+Bacon  3.00\n\nTotal\t21.00");
		        }
		        if(cb.getSelectedIndex()==0 && rb1.isSelected() && rb2.isSelected()) {
		        	jta.setText("Spicy Chicken\t18.00\n+Bacon  3.00\n+Cheese  1.50\n\nTotal\t22.50");
		        }
		        if(cb.getSelectedIndex()==2 && rb1.isSelected()) {
		        	jta.setText("Roast Beef\t20.00\n+Bacon  3.00\n\nTotal\t23.00");
		        }
		        if(cb.getSelectedIndex()==2 && rb1.isSelected()&& rb2.isSelected()) {
		        	jta.setText("Roast Beef\t20.00\n+Bacon  3.00\n+Cheese  1.50\n\nTotal\t24.50");
		        }
			}
		});
		
		rb2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        if(cb.getSelectedIndex()==0 && rb2.isSelected()) {
		        	jta.setText("Spicy Chicken\t18.00\n+Cheese  1.50\n\nTotal\t19.50");
		        }
		        if(cb.getSelectedIndex()==0 && rb1.isSelected() && rb2.isSelected()) {
		        	jta.setText("Spicy Chicken\t18.00\n+Bacon  3.00\n+Cheese  1.50\n\nTotal\t22.50");
		        }
		        if(cb.getSelectedIndex()==1 && rb2.isSelected()) {
		        	jta.setText("Vegeterian\t15.00\n+Cheese  1.50\n\nTotal\t16.50");
		        }
		        if(cb.getSelectedIndex()==2 && rb2.isSelected()) {
		        	jta.setText("Roast Beef\t20.00\n+Cheese  1.50\n\nTotal\t21.50");
		        }
		        if(cb.getSelectedIndex()==2 && rb1.isSelected()&& rb2.isSelected()) {
		        	jta.setText("Roast Beef\t20.00\n+Bacon  3.00\n+Cheese  1.50\n\nTotal\t24.50");
		        }
			}
		});
		
		frame.setLayout(null);
		frame.add(lb);
		frame.add(lb2);
		frame.add(cb);
		frame.add(rb1);
		frame.add(rb2);
		frame.add(jta);
		frame.setVisible(true);
		}
}
