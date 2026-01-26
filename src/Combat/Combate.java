package Combat;

import Characters.Personaje;

public class Combate {

    public static void combatir(Personaje c1, Personaje c2){
        int daño;

        while (!c1.estaMuerto() && !c2.estaMuerto()){

            if (c1.getVel() > c2.getVel()){

                daño = c1.getAtq() - c2.getArm();
                c2.setPv(c2.getPv() - daño);

                if ((c1.getVel() > c2.getVel()*2) || !c2.estaMuerto()) {

                    daño = c1.getAtq() - c2.getArm();
                    c2.setPv(c2.getPv() - daño);

                    daño = c2.getAtq() - c2.getArm();
                    c1.setPv(c1.getPv() - daño);
                }
            }else if (c2.getVel() > c1.getVel()){

                daño = c2.getAtq() - c1.getArm();
                c1.setPv(c1.getPv() - daño);

                if ((c2.getVel() > c1.getVel()*2) || !c1.estaMuerto()) {

                    daño = c2.getAtq() - c1.getArm();
                    c1.setPv(c1.getPv() - daño);

                    daño = c1.getAtq() - c1.getArm();
                    c2.setPv(c2.getPv() - daño);

                }
            }
        }
    }
}

