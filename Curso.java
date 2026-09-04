public class Curso {

    String nome;
    String professor;
    int cargaHoraria;
    double valor;

    public Curso(String nome, String professor, int cargaHoraria, double valor) {
        this.nome = nome;
        this.professor = professor;
        this.cargaHoraria = cargaHoraria;
        this.valor = valor;
    }

    public void exibirInformacoes() {
        System.out.println("Nome do curso: " + nome);
        System.out.println("Professor: " + professor);
        System.out.println("Carga horária: " + cargaHoraria + " horas");
        System.out.println("Valor: R$ " + valor);
        System.out.println("Valor por hora: R$ " + calcularValorHora());
        System.out.println("-----------------------------");
    }

    public double calcularValorHora() {
        return valor / cargaHoraria;
    }
}