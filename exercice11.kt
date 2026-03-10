fun main(){

    val list =mutableListOf<Int>()
    printl("entrer des nembers separes par espace")
    val chain=readLin()?:return
    val nembers=chain.split("").mapNotNull{it.toIntOrNull()}
    val numbersImpair=numbers.filter{it%2 !=0}
    printl("les list des nomber impair $numbersImpair")

}