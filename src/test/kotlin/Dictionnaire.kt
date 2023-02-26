

class Dictionnaire {
    //1
    var Dictionnaire:MutableList<Ent> = mutableListOf()

    //2
    fun nombresEntrées():Int{
        return Dictionnaire.size
    }

    //add
    fun ajouter(e:Ent){
        if (Dictionnaire.contains(e)){
            throw Exception("le mot existe déjà")
        }else {
            Dictionnaire.add(e)
        }
    }

    //remove
    fun supprimer(e:Ent):Boolean{
        if(Dictionnaire.contains(e)) {
            Dictionnaire.remove(e)
            return true
        }else {
            throw Exception("N'existe pas !!")
            return false
        }
    }

    //remove
    fun supprimer(motEnglish:String):Boolean{
        var et = false
        for (entre in Dictionnaire){
            if (entre.motAng==motEnglish){
                Dictionnaire.remove(entre)
                et=true
            }else {
                throw Exception("N'existe pas !!")
                et=false
            } }
        return et
    }

    fun frAn(motFrench:String): MutableList<String> {
        val motsAnglais = mutableListOf<String>()
        for (entree in Dictionnaire) {
            if (entree.motFr == motFrench) {
                motsAnglais.add(entree.motAng)
            }
        }
        return motsAnglais
    }

    fun motsFrançais(): Set<String> {
        return Dictionnaire.map { it.motFr }.toSet()
    }

    fun dictionnaireFrAn():HashMap<String,ArrayList<String>>{
        val dictionnaire = HashMap<String, ArrayList<String>>()
        for (entree in Dictionnaire) {
            val motsAnglais = dictionnaire.getOrDefault(entree.motFr, ArrayList())
            motsAnglais.add(entree.motAng)
            dictionnaire[entree.motFr] = motsAnglais
        }
        return dictionnaire
    }
    //toString
    override fun toString():String{
        val str = StringBuilder()
        for (entree in Dictionnaire) {
            str.append(entree.toString())
        }
        return str.toString()
    }
}
