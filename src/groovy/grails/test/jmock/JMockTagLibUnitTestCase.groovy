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
	
	public JMockTagLibUnitTestCase() {
		super()
	}

	public JMockTagLibUnitTestCase(Class tagLibClass) {
		super(tagLibClass)
	}
}
