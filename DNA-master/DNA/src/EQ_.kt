import java.time.Duration
import java.time.Instant
import kotlin.concurrent.thread

val source = arrayListOf('a', 'd','m', 'i','n', 'd')
val tar = CharArray(source.size)
val get = ArrayList<Char>()
val start = Instant.now()!!
fun main(args: Array<String>) {

//    get.addAll(data().Number())
    get.addAll(data().A_S_ToY())
    val maximum = 0
    val minimum = get.size - 1
    println("source : ${source.toList()}")
    println("size : ${tar.size}")

    for (i in 0..1000000) {
        thread {
            while (true) {
                for (i in 0 until source.size) {
//                    tar[i] = ((minimum + 1) + Math.random() * (maximum -(minimum + 1))).toString().last()
                    tar[i] = get[((minimum + 1) + Math.random() * (maximum - (minimum + 1))).toInt()]

                }
                eq()
            }
        }
    }

}

private fun eq(): Boolean {
    val tarOut = CharArray(tar.size)
    for (i in 0 until tar.size) {
        if (source[i] != tar[i]) {
            return@eq false
        }
        tarOut[i] = tar[i]
    }
    println("true : ${tarOut.toMutableList()}")
    val end = Instant.now()
    println(Duration.between(start, end))
//    ;System.exit(0)
    return true
}
