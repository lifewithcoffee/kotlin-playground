import java.lang.reflect.Modifier
import kotlin.reflect.KFunction
import kotlin.reflect.jvm.javaMethod
import kotlin.reflect.jvm.kotlinFunction

fun main(args: Array<String>) {
    printArgs(args)
    getFunctionFromFile(args[0], args[1])?.call()

    //executeTestFunction("test loop", ::testLoop)
    //executeTestFunction("test array", ::testArray)
    //listFiles("e:\\rp\\mcn\\sync\\notes. prog''. lang\\")
}

fun printArgs(args: Array<String>) {
    print("args: ")
    for (arg in args){
        print(arg)
        print(' ')
    }
    println()
}

// for function "testLoop" in source file "app.kt", call: getFunctionFromFile("App", "testArray")
fun getFunctionFromFile(fileName: String, funcName: String): KFunction<*>? {
    val selfRef = ::getFunctionFromFile
    val currentClass = selfRef.javaMethod!!.declaringClass
    val classDefiningFunctions = currentClass.classLoader.loadClass("${fileName}Kt")
    val javaMethod  = classDefiningFunctions.methods.find { it.name == funcName && Modifier.isStatic(it.modifiers)}
    return javaMethod?.kotlinFunction
}

fun executeTestFunction(testName: String, fn: ()->Unit) {
    println("=== $testName:")
    fn()
    println("\n")
}

