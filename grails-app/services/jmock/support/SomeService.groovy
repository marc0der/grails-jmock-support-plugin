package jmock.support

interface SomeServiceIface {
    String someMethod(int param)
}

class SomeService implements SomeServiceIface{
    String someMethod(int param){
        ">>> ${param} <<<"
    }
}

