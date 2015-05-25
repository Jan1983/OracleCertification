package oca.capture01.staticimport;

public class NonStaticOutput implements StaticPrintable {

	@Override
	public void out() {
		System.out.println("Non static output");
	}


}
