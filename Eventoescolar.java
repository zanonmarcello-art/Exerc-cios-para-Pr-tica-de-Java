/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Eventoescolar{

    public static void main(String[] args) {

        int participantes = 150;      // Número de pessoas no evento
        double valorIngresso = 15.0;  // Preço do ingresso em R$

        double arrecadacao = participantes * valorIngresso;

        System.out.println("Total de participantes: " + participantes);
        System.out.println("Valor do ingresso: R$ " + valorIngresso);
        System.out.println("Arrecadação total: R$ " + arrecadacao);

    }
}