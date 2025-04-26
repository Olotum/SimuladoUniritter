package A103;

public class A103 {
    int numero;

    public A103(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int fatorar(){
        int fatorado = 1;
        for (int num = numero; num > 1; num--) {
            fatorado = fatorado * num;
        }
        return fatorado;
    }
}
