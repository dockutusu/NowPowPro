package tests;

import org.testng.annotations.Test;

public class ParTest {

	String name = null;
	ThreadLocal<String> name1 = new ThreadLocal<>();

	@Test
	void m1() {
		
		name = val("A1");
		name1.set(name);
		System.out.println(name1.get());
	}

	@Test
	void m2() {

		name = val("A2");
		name1.set(name);
		System.out.println(name1.get());
	}

	@Test
	void m3() {

		name = val("A3");
		name1.set(name);
		System.out.println(name1.get());
	}

	@Test
	void m4() {

		name = val("A4");
		name1.set(name);
		System.out.println(name1.get());
	}

	@Test
	void m5() {

		name = val("A5");
		name1.set(name);
		System.out.println(name1.get());
	}

	synchronized String val(String val) {
		System.out.println(Thread.currentThread().getName());
		return val;
	}

}
