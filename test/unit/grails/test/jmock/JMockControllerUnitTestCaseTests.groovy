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
		testCase.assertEquals 1d, 1d
	}
	
	void testAssertEqualsLongTrue(){
		testCase.assertEquals Long.MAX_VALUE, Long.MAX_VALUE
	}
	
	void testAssertEqualsObjectTrue(){
		Object obj1 = new Integer(100)
		Object obj2 = new Integer(100)
		testCase.assertEquals obj1, obj2
	}
	
	void testAssertEqualsStringTrue(){
		String str1 = "A String"
		String str2 = "A String"
		testCase.assertEquals str1, str2
	}
	
	void testAssertNotNull(){
		testCase.assertNotNull 'not null'
	}
	
	void testAssertNull(){
		testCase.assertNull null
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
	
	void testAssertTrue(){
		testCase.assertTrue true
	}
	
	void testAssertFalse(){
		testCase.assertFalse false
	}
	
}
