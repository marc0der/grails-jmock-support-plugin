h1. Grails JMock Support Plugin

h3. Installing

Using the command line, step into the directory of your Grails project.

Install the plugin by entering the following:
{code}
grails install-plugin jmock-support
{code}

h3. Description

A plugin for the Grails Framework that provides support for the JMock Mocking Framework.
It adds JMock 2 functionality which integrates well with the new JUnit 4 upgrade that was
added to Grails since 1.3.0.

h3. Using It

Once the plugin is installed, you are ready to start using it. This plugin strives to give
you all the functionality of existing Grails TestCases, with added functionality of having
a Mockery instance as part of the test fixture. More specifically, it adds an instance of
the JUnit4GroovyMockery to each test instance.

See this article for more details of the JUnit4GroovyMockery:
[http://groovy.codehaus.org/Using+JMock+with+Groovy]

h3. The Caveat

Beacause of Groovy's dynamic nature, the usual @org.jmock.lib.legacy.ClassImposteriser@
does not work when set on the Mockery. It causes a big ugly stack overflow!

As a result, it is neccessary to define an interface for the class being mocked. I found it
quiet neat and even helpful to define the interface in the same file as the implementation.
This makes your class quiet readable and makes the contract of the class quiet clear. See the
Service example below.

h3. A JUnit 3 Style Example

Writing a simple JUnit 3 style test case is as easy as extending the following TestCases
instead of the old implementation:

Replace
* grails.test.ControllerUnitTestCase with grails.test.jmock.JMockControllerUnitTestCase
* grails.test.GrailsUnitTestCase with grails.test.jmock.JMockGrailsUnitTestCase
* grails.test.MvcUnitTestCase with grails.test.jmock.JMockMvcUnitTestCase
* grails.test.TagLibUnitTestCase with grails.test.jmock.JMockTagLibUnitTestCase


Here is a simple example of using it in a Test Case:
{code}
class MyControllerTests extends JMockControllerUnitTestCase {
    def myService
    
    protected void setUp() {
        super.setUp()
        myService = mockery.mock(MyServiceIface)
        controller.myService = myService
    }

    void testAction() {
        def result = 'The acid test!'
        
        mockParams.id = '100'
        mockery.checking {
            one(myService).tryit(mockParams.id)
            will(returnValue(result))
        }
        
        controller.action()
        
        assert renderArgs.view == 'success'
        assert renderArgs.model.result == result
        
    }
}
{code}

The Controller Code:
{code}
class MyController {
    
    def myService
    
    def action = {
        String result = myService.tryit(params.id)
        render(view:'success', model:[result:result])   
    }
}
{code}


Finally, the Service being mocked. Notice the neccessity of having an interface defined!
{code}
interface MyServiceIface {
    String tryit(String id)
}

class MyService implements MyServiceIface{

    static transactional = true

    String tryit(String id) {
        "Hello World!: ${id}"
    }
}
{code}

h3. A JUnit 4 Style Example

{code}
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
{code}

h3. Added bonus: Power Asserts!

As of Version 0.2 of this plugin, I have added overrides for many of the most-used assertEquals
methods provided by JUnit. Here is a list of all those supported:

{code}
static void assertEquals(Object expected, Object actual)
static void assertEquals(int expected, int actual)
static void assertEquals(long expected, long actual)
static void assertEquals(String expected, String actual)
static void assertNotSame(Object unexpected, Object actual)
static void assertSame(Object expected, Object actual)
{code}

Hope you enjoy using JMock with Grails!
