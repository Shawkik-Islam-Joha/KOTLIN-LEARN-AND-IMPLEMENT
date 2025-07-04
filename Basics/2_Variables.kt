fun main(){
    var name = "Joha"   // Variable type, can modify
    val pi = 3.1416     // Value type, can't modify once assigned

    // Kotlin can automatically detect data types, but you can also define them
    var age: Int = 22

    println("Hello my name is $name and I am $age years old.")
    // Prints using variables

    var a = 12
    var b = 24
    var sum = a+b   // Storing value of addition
    println(sum)    // Print sum using variable
    println(a+b)    // Print sum directly
}