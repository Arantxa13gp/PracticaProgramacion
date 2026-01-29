package Subclases;
import Characters.Personaje;

public class Guerrero extends Personaje {

    private boolean furia;

    public Guerrero(){
        super();
        furia = false;
    }

    public Guerrero(String nombre, int atq, int arm, int pv, int nivel, int res, int vel, String raza){
        super(nombre, atq, arm, pv,nivel,res, vel, raza);
        setFuria(false);
    }
    public void setFuria(boolean furia) {
        this.furia = furia;
    }

    public void modificarFuria(){

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
        if (n >= 80){
            setAtq(getAtq() +2);
        }else setAtq(getAtq()+1);
    }
    public void subirArm(){
        int n = (int)(Math.random() * 100) +1;
        if (n >= 75){
            setArm(getArm() +2);
        }else setArm(getArm() +1);
    }
    public void subirPv(){
        int n = (int)(Math.random() * 100) +1;
        if (n >= 75){
            setPv(getPv()+2);
        }else setPv(getPv() +1);
    }
    public void subirRes(){
        int n = (int)(Math.random() * 100) +1;
        if (n >= 20){
           setRes(getRes() +1);
        }
    }
    public void subirVel(){
        int n = (int)(Math.random() * 100) +1;
        if (n >= 50){
            setVel(getVel()+1);
        }
    }

    public String toString(){
        return super.toString();
    }
}
