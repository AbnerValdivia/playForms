// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/INSPIRON/Documents/PlayFramework/play-samples-play-java-forms-example/conf/routes
// @DATE:Fri Jul 03 17:15:07 CDT 2020


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
