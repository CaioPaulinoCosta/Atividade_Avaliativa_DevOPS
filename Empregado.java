public class Empregado extends Pessoa {
    private int codigoSetor;
    private double salarioBase;
    private double imposto; // porcentagem de imposto a ser descontado

    // Construtor padrão
    public Empregado() {
    }

    // Construtor com todos os atributos
    public Empregado(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto) {
        super(nome, endereco, telefone);
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }

    // Getters e Setters
    public int getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    // Método para calcular o salário líquido
    public double calcularSalario() {
        return salarioBase - (salarioBase * (imposto / 100));
    }
}
