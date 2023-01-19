import java.util.Scanner;

public class EstudandoComandos {

    public static void main(String[] args) {

        int  vInteiro;
        double vDouble;
        String  vString;
        String vFrase;
        float vFloat;

        //Estudando os comandos de entrada

        try (Scanner entrada = new Scanner (System.in)){
        System.out.printf("Informe uma frase: ");
        vFrase = entrada.nextLine();
        System.out.println("A frase é: " + vFrase);

        System.out.printf("Informe uma palavra: ");
        vString = entrada.next();
        System.out.println("A palavra é: " + vString);

        System.out.printf("Informe um número inteiro: ");
        vInteiro = entrada.nextInt();
        System.out.println("O número é: " + vInteiro);

        System.out.printf("Informe um double: ");
        vDouble = entrada.nextDouble();
        System.out.println("O número é: " + vDouble);

        System.out.printf("Informe um float: ");
        vFloat = entrada.nextFloat();
        System.out.println("O número é: " + vFloat);
        }

    
}

}
 