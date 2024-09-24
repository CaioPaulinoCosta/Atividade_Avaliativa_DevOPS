public class Operario extends Empregado {
    private double valorProducao;
    private double comissao; // porcentagem sobre o valor da produção

    // Construtor
    public Operario(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double valorProducao, double comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }

    // Getters e Setters
    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    // Sobrescrita do método calcularSalario
    @Override
    public double calcularSalario() {
        double salarioComComissao = getSalarioBase() + (valorProducao * (comissao / 100));
        return salarioComComissao - (salarioComComissao * (getImposto() / 100));
    }
}
