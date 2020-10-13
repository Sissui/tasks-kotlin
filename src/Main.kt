import FileLogic.FileLogic
import Task.TaskLogic
import java.io.File
import java.io.FileNotFoundException

fun main(args: Array<String>){

//  MENU
    try{
    var tl = TaskLogic()
    var fl = FileLogic(tl)
    fl.readFromFile()

    var option: Int = -1
    while(option != 4){
        tl.showTasks()

        option = readLine()!!.toInt()
        when(option){
            1 -> {println("What's the task?")
                    tl.addTask()
                    fl.writeToFile()
            }

            2 -> {println("Type number of Task <only one> that you have done or you want to remove!")
                    var index: Int = readLine()!!.toInt();
                    tl.deleteTask(index)
                    fl.writeToFile()
            }

            3 -> {fl.clearTasks()
                    println("All tasks are cleared")
                    fl.writeToFile()
            }

            4-> { println("Bye! Remember about your tasks!")
                    return
            }
            else -> println("Choose correct option. Try Again!")
        }
    }
    }catch (e: FileNotFoundException){
        // w File logic utworzyc pusty kontruktor dla tego przypadku
        val tl = TaskLogic()
        val fl = FileLogic(tl)
        print("File 'file.txt' was missing so we created one for you. Don't bother and rerun your app.")
        fl.createEmptyFile()
    }
}