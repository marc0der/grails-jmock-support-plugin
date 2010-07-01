package grails.test.jmock

import groovy.util.GroovyTestCase;

class JMockGrailsUnitTestCaseTests extends GroovyTestCase {
	def testCase
	
	void setUp(){
		testCase = new JMockGrailsUnitTestCase()
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
