

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        String calculadora;
        double resultado, numA, numB;
        numA = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro número: "));
        numB = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo número: "));
        calculadora = JOptionPane.showInputDialog("""
                                                  Informe a operação desejada
                                                  Para adição: +
                                                  Para subtração: -
                                                  Para multiplicação: *
                                                  Para divisão: /
                                                  """);
        char calculadoraCHAR = calculadora.charAt(0);
        switch (calculadoraCHAR) {
            case '+':
                resultado = numA + numB;
                JOptionPane.showMessageDialog(null, "A soma é: " + resultado);
                break;
            case '-':
                resultado = numA - numB;
                JOptionPane.showMessageDialog(null, "A subtração é: " + resultado);
                break;
            case '*':
                resultado = numA * numB;
                JOptionPane.showMessageDialog(null, "A multiplicação é: " + resultado);
                break;
            case '/':
                resultado = numA / numB;
                JOptionPane.showMessageDialog(null, "A divisão é: " + resultado);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida! ");
                break;
        }

    }
}
