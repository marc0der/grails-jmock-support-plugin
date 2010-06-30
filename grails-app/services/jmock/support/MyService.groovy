package jmock.support

interface MyServiceIface {
    String tryit(String id)
}

class MyService implements MyServiceIface{

    static transactional = true

    def someService

    String tryit(String id) {
        int param = id.toInteger() + 1
        "My test ${someService.someMethod(param)} message."
    }
}
