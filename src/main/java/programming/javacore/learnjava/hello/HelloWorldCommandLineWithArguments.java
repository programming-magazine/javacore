package programming.javacore.learnjava.hello;

import java.text.MessageFormat;

public class HelloWorldCommandLineWithArguments {

	public static void main(String[] args) {
		if (args.length !=1) {
			System.err.println("Usage:  HelloWorldCommandLineWithArguments <NAME>");
		}
		
		System.out.println(MessageFormat.format("Hello {0}, Welcome to java", args[0]));
	}
}


