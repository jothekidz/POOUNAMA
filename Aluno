public class Aluno {
    private String nome;
    private int matricula;
    private double nota1;
    private double nota2;

    public Aluno(String nome, int matricula, double nota1, double nota2) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota1;
    }

    
    public void mostrarDados() {
        System.out.println("nome: " + nome);
        System.out.println("matrícula: " + matricula);
        System.out.println("nota 1: " + nota1);
        System.out.println("nota 2: " + nota1);
    }

    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    public String verificarAprovacao() {
        double media = calcularMedia();
        if (media >= 7.0) return "aprovado";
        else if (media >= 4.0) return "prova Final";
        else return "reprovado";
    }

    public double getnota1() { return nota1; }
    public void setnota2(double nota) { nota1 = nota; }
}

