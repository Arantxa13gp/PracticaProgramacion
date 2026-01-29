package Subclases;

import Characters.Personaje;

import java.security.PublicKey;

public class Monstruo extends Personaje {

    public Monstruo(){
    super();
    }

    public Monstruo(String nombre, int atq, int arm, int pv, int nivel, int res, int vel, String raza) {
        super(nombre, atq, arm, pv, nivel, res, vel, raza);
    }

    public void subirNivel(){
        setNivel(getNivel()+1);
        setAtq(getAtq());
        setPv(getPv());
        setArm(getArm());
        setVel(getVel());
        setRes(getRes());
    }

    public String tipoMostruo(String raza){
        switch (raza.toLowerCase()){
            case "bestia":

                subirNivel();{
                setNivel(getNivel()+1);
                setAtq(getAtq());
                setPv(getPv());
                setArm(getArm());
                setVel(getVel());
                setRes(getRes());
            }

                subirAtq();{
                int n = (int)(Math.random() * 100) +1;
                if (n >= 20){
                    setAtq(getAtq()+2);
                } else setAtq(getAtq()+1);
            }
            subirArm();{
                int n = (int)(Math.random() * 100) +1;
                if (n >= 50){
                    setArm(getArm() +1);
                }
            }
            subirPv();{
                int n = (int)(Math.random() * 100) +1;
                setPv(getPv()+1);
                if (n >= 50){
                    setPv(getPv()+1);
                }
            }
            subirRes();{
                int n = (int)(Math.random() * 100) +1;
                if (n >= 85){
                    setRes(getRes() +2);
                }else setRes(getRes() +1);
            }
            subirVel();{
                int n = (int)(Math.random() * 100) +1;
                if (n >= 20){
                    setVel(getVel()+2);
                } else setVel(getVel()+1);
            }
                break;
            case "no-muerto":
                subirNivel();{
                setNivel(getNivel()+1);
                setAtq(getAtq());
                setPv(getPv());
                setArm(getArm());
                setVel(getVel());
                setRes(getRes());
            }
                subirAtq();{
                int n = (int)(Math.random() * 100) +1;
                if (n >= 50){
                    setAtq(getAtq()+1);
                }
            }
            subirArm();{
                int n = (int)(Math.random() * 100) +1;
                if (n >= 70){
                    setArm(getArm() +1);
                }
            }
            subirPv();{
                int n = (int)(Math.random() * 100) +1;
                setPv(getPv()+1);
                if (n >= 70){
                    setPv(getPv()+1);
                }
            }
            subirRes();{
                int n = (int)(Math.random() * 100) +1;
                if (n >= 30){
                    setRes(getRes() +4);
                }else setRes(getRes() +1);
            }
            subirVel();{
                int n = (int)(Math.random() * 100) +1;
                if (n >= 95){
                    setVel(getVel()+1);
                }
            }
                break;
            case "gigante":
                subirNivel();{
                setNivel(getNivel()+1);
                setAtq(getAtq());
                setPv(getPv());
                setArm(getArm());
                setVel(getVel());
                setRes(getRes());
            }
                subirAtq();{
                int n = (int)(Math.random() * 100) +1;
                if (n >= 50){
                    setAtq(getAtq()+1);
                }
            }
            subirArm();{
                int n = (int)(Math.random() * 100) +1;
                if (n >= 50){
                    setArm(getArm() +1);
                }
            }
            subirPv();{
                int n = (int)(Math.random() * 100) +1;
                if (n >= 50){
                    setPv((int)(getPv()+2));
                }else setPv((int)(getPv()+3));
            }
            subirRes();{
                int n = (int)(Math.random() * 100) +1;
                if (n >= 90){
                    setRes(getRes() +1);
                }
            }
            subirVel();{
                int n = (int)(Math.random() * 100) +1;
                if (n >= 90){
                    setVel(getVel()+1);
                }
            }
                break;
            default:
                raza = "";
        }
        return raza;
    }
    public String toString(){
        return "El enemigo es un " + getRaza();
    }
}
