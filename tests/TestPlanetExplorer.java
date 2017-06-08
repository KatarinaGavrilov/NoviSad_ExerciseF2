import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer {

	/*
	@Test
	public void test_executeCommand() {
		fail("Not yet implemented");
	}
	*/
	
	@Test
	public void test_PlanetExplorerConstructor() {
		PlanetExplorer vozilo = new PlanetExplorer(0,0,"(0,2)");
		assertNotNull(vozilo);
	}
	
	
}
