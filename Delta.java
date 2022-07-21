package aula7;

public class Delta extends Equacao {
    private double delta;

    // #region metodos de acesso
    public double getDelta() {
        return delta;
    }

    public void setDelta(double delta) {
        this.delta = delta;
    }
    // #endregion

    // #region regra de negocios
    public void calculaDelta() {
        delta = (Math.pow(super.getB(), 2) - (4 * super.getA() * super.getC()));
        if (delta < 0) {
            System.out.println("Erro: delta negativo!");
            System.exit(0);
        }
    }
    // #endregion
}