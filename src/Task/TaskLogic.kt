package Task

import java.util.*

class TaskLogic {
    private var tasks = mutableListOf<String>()

    fun getTasks(): MutableList<String>{
        return this.tasks
    }
    fun addTask(){
        var newTask = Task(readLine()!!)
        this.tasks.add(newTask.getName())
    }

    fun showTasks(){
        var i: Int = 0
        this.tasks.forEach {element -> println("${++i}: ${element}")

        }
        println("1. Add Task, 2. Remove Task, 3. Clear Tasks  4. Exit")
    }
//    fun deleteTask(i: Int){
//       this.tasks.forEachIndexed{index, element ->
//           if(index == i){
//               element.remove
//           }
//       }
//    }
}