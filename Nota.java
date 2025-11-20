import javax.annotation.processing.SupportedSourceVersion;
import javax.print.attribute.standard.Media;
import java.util.Scanner;

public class Nota {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite a Primeira nota de 1 a 10:");
        double Pnota = s.nextDouble();
        System.out.println("Digite a Segunda nota de 1 a 10: : ");
        double Snota = s.nextDouble();
        System.out.println("Digite a Terceira nota de 1 a 10: ");
        double Tnota = s.nextDouble();
        System.out.println("Digite a Quarta nota de 1 a 10: ");
        double Qnota = s.nextDouble();

     double Media = (Pnota + Snota + Tnota + Qnota) /4;
        System.out.println("A Sua Media é: "  + Media);
        if (Media >+ 7.00  ){
            System.out.println("Voce está Aprovado");
        }else if(Media == 5 ){
            System.out.println("Voce está de Recuperação");
        }else{
            System.out.println("Voce está Reprovado");
        }
    }
}
