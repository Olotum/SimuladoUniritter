package A101;
//Embrulhar um presente de aniversário custa X reais. O presente de aniversário
//custa Y reais a mais que o preço para embrulhá-lo. Quanto custará para comprar e embrulhar o presente?
//Faça um programa que responda automaticamente a questão apresentada. O valor X e Y do problema
//devem ser lidos e são valores reais.

public class A101 {
    private double precoEmbrulha; //X
    private double precoAMais; //Y
    private double precoFinal;

    public A101(double precoEmbrulha, double precoAMais) {
        this.precoEmbrulha = precoEmbrulha;
        this.precoAMais = precoAMais;
    }

    public double getPrecoEmbrulha() {
        return precoEmbrulha;
    }

    public void setPrecoEmbrulha(double precoEmbrulha) {
        this.precoEmbrulha = precoEmbrulha;
    }

    public double getPrecoAMais() {
        return precoAMais;
    }

    public void setPrecoAMais(double precoAMais) {
        this.precoAMais = precoAMais;
    }

    public double getPrecoFinal() {
        return precoFinal;
    }

    @Override
    public String toString() {
        return "A101{" +
                "precoEmbrulha=" + precoEmbrulha +
                ", precoAMais=" + precoAMais +
                ", precoFinal=" + precoFinal +
                '}';
    }

    public double obterPrecoFinal() {
        precoFinal = (precoEmbrulha+precoAMais)+precoEmbrulha;
        return precoFinal;
    }
}
