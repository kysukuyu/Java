import java.awt.*;

public class java77{
	static Frame frm = new Frame("java77");
	static List lst = new List();
	public static void main(String[] args) {
		frm.setLayout(null);
		frm.setSize(200,160);
		lst.setBounds(50,50,100,60);
		lst.add("小1");
		lst.add("小2");
		lst.add("小3");
		lst.add("小4");
		lst.add("小5");
		lst.add("小6");
		lst.select(0);
		frm.add(lst);
		frm.setVisible(true);
	}
}
