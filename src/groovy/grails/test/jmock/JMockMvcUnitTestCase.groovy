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

	public JMockMvcUnitTestCase(String suffix) {
		super(suffix)
	}

	public JMockMvcUnitTestCase(Class clazz) {
		super(clazz)
	}
	
}
