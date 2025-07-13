fun main(){
    var name = "Joha"   // Variable type, can modify
    val pi = 3.1416     // Value type, can't modify once assigned

    // Kotlin can automatically detect data types, but you can also define them
    var age: Int = 22
    var institution: String = "CUET"
    var section: Char = 'C'
    var isEven: Boolean = true

    println("Hello my name is $name\nI am $age years old.\nI am persuing my B.Sc from $institution.")  // Prints using variables

    var a = 12
    var b = 24
    var sum = a+b   // Storing value of addition
    println(sum)    // Print sum using variable
    println(a+b)    // Print sum directly

    var x = 12
    print("The Number is $x and ")  // Doesn't add newline
    println("it is even")           // Adds a newline

    x+=10   // 10 increment of x

    val numbers = arrayOf(10, 20, 30, 40)   // Array declaration
    val names = arrayOf("Joha","Junan","Jawaher")

    println(numbers[2]) // Print 3rd element
    println(names[2])   // Print 3rd element
}