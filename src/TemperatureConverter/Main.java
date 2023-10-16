
public class Main {
    public static void main(String[] args) {

        TemperatureConverter DamValoare = new TemperatureConverter();
        System.out.println(" 90'F = "+ TemperatureConverter.toCelsius(90F)+" 'C");
        System.out.println(" 90'C = "+ TemperatureConverter.toFahrenheit(90F)+" 'F");


    }
}
//3.	Creați un proiect Java cu denumirea TemperatureConverter. Creați o clasă Java în interiorul proiectului cu denumirea TemperatureConverter. Definiți în interiorul clasei, două metode care ar urma să transforme temperatura din Celsius în Fahrenheit și invers. Denumirile metodelor ar putea fi următoarele: toCelsius() și toFahrenheit(). Aceste două metode vor primi ca argument valoarea temperaturii care urmează să o convertească și vor returna valoarea convertită.
//        Reveniți într-o clasă care are metoda main. Inițializați un obiect de tipul clasei TemperatureConverter. Apelați metodele toCelsius() și toFahrenheit() transmițând ca argument diferite valori și asigurați-vă că acestea returnează rezultatul corect.
