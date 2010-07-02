package grails.test.jmock

import groovy.util.GroovyTestCase;

class JMockControllerUnitTestCaseTests extends GroovyTestCase {
	def testCase
	
	void setUp(){
		testCase = new JMockControllerUnitTestCase(this.getClass())
	}
	
	void testMockeryNotNull(){
		assert testCase.mockery != null
	}
	
	void testMockeryType(){
		assert testCase.mockery instanceof JUnit4GroovyMockery
	}
	
	void testAssertEqualsIntTrue(){
		testCase.assertEquals 1, 1
	}
	
	void testAssertEqualsDoubleTrue(){
		testCase.assertEquals 1d, 1d, 0d
	}

	void testAssertEqualsLongTrue(){
		testCase.assertEquals 1L, 1L
	}
	
	void testAssertEqualsObjectTrue(){
		Object obj = new Object()
		testCase.assertEquals obj, obj
	}
	
	void testAssertEqualsStringTrue(){
		String str1 = "A String"
		String str2 = "A String"
		testCase.assertEquals str1, str2
	}
	
	void testAssertNotSame(){
		def obj1 = new Object()
		def obj2 = new Object()
		testCase.assertNotSame obj1, obj2
	}
	
	void testAssertSame(){
		def obj1 = new Object()
		testCase.assertSame obj1, obj1
	}
		
}
