fun main(){

    val list =mutableListOf<Int>()
    printl("entrer des nembers separes par espace")
    val chain=readLin()?:return
    val nembers=chain.split("").mapNotNull{it.toIntOrNull()}
    val maxNumber=numbers.maxOrNull()
    printl("le max number $maxNumber")
   

}