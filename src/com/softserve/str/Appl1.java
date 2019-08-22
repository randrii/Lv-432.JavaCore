package com.softserve.str;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Appl1 {
	public static void main(String[] args) {
		//String pattern = "[a-z]+";
		//String pattern = "[ Na-z]+";
		//String pattern = "Now is the time";
		//String text = "Now is the time";
		//
		//String pattern = "<.+>";
		//String pattern = "<[^>]+>";
		//String pattern = ">[^<]+<";
		//String pattern = "<([^>]+)>[^<]+</\\1>";
		//String text = "<p><b>Beginning with bold text</b> next, <span>text</span> body, <i>italic text</i> end of text.</p>";
		//
		//String pattern = "\\w+(\\.\\w+)*@(\\w+\\.)+\\w{2,}";
		//String text = "aaa.bbb.b@gmail.com aaa@ukr.net bbb@i.ua cc@ua ddd.@ms.com";
		//
		String pattern = "(\\d{1,3}')*\\d{1,3}\\.\\d{2}";
		String text = "price is $2'111'201.12 text";
		//
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(text);
		//
		if (m.matches()) {
			System.out.println("text correspond pattern");
		} else {
			System.out.println("text NOT correspond pattern");
		}
		m.reset();
		//
		List<String> list = new ArrayList<>();
		while (m.find()) {
			//System.out.print(text.substring(m.start(), m.end()) + "*");
			//System.out.print(text.substring(m.start() + 1, m.end() - 1).trim() + "*");
			list.add(text.substring(m.start(), m.end()));
		}
		System.out.println("Result: " + list);
		//
		String price = list.get(0);
		price = price.replace("'", "");
		System.out.println("old Price: " + price);
		double myPrice = Double.parseDouble(price);
		System.out.println("new Price: " + (myPrice+1) );
	}
}