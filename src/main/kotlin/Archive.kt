open class Archive(var name: String) {

    val setNote:MutableList<Note> = mutableListOf()
    fun printArchive(){
        println("Архив $name Создан")
    }


}


