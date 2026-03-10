import kotlin.random.Random
fun main(){
    var num =0
    val ran =Random.nextInt(1 ,21)
    do{
        printl("entrer un nember")
        var n = readLin()
        num = n?.toIntOrNull()
        if(num == Null){
            Throw Exeption("tu dois entrer un nember entier")
        }else{
            if(num>ran){
                printl("Plus Grand") 
            }else if(num<ran){
                println("Plus pas")
            }
        }
    }while(num!=ran)
    println("correct Félicitation")
}