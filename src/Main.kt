import FileLogic.FileLogic
import Task.TaskLogic

fun main(args: Array<String>){
    var tl = TaskLogic()

    tl.addTask()
    tl.addTask()
    tl.addTask()
    tl.showTasks()
    var fl = FileLogic(tl)
    fl.writeToFile()

}