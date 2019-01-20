fun main(args: Array<String>) {
    println("Hello World!")
    executeTestFunction("test loop", ::testLoop)
    executeTestFunction("test array", ::testArray)
}

fun executeTestFunction(testName: String, fn: ()->Unit) {
    println("=== $testName:")
    fn()
    println("\n")
}

fun testLoop() {
    for (i in 0..10 step 2) {
        print(i)
        print(' ')
    }
}

fun testArray() {
    val numbers: IntArray = intArrayOf(10,22,34,14,75)
    val number : Int = numbers[4]
    println("The 4th number from of numbers is: $number")
}