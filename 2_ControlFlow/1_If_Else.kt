fun main() {
    print("Enter your age: ")
    val age = readLine()!!.toInt()

    if(age >= 18){
        println("You are eligible to vote.")
    }else{
        println("You are not eligible to vote yet.")
    }

    print("Enter a Number: ")
    val n = readLine()!!.toInt()
    
    if(n%2==0){
        println("The Number is Even")
    }else{
        println("The Number is Odd.")
    }
}
