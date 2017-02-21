package edu.ucsd.cs110.temperature;
public class Fahrenheit extends Temperature
{
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        float cTemp = (float) ((getValue() - 32)/1.8);
        return new Celsius(cTemp);
    }

    @Override
    public Temperature toFahrenheit() {
        return new Fahrenheit(getValue());
    }

    public String toString()
    {
        // TODO: Complete this method
        return getValue() + " F";
    }
}
