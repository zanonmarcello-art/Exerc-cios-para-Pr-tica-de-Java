/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Conversaodetemperatura {
    public static void main(String[] args) {

        double celsius = 25.0; // Temperatura em Celsius

        // Fórmula: (Fahrenheit = Celsius * 1.8 + 32)
        double fahrenheit = (celsius * 1.8) + 32;

        System.out.println("Temperatura em Celsius: " + celsius + " °C");
        System.out.println("Temperatura em Fahrenheit: " + fahrenheit + " °F");

    }
}