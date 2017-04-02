// フレーム
import java.awt.*;
import java.awt.event.*;

public class JIP4 extends Frame {
	Button b1, b2, b3;
	TextField txt1, txt2, txt3;

	public static void main(String[] args) {
		JIP4 f = new JIP4("加算フレーム");
		f.init();
		f.show();
	}

	public JIP4(String title) {
		super(title);
		setSize(200, 200);
		setBackGround(Color.white);
	}

	public void init() {
		setLayout(new FlowLayout(FlowLayout.LEFT));
		add(new Label("x =     "));
		txt1 = new TextField(15);
		add(txt1);
		add(new Label("x =     "));
		txt2 = new TextField(15);
		add(txt2);
		add(new Label("x =     "));
		txt3 = new TextField(15);
		add(txt3);
		b1 = new Button("加算");
		b2 = new Button("消去");
		b3 = new Button("終了");
		add(b1);
		add(b2);
		add(b3);
		b1.addActionListener(new Listener1());
		b2.addActionListener(new Listener2());
		b3.addActionListener(new Listener3());
	}

	public class Listener1 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			double x, y, z;
			String s;
			if(e.getSource() == b1) {
				x = Double.valueOf(txt1.getText()).doubleValue();
				y = Double.valueOf(txt2.getText()).doubleValue();
				z = x + y;
				s = Double.toString(z);
				txt3.setText(s);(
	 		}
	 	}
	 }
				
	 public class Listener2 implements ActionListener {
	 	public void actionPerformed(ActionEvent e) {
	 		if(e.getSource() == b2) {
	 			txt1.setText(" ");
	 			txt2.setText(" ");
	 			txt3.setText(" ");
	 		}
	 	}
	 }
				
	 public class Listener3 implements ActionListener {
	 	public void actionPerformed(ActionEvent e) {
	 		if (e.getSource() == b3) {
	 			System.exit(0);
	 		}
	 	}
	}
}