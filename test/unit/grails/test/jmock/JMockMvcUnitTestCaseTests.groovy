package grails.test.jmock

import groovy.util.GroovyTestCase;

class JMockMvcUnitTestCaseTests extends GroovyTestCase {
	def testCase
	
	void setUp(){
		testCase = new JMockMvcUnitTestCase(this.getClass())
	}
	
	void testMockeryNotNull(){
		assert testCase.mockery != null
	}
	
	void testMockeryType(){
		assert testCase.mockery instanceof JUnit4GroovyMockery
	}
	
	void testAssertEqualsTrue(){
		testCase.assertEquals 1, 1
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
