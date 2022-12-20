package com.callbacks;

public class Program {

	public static void main(String[] args) {

		// Simple Consumer
		Processor process = new Processor();

		OnEventListener listener = new Callback("Simple");
		process.registerOnEventListener(listener);
		process.run();

		/// Multi Consumers

		ProcessorMulti process2 = new ProcessorMulti();

		OnEventListener listener1 = new Callback("Mercury");
		process2.addOnEventListener(listener1);

		OnEventListener listener2 = new Callback("Venus");
		process2.addOnEventListener(listener2);

		OnEventListener listener3 = new Callback("Earth");
		process2.addOnEventListener(listener3);
		process2.run();
		
		process2.removeOnEventListener(listener2);
		process2.run();
	}

}
