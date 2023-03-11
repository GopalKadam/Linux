package com.main.profinch;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HibernateProjectApplicationTests {

	private Calculator c = new Calculator();
	
	@Test
	void contextLoads() {
	}
	
	//expected
	int expectedResult = 17;
	
	//actual
	@Test
	public void Sum()
	{
		int actualResult =c.doSum(10, 5, 2);
		
		assertThat(actualResult).isEqualTo(expectedResult);
	}
	
	//expected
		int expectedResult1 = 10;
		
		//actual
		@Disabled
		@Test
		public void testProduct()
		{
			int actualResult =c.doMulti(5, 2);
			
			assertThat(actualResult).isEqualTo(expectedResult1);
		}
		
		@Test
		public void Compare()
		{
			boolean actualResult=c.TwoCompare(3, 3);
			
			assertThat(actualResult).isTrue();
			
			
		}

}
