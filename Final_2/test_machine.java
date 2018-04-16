package Final_2;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.reflect.Whitebox;

import QuitCommand;


@RunWith(PowerMockRunner.class)
@PrepareForTest(QuitCommand.class)

public class test_machine {
	machine m= new machine();

	@Test
	private void test()
	{
		assertTrue(m.getReady());
	}
	private void assertTrue(state ready) {
		// TODO Auto-generated method stub
		System.out.println("In the Ready State");
	}
	@Test
	private void testgetserialnumber() throws Exception {
	int ret = Whitebox.invokeMethod(m,"getSerialNum"); 
		
	assertEquals(ret,"poptart");
}
	}
