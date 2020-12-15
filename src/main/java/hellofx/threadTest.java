package hellofx;

import java.awt.FileDialog;

import javax.swing.JFrame;

public class threadTest extends Thread {
	public void run(){  
	    JFrame frame = new JFrame();
        System.setProperty("com.apple.macos.use-file-dialog-packages", "true");
        FileDialog fd = new FileDialog(frame, "choose_file", FileDialog.LOAD);
        fd.setVisible(true);
		String filename = fd.getFile();
	  }    
}
