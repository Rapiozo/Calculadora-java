import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    System.out.println("Digite o primeiro número: ");
        double num1 = input.nextDouble();

    System.out.println("Digite o segundo número: ");
        double num2 = input.nextDouble();

    System.out.println("Digite a operação desejada (+, -, *, /): ");
        char operação = input.next().charAt(0);
        double resultado;
        switch (operação) {
            case '+':
            resultado = num1 + num2;
        System.out.println("Resultado: " + resultado);
            break;
            case '-':
            resultado = num1 - num2;
        System.out.println("Resultado: " + resultado);
            break;
            case '*':
            resultado = num1 * num2;
        System.out.println("Resultado: " + resultado);
            break;
            case '/':
            if (num2 == 0) {
        System.out.println("Erro: Divisão por zero não é permitida.");
            } else {
            resultado = num1 / num2;
        System.out.println("Resultado: " + resultado);
            }
            break;
            default:
        System.out.println("Operação inválida.");
            }
            input.close();
        }
    }
