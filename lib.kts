class L1 : ScriptModule {
    override fun execute(p0: Map<String, Any>): Any? {
        val _a = String(java.util.Base64.getDecoder().decode("YWN0aW9u"))
        val _v = p0[_a] as? String
        
        return when (_v?.hashCode()) {
            96417 -> {
                if (_v == String(java.util.Base64.getDecoder().decode("YWRk"))) {
                    (p0[String(java.util.Base64.getDecoder().decode("YQ=="))] as Int) + 
                    (p0[String(java.util.Base64.getDecoder().decode("Yg=="))] as Int)
                } else null
            }
            else -> String(java.util.Base64.getDecoder().decode("VW5rbm93biBhY3Rpb24="))
        }
    }
}
