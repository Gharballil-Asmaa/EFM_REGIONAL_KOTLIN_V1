

//1
fun String.isEmptyOrBlank(){
    if (isEmpty()){
        println("Empty")
    }
    if(isBlank()) {
        println("Blank")
    }
}

//2
fun String.acronym(): String {
    var mots= this.split(" ").filter { it.isNotBlank() }
    var acronym = StringBuilder()
    for (m in mots) {
        acronym.append(m[0].uppercase())
    }
    return acronym.toString()
}
