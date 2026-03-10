fun main(){
    var sum:int=0
    for(i in 1..5){
        println("taper le nomber $i ")
        var nb=readLin()
        val number=nb?.toIntOrNull()
        if(nember==Null){
            println("Error , No saisir un number")
         }else{
            sum = sum + nb
        }   
    }
    println("la somme c'est $sum")

}