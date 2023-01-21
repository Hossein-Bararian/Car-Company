class Car {
    var name = ""
    var model = ""
    var price = 0
    var doors = 0
    fun create() {
        print("Enter Car Name: ")
        name = readLine()!!
        print("Enter Car Model: ")
        model = readLine()!!
        print("Enter Number Of Car Doors: ")
        doors = readLine()!!.toInt()
        print("Enter Car Price: ")
        price = readLine()!!.toInt()
        println("$name Created !")
    }

    fun showCarsDetails() {
        println("Car Name :$name , Car Model :$model , Car Doors :$doors , Car Price:$price")
    }
}
