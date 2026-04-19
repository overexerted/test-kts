class Library : ScriptModule {
  override fun execute(args: Map<String, Any>): Any? {
        val action = args["action"] as? String
        return when(action) {
            "add" -> (args["a"] as Int) + (args["b"] as Int)
            else -> "Unknown action"
        }
    }
}
