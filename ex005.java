import java.util.Scanner;
public class ex005 {
    public static void main( String[] args){
        int cod; //Declaração das variáveis
        double n1, n2, n3;//Declaração das variáveis
        double media;//Declaração das variáveis
        String sit;//Declaração das variáveis
        
        Scanner s = new Scanner( System.in);//Inicia o scanner
        
        do{//Laço de repetição
            System.out.print("Digite o código do aluno (0 - Encerra o programa): ");//Pergunta o código do aluno
            cod = s.nextInt();//Armazena o código do aluno

            if (cod == 0){//Verifica se o usuário digitou 0 para falar que o programa encerrou
                System.out.print("Obrigado por usar o programa! FIM!");//Mostra ao usuário que o prog. acabou
            }else{//Se o usuário não digitou 0, continua
                System.out.print("Digite a nota 1: ");//Pede a nota 1
                n1 = s.nextDouble();//Armazena nota 1

                System.out.print("Digite a nota 2: ");//Pede a nota 2
                n2 = s.nextDouble();//Armazena nota 2

                System.out.print("Digite a nota 3: ");//Pede a nota 3
                n3 = s.nextDouble();//Armazena nota 3

                media = (n1 + n2 + n3) / 3;//Calculo da média

                if(media >= 8){//Verificação da nota do aluno, se foi mais que 8
                    sit = "APROVADO";//Colaca na variável sit a situação do aluno
                }else if(media > 6){//Verificação da nota do aluno, se foi mais que 6
                    sit = "RECUPERAÇÃO";//Colaca na variável sit a situação do aluno
                }else{//Verificação da nota do aluno, se foi menos que 6
                    sit = "REPROVADO";//Colaca na variável sit a situação do aluno
                }

                System.out.println("-------------------------");//Apenas questão de estética
                System.out.println("Aluno: "+ cod);//Mostra o código do aluno
                System.out.println("Média: "+ media);//Mostra a média
                System.out.println("Situação: " + sit);//Mostra a situação
                System.out.println("-------------------------");//Apenas questão de estética
            }
            
        }while(cod != 0);//Encerra o laçõ de repetição

        s.close();//Fecha o scanner
    }
}
