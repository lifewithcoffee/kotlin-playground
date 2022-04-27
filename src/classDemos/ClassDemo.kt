package classDemos

class ClassDemo (name: String) {
    val firstProperty = "First property: $name".also(::println)

    init {
        println("First initializer block that prints ${name}")
    }
}

data class Person(var name: String?,var age: Int?)

class Person2(var name: String?,var age: Int?)

// extension method demo 1
fun MutableList<Int>.swap(index1: Int, index2: Int) {
    val tmp = this[index1] // 'this' corresponds to the list
    this[index1] = this[index2]
    this[index2] = tmp
}

// extension method demo 2
fun ClassDemo.Foo(){
    println("ClassDemo.Foo() called")
}

fun doClassDemo() {
    println("doClassDemo() called")
    ClassDemo("someName").Foo()
}