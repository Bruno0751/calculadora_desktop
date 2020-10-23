package pack;
/**
 *
 * @author Bruno Gressler da Silveira
 * @version 2
 * @since 23/10/2020
 */
public class Pessoa {
    
    private double valor1, valor2;
    private char op;
    String valorNullo;

    public char getOp() {
        return op;
    }

    public void setOp(char op) {
        this.op = op;
    }

    public double getValor1() {
        return valor1;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public double getValor2() {
        return valor2;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }

    public String getValorNullo() {
        return valorNullo;
    }

    public void setValorNullo(String valorNullo) {
        this.valorNullo = valorNullo;
    }
    
    public double calcularSoma(double var1, double var2){
        return var1 + var2;
    }
    
    public double calcularSubtracao(double var1, double var2){
        return var1 - var2;
    }
    
    public double calcularMultiplicacao(double var1, double var2){
        return var1 * var2;
    }
    
    public double calcularDivisao(double var1, double var2){
        return var1 / var2;
    }
    
    public double calcularPotenciacao(double var1, double var2){
        return Math.pow(var1, var2);
    }
    
    public double calcularPorcentagem(double var1, double var2){
        return (var1 * var2) / 100;
    }
    
    public double calcularRaizQuadrada(double var1){
        return Math.sqrt(var1);
    }
    
    public double calcularRaizCubica(double var1){
        return Math.cbrt(var1);
    }
}
