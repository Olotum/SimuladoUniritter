package A101;

public class TesteA101 {
    public static void main(String[] args) {
        A101 presente = new A101(10, 20);
        double valorTotal = presente.obterPrecoFinal();
        System.out.println(valorTotal);
    }
}
