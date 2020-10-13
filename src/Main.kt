import FileLogic.FileLogic
import Task.TaskLogic

fun main(args: Array<String>){

//  MENU
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

            2 -> {println("Deleting isn't working yet")
//                    var index: Int = readLine()!!.toInt();
//                    tl.deleteTask(index)}
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
}