import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MapTest {

	@Test
	public void validateIfMapEmpty() {
		Map map=new Map();
		assertEquals(0, map.size());
	}

	@Test
	public void validateIfElementAdded() {
		Map map=new Map();
		map.add(1, "Ayushi");
		map.add(2, 3);
		map.add(5, "Bindu");
		assertEquals(3, map.size());
	}
	
	@Test
	public void validateValueAtGivenKey() {
		Map map=new Map();
		map.add(1, "Ayushi");
		map.add(2, 3);
		map.add(5, "Bindu");
		assertEquals("Bindu", map.getValue(5));
	}
	
	@Test (expected=NullPointerException.class)
	public void validateIfDelete() {
		Map map=new Map();
		map.add(1, "Ayushi");
		map.add(2, 3);
		map.add(5, "Bindu");
		map.add(66, 465);
		map.Delete(2);
		assertEquals(3, map.size());
		
		
		
		
	}
}
