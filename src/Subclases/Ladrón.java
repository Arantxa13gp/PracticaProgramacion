package Subclases;

import Characters.Personaje;

public class Ladrón extends Personaje {

    public Ladrón(){
        super();
    }

    public Ladrón(String nombre, int atq, int arm, int pv,int nivel, int res, int vel, String raza){
        super(nombre, atq, arm, pv,nivel,res, vel, raza);
    }

    public void subirNivel(){
        setNivel(getNivel()+1);
        setAtq(getAtq());
        setPv(getPv());
        setArm(getArm());
        setVel(getVel());
        setRes(getRes());
    }

    public void subirAtq(){
        int n = (int)(Math.random() * 100) +1;
        if (n >= 40){ //Probabilidad del 60%
            setAtq(getAtq() +2);
        }else setAtq(getAtq()+1);
    }
    public void subirArm(){
        int n = (int)(Math.random() * 100) +1;
        if (n >= 60){
            setArm(getArm() +2);
        }else setArm(getArm() +1);
    }
    public void subirPv(){
        int n = (int)(Math.random() * 100) +1;
        if (n >= 60){
            setPv(getPv()+2);
        }else setPv(getPv() +1);
    }
    public void subirRes(){
        int n = (int)(Math.random() * 100) +1;
        if (n >= 20){ //Probabilidad del 80%
            setRes(getRes() +2);
        }
    }
    public void subirVel(){
        int n = (int)(Math.random() * 100) +1;
        if (n >= 15){
            setVel(getVel()+2);
        } else setVel(getVel()+1);
    }

    public void robar(){
        //Con el metodo atacar
    }

    public String toString(){
        return super.toString();
    }

}
