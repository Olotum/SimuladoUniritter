package A102;
//O IAC (Índice de Adiposidade Corporal) é uma fórmula que indica a condição de peso
//de um adulto. A fórmula para calcular o IAC é:
//Desenvolver um programa que leia a circunferência do quadril (cm), a altura (m) e o sexo. Calcule o
//IAC e escreva na tela a condição que o mesmo encontra-se, conforme a tabela abaixo:
public class A102 {
    double circuferenciaQuadril; //cm
    double altura; //m
    char sexo; // 'm' ou 'f'
    double percentGorduraCorporal;
    String condicaoCorporal;


    public A102(double circuferenciaQuadril, double altura, char sexo) {
        this.circuferenciaQuadril = circuferenciaQuadril;
        this.altura = altura;
        this.sexo = sexo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getCircuferenciaQuadril() {
        return circuferenciaQuadril;
    }

    public void setCircuferenciaQuadril(double circuferenciaQuadril) {
        this.circuferenciaQuadril = circuferenciaQuadril;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPercentGorduraCorporal() {
        return percentGorduraCorporal;
    }

    public String getCondicaoCorporal() {
        return condicaoCorporal;
    }

    @Override
    public String toString() {
        return "A102{" +
                "circuferenciaQuadril=" + circuferenciaQuadril +
                ", altura=" + altura +
                ", percentGorduraCorporal=" + percentGorduraCorporal +
                '}';
    }

    public double obterPercentGorduraCorporal() {
        percentGorduraCorporal = (circuferenciaQuadril / Math.sqrt(altura)) - 18;
        return percentGorduraCorporal;
    }

    public String obterCondicaoCorporal() {
        if ((sexo == 'h' && percentGorduraCorporal < 8) || (sexo == 'f' && percentGorduraCorporal < 20)) {
            condicaoCorporal = "Abaixo do peso";
        } else if ((sexo == 'h' && (8 <= percentGorduraCorporal && percentGorduraCorporal <= 20)) || (sexo == 'f' && (21 <= percentGorduraCorporal && percentGorduraCorporal <= 32))) {
            condicaoCorporal = "Normal";
        } else if ((sexo == 'h' && (21 <= percentGorduraCorporal && percentGorduraCorporal <= 25)) || (sexo == 'f' && (33 <= percentGorduraCorporal && percentGorduraCorporal <= 38))) {
            condicaoCorporal = "Sobrepeso";
        } else {
            condicaoCorporal = "Obesidade";
        }
        return condicaoCorporal;
    }
}