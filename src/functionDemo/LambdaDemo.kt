package functionDemo

fun testFunction(){
    println("someFn() called")
}
fun executeTestFunction(testName: String, fn: ()->Unit) {
    println("=== $testName:")
    fn()
    println()
}

fun executeTestFunction2(fn: ()->Unit , testName: String) {
    executeTestFunction(testName, fn)
}

fun lambdaDemo() {
    executeTestFunction("executeTestFunction, case 1", ::testFunction)
    executeTestFunction("executeTestFunction, case 2", {testFunction()})
    executeTestFunction("executeTestFunction, case 3", { println("println() called") })
    executeTestFunction("executeTestFunction, case 4") {testFunction()}

    executeTestFunction2({testFunction()} , "executeTestFunction2")
}