public class Main{
    public static void main(String[] args){

        Empregado empregado1 = new Empregado("Lucas", 5.50f);
        Empregado empregado2 = new Empregado("Moro", 5.50f);
        Empregado empregado3 = new Empregado("Vinicius", 5.50f);
        Empregado empregado4 = new Empregado("Cardoso", 5.50f);
        Empregado empregado5 = new Empregado("Moro", 5.50f);

        //empregado1.setSalarioMensal(7.70f);
        empregado1.imprimirInformacoes();
        empregado2.imprimirInformacoes();
        empregado3.imprimirInformacoes();
        empregado4.imprimirInformacoes();
        empregado5.imprimirInformacoes();
        System.out.println();

        Departamento departamento = new Departamento("Departamento1");
        departamento.alocarEmpregado(empregado1);
        departamento.alocarEmpregado(empregado2);
        departamento.alocarEmpregado(empregado3);
        departamento.alocarEmpregado(empregado4);
        departamento.alocarEmpregado(empregado5);
        System.out.println();

        departamento.removerEmpregado("Lucas");
        departamento.imprimirEmpregados();
        //System.out.println(departamento.retornarArray()[0]);
    }
}