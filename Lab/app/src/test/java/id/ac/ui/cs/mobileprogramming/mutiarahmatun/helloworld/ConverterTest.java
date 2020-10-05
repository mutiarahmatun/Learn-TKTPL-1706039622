package id.ac.ui.cs.mobileprogramming.mutiarahmatun.helloworld;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterTest {

    @Test
    public void convertFahrenheitToCelcius() {
        float input = 212;
        float output;
        float expected = 100;
        double delta = .1;

        ConverterUtil converter = new ConverterUtil();
        output = converter.convertFahrenheitToCelcius(input);

        assertEquals(expected, output, delta);
    }

    @Test
    public void convertCelciusToFahrenheit() {
        float input = 100;
        float output;
        float expected = 212;
        double delta = .1;

        ConverterUtil converter = new ConverterUtil();
        output = converter.convertCelciusToFahrenheit(input);

        assertEquals(expected, output, delta);
    }
}