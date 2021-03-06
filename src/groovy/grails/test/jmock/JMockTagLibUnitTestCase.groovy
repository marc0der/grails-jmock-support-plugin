package grails.test.jmock

import org.jmock.Mockery
import grails.test.TagLibUnitTestCase

/**
 * Support class for writing unit tests for tag libraries.
 * Inherits directly from {@link TagLibUnitTestCase}.
 * Instances of this class carry a {@link JUnit4GroovyMockery}
 * to be used in JMock Unit Tests.

 * @author marco
 */
class JMockTagLibUnitTestCase extends TagLibUnitTestCase {
	Mockery mockery = new JUnit4GroovyMockery()
	
    /**
     * Creates a new test case for the tag library that is in the same
     * package as the test case and has the same prefix
     * in its name. For example, if the class name of the test were
     * <code>org.example.MyTagLibTests</code>, this constructor
     * would mock <code>org.example.MyTagLib</code>.
     */
	public JMockTagLibUnitTestCase() {
		super()
	}

    /**
     * Creates a new test case for the given tag lib class.
     */
	public JMockTagLibUnitTestCase(Class tagLibClass) {
		super(tagLibClass)
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
