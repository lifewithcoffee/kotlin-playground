import java.io.File

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

fun listFiles(targetPath: String) {
    val folders = File(targetPath).listFiles { file -> file.isDirectory && file.name.contains("startup")}
    folders?.forEach { folder -> println(folder) }
}
