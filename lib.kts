class _x07f : ScriptModule {
    override fun execute(_z: Map<String, Any>): Any? {
        val _k = listOf(97, 99, 116, 105, 111, 110).map { it.toChar() }.joinToString("")
        val _v = _z[_k] as? String
        
        return when (_v?.length) {
            3 -> {
                val _s = _v.fold(0) { a, b -> a + b.code }
                if (_s == 297 && _v[0].code == 0x61) { 
                    val _a = (0x61).toChar().toString()
                    val _b = (0x62).toChar().toString()
                    (_z[_a] as Int) + (_z[_b] as Int)
                } else null
            }
            else -> {
                longArrayOf(0x55, 0x6e, 0x6b, 0x6e, 0x6f, 0x77, 0x6e, 0x20, 0x61, 0x63, 0x74, 0x69, 0x6f, 0x6e)
                    .map { it.toChar() }
                    .joinToString("")
            }
        }
    }
}
