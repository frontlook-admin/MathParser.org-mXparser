package mxparser.helloworld;

import org.mariuszgromada.math.mxparser.*;

public class HelloWorld {
	public static void main(String[] args) {
		Expression eh = new Expression("5^2 * 7^3 * 11^1 * 67^1 * 49201^1");
		Expression ew = new Expression("71^1 * 218549^1 * 6195547^1");
		String h = mXparser.numberToAsciiString( eh.calculate() );
		String w = mXparser.numberToAsciiString( ew.calculate() );
		mXparser.consolePrintln(h + " " + w);
	}
}

