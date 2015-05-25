package oca.capture01.staticimport;

import org.junit.Test;

public class StaticOutTest {

	@Test
	public void staticImportTest() {
		StaticPrintable printer = new StaticOutput();
		printer.out();
	}
	
	@Test
	public void nonStaticImportTest() {
		StaticPrintable printer = new NonStaticOutput();
		printer.out();
	}

}
