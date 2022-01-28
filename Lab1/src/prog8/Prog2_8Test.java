package prog8;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;
import prog6.Prog6;

public class Prog2_8Test {

	@Test
public void arrayOfInts() {
		
		int[] testData = {2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};
		int result = Prog8.min(testData);
		int expected = -22;
		//assertTrue(expected.equals(result));
		//Assert.assertEquals(expected.equals(result));
		assertTrue(expected == result);
		
	}

}
