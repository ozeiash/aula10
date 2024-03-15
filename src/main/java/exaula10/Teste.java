/*
 * Copyright (C) 2024 Ozeias Campos <ozeiash@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package exaula10;

import java.util.Scanner;

/**
 *
 * @author Ozeias Campos <ozeiash@gmail.com>
 * @date 14/03/2024
 * @brief Class Teste
 */
public class Teste {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Quadrado quadrado = new Quadrado();
        Triangulo triangulo = new Triangulo();
        Circulo circulo = new Circulo();
        Retangulo retangulo = new Retangulo();

        while (true) {
            System.out.println();
            System.out.println("Escolha uma figura geométrica:");
            System.out.println("1. Quadrado");
            System.out.println("2. Triângulo");
            System.out.println("3. Círculo");
            System.out.println("4. Retângulo");
            System.out.println("5. Sair");

            int escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1:

                    System.out.println("Digite a cor do quadrado:");
                    quadrado.cor = scanner.nextLine();
                    System.out.println("Digite o lado do quadrado:");
                    quadrado.lado = scanner.nextInt();
                    System.out.println();
                    System.out.println(quadrado);

                    break;
                case 2:
                    System.out.println("Digite a cor do triângulo:");
                    triangulo.cor = scanner.nextLine();
                    System.out.println("Digite a base do triângulo:");
                    triangulo.base = scanner.nextDouble();
                    System.out.println("Digite a altura do triângulo:");
                    triangulo.altura = scanner.nextDouble();
                    System.out.println();
                    System.out.println(triangulo);
                    break;
                case 3:

                    System.out.println("Digite a cor do círculo:");
                    circulo.cor = scanner.nextLine();
                    System.out.println("Digite o raio do círculo:");
                    circulo.raio = scanner.nextDouble();
                    System.out.println();
                    System.out.println(circulo);
                    break;
                case 4:

                    System.out.println("Digite a cor do retângulo:");
                    retangulo.cor = scanner.nextLine();
                    System.out.println("Digite o primeiro lado do retângulo:");
                    retangulo.lado1 = scanner.nextDouble();
                    System.out.println("Digite o segundo lado do retângulo:");
                    retangulo.lado2 = scanner.nextDouble();
                    System.out.println();
                    System.out.println(retangulo);
                    break;
                case 5:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção do válida no menu.");
            }
        }
    }

}
