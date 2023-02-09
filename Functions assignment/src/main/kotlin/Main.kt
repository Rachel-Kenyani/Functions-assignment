fun main() {
    greetings("Rachel")

   divide(24,5)
    var result =divide(24,5)
    println(result)

    add(65,3,1,1)
    var sum =add(65,3,1,1)
    println(sum)

    aboutMe()

}
fun greetings(name: String){
    println("Hello $name")
}

fun divide(num1: Int, num2: Int): Int {
    return num1 % num2
}

fun add(num1:Int, num2:Int,num3:Int, num4:Int):Int {
    var sum =num1+num2+num3+num4
    return sum
}

fun aboutMe() {
    var funfact=("I love sewing.")
    println(funfact)
}