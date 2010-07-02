package grails.test.jmock

import org.jmock.Mockery
import grails.test.GrailsUnitTestCase

/**
 * Support class for writing unit tests in Grails.
 * Inherits directly from {@link GrailsUnitTestCase}.
 * Instances of this class carry a {@link JUnit4GroovyMockery}
 * to be used in JMock Unit Tests.
 * 
 * @author marco
 *
 */
class JMockGrailsUnitTestCase extends GrailsUnitTestCase {
	Mockery mockery = new JUnit4GroovyMockery()
	
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
