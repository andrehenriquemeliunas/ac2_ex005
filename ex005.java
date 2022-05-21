import java.util.Scanner;
public class ex005 {
    public static void main( String[] args){
        int cod;
        double n1, n2, n3;
        double media;
        
        Scanner s = new Scanner( System.in);
        
        do{
            System.out.print("Digite o código do aluno (0 - Encerra o programa): ");
            cod = s.nextInt();

            if (cod == 0){
                System.out.print("Obrigado por usar o programa! FIM!");
            }else{
                System.out.print("Digite a nota 1: ");
                n1 = s.nextDouble();

                System.out.print("Digite a nota 2: ");
                n2 = s.nextDouble();

                System.out.print("Digite a nota 3: ");
                n3 = s.nextDouble();

                media = (n1 + n2 + n3) / 3;

                if(media >= 8){
                    System.out.println("-------------------------");
                    System.out.println("Código aluno: "+ cod);
                    System.out.println("Média: "+ media);
                    System.out.println("Situação: APROVADO.");
                    System.out.println("-------------------------");
                }else if(media > 6){
                    System.out.println("-------------------------");
                    System.out.println("Aluno: "+ cod);
                    System.out.println("Média: "+ media);
                    System.out.println("Situação: RECUPERAÇÃO");
                    System.out.println("-------------------------");
                }else{
                    System.out.println("-------------------------");
                    System.out.println("Aluno: "+ cod);
                    System.out.println("Média: "+ media);
                    System.out.println("Situação: REPROVADO");
                    System.out.println("-------------------------");
                }
            }
            
        }while(cod != 0);

        s.close();
    }
}
