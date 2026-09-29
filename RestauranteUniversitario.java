/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class RestauranteUniversitario {
    public static void main(String[] args) {

        int quantidadeRefeicoes = 40; // Quantidade de refeições no mês
        double valorRefeicao = 5.50;  // Valor fixo por refeição em R$

        double gastoMensal = quantidadeRefeicoes * valorRefeicao;

        System.out.println("Quantidade de refeições: " + quantidadeRefeicoes);
        System.out.println("Gasto mensal: R$ " + gastoMensal);

    }
}