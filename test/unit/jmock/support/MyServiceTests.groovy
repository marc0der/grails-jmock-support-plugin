package jmock.support

import grails.test.jmock.*

class MyServiceTests extends JMockGrailsUnitTestCase {
    def myService
    def someService

    protected void setUp() {
        super.setUp()
        someService = mockery.mock(SomeServiceIface)
        myService = new MyService(someService:someService)
    }

    void testSomeMethod() {
        mockery.checking {
            one(someService).someMethod(1000)
            will(returnValue('100'))
        }
        
        String result = myService.tryit('999')
        assert result == 'My test 100 message.'

    }
}
