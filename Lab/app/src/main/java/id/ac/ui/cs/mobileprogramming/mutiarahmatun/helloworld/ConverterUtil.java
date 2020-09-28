package id.ac.ui.cs.mobileprogramming.mutiarahmatun.helloworld;

public class ConverterUtil {
    public static float convertFahrenheitToCelcius(float fahrenheit) {
        float result = ((fahrenheit - 32) * 5 / 9);
        return result;
    }
    public static float convertCelciusToFahrenheit(float celcius) {
        float result = ((celcius * 9) / 5) + 32;
        return result;
    }
}
