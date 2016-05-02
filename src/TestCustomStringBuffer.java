import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;


public class TestCustomStringBuffer {

	@Test
	public void TestForString() {
		MyStringBuffer b = new MyStringBuffer();
		b.append("Megha");
		b.append("Tyagi");
		String output = b.toString();
		String expectedOutput = "MeghaTyagi";
		Assert.assertEquals(expectedOutput,output);
	}
	
	@Test
	public void TestForStringNotEqual() {
		MyStringBuffer b = new MyStringBuffer();
		b.append("Megha ");
		b.append("Tyagi");
		String output = b.toString();
		String expectedOutput = "MeghaTyagi";
		Assert.assertNotEquals(expectedOutput,output);
	}
	
	@Test
	public void StringCapacityGreaterThanDefault16() {
		MyStringBuffer b = new MyStringBuffer();
		b.append("Megha Tyagi ");
		b.append("Senior Software Engineer");
		String output = b.toString();
		String expectedOutput = "Megha Tyagi Senior Software Engineer";
		
		Assert.assertEquals(expectedOutput,output);
	}
	
	@Test
	public void TestForCharacter() {
		MyStringBuffer b = new MyStringBuffer();
		b.append('M');
		b.append('e');
		b.append('g');
		b.append('h');
		b.append('a');
		String output = b.toString();
		String expectedOutput = "Megha";		
		Assert.assertEquals(expectedOutput,output);
	}
	
	@Test
	public void TestForNull() {
		MyStringBuffer b = new MyStringBuffer();
		b.append(null);
		String output = b.toString();
		String expectedOutput = "null";	
		Assert.assertEquals(expectedOutput,output);
	}
	
	@Test
	public void TestForCharacterNotEqual() {
		MyStringBuffer b = new MyStringBuffer();
		b.append('M');
		b.append('e');
		b.append('g');
		b.append('h');
		b.append('a');
		b.append(' ');
		String output = b.toString();
		String expectedOutput = "Megha";		
		Assert.assertNotEquals(expectedOutput,output);
	}

}
