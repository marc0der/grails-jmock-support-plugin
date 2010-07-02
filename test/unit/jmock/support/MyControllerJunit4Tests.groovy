package jmock.support;
import grails.test.jmock.JUnit4GroovyMockery;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4)
class MyControllerJunit4Tests {
	def mockery
	def service
	def controller
	
	@Before
	void setUp(){
		mockery = new JUnit4GroovyMockery()
		service = mockery.mock(MyServiceIface)
		controller = new MyController()
		controller.myService = service
		controller.metaClass.params = [:]
		controller.metaClass.render = {
			assert it.view == 'success'
			assert it.model.result == 'The result'
		}
	}
	
	@Test
	void testAction(){
		def result = 'The result'
		controller.params.put 'id', '100'
		mockery.checking {
            one(service).tryit('100')
            will(returnValue(result))
        }
		
		controller.action()
		
	}
}
