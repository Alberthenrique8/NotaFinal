import java.util.Scanner;

public class Nota {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite a Primeira nota de 1 a 10:");
        double Pnota = s.nextDouble();

        System.out.println("Digite a Segunda nota de 1 a 10:");
        double Snota = s.nextDouble();

        System.out.println("Digite a Terceira nota de 1 a 10:");
        double Tnota = s.nextDouble();

        System.out.println("Digite a Quarta nota de 1 a 10:");
        double Qnota = s.nextDouble();

        double Media = (Pnota + Snota + Tnota + Qnota) / 4;

        System.out.println("A Sua Media é: " + Media);

        if (Media >= 7.0) {
            System.out.println("Você está APROVADO");
        } else if (Media >= 5.0 && Media < 7.0) {
            System.out.println("Você está de RECUPERAÇÃO");
        } else {
            System.out.println("Você está REPROVADO");
        }
    }
}
