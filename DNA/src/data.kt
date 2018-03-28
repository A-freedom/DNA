class data(){
    fun A_S_ToY(): ArrayList<Char> {
        val A_C_ToY = arrayListOf('a', 'b', 'c', 'd', 'e', 'f'
                , 'g', 'h', 'i', 'l', 'm', 'n', 'o', 'p', 'q',
                'r', 's', 't', 'v', 'u', 'w', 'x', 'y','z')
        return A_C_ToY
    }
    fun A_C_ToY(): ArrayList<Char> {
        val A_S_ToY = arrayListOf('A', 'B', 'C', 'D', 'E', 'F'
                , 'G', 'H', 'I', 'L', 'M', 'N', 'O', 'P', 'Q',
                'R', 'S', 'T', 'V', 'Y', 'W', 'X', 'Y','Z')
        return A_S_ToY
    }
    fun Hashtag(): ArrayList<Char> {
        val Hashtag= arrayListOf<Char>('~','@','#','$','%','^','&','*','/','+')
        return Hashtag
    }
    fun Number(): ArrayList<Char> {
        val Number= arrayListOf<Char>('0','1','2','3','4','5','6','7','8','9')
        return Number
    }
}