package oca.capture01.staticimport;

import static java.lang.System.out;

public class StaticOutput implements StaticPrintable {
	
	@Override
	public void out() {
		out.println("Static import");
	}

}
