package ru.itis;

import com.beust.jcommander.JCommander;

public class Program {
	public static void main(String[] argv) {

		Args args = new Args();

		JCommander.newBuilder()
			.addObject(args)
			.build()
			.parse(argv);

		System.out.println(args.text + " " + args.source + " " + args.target);

		Replacer replacer = new Replacer();
	}
}