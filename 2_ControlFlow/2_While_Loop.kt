fun main(){
    var a:Int = 1; var i:Int = 1
    while(a <= 10){
        // Loop will run as long as a is non-zero
        i = 1
        while(i <= 10){
            print("$a x $i = ")
            println(a*i)
            i++
        }
        a++
        println("______________")
    }
}