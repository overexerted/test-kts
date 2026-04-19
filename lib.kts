class _0x00A1 : ScriptModule {
    override fun execute(_0x_: Map<String, Any>): Any? {
        val _δ: (IntArray) -> String = { it.map { c -> (c - 5).toChar() }.joinToString("") }
        
        val _k1 = _δ(intArrayOf(102, 104, 121, 114, 116, 115)) 
        val _k2 = _δ(intArrayOf(102)) 
        val _k3 = _δ(intArrayOf(103)) 
        
        val _v = _0x_[_k1] as? String
        
        return when ((_v?.length ?: 0) * 17) {
            51 -> {
                val _s = _v?.fold(1) { a, b -> a * b.code } ?: 0
                if (_s == 970000) {
                    val _1 = _0x_[_k2] as Int
                    val _2 = _0x_[_k3] as Int
                    
                    listOf(_1, _2).reduce { _x, _y -> _x + _y }
                } else _δ(intArrayOf(90, 110, 111, 120, 122))
            }
            else -> {
                val _u = intArrayOf(90, 115, 112, 116, 124, 115, 37, 102, 104, 121, 114, 116, 115)
                _δ(_u)
            }
        }
    }
}
