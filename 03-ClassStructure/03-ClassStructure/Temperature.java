public class Temperature
{
    public static double CelsiusToKelvin(double Celsius)
    {
        return Celsius + 273.15;
    };
    
    public static double CelsiusToFehrenheit(double Celsius)
    {
        return Celsius * 1.8 + 32;
    };
    
    public static double KelvinToCelsius(double Kelvin)
    {
        return Kelvin - 273.15;
    };
    
    public static double KelvinToFahrenheit(double Kelvin)
    {
        return 1.8*(Kelvin - 273) + 32;
    };
    
    public static double FahrenheitToCelsius(double Fahrenheit)
    {
        return 5/9 * (Fahrenheit - 32);
    };
    
    public static double FahrenheitToKelvin(double Fahrenheit)
    {
        return (Fahrenheit + 459.67) * 5/9;
    };
    
    public static void main(String[] args) 
    {
        System.out.println(CelsiusToFehrenheit(25));
        System.out.println(CelsiusToKelvin(25));
        
        System.out.println(FahrenheitToKelvin(100));
        System.out.println(FahrenheitToCelsius(100));
        
        System.out.println(KelvinToCelsius(0));
        System.out.println(KelvinToFahrenheit(0));
        
    };
}