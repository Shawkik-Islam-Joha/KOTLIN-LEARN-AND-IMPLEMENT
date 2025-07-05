fun main(){
    println("Enter Your Name:")
    var name = readLine()
    // readLine() takes user input (as long as Enter key not Hit!) in terminal and stores in name variable
    // It takes input as string

    var number = readLine()!!.toInt()
    // Takes input as string and then converts it
    number = number*10

    println("Hello $name")
    println("The modified number is $number")
}