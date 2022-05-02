import org.junit.*;
import static org.junit.Assert.*;

public class CountElementsTester{
	@Test
	public void count(){
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7};
		assertEquals(7, CountElements.numOfElements(numbers));
	}
}