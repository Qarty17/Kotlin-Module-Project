import java.util.Scanner

class Menu2(archive:Archive) {
    var listOfNote:MutableList<Note> = archive.setNote
    private var count=1
    fun menu2(){
        println("Список заметок: ")
        println("0. Создать заметку")
        var numEnd=1
        for ((count,note) in listOfNote.withIndex()){
            println("${count+1}. ${note.name}")
            numEnd+=1
        }
        println("$numEnd. Назад")

    }
    fun addNote(){
        println("Введите название заметки: ")
        val nameNote= Scanner(System.`in`).nextLine()
        if (nameNote==""){
            println("Вы ввели пустое имя")
            return
        }
        println("Введите содержание заметки: ")
        val textNote=Scanner(System.`in`).nextLine()
        val note=Note(nameNote,textNote)
        listOfNote.add(note)
        count+=1
        note.printNote()
    }
}