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

}
