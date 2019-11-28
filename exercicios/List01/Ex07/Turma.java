public class Turma {
    //ATRIBUTOS
    private double [][] notas;
    private int numAlunos;
    private int numProvas;

    //MÉTODO PARA CALCULAR MÉDIA POR ALUNO
    public double[] mediaPorAluno(){
        double[] media = new double[getNotas().length];//Array para armazenar a media de cada aluno.
        for(int i = 0; i < getNotas().length; i++){ // Percorre as linhas
            for(int j = 0; j < getNotas()[i].length; j++){ // Percorre as colunas de cada linha
        media[i] += notas[i][j];//Faz a soma de todas as notas do aluno e atribui a média
            }
            media[i] /= notas[i].length;//Dividi a soma total das notas de um aluno pela quantidade de provas feitas
        }
        return media;//Retorna o array "media" para o método.
    }
    
    //MÉTODO PARA CALCULAR MÉDIA POR PROVA
    public double[] mediaPorProva(){
        double[] media = new double[numProvas];//Array para armazenar a media de cada prova
        for(int j = 0; j < getNotas()[0].length; j++){//Percorre as linhas
            for(int i = 0; i <= getNotas().length - 1; i++){//Percorre as colunas de cada linha
        media[j] += notas[i][j];//Faz a soma de todas as notas das provas e atribui a média
            }
            media[j] /= notas.length;//Dividi a soma total das notas de uma prova pela quantidade de alunos
    }
        return media;//Retorna o array "media" para o método
    }
    
    //MÉTODO PARA CALCULAR MÉDIA DA TURMA
    public double mediaTurma(){
        double media = 0;//Váriavel para armazenar média
        for(int i = 0; i < getNotas().length; i++){//Percorre todas as medias de cada aluno
            media += mediaPorAluno()[i];//Faz a soma das medias de cada aluno
        }
        media = media / getNotas().length;//Dividi a soma de todas as medias pela quantidade de alunos
        
        return media;//Retorna o valor da variável "media" para o método
    }
    
    //MÉTODO PARA SABER QUANTOS ALUNOS FORAM APROVADOS
    public int alunosAprovados(){
        int aprovados = 0;//Váriavel para receber soma dos alunos aprovados
        for (int i = 0; i < getNotas().length; i++){//Percorre todos os alunos
            if(mediaPorAluno()[i] >= 6){//Condição que se caso a media do aluno for maior ou igual a 6, então ele está aprovado
                aprovados++;//Se condição for aceita, soma mais 1 a variável "aprovados"
            }
        }
        return aprovados;//Retorna o valor da variável "aprovados" para o método
    }
    
    //MÉTODO PARA IMPRIMIR O RESUMO NA TELA
    public void imprimeResumo(){
        System.out.println("");//Pular uma linha dos comandos de entrada para os de saída
        for(int j = 0; j < numProvas; j++){//Percorre as médias de cada aluno
           System.out.println("Media da prova: " + (j + 1) + " : " + mediaPorProva()[j]);//Printa a média de cada prova
        }
        System.out.printf("Media geral da turma: %.2f\n", mediaTurma());
        System.out.println("Quantidade de alunos aprovados: " + alunosAprovados());
    }
    
    //MÉTODOS GETTERS E SETTERS
    public int getNumAlunos() {
        return numAlunos;
    }

    public void setNumAlunos(int numAlunos) {
        this.numAlunos = numAlunos;
    }

    public int getNumProvas() {
        return numProvas;
    }

    public void setNumProvas(int numProvas) {
        this.numProvas = numProvas;
    }
    
    public double[][] getNotas() {
        return notas;
    }

    public void setNotas(double[][] notas) {
        this.notas = notas;
    }
}
