package grails.test.jmock

import org.jmock.Mockery
import grails.test.MvcUnitTestCase

/**
 * Common test case support class for controllers, tag libraries, and
 * anything else that has access to the standard web properties such
 * as "request", "response", and "session".
 * Inherits directly from {@link MvcUnitTestCase}.
 * Instances of this class carry a {@link JUnit4GroovyMockery}
 * to be used in JMock Unit Tests.
 * 
 * @author marco
 */
class JMockMvcUnitTestCase extends MvcUnitTestCase {
	Mockery mockery = new JUnit4GroovyMockery()

    /**
     * Creates a new test case for the class whose name and package
     * matches this test's class up to and including the given suffix.
     * In other words, if this test is <code>org.example.MyControllerTests</code>
     * then the class under test is <code>org.example.MyController</code>.
     * This example assumes that the suffix is "Controller".
     */
	public JMockMvcUnitTestCase(String suffix) {
		super(suffix)
	}

    /**
     * Creates a new test case for the given class.
     */
	public JMockMvcUnitTestCase(Class clazz) {
		super(clazz)
	}

	/**
	 * Asserts that two Objects are equal.
	 * @param expected The expected Object.
	 * @param actual The actual Object.
	 */
	static void assertEquals(Object expected, Object actual){
		assert expected == actual
	}
			
	/**
	 * Asserts that two integers are equal.
	 * @param expected The expected object.
	 * @param actual The actual object.
	 */
	static void assertEquals(int expected, int actual){
		assert expected == actual
	}
	
	/**
	 * Asserts that two longs are equal.
	 * @param expected The expected long.
	 * @param actual The actual long.
	 */
	static void assertEquals(long expected, long actual){
		assert expected == actual
	}
	
	/**
	 * Asserts that two Strings are equal.
	 * @param expected The expected String.
	 * @param actual The actual String.
	 */
	static void assertEquals(String expected, String actual){
		assert expected == actual
	}

	/**
	 * Asserts that two objects do not refer to the same object.
	 * @param unexpected The unexpected object.
	 * @param actual The actual object.
	 */
	static void assertNotSame(Object unexpected, Object actual){
		assert unexpected.hashCode() != actual.hashCode()
	}
	
	/**
	 * Asserts that two objects refer to the same object.
	 * @param expected The expected object.
	 * @param actual The unexpected object.
	 */
	static void assertSame(Object expected, Object actual){
		assert expected.hashCode() == actual.hashCode()
	}
	
}
