fun main() {
    val carsList = arrayListOf<Car>()
    var isContinue = true
    while (isContinue) {
        print("Do you want to build a new car : Y/N ? ")
        when (readLine()?.uppercase()) {
            "Y" -> {
                val car = Car()
                print("Enter Car Name: ")
                car.name = readLine()!!
                print("Enter Car Model: ")
                car.model = readLine()!!
                print("Enter Number Of Car Doors: " )
                car.doors = readLine()!!.toInt()
                print("Enter Car Price: ")
                car.price = readLine()!!.toInt()
                carsList.add(car)
            }
            "N" -> isContinue = false
            else -> {
                println("Invalid character! Please Retry")
                continue
            }
        }
    }
    for (_car in carsList)
    {
        _car.showCarsDetails()
    }
}
