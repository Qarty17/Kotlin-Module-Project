
import java.util.Objects
import java.util.Scanner
fun main() {
    startMenu()


}

fun startMenu(){
    val listArchive:MutableList<Archive> = mutableListOf()
    var flag = true
    do {
        println("Список архивов: \n0. Создать архив\n1. Это мои уже созданные архивы \n2. Выход")
        val answer: Int = Scanner(System.`in`).nextInt()

        when (answer){
            0 -> {

                println("Введите название архива: ")
                val nameArch=Scanner(System.`in`).nextLine()
                val archive=Archive(nameArch)
                listArchive.add(archive)
                archive.printArchive()
            }
            1-> {
                println("Список архивов:")

                for ((count, arch) in listArchive.withIndex()){

                    println("$count. ${arch.name}")
                }

                val archive:Int=Scanner(System.`in`).nextInt()

                noteMenu(listArchive[archive])

            }
            2 -> {
                println("Выход")
                flag=false
            }
            else -> println("Введите число")
        }
    }
    while (flag)
}
fun noteMenu(archive:Archive) {


    var flag1 = true
    do {
        println("Архив: ${archive.name}")
        println("0. Создать заметку\n1. Список заметок\n2. Выход")
        val newMenu = Scanner(System.`in`).nextInt()
        when (newMenu) {
            0 -> {
                println("Введите название заметки")
                val noteName = Scanner(System.`in`).nextLine()
                println("Введите содержание заметки")
                val noteText = Scanner(System.`in`).nextLine()
                val newNote = Note(noteName,noteText)
                archive.setNote.add(newNote)
                println("Заметка ${newNote.name} Создана")
            }

            1 -> {
                println("Список заметок: ")
                for ((ind, note) in archive.setNote.withIndex()) {
                    println("$ind. ${note.name}")
                }
                val noteInp = Scanner(System.`in`).nextInt()
                for ((i2, note) in archive.setNote.withIndex())
                    when (i2) {
                        i2 -> println("Содержание ${note.name}: ${note.text}")
                        else -> println("Такой заметки нет")
                    }
            }

            2 -> flag1 = false
            else -> println("введите число")

        }
    } while (flag1)
}


