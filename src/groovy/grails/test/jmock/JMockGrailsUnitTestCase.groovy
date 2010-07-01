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
