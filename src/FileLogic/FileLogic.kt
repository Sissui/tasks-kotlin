package FileLogic

import Task.TaskLogic
import java.io.File

class FileLogic (taskLogic: TaskLogic) {
    var tl: TaskLogic

    init {
        this.tl = taskLogic
    }

    private var tasks: MutableList<String> = this.tl.getTasks()

    fun writeToFile() {

        File("text.txt").bufferedWriter().use { out ->
            this.tasks.forEach{ element -> out.write("${element}\n") }
        }
    }

    fun clearTasks(){
        File("text.txt").forEachLine {element -> this.tasks.remove(element) }
    }

    fun readFromFile(){

        File("text.txt").forEachLine {element -> this.tasks.add(element) }
    }

    fun createEmptyFile(){
        val fileName:String = "text.txt"
        var emptyFile = File(fileName)
        emptyFile.writeBytes(ByteArray(0))
    }
}