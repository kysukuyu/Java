import javax.swing.*;
public class java80{
	static JFrame frm = new JFrame("java80");
	static JTextArea ta = new JTextArea(200,200);
	static JTabbedPane tp = new JTabbedPane();
	static JPanel p1 = new JPanel();
	static JPanel p2 = new JPanel();
	static JPanel p3 = new JPanel();
	public static void main(String[] args){
		frm.setLayout(null);
		tp.setBounds(50,50,200,200);
		p1.add(ta);
		tp.add("個人學歷",p1);
		tp.add("經歷",p2);
		tp.add("著作",p3);
		frm.add(tp);
		
		frm.setSize(350,350);
		frm.setDefaultCloseOperation(frm.EXIT_ON_CLOSE);
		frm.setVisible(true);
	}
}
