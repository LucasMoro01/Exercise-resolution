import java.util.Scanner;//Importando Scanner

public class TurmaTeste {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Turma turma = new Turma();//Instanciando classe
        
        //Matriz para receber notas
        double [][] nota;


        //Pedindo ao usuário quantidade de alunos e provas
        System.out.println("Por gentileza informe a quantidade de alunos: ");
        turma.setNumAlunos(scan.nextInt());
        System.out.println("Por gentileza informe a quantidade de provas: ");
        turma.setNumProvas(scan.nextInt());
        scan.nextLine();//Consumir \n que sobrou da leitura anterior
        
        //Passando parâmetros da matriz
        nota = new double[turma.getNumAlunos()][turma.getNumProvas()];
        
        //Recebendo as notas das provas
        for(int i = 0; i < nota.length; i++){//Percorre a linha
            for(int j = 0; j < nota[i].length; j++){//Percorre a coluna da linha
                System.out.println("Digite a nota " + (j+1) + " do aluno " + (i+1) + ":");
                nota[i][j] = scan.nextDouble();
            }
        }
        
        //Chamando métodos a serem executados
        turma.setNotas(nota);
        turma.mediaPorAluno();
        turma.mediaPorProva();
        turma.imprimeResumo();
    }
    
}
