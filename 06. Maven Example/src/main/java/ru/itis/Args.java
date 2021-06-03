package ru.itis;

import com.beust.jcommander.Parameter;

public class Args {
	@Parameter(names = {"--text"})
	public String text;

	@Parameter(names = {"--source"})
	public String source;

	@Parameter(names = {"--target"})
	public String target;
}