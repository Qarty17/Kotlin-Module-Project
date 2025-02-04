import java.util.Scanner

class Menu() {
    var listOfArchive:MutableList<Archive> = mutableListOf()
    private var count=1
    fun menu(){
        println("Список архивов: ")
        println("0. Создать архив")
        var numEnd=1
        for ((count,arch) in listOfArchive.withIndex()){
            println("${count+1}. ${arch.name}")
            numEnd+=1
        }
        println("$numEnd. Выход")

    }
    fun addArchive(){
        println("Введите название архива: ")
        val nameArch=Scanner(System.`in`).nextLine()
        if (nameArch==""){
            println("Вы ввели пустое имя")
            return
        }
        val archive=Archive(nameArch)
        listOfArchive.add(archive)
        count+=1
        archive.printArchive()
    }

}