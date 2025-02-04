

import java.util.Objects
import java.util.Scanner
fun main() {
    var scanner=Scanner(System.`in`)
    val menuArch = Menu()

    val listArchive=menuArch.listOfArchive

    try {
        while(true){

            menuArch.menu()

            val num=scanner.nextInt()
            val exitCode=listArchive.size+1

            when(num){
                0->menuArch.addArchive()
                in 1 until exitCode-> {
                    var flag=true
                    try {
                        while (flag){
                            val menuNote=Menu2(listArchive[num-1])
                            val listNote=menuNote.listOfNote
                            menuNote.menu2()
                            val num2=scanner.nextInt()
                            var exitCode2=listNote.size+1
                            when(num2){
                                0->menuNote.addNote()
                                in 1..exitCode2->{
                                    println("текст "+menuNote.listOfNote[num2-1].name+": "+menuNote.listOfNote[num2-1].text)
                                }
                                exitCode2->{
                                    println("Выход")
                                    flag=false
                                }
                            }
                        }
                    }catch (e:Exception){
                        println("Введите число")
                    }

                }
                exitCode->{
                    println("Выход")
                    return
                }
                else->{
                    if(num !in 0..exitCode){
                        println("такого числа нет")
                    }
                }
            }
        }
    }catch (e:Exception){
        println("Введите число")

    }




}

