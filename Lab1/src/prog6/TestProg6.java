package prog6;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

public class TestProg6 {

	@Test
	public void removeDups() {
		
		String[] testData = {"horse", "dog", "cat", "horse","dog"};
		String[] result = Prog6.removeDups(testData);
		String[] expected = {"horse", "cat", "dog"};
		//assertTrue(expected.equals(result));
		//Assert.assertEquals(expected.equals(result));
		Assert.assertTrue(Arrays.equals(expected, result));
		
	}

}
