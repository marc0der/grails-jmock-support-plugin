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
	 * Asserts that two objects are equal.
	 * @param expected The expected object.
	 * @param actual The actual object.
	 */
	static void assertEquals(def expected, def actual){
		assert expected == actual
	}

}
