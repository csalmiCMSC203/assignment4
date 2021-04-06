

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ManagementCompanyTestSTUDENT {
	ManagementCompany mgm;
	
	@Before
	public void setUp() throws Exception {
		//student create a management company
		mgm = new ManagementCompany();
		mgm.addProperty("p1", "c1", 1000, "o1", 0, 0, 1, 1);
		mgm.addProperty("p2", "c3", 2000, "o2", 1, 1, 1, 1);
		mgm.addProperty("p3", "c3", 3000, "o3", 2, 2, 1, 1);
		//student add three properties, with plots, to mgmt co
		
	}

	@After
	public void tearDown() {
		//student set mgmt co to null  
		mgm = null;
	}

	@Test
	public void testAddPropertyDefaultPlot() {
		mgm.addProperty("p4", "c4", 4000, "o4", 3, 3, 1, 1);
		mgm.addProperty("p5", "c5", 5000, "o5", 4, 4, 1, 1);		
		assertEquals(mgm.addProperty("p4", "c4", 4000, "o4", 5, 5, 1, 1),-1,0);
		//assertEquals(mgm.addProperty("p4", "c4", 4000, "o4", 5, 5, 3, 3),-1,0);
		//student should add property with 4 args & default plot (0,0,1,1)
		//student should add property with 8 args
		//student should add property that exceeds the size of the mgmt co array and can not be added, add property should return -1	
	}
 
	@Test
	public void testMaxRentProp() {
		assertEquals(mgm.maxRentProp(), 3000.0,0);		
		//student should test if maxRentProp contains the maximum rent of properties		
	}

	@Test
	public void testTotalRent() {
		assertEquals(mgm.totalRent(), 6000.0,0);
		//student should test if totalRent returns the total rent of properties
	}

 }