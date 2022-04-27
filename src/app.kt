import classDemos.doClassDemo
import collectionDemos.testArray
import fileDemos.listFiles
import functionDemos.getFunctionFromFile
import functionDemos.lambdaDemo

fun main(args: Array<String>) {
    printArgs(args)

    // just call the first function for testing
    // can use ::fnName and {} to the same arrayOf --> TODO: why?
    arrayOf(
        { doClassDemo() },
        { listFiles("i:\\rp\\mcn\\sync") },
        { lambdaDemo() },
        { testLoop() },
        { testArray() },
        { getFunctionFromFile(args[0], args[1])?.call() },
    {})[0]();       // the last parameter {} is just a placeholder for its previous ','
}

fun printArgs(args: Array<String>) {
    if (args.isNotEmpty()) {
        print("args: ")
        for (arg in args){
            print(arg)
            print(' ')
        }
        println()
    }
}