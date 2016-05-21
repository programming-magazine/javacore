package programming.javacore.learnjava.hello;

import java.text.MessageFormat;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloWorldGui {

	public static void main(String[] args) {
		if (args.length !=1) {
			System.err.println("Usage:  HelloWorldCommandLineWithArguments <NAME>");
		}
		
		JFrame frame = new JFrame( "Hello, Java!" );
        JLabel label = new JLabel(MessageFormat.format("Hello {0}, Welcome to java", args[0]), JLabel.CENTER );
        frame.add( label );
        frame.setSize( 300, 300 );
        frame.setVisible( true );
	}
}


