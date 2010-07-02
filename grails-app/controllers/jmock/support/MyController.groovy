package jmock.support

class MyController {
    
    def myService    
    
    def action = {
        String result = myService.tryit(params.id)
        render(view:'success', model:[result:result])
    }
}
