package net.coolblossom.lycee.practice.lesson2;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MainProgram {

	public static void main(final String[] args) {

		// create window component with frame
		final Frame frame = new Frame();

		// set window location and size
		frame.setLocation(100, 50);
		frame.setSize(500, 500);

		// entry window event handler
		frame.addWindowListener(new WindowListener() {

			@Override
			public void windowOpened(final WindowEvent e) {
				System.out.println(e.paramString());
			}

			@Override
			public void windowIconified(final WindowEvent e) {
				System.out.println(e.paramString());
			}

			@Override
			public void windowDeiconified(final WindowEvent e) {
				System.out.println(e.paramString());
			}

			@Override
			public void windowDeactivated(final WindowEvent e) {
				System.out.println(e.paramString());
			}

			@Override
			public void windowClosing(final WindowEvent e) {
				System.out.println(e.paramString());
				e.getWindow().dispose();
			}

			@Override
			public void windowClosed(final WindowEvent e) {
				System.out.println(e.paramString());
			}

			@Override
			public void windowActivated(final WindowEvent e) {
				System.out.println(e.paramString());
			}
		});

		// show window
		frame.setVisible(true);

	}
}
