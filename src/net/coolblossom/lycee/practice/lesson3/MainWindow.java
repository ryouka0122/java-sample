package net.coolblossom.lycee.practice.lesson3;

import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MainWindow
extends Frame
implements WindowListener
, MouseListener
, MouseMotionListener
, MouseWheelListener
{
	private static final long serialVersionUID = 1L;

	public MainWindow(final int x, final int y, final int width, final int height) {
		super();
		super.setBounds(x, y, width, height);
		super.setTitle("MainWindow powered Lycee-Projects");
		super.addWindowListener(this);
		super.addMouseListener(this);
		super.addMouseWheelListener(this);
	}

	// ====================================================================
	// Window Event Handling Methods
	//
	@Override
	public void windowOpened(final WindowEvent e) {
		; // NO OPERATION
	}

	@Override
	public void windowClosing(final WindowEvent e) {
		e.getWindow().dispose();
	}

	@Override
	public void windowClosed(final WindowEvent e) {
		; // NO OPERATION
	}

	@Override
	public void windowIconified(final WindowEvent e) {
		; // NO OPERATION
	}

	@Override
	public void windowDeiconified(final WindowEvent e) {
		; // NO OPERATION
	}

	@Override
	public void windowActivated(final WindowEvent e) {
		; // NO OPERATION
	}

	@Override
	public void windowDeactivated(final WindowEvent e) {
		; // NO OPERATION
	}


	// ====================================================================
	// Mouse Event Methods
	//
	@Override
	public void mouseClicked(final MouseEvent e) {
		System.out.println(e.paramString());
	}

	@Override
	public void mousePressed(final MouseEvent e) {
		System.out.println(e.paramString());
	}

	@Override
	public void mouseReleased(final MouseEvent e) {
		System.out.println(e.paramString());
	}

	@Override
	public void mouseEntered(final MouseEvent e) {
		System.out.println(e.paramString());
	}

	@Override
	public void mouseExited(final MouseEvent e) {
		System.out.println(e.paramString());
	}

	// ====================================================================
	// Mouse Wheel Event Methods
	//
	@Override
	public void mouseDragged(final MouseEvent e) {
		System.out.println(e.paramString());

	}

	@Override
	public void mouseMoved(final MouseEvent e) {
		System.out.println(e.paramString());

	}

	// ====================================================================
	// Mouse Wheel Event Methods
	//
	@Override
	public void mouseWheelMoved(final MouseWheelEvent e) {
		System.out.println(e.paramString());

	}

}
