@Grapes([
  @Grab('io.ratpack:ratpack-groovy:1.5.4'),
  @Grab('org.slf4j:slf4j-simple:1.7.25')
])

import static ratpack.groovy.Groovy.ratpack

ratpack {
	handlers {
		get {
			render "hello, world!"
		}
        get(":name") {
            render "Hello $pathTokens.name!"
        }
	}
}