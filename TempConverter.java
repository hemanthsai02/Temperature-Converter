import java.util.*;
public class TempConverter {
    public static void main(String args[]) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the temperature:");
        double temperature = sc1.nextDouble();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter the units:");
        String unit = sc2.nextLine();
        if (unit.equals("celsius")){
            double Fahrenheit1=(temperature*1.8)+32;
            System.out.println("In Fahrenheit="+Fahrenheit1);
            double Kelvin1=(temperature+273.15);
            System.out.println("In Kelvin"+Kelvin1);
        } else if (unit.equals("kelvin")) {
            double celsius1=(temperature-273.15);
            System.out.println("In Celsius"+celsius1);
            double Fahrenheit2=1.8*(temperature-273.15)+32;
            System.out.println("In Fahrenheit"+Fahrenheit2);
        }
        else {
            double celsius2=(temperature-32)/1.8;
            System.out.println("In Celsius"+celsius2);
            double kelvin2=(temperature-32)/1.8+273.15;
            System.out.println("In kelvin"+kelvin2);
        }
    }
}