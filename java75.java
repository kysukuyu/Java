import java.awt.*;
public class java75{
	static Frame frm = new Frame("demo303");
	public static void main(String[] args) {
		BorderLayout obj = new BorderLayout(4,2);
		frm.setLayout(obj);
		frm.setSize(300,200);
		frm.add(new Button("東"), obj.EAST);
		frm.add(new Button("西"), obj.WEST);
		frm.add(new Button("南"), obj.SOUTH);
		frm.add(new Button("北"), obj.NORTH);
		frm.add(new Button("中"), obj.CENTER);
		frm.setVisible(true);
	}
}
