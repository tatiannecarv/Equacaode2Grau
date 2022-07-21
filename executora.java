package aula7;

import java.util.Scanner;

public class executora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Delta delta = new Delta();
        EqXn eqX = new EqXn();

        System.out.println("Considere a Equacao: Ax^2 Bx C = 0 informe os valores.");
        System.out.println("------------------------------------------------------");
        System.out.println("Valor de A?");
        delta.setA(entrada.nextDouble());
        while (delta.getA() == 0) {
            System.out.println("Erro, digite um valor diferente de 0");
            System.out.println("Valor de A?");
            delta.setA(entrada.nextDouble());
        }
        System.out.println();
        System.out.println("Valor de B?");
        delta.setB(entrada.nextDouble());
        System.out.println("Valor de C?");
        delta.setC(entrada.nextDouble());
        delta.calculaDelta();
        System.out.println(" --- Resultados da Equacao ---");
        System.out.println("Delta: " + delta.getDelta());
        eqX.setA(delta.getA());
        eqX.setB(delta.getB());
        eqX.setC(delta.getC());
        eqX.calculaXn(delta.getDelta());
        eqX.calculaXp(delta.getDelta());
        System.out.println("X |: " + eqX.getXn());
        System.out.println("X ||: " + eqX.getXp());
    }
}
