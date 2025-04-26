package A102;

public class TesteA102 {
    public static void main(String[] args) {
        A102 p1 = new A102(50,1.8, 'h');
        double gorduracorp = p1.obterPercentGorduraCorporal();
        String situacaoCorporal = p1.obterCondicaoCorporal();
        System.out.println(situacaoCorporal);
    }
}
