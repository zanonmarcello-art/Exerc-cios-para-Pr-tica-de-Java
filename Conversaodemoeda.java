/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Conversaodemoeda{

    public static void main(String[] args) {

        double valorReais = 1000.0; // Valor a converter em R$
        double cotacaoDolar = 5.30; // Cotação fixa do dólar[span_6](start_span)[span_6](end_span)

        double valorDolares = valorReais / cotacaoDolar;

        System.out.println("Valor em Reais: R$ " + valorReais);
        System.out.println("Valor em Dólares: US$ " + valorDolares);

    }
}