fun main() {
    loopp()
    max()
    min()
    sum()
    average()
}



fun loopp() {
    val myArray = arrayOf(1, 2, 3)
    for (i in myArray) {
        println(i)
    }
    for (i in 10 downTo 5) {
        println("For loop in descending order: $i")
    }
    for (i in 10 downTo 5 step 2) {
        println("For loop in descending and skipping order: $i")
    }
    for (i in 'a'..'z') {
        print("$i ")
    }
}

fun max() {
    val myArray = arrayOf(4,5,8,9,10,2,3)
    var max = myArray[0]
    for (item in myArray) {
        if (item > max) {
            max = item
        }
    }
    println("\nMaximum value is: $max")
}
fun min() {
    val myArray = arrayOf(4,5,8,9,10,2,3)
    var min = myArray[0]
    for (item in myArray) {
        if (item < min) {
            min = item
        }
    }
    println("\nMinimum value is: $min")
}
fun sum() {
    val myArray = arrayOf(4,5,8,9,10,2,3)
    var sum = myArray[0]
    for (i in myArray) {
        sum += i
    }
    println("Sum = $sum")
}

fun average () {
    println("Enter how many numbers to calculate average:\n")
    val num = readLine()?.toInt()
    var avg = 0.00
    var sum = 0.0
    println("Enter $num numbers")
    for (i in 1..num!!) {
        val input = readLine()?.toInt()
        //if (input != null) {
            sum += input!!
            avg = sum/num
        //}
    }
    println("Average = $avg")
}
