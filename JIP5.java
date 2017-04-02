// 画像の読み込み、表示

import java.applet.*;
import java.awt.*;
import java.io.*;

public class JIP5 extends Applet {
	Image image;

	public void init() {
		image = getImage(getDocumentBase(), "dog.jpg");
	}

	public void paint(Graphics g) {
		g.drawImage(image, 10, 10, this);
	}
}
