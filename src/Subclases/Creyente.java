package Subclases;

import Characters.Personaje;

public abstract class Creyente extends Personaje {

    private int fe;

    public Creyente(){
        super();
        fe = -1;
    }

    public Creyente(String nombre, int atq, int arm, int pv,int nivel, int res, int vel, String raza){
        super(nombre, atq, arm, pv, nivel, res, vel, raza);
        setFe(fe);
    }

    public int getFe() {
        return fe;
    }
    public void setFe(int fe) {
        this.fe = fe;
    }

    public abstract String plegaria(String milagro);

    public String toString(){
        return super.toString() + " tiene " + fe + " puntos de fe";
    }
}
