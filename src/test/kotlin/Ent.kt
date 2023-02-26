import java.lang.Exception

data class Ent(var motFr:String, var motAng:String) {
    init {
        if (motFr.isEmpty() || motFr.isBlank()){
            throw Exception("Le mot français ne peut pas etre empty ou blank !")
        }

        if (motAng.isEmpty() || motAng.isBlank()){
            throw Exception("Le mot anglais ne peut pas etre empty ou blank !")
        }
    }
    //toString
    override fun toString(): String {
        return "$motFr : $motAng"
    }
    //Equals
    fun equals(other: Ent): Boolean {
        return this.motFr == other.motFr
    }
}