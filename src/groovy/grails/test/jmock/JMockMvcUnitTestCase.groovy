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
	 * Asserts that two objects are equal.
	 * @param expected The expected object.
	 * @param actual The actual object.
	 */
	static void assertEquals(def expected, def actual){
		assert expected == actual
	}
	
	/**
	 * Asserts that an object isn't null.
	 * @param obj The object.
	 */
	static void assertNotNull(def obj){
		assert obj != null
	}

	/**
	 * Asserts that an object is null.
	 * @param obj The object.
	 */
	static void assertNull(def obj){
		assert obj == null
	}
	
	/**
	 * Asserts that two objects do not refer to the same object.
	 * @param unexpected The unexpected object.
	 * @param actual The actual object.
	 */
	static void assertNotSame(def unexpected, def actual){
		assert unexpected.hashCode() != actual.hashCode()
	}
	
	/**
	 * Asserts that two objects refer to the same object.
	 * @param expected The expected object.
	 * @param actual The unexpected object.
	 */
	static void assertSame(def expected, def actual){
		assert expected.hashCode() == actual.hashCode()
	}
	
	/**
	 * Asserts that a condition is true.
	 * @param condition The condition.
	 */
	static void assertTrue(def condition){
		assert condition == true
	}
	
	/**
	 * Asserts that a condition is false.
	 * @param condition The condition.
	 */
	static void assertFalse(def condition){
		assert condition == false
	}
	
}
