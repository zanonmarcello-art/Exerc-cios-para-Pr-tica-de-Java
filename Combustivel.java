/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Combustivel {
    
    public static void main(String[] args) {

        double distanciaPercorrida = 450.0; 
        double combustivelGasto = 37.5;      
        
        
        double consumoMedio = distanciaPercorrida / combustivelGasto;

        System.out.println("Distância percorrida: " + distanciaPercorrida + " km");
        System.out.println("Combustível gasto: " + combustivelGasto + " L");
        System.out.println("Consumo médio: " + consumoMedio + " km/L");

    }
}