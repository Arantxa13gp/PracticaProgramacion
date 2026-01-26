package Subclases;

import Characters.Personaje;

public class Monstruo extends Personaje {

    public Monstruo(){
    super();
    }

    public Monstruo(String nombre, int atq, int arm, int pv, int nivel, int res, int vel, String raza) {
        super(nombre, atq, arm, pv, nivel, res, vel, raza);
    }

    public String tipoMostruo(String raza){
        switch (raza.toLowerCase()){
            case "bsetia":

                break;
            case "no-muerto":
                break;
            case "gigante":
                break;
            default:
                raza = "";
        }
        return raza;
    }
}
