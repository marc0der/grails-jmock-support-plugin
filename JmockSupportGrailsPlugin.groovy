class JmockSupportGrailsPlugin {
    // the plugin version
    def version = "0.2"
    // the version or versions of Grails the plugin is designed for
    def grailsVersion = "1.3.0 > *"
    // the other plugins this plugin depends on
    def dependsOn = [:]
    // resources that are excluded from plugin packaging
    def pluginExcludes = [
            "grails-app/",
            "web-app"
    ]

    def author = "Marco Vermeulen"
    def authorEmail = "marco_vermeulen@yahoo.co.uk"
    def title = "JMock Support Plugin for Grails"
    def description = '''\\
Adds JMock support to your Grails Application.
Provides extensions of all the Grails Unit Test Case classes retrofitted with Mockery instances.
Also makes the JMock checking blocks more DSL-like.
'''

    // URL to the plugin's documentation
    def documentation = "http://grails.org/plugin/jmock-support"

}
