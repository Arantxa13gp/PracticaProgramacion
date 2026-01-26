package Subclases;

import Characters.Personaje;

import java.util.Random;

public class Mago extends Personaje {

    private int mag;

    public Mago() {
        super();
        mag = 10;
    }

    public Mago(String nombre, int atq, int arm, int pv, int nivel, int res, int vel, String raza) {
        //super(nombre, atq, arm, pv, nivel, res, vel, raza);
        setMag(mag);
    }

    public void subirNivel() {
        setNivel(getNivel() + 1);
        setAtq(getAtq());
        setPv(getPv());
        setArm(getArm());
        setVel(getVel());
        setRes(getRes());
    }

    public int getMag() {
        return mag;
    }

    public void setMag(int mag) {
        this.mag = mag;
    }
    public void subirAtq() {
        int n = (int) (Math.random() * 100) + 1;
        if (n >= 80) {
            setAtq(getAtq() + 2);
        } else setAtq(getAtq() + 1);
    }

    public void subirArm() {
        int n = (int) (Math.random() * 100) + 1;
        if (n >= 75) {
            setArm(getArm() + 2);
        } else setArm(getArm() + 1);
    }
    public void subirPv() {
        int n = (int) (Math.random() * 100) + 1;
        if (n >= 75) {
            setPv(getPv() + 2);
        } else setPv(getPv() + 1);
    }
    public void subirRes() {
        int n = (int) (Math.random() * 100) + 1;
        if (n >= 20) {
            setRes(getRes() + 1);
        }
    }
        public void lanzarConjuro(String conjuro){
            switch (conjuro.toLowerCase()) {
                case "bola de fuego":
                    //Variable con la cantidad de daño y los puntos de magia (se calcula) daño = mag * 0.7;
                    break;
                case "escudo arcano":

                    break;
                case "céfiro":

                    break;
                case "presteza mental":
                    break;
            }
        }
    }
