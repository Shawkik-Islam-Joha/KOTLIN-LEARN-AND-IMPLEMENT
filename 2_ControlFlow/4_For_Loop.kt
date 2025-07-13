fun main(){
    for(i in 1..3)println(i)            // Output: 1 2 3
    for(i in 10 downTo 1)println(i)     // Output: 5 4 3 2 1
    for(i in 1..100 step 10)println(i)  // Output: 1 3 5 7 9
    for(i in 1 until 5)println(i)       // Output: 1 2 3 4 

    // Loop through array
    var names = listOf("Joha","Junan","Jawaher")
    for(name in names)println(name)

    val colors = listOf("Red","Green","Blue")
    for((index,color) in colors.withIndex())println("$index position color is $color.")

}