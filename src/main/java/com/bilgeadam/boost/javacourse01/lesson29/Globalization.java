package com.bilgeadam.boost.javacourse01.lesson29;

public class Globalization {
	
	public static void main(String[] args) {
		GlobalStrings globalization;
		
		if(args.length==1) {
			globalization = new GlobalStrings(args[0]);
		}
		else if (args.length==2) {
			globalization = new GlobalStrings(args[0],args[1]);
		}
		else {
			globalization = new GlobalStrings();
		}
		
		System.out.println(globalization.getString("Globalization.HELLO")); //$NON-NLS-1$
		System.out.println(globalization.getString("Globalization.HOW_ARE_YOU")); //$NON-NLS-1$
		System.out.println(globalization.getString("Globalization.SPLITTER")); //$NON-NLS-1$
		System.out.println(globalization.getString("Globalization.THANKS")); //$NON-NLS-1$
		System.out.println(globalization.getString("Globalization.SPLITTER")); //$NON-NLS-1$
		System.out.println(globalization.getString("Globalization.BYE")); //$NON-NLS-1$
	}
	
}
