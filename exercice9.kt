fun main(){
    printl("saisir plusieur nembers")
    val numbers = readLin()
    val splitNembers = nembers.split(" ")
    val listN=mitableList(splitNembers)
	val somme=0
	for(num in listN){
		somme=somme+num
	}
    printl(la somme c'est : $somme)
}

fun main(){
    var somme:Int=0
    var nomberlistes = mutableListOf<Int>()
    printl("saisir des nembers separes par espace")
    val saisi = readLin()?:return
    val saisitables =saisi.split("")
    for(item in saisitables){
        val item2=item?.toIntOrNull()
        if(item2!=Null){
            nomberlistes.add(item2)
        }
    }
    printl("les membres de la liste sont :")
    for(i in nomberlistes){
        println(i)
        somme+=i
    }
    printl(la somme c'est : $somme)
}