import java.awt.*;
import java.awt.event.*;
import java.applet.Applet.*;

public class JIP3 extends Applet implements ActionListener {
	Button b1, b2, b2;
	TextField txt1, txt2, txt3;

	public void init() {
		setSize(200, 150);
		add(new Label("x =     "));
		txt1 = new TextField(15);
		add(txt1);
		add(new Label("y =     "));
		txt2 = new TextField(15);
		add(txt2);
		add(new Label("x + y =     "));
		txt3 = new TextField(15);
		add(txt3);

		b1 = new Button("加算");
		b2 = new Button("消去");
		b3 = new Button("終了")；
		add(b1);
		add(b2);
		add(b3);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		double x, y, z;
		String s;
		if(e.getSource() == b3) {
			System.exit(0);
		}
		if(e.getSource() == b2) {
			txt1.setText(" ");
			txt2.setText(" ");
			txt3.setText(" ");
		}

		if(e.getSource() == b1) {
			x = Double.valueOf(txt1.getText()).doubleValue();
			y = Double.valueOf(txt2.getText()).doubleValue();
			z = x + y;
			s = Double.toString(z);
			txt3.setText(s);
		}
	}
}
