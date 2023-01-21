 class Car {
    var name = ""
    var model = ""
    var price = 0
    var doors = 0
    fun create( parameterName: String,  parameterModel: String,  parameterPrice: Int,  parameterDoors: Int) {
        name = parameterName
        model = parameterModel
        price = parameterPrice
        doors = parameterDoors
    }
    fun showCarsDetails() {
    println("Car Name :$name , Car Model :$model , Car Doors :$doors , Car Price:$price")
    }
}
