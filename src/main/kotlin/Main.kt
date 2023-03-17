fun main(){
    number()
    println(peopleNames(arrayOf("Makena", "Sally", "Favour","Samuel", "Kinya")))
    robot(3)
    robot(13)
    robot(24)
    numbers()

}

//1. Create a function that prints out all the odd numbers between 1 and 100.
fun number(){
    for (value in 1..100){
        if (value % 2==1){
            println(value)
        }
    }
}

//2. Create a function that takes in an array of names and returns the number of
//names longer than 5 characters.
fun peopleNames(names:Array<String>):Int{
    var Z = 0
    for (name in names){
        if ( name.length>5)
            Z ++
    }
    return Z
}

//3.You are creating a robot to serve drinks at a party. The robot is required to
//serve a glass of milk for guests under the age of 6. For guests under the age of
//15 but over the age of 6, the robot serves a bottle of fanta orange. Everybody
//else gets a bottle of coca cola. Create a function that will make these
//decisions, printing out the name of the drink each person gets according to
//their age.

fun robot(age:Int){
    when(age){
        in 1..5 -> println("milk")
        in 6..14 -> println("fanta orange")
        else -> println("coca-cola")
    }
}

//4.Write a function that prints each number from 1 to 100 on a new line. For each
//multiple of 3, print "Fizz" instead of the number. For each multiple of 5, print
//"Buzz" instead of the number. For numbers which are multiples of both 3 and
//5, print "FizzBuzz" instead of the number.

fun numbers(){
    for (value in 1..100){
        if (value % 3 == 0){
            println("Fizz")
        }
        else if (value % 5 == 0){
            println("Buzz")
        }
        else if (value % 15 == 0){
            println("FizzBuzz")
        }
        else{
        }
    }
}

