import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class java79{
	static JFrame jfrm = new JFrame("java79");
	static Container ct = jfrm.getContentPane();
	static JTextField tf1 = new JTextField("歡迎");
	static JTextField tf2 = new JTextField("光臨");
	static JButton btn = new JButton("Change");
	
	static class myListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			String str1 = tf1.getText();
			String str2 = tf2.getText();
			if  (e.getSource() == btn){
				tf1.setText(str2);
				tf2.setText(str1);
			}
		}
	}
	
	public static void main(String[] args){
		ct.setLayout(null);
		tf1.setBounds(50,30,100,20);
		tf2.setBounds(50,80,100,20);
		btn.setBounds(50,140,100,30);
		
		
		ct.add(tf1);
		ct.add(tf2);
		ct.add(btn);
		
		btn.addActionListener(new myListener());
				
		jfrm.setSize(260,220);
		jfrm.setDefaultCloseOperation(jfrm.EXIT_ON_CLOSE);
		jfrm.setVisible(true);
	}
}