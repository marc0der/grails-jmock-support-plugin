package grails.test.jmock

import groovy.lang.Closure
import org.jmock.Expectations
import org.jmock.integration.junit4.JUnit4Mockery

class ClosureExpectations extends Expectations {
    void closureInit(Closure cl, Object delegate) {
        cl.setDelegate(delegate);
        cl.call();
    }
}

class JUnit4GroovyMockery extends JUnit4Mockery {
    public void checking(Closure c) {
        ClosureExpectations expectations = new ClosureExpectations()
        expectations.closureInit(c, expectations)
        super.checking(expectations)
    }
}
