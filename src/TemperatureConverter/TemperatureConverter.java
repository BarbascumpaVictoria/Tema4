public class TemperatureConverter {

    public static float toCelsius(float F){
        float celsius1 = (5*(F-32))/9;
        return celsius1;
    }
    public static float toFahrenheit(float C){
        float fahrenheit1 = (9*C+(32*5))/5;
        return fahrenheit1;
    }
}
