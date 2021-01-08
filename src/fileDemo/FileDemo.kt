package fileDemo

import java.io.File

fun listFiles(targetPath: String) {
    val folders = File(targetPath).listFiles { file -> file.isDirectory && file.name.contains("startup")}
    folders?.forEach { folder -> println(folder) }
}
