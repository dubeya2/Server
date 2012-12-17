package server

class ServerController {

    def index() {		
		render "test"
    }
	
	def ajaxServerVersion() {
		def serverDetails = "not found"
		def plugins = grailsApplication.mainContext.getBean('pluginManager').allPlugins
		plugins.each {
			if(it.getName() == "tomcat") {
				serverDetails = it.getName() + " " + it.getVersion()
			}
		} 
		render serverDetails
	}
}
