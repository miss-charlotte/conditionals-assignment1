fun main() {
    //a car is moving at a speed of 1000m/s at an acceleration of 25m/s. Find the time it will take to move a distance of 5km
    val speed = 1000.0
    val acceleration = 25.0
    val distance = 5000.0 //meters
    val finalSpeedSquared: Double = (speed * speed + 2 * acceleration * distance)
    val finalSpeed = kotlin.math.sqrt (finalSpeedSquared)
    val time  = (finalSpeed - speed) / acceleration
    println("The time it will take to cover 5km is $time seconds")

    //A person has the option of choosing between pizza, chicken, pancakes or cake.
    //If they choose pizza, they'll go to pizza hut
    //If they choose chicken, they go to KFC
    //If they choose pancakes, they go to foodhub
    //If they choose cake, they go to Cakely
    //Write a program using an if statement that captures a person's choice and prints selected restaurant
    //same program using a when statement

    //if statement
    println("Please choose food of your choice")
    val choice = readln()
    if (choice == "pizza") {
        println("Please go to Pizza Hut")
    } else if (choice == "chicken") {
        println("Please go to KFC")
    } else if (choice == "pancakes") {
        println("Please go to FoodHub")
    } else if (choice == "cake") {
        println("Please go to Cakely")
    } else {
        println("Not available")
    }

    //when statement
    println("Please choose food of your choice")
    val food = readln()
    when (food) {
        "pizza" ->  println("Please go to Pizza Hut")
        "chicken" ->  println("Please go to KFC")
        "pancakes" ->  println("Please go to FoodHub")
        "cake" ->  println("Please go to Cakely")
        else ->  println("Not available")
    }

    //solve the equation x * x + 10x + 25 =0
    val a = 1.0
    val b = 10.0
    val c = 25.0

    val discriminant = b * b - 4 * a * c
    if (discriminant > 0.0) {
        val root1 = (-b + kotlin.math.sqrt(discriminant)) / (2 * a)
        val root2 = (-b - kotlin.math.sqrt(discriminant)) / (2 * a)
        println("The roots are: x1 = $root1 and x2 = $root2")
    }
    else if (discriminant == 0.0) {
        val root = -b / (2 * a)
        println("The roots is: x = $root")
    }
    else {
        println("The equation has no real roots")
    }

    //solve the equation x * x * x + 7(x * x) + 10x = 0
    val x = 1.0
    val y = 7.0
    val z = 10.0

    val discriminantEquation = y * y - 4 * x * z

    if (discriminantEquation >= 0.0) {
        val root1 = (-y + kotlin.math.sqrt(discriminantEquation)) / (2 * x)
        val root2 = (-y - kotlin.math.sqrt(discriminantEquation)) / (2 * x)
        println("The roots are: x1 = 0, x2 = $root1, x3 = $root2")
    }
    else {
        println("The equation has no real roots")
    }


    //A person is moving to his village with a car moving at 20km/hr and he has many alternative routes
    //If he uses route 1, he will move a distance of 5000km
    //If he uses route 2, he will move a distance of 25000km
    //If he uses route 3, he will move a distance of 50000km
    //If he uses another, he will move a distance of 10000km
    //find the time it will take him to reach the village using separate routes

    //using if statement
    //this is somewhat hard for me though i will keep trying

    //using when statement
    println("Choose the route of your choice")
    val constantSpeed = 20.0
    val selectedRoute = readln()
    val timeOfArrival = when (selectedRoute) {
        "route1" -> 5000 / constantSpeed
        "route2" -> 25000 / constantSpeed
        "route3" -> 50000 / constantSpeed
        else -> 10000 / constantSpeed
    }
    println("If he uses $selectedRoute, he will reach his village in $timeOfArrival hours")
}