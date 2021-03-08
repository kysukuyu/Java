import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;
public class java81 extends JPanel {
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			Random ran = new Random();
			for (int i=0; i<50; i++){
				int x1 = ran.nextInt(620);
				int y1 = ran.nextInt(520);
				int x2 = ran.nextInt(360);
				int y2 = ran.nextInt(260);
				if(x1 > x2){
					int tmp = x1; x1 = x2; x2 = tmp;
				}
				if(y1 > y2){
					int tmp = y1; y1 = y2; y2 =tmp;
				}
				g.drawRect(x1,y1,(x2-x1),(y2-y1));
			}
		}
		public static void main(String[] args){
			JFrame frm = new JFrame("java81");
			Container ct = frm.getContentPane();
			ct.add(new java81());
			frm.setSize(650,200);
			frm.setDefaultCloseOperation(frm.EXIT_ON_CLOSE);
			frm.setVisible(true);
	}
}
