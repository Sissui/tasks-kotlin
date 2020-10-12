package Task

class Task  (_name: String){
    private var name: String = ""

    init {
        this.name = _name
    }

    fun getName(): String{
        return this.name
    }
}