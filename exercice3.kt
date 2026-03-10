fun main(){
    println("taper un number par facteurial ")
    val nb=readLin()
    val number=nb?.toIntOrNull()
    if(nember==Null){
        println("Error , No saisir un number")
    }
    else{
        var facteurial:int=1
        for(i in 1..nb){
            facteurial = facteurial * i 
        } 
        println("le facteurial de number $nb c'est $facteurial")  
    }
}