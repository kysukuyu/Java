import java.awt.*;
public class java78{
	static Frame frm = new Frame("java78.java");
	static MenuBar mb = new MenuBar();
	static Menu menu1 = new Menu("File");
	static Menu menu2 = new Menu("Edit");
	static MenuItem mI1_1 = new MenuItem("New");
	static MenuItem mI1_2 = new MenuItem("Save");
	static MenuItem mI2_1 = new MenuItem("copy");
	static MenuItem mI2_2 = new MenuItem("paste");
	static MenuItem mI1_3 = new MenuItem("Exit");
	public static void main(String[] args) {
		mb.add(menu1);
		mb.add(menu2);
		menu1.add(mI1_1);
		menu1.add(mI1_2);
		menu1.addSeparator();
		menu1.add(mI1_3);
		menu1.add(mI2_1);
		menu1.add(mI2_2);
		frm.setSize(200, 160);
		frm.setMenuBar(mb);
		frm.setVisible(true);
	}
}

	