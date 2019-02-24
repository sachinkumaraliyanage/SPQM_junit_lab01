package lab02;

import static org.junit.Assert.*;

import org.junit.Test;

public class CheckmaxTest {

	@Test
	public void testChmax() {
		Checkmax a= new Checkmax();
		
		int acc_out=a.chmax(2, 3);
		int exp_out=3;
		
		assertEquals(acc_out,exp_out);
		
		
	}
	
	
	

}
