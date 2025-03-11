public class BancoTerminal {
    public static void main(String[] args) {
        // Primeira simulação de saque
        double saldo = 25;
        double valorSolicitado = 18;

        // Verifica se o saldo é suficiente para o saque
        if (saldo > valorSolicitado) {
            saldo = saldo - valorSolicitado;  // Atualiza o saldo
        } else {
            System.out.println("Saldo insuficiente");
        }

        // Exibe o saldo após a primeira operação
        System.out.println("Saldo após a primeira operação: " + saldo);

        // Segunda simulação de saque
        saldo = 15;
        valorSolicitado = 22;

        // Verifica se o saldo é suficiente para o saque
        if (saldo > valorSolicitado) {
            saldo = saldo - valorSolicitado;  // Atualiza o saldo
        } else {
            System.out.println("Saldo insuficiente");
        }

        // Exibe o saldo após a segunda operação
        System.out.println("Saldo após a segunda operação: " + saldo);
    }
}
