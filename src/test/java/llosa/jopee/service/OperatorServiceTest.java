package llosa.jopee.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import llosa.jopee.model.Operator;

public class OperatorServiceTest {
	
	@Test
	public void testCrud() {
		OperatorService service = new OperatorService();
		Operator operator = new Operator();
		operator.setOpratorId(1000);
		operator.setFirstName("Juan");
		operator.setLastName("Tamad");
		operator.setBarangayAddress("Daro");
		operator.setCityOrTownAddress("Dumaguete");
		operator.setStreetAddress("Tindalo St.");
		service.save(operator); //create
		Operator actual = service.findById(1000); //read
		
		assertEquals(operator, actual);
		
		operator.setStreetAddress("Aldecoa Drive");
		service.update(operator); //update
		actual = service.findById(1000);
		
		assertEquals(operator, actual);
		
		service.delete(1000); //delete
		actual = service.findById(1000);
		
		assertEquals(null, actual);
	}

}
