package grails.test.jmock

import org.jmock.Mockery
import grails.test.ControllerUnitTestCase

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

	JMockControllerUnitTestCase() {
        super()
    }

	JMockControllerUnitTestCase(Class controllerClass) {
        super(controllerClass)
    }
}
