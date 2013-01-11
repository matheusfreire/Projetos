import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;


public class calculadoraTest {

	int a, b;
	
	@Before
	public void setUp(){
		a = 5;
		b = 3;
	}
	
	@Test
	public void testSoma() {
		Assert.assertEquals(8, calculadora.soma(a,b));
	}

	@Test
	public void testSub(){
		Assert.assertEquals(2, calculadora.sub(a,b));
	}
	
	@Test
	public void testeDiv(){
		Assert.assertEquals(1, calculadora.div(a, b), 0.001);
	}
	
	@Test
	public void testeMult(){
		Assert.assertEquals(15, calculadora.mult(a,b));
	}
	
	
	@Test
	public void testeMod(){
		Assert.assertEquals(2, calculadora.mod(a,b));
	}
	
	@Test
	public void testeChao(){
		Assert.assertEquals(a, calculadora.chao(a));
		Assert.assertEquals(b, calculadora.chao(b));
	}
	
	
	@Test
	public void testeTeto(){
		Assert.assertEquals(a, calculadora.teto(a));
		Assert.assertEquals(b, calculadora.teto(b));
	}
}
