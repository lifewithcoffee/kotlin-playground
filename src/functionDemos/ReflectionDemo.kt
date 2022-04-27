package functionDemos

import java.lang.reflect.Modifier
import kotlin.reflect.KFunction
import kotlin.reflect.jvm.javaMethod
import kotlin.reflect.jvm.kotlinFunction

// for function "testLoop" in source file "app.kt", call: FunctionDemo.getFunctionFromFile("App", "testArray")
fun getFunctionFromFile(fileName: String, funcName: String): KFunction<*>? {
    val selfRef = ::getFunctionFromFile
    val currentClass = selfRef.javaMethod!!.declaringClass
    val classDefiningFunctions = currentClass.classLoader.loadClass("${fileName}Kt")
    val javaMethod  = classDefiningFunctions.methods.find { it.name == funcName && Modifier.isStatic(it.modifiers)}
    return javaMethod?.kotlinFunction
}

