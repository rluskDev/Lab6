package edu.ucsd.cs110.temperature;

public class Celsius extends Temperature
{
    public Celsius(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        return new Celsius(getValue());
    }

    @Override
    public Temperature toFahrenheit() {
        float fTemp = (float) (getValue()*1.8 + 32);
        return new Fahrenheit(fTemp);
    }

    public String toString()
    {
        // TODO: Complete this method
        return getValue() + " C";
    }
}

