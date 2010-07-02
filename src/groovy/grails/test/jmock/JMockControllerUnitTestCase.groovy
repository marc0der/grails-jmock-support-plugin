package grails.test.jmock

import org.jmock.Mockery
import grails.test.ControllerUnitTestCase

import static grails.test.jmock.PowerAssert.assertEquals;
import static grails.test.jmock.PowerAssert.assertNotSame;
import static grails.test.jmock.PowerAssert.assertSame;

/**
 * Support class for writing unit tests for controllers.
 * Inherits directly from {@link ControllerUnitTestCase}.
 * Instances of this class carry a {@link JUnit4GroovyMockery}
 * to be used in JMock Unit Tests.
 * 
 * @author marco
 */
class JMockControllerUnitTestCase extends ControllerUnitTestCase {
	Mockery mockery = new JUnit4GroovyMockery()

    /**
     * Creates a new test case for the controller that is in the same
     * package as the test case and has the same prefix before "Controller"
     * in its name. For example, if the class name of the test were
     * <code>org.example.TestControllerTests</code>, this constructor
     * would mock <code>org.example.TestController</code>.
     */
	JMockControllerUnitTestCase() {
        super()
    }

    /**
     * Creates a new test case for the given controller class.
     */
	JMockControllerUnitTestCase(Class controllerClass) {
        super(controllerClass)
    }
	
	/**
	 * Asserts that an object isn't null.
	 * @param obj The object.
	 */
	static void assertNotNull(def obj){
		println 'I am here!'
		assert obj != null
	}

	/**
	 * Asserts that an object is null.
	 * @param obj The object.
	 */
	static void assertNull(def obj){
		println 'I am here!'
		assert obj == null
	}
	
	/**
	 * Asserts that a condition is true.
	 * @param condition The condition.
	 */
	static void assertTrue(def condition){
		println 'I am here!'
		assert condition == true
	}
	
	/**
	 * Asserts that a condition is false.
	 * @param condition The condition.
	 */
	static void assertFalse(def condition){
		println 'I am here!'
		assert condition == false
	}

	/**
	 * Asserts that two integers are equal.
	 * @param expected The expected object.
	 * @param actual The actual object.
	 */
	static void assertEquals(int expected, int actual){
		println 'I am here!'
		assert expected == actual
	}
	
	/**
	 * Asserts that two doubles or floats are equal to within a positive delta.
	 * @param expected The expected object
	 * @param actual The actual object
	 * @param delta The delta
	 */
	static void assertEquals(double expected, double actual, double delta){
		println 'I am here!'
		assert expected == actual
	}
	
	/**
	 * Asserts that two objects do not refer to the same object.
	 * @param unexpected The unexpected object.
	 * @param actual The actual object.
	 */
	static void assertNotSame(Object unexpected, Object actual){
		println 'I am here!'
		assert unexpected.hashCode() != actual.hashCode()
	}
	
	/**
	 * Asserts that two objects refer to the same object.
	 * @param expected The expected object.
	 * @param actual The unexpected object.
	 */
	static void assertSame(Object expected, Object actual){
		println 'I am here!'
		assert expected.hashCode() == actual.hashCode()
	}

}
