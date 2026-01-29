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
                    if (n >= 70){
                        setAtq(getAtq() +1);
                    }
                }
                subirArm();{
                    int n = (int)(Math.random() * 100) +1;
                    if (n >= 85){
                        setArm(getArm() +1);
                    }
                }
                subirPv();{
                    int n = (int)(Math.random() * 100) +1;
                    if (n >= 85){
                        setPv(getPv()+1);
                    }
                }
                subirRes();{
                    int n = (int)(Math.random() * 100) +1;
                    if (n >= 85){
                        setRes(getRes() +1);
                    }
                }
                subirVel();{
                    int n = (int)(Math.random() * 100) +1;
                    if (n >= 70){
                        setVel(getVel()+1);
                    }
                }
                    break;
                case "rapaz":
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
                    if (n >= 85){
                        setAtq(getAtq() +1);
                    }
                }
                subirArm();{
                    int n = (int)(Math.random() * 100) +1;
                    if (n >= 95){
                        setArm(getArm() +1);
                    }
                }
                subirPv();{
                    int n = (int)(Math.random() * 100) +1;
                    if (n >= 95){
                        setPv(getPv()+1);
                    }
                }
                subirRes();{
                    int n = (int)(Math.random() * 100) +1;
                    if (n >= 75){
                        setRes(getRes() +1);
                    }
                }
                subirVel();{
                    int n = (int)(Math.random() * 100) +1;
                    if (n >= 65){
                        setVel(getVel()+1);
                    }
                }
                    break;
                default:
                    raza = "";
            }
            return raza;
        }
    }

    public String toString(){
        return super.toString() + " y tiene un compañero " + mascota;
    }

}
