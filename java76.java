import java.awt.*;
public class java76{
	static Frame frm = new Frame("demo305");
	static Button btn = new Button("請按我");
	public static void main(String[] args) {
		frm.setLayout(new FlowLayout());
		frm.setSize(200,120);
		frm.setBackground(Color.yellow);
		frm.add(btn);
		frm.setVisible(true);
	}
}
