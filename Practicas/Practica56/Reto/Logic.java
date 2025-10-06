public class Logic {
    private double Op1 = 0;
    private String operador = "";
    public void setOp1(double operando) {
        this.Op1 = operando;
    }
    public void setOperador(String operador) {
        this.operador = operador;
    }
    public String calcular(double Op2) {
        if (operador.isEmpty()) {
            return String.valueOf(Op2);
        }
        double resultado = 0;
        switch (operador) {
            case "+": resultado = Op1 + Op2;
                break;
            case "-": resultado = Op1 - Op2;
                break;
            case "*": resultado = Op1 * Op2;
                break;
            case "/":
                if (Op2 == 0) {
                    return "Error: Div por 0";
                }
                resultado = Op1 / Op2;
                break;
        }
        if (resultado == (long) resultado) {
            return String.format("%d", (long) resultado);
        } else {
            return String.format("%s", resultado);
        }
    }
    public void reset() {
        this.Op1 = 0;
        this.operador = "";
    }
}