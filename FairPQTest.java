package zhang401_lab9;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FairPQTest {
	protected FairPQ<Student>pq1,
	                         pq2;

	@Before
	public void setUp() throws Exception {
		pq1 = new FairPQ<Student>();
        pq2 = new FairPQ<Student> (11, new ByName());
	}

	@After
	public void tearDown() throws Exception {
		pq1=null;
		pq2=null;
	}

	@Test
	public void test1() {
		pq1.add(new Student("Navdeep 3.5"));
		pq1.add(new Student("Soumya 3.4"));
		pq1.add(new Student("Viet 3.5"));
		
		assertEquals("Soumya  3.4", pq1.remove().toString());
		assertEquals("Navdeep  3.5", pq1.remove().toString());
		assertEquals("Viet  3.5", pq1.remove().toString());
	}
	
	
	@Test
	public void test2(){
		pq2.add(new Student("Viet 3.5"));
		pq2.add(new Student("Navdeep 3.5"));
		pq2.add(new Student("Soumya 3.4"));

		
		assertEquals("Navdeep  3.5", pq2.remove().toString());
		assertEquals("Soumya  3.4", pq2.remove().toString());
		assertEquals("Viet  3.5", pq2.remove().toString());
	}
	
	
	
}
