fun main(){
    println("Starting for loop: ")
    for(number in 1..100){
        // variable i from 1 to 100(inclusive)
        println(number)
    }

    //we can loop through array too

    val fruits = listOf("Apple", "Banana", "Mango")
    for (fruit in fruits) {
        println(fruit)
    }

}