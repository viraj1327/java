package Final;
import java.util.ArrayList;import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.*;
import org.mockito.Mockito.*;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.reflect.Whitebox;

import QuitCommand;

import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest(QuitCommand.class)

public class manager_test  {
manager m = new manager();
	
	@Test
	private void test()
	{
		Assert.assertTrue(m.attach(null));
	}
	private void assertTrue(Object attach) {
		// TODO Auto-generated method stub
		System.out.print("Add an WorkerItem.");
	}
	@Test
	private void testgetserialnumber() throws Exception {
	int ret = Whitebox.invokeMethod(m,"getSerialNum"); 
		
	assertEquals(ret,"poptart");
}}
