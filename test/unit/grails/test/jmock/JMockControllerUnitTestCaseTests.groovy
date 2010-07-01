package grails.test.jmock

import groovy.util.GroovyTestCase;

class JMockControllerUnitTestCaseTests extends GroovyTestCase {
	def testCase
	
	void setUp(){
		testCase = new JMockControllerUnitTestCase(JMockControllerUnitTestCaseTests)
	}
	
	void testMockeryNotNull(){
		assert testCase.mockery != null
	}
	
	void testMockeryType(){
		assert testCase.mockery instanceof JUnit4GroovyMockery
	}
	
	void testAssertEqualsTrue(){
		testCase.assertEquals true, true
	}
	
}
