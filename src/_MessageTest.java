
import static org.junit.Assert.*;

import org.junit.Test;

public class _MessageTest {

	@Test
	public void isShouldReturnTheMessage() {
		Message message =  new Message("Hola mundo");
		assertEquals("Hola mundo", message.getText());
	}

}
