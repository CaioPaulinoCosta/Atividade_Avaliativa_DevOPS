public class TesteEmpregado {
    public static void main(String[] args) {
        // Teste para o Administrador
        Administrador admin = new Administrador("João", "Rua 1", "123456789", 101, 5000.00, 10.0, 1000.00);
        System.out.println("Salário do Administrador: " + admin.calcularSalario());

        // Teste para o Operário 1
        Operario operario1 = new Operario("Maria", "Rua 2", "987654321", 202, 3000.00, 5.0, 10000.00, 10.0);
        System.out.println("Salário do Operário 1: " + operario1.calcularSalario());

        // Teste para o Operário 2
        Operario operario2 = new Operario("Pedro", "Rua 3", "456789123", 203, 2500.00, 7.5, 8000.00, 15.0);
        System.out.println("Salário do Operário 2: " + operario2.calcularSalario());
    }
}
