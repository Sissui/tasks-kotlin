package FileLogic

import Task.Task
import Task.TaskLogic
import java.io.File

class FileLogic (taskLogic: TaskLogic){
    var tl: TaskLogic

    init {
        this.tl = taskLogic
    }

    private var tasks: List<Task> = this.tl.getTasks()

    fun writeToFile(){
        println(this.tasks)
        this.tasks.forEach{element -> File("text.txt").bufferedWriter().use { out -> out.write(element.getName()) }}
    }
}