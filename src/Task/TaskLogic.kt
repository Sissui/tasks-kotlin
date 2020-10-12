package Task

import java.util.*

class TaskLogic {
    private var tasks = mutableListOf<Task>()

    fun getTasks(): List<Task>{
        print(tasks)
        return this.tasks
    }
    fun addTask(){
        var newTask = Task(readLine()!!)
        this.tasks.add(newTask)
    }

    fun showTasks(){
//        println(tasks)
        this.tasks.forEachIndexed { index, element ->
            println("${index+1}: ${element.getName()}.")
        }
    }
    fun deleteTask(index: Int){
//        for (i in tasks.indices) {
//            if(i == index){
//                tasks.
//            }
//        }
    }
}