package lab02;

import static org.junit.Assert.*;

import org.junit.Test;

public class CheckminTest {

	@Test
	public void testChmin() {
		Checkmax a= new Checkmax();
		
		int acc_out=a.minno(2, 3);
		int exp_out=2;
		
		assertEquals(acc_out,exp_out);
		
		
	}

}
