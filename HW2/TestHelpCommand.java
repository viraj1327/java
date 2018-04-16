import static org.junit.Assert.assertTrue;

import org.junit.Test;
public class TestHelpCommand {
	HelpCommand hc = new HelpCommand();
	@Test
	public void test()
	{
		assertTrue(hc.matchcommand("help"));
	}

}
