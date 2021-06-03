package ru.itis;

public class Replacer {
	public String replace(String text, String source, String target) {
		return text.replaceAll(source, target);
	}
}