import FunctionDemo.getFunctionFromFile
import FunctionDemo.lambdaDemo

fun main(args: Array<String>) {
    printArgs(args)

    // just call the first function for testing
    arrayOf(
        { lambdaDemo() },
        { listFiles("e:\\rp\\mcn\\sync") },
        { testLoop() },
        { testArray() },
        { getFunctionFromFile(args[0], args[1])?.call() },
    {})[0]();       // the last parameter {} is just a placeholder for its previous ','

}

fun printArgs(args: Array<String>) {
    print("args: ")
    for (arg in args){
        print(arg)
        print(' ')
    }
    println()
}

