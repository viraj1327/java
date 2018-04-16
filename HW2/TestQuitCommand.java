import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.mockito.*;
import org.mockito.Mockito.*;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.reflect.Whitebox;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest(QuitCommand.class)

public class TestQuitCommand {
	QuitCommand qc = new QuitCommand();
	
	@Test
	private void test()
	{
		assertTrue(qc.matchcommand("quit"));
	}
	@Test
	private void testgetserialnumber() throws Exception {
	int ret = Whitebox.invokeMethod(qc,"getSerialNum"); 
		
	assertEquals(ret,"poptart");
	}
}