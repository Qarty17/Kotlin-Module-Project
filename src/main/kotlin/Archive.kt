import java.util.Scanner
data class Archive(var name: String) {

    val setNote:MutableSet<Note> = mutableSetOf()
    fun printArchive(){
        println("Архив $name Создан")
    }


}


