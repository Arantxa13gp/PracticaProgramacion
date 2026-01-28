package Subclases;

import Characters.Personaje;

public class Cazador extends Personaje {

    private mascota mascota;

    public Cazador() {
        super();
    }

    public Cazador(String nombre, int atq, int arm, int pv, int nivel, int res, int vel, String raza) {
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

    public void subirAtq(){
        int n = (int)(Math.random() * 100) +1;
        if (n >= 50){
            setAtq(getAtq() +1);
        }
    }
    public void subirArm(){
        int n = (int)(Math.random() * 100) +1;
        if (n >= 50){
            setArm(getArm() +1);
        }
    }
    public void subirPv(){
        int n = (int)(Math.random() * 100) +1;
        if (n >= 50){
            setPv(getPv()+1);
        }
    }
    public void subirRes(){
        int n = (int)(Math.random() * 100) +1;
        if (n >= 50){
            setRes(getRes() +1);
        }
    }
    public void subirVel(){
        int n = (int)(Math.random() * 100) +1;
        if (n >= 30){
            setVel(getVel()+1);
        }
    }

    public class mascota extends Personaje{

        public String tipoMascota(String raza){
            switch (raza.toLowerCase()){
                case "cánido":

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
                        setAtq(getAtq() +1);
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
                        setPv(getPv()+1);
                    }
                }
                subirRes();{
                    int n = (int)(Math.random() * 100) +1;
                    if (n >= 50){
                        setRes(getRes() +1);
                    }
                }
                subirVel();{
                    int n = (int)(Math.random() * 100) +1;
                    if (n >= 30){
                        setVel(getVel()+1);
                    }
                }

                    break;
                case "felino":
                    break;
                case "rapaz":
                    break;
                default:
                    raza = "";
            }
            return raza;
        }
    }


}
