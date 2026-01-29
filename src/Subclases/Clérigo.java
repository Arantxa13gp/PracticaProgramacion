package Subclases;

public class Clérigo extends Creyente{

    public Clérigo(){
        super();
    }

    public Clérigo(String nombre, int atq, int arm, int pv,int nivel, int res, int vel, String raza, int fe){
        super(nombre, atq, arm, pv, nivel, res, vel, raza);
        this.setFe(fe);
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
        if (n >= 90){
            setAtq(getAtq()+1);
        }
    }
    public void subirArm(){
        int n = (int)(Math.random() * 100) +1;
        if (n >= 80){
            setArm(getArm() +1);
        }
    }
    public void subirPv(){
        int n = (int)(Math.random() * 100) +1;
        if (n >= 80){
            setPv((int)(getPv()+1));
        }
    }
    public void subirRes(){
        int n = (int)(Math.random() * 100) +1;
        if (n >= 20){
            setRes(getRes() +2);
        }else setRes(getRes() +1);
    }
    public void subirVel(){
        int n = (int)(Math.random() * 100) +1;
        if (n >= 50){
            setVel(getVel()+1);
        }
    }

    public void subirFe(){
        int n = (int)(Math.random() * 100) +1;
        if (n >= 20){
            setFe(getFe()+2);
        }else setFe(getFe()+1);
    }

    public String plegaria(String milagros){
        switch (milagros.toLowerCase()){
            case "sanación":
                setPv((int)(getPv()*0.7));
                break;
            case "rezo sagrado":
                setPv((int)(getPv()*0.35));
                break;
            case "cólera divina":
                setAtq((int)(getAtq()*0.55));
                break;
            default:
                milagros = "";
        }
        return milagros;
    }

    public String toString(){
        return super.toString() + " está usando la plegaria" + plegaria("");
    }
}
