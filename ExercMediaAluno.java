<<<<<<< HEAD
import java.util.Scanner;

public class MediaAluno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        float nota1 = input.nextFloat();

        System.out.print("Digite a seguda nota: ")
        float nota2 = input.nextFloat();

        floar media =(nota1 + nota2) /2;

        System.out.println("A media do aluno é "+ media);

        if (media >= 7) {
            System.out.println("Aluno aprovado!");
        } else if (media >= 5) {
            System.out.prinln("aluno em recuperação. ");
        } else {
            System.out.println("Aluno reprovado.")
        }

        input.close(); // Sempre fechar o Scanner
    }
=======
import java.util.Scanner;

public class MediaAluno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        float nota1 = input.nextFloat();

        System.out.print("Digite a seguda nota: ")
        float nota2 = input.nextFloat();

        floar media =(nota1 + nota2) /2;

        System.out.println("A media do aluno é "+ media);

        if (media >= 7) {
            System.out.println("Aluno aprovado!");
        } else if (media >= 5) {
            System.out.prinln("aluno em recuperação. ");
        } else {
            System.out.println("Aluno reprovado.")
        }

        input.close(); // Sempre fechar o Scanner
    }
>>>>>>> b432ffe9b0bf5a30dae92d9c9237633b6edd6cdd
}