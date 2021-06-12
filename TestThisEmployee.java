package employee_data;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestThisEmployee {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	void testInsertLogic1() {
		Employee emp = new Manager("Vikram Kumar",26);
		
		assertEquals(new Logic().insertRecord(emp),1);
	}
	
	@Test
	void testInsertLogic2() {
		Employee emp = new Clerk("Vijay Kumar",24);
		
		assertEquals(new Logic().insertRecord(emp),1);
	}
	
	@Test
	void testInsertLogic3() {
		Employee emp = new Programmer("Vikram",29);
		
		assertEquals(new Logic().insertRecord(emp),1);
	}
	
	@Test
	void testShowRecords() {
		assertFalse(new Logic().getAllRecords().isEmpty());
	}
	
	@Test
	void testRaiseSalaryLogic1() {
		Employee emp = new Clerk();
		emp.setDesig("Clerk");
		assertTrue(new Logic().raiseSalary(emp));
	}
	
	@Test
	void testRaiseSalaryLogic2() {
		Employee emp = new Manager();
		emp.setDesig("Manager");
		assertTrue(new Logic().raiseSalary(emp));
	}
	
	@Test
	void testRaiseSalaryLogic3() {
		Employee emp = new Programmer();
		emp.setDesig("Programmer");
		assertTrue(new Logic().raiseSalary(emp));
	}
	
	@Test
	void testDeleteRecordById() {
		assertTrue(new Logic().deleteRecordById(10));
	}

}
