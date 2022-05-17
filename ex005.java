import java.util.Scanner;
public class ex005 {
    public static void main( String[] args){
        int cod, n1, n2, n3;
        double media;
        Scanner s = new Scanner( System.in);
        

        System.out.print("Digite o código do aluno: ");
        cod = s.nextInt();

        if(cod == 0){
            System.out.print("Fim ");
        }else{
            System.out.print("Digite a nota 1: ");
            n1 = s.nextInt();

            System.out.print("Digite a nota 2: ");
            n2 = s.nextInt();

            System.out.print("Digite a nota 3: ");
            n3 = s.nextInt();

            media = (n1 + n2 + n3) / 3;

            if(media >= 8){
                System.out.print("O aluno ("+ cod +") foi APROVADO.");
            }else if(media > 6){
                System.out.print("O aluno ("+ cod +") foi RECUPERAÇÃO.");
            }else{
                System.out.print("O aluno ("+ cod +") foi REPROVADO.");
            }
            
        }

        s.close();
    }
}
