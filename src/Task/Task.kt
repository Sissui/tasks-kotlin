package Task

class Task  (_content: String){
    private var content: String = ""

    init {
        this.content = _content
    }

    fun getContent(): String{
        return this.content
    }
}