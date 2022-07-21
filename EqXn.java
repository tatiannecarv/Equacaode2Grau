package aula7;

import java.lang.Math;

public class EqXn extends Equacao {
    private double xn;
    private double xp;

    // #region metodo de acesso
    public double getXn() {
        return xn;
    }

    public void setXn(double xn) {
        this.xn = xn;
    }

    public double getXp() {
        return xp;
    }

    public void setXp(double xp) {
        this.xp = xp;
    }
    // #region

    // #region regra de negocio
    public void calculaXn(double delta) {
        this.xn = (-super.getB() + Math.sqrt(delta)) / 2 * super.getA();
    }

    public void calculaXp(double delta) {
        this.xp = (-super.getB() - Math.sqrt(delta)) / 2 * super.getA();
    }
    // #endregion
}