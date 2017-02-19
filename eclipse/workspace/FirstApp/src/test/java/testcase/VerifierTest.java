package testcase;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import util.Verifier;

public class VerifierTest {

	private String a;
	private String b;
	
	@Before
	public void setUp() throws Exception {
		a = "a";
		b = "a";
	}

	@Test
	public void test() {
		Verifier verifier = new Verifier();
		assertTrue(true==verifier.isIdentical(a, b));
	}

}
