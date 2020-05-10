import java.util.Scanner
import kotlin.system.exitProcess

class UnitConverter {

    fun main() {
        println("Welcome to Unit Converter!")
        println("What unit do you want to convert?")
        println("Type only the letter written in the options provided below")
        println("Miles to Kilometers: m")
        println("Kilometers to Miles: k")
        println("Fahrenheit to Celsius: f")
        println("Celsius to Fahrenheit: c")
        println("Quit: q")
        print("Type the desired conversion option: ")
        var sc = Scanner (System.`in`)
        //This is the option chosen by the users for conversion
        var conversionChoice = sc.next()
        if (conversionChoice.toLowerCase().equals("m")) {
            print("Enter the miles to be converted to Kilometer: ")
            var mileToConvert = sc.nextDouble()
            var returnKm = mileToKm(mileToConvert)
            println("The Kilometer equivalent of $mileToConvert miles is: $returnKm km")
        }
        else if (conversionChoice.toLowerCase().equals("k")) {
            print("Enter the Kilometers to be converted to miles: ")
            var kmToConvert = sc.nextDouble()
            var returnMile = kmToMile(kmToConvert)
            println("The miles equivalent of $kmToConvert km is: $returnMile miles")
        }
        else if (conversionChoice.toLowerCase().equals("f")) {
            print("Enter the Fahrenheit to be converted to Celsius: ")
            var fToConvert = sc.nextDouble()
            var returnCelsius = fToC(fToConvert)
            println("The Celsius equivalent of $fToConvert Fahrenheit is: $returnCelsius Celsius")
        }
        else if (conversionChoice.toLowerCase().equals("c")) {
            print("Enter the Celsius to be converted to fahrenheit: ")
            var cToConvert = sc.nextDouble()
            var returnFahrenheit = mileToKm(cToConvert)
            println("The Fahrenheit equivalent of $cToConvert Celsius is: $returnFahrenheit Fahrenheit")
        }
        else if (conversionChoice.toLowerCase().equals("q")) {
            println("Thank you for using the program, have a good day!")
            exitProcess(0)
        }
        else {
            println("Invalid option please try again")
        }

    }

    private fun mileToKm(miles: Double): Double {
        return miles * 1.60934
    }

    private fun kmToMile(km: Double): Double {
        return km * 0.621371
    }
    private fun fToC(f: Double): Double {
        return (f - 32) * (5.0/9.0)
    }
    private fun cToF(c: Double): Double {
        return c * (9.0/5.0) + 32
    }

}