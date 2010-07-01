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
	
}
