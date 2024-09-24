public class Administrador extends Empregado {
    private double ajudaDeCusto;

    // Construtor
    public Administrador(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double ajudaDeCusto) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    // Getters e Setters
    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }

    // Sobrescrita do método calcularSalario
    @Override
    public double calcularSalario() {
        return super.calcularSalario() + ajudaDeCusto;
    }
}
