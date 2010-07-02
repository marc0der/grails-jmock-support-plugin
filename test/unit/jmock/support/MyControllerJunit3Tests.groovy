package jmock.support

import grails.test.jmock.*

class MyControllerJunit3Tests extends JMockControllerUnitTestCase {
    def myService
    
    protected void setUp() {
        super.setUp()
        myService = mockery.mock(MyServiceIface)
        controller.myService = myService
    }

    void testAction() {
        def result = 'The acid test!'
        
        mockParams.id = 'Cool'
        mockery.checking {
            one(myService).tryit(mockParams.id)
            will(returnValue(result))
        }
        
        controller.action()
        
        assert renderArgs.view == 'success'
        assert renderArgs.model.result == result
        
        println "View: ${renderArgs.view}"
        println "Result: ${renderArgs.model.result}"
        
    }
}
