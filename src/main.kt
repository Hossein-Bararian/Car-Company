fun main() {
    val carsList = arrayListOf<Car>()
    var isContinue = true
    while (isContinue) {
        print("Do you want to build a new car : Y/N ? ")
        when (readLine()?.uppercase()) {
            "Y" -> {
                val car = Car()
                car.create()
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
