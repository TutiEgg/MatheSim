package app;

import com.formdev.flatlaf.FlatDarculaLaf;
import gui.MainGUI;

public class DebugMain {
	public static void main(String[] args) {

		FlatDarculaLaf.install();
		//FlatLightLaf.install();

		Control control = new Control();
		MainGUI gui = new MainGUI(control);
	}

}