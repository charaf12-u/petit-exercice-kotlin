fun main(){
    println("saisir un nember")
    val nb=readLine()
    val nember=nb?.toIntOrNull()
    if(nember==Null){
        println("Error , No saisir un number")
    }else{
        if(nb/2==0){
            println("number et paire")
        }else{
            println("number et impaire")
    } 

    
}