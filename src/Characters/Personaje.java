package Characters;

public class Personaje {

    private String nombre;
    private int pv, atq, arm, nivel;
    private int res;
    private int vel;

    private String raza;
    public Personaje(){
        nombre = raza = "";
        pv = 100;
        atq = 10;
        arm = 10;
        vel = 10;
        res = 10;
        nivel = 0;
    }

    public Personaje(String nombre){
        this.nombre = nombre;
        nivel = 1;
        atq = arm = vel = res = 10;
        pv = 100;
    }

    public Personaje(String nombre, int nivel){
        this.nombre = nombre;
        nivel = 1;
        atq = arm = vel = res = 10;
        pv = 100;
        for (int i = 0; i <nivel; i++){
            subirAtq();
            subirArm();
            subirPv();
        }
    }
    public Personaje(String nombre, int atq, int arm, int pv,int nivel, int res, int vel, String raza){
        setNombre(nombre);
        setPv(pv);
        setAtq(atq);
        setArm(arm);
        setRes(res);
        setVel(vel);
        setNivel(nivel);
        setRaza(raza);
    }

    public Personaje(Personaje copia){
        this.nombre = copia.nombre;
        this.nivel = copia.nivel;
        this.atq = copia.atq;
        this.arm = copia.arm;
        this.pv = copia.pv;
        this.res = copia.res;
        this.vel = copia.vel;
        this.raza = copia.raza;
    }

    public String getNombre(){
        return nombre;
    }
    public int getPv(){
        return pv;
    }
    public int getAtq(){
        return atq;
    }
    public int getArm(){
        return arm;
    }
    public int getNivel(){
        return nivel;
    }

    public int getRes() {
        return res;
    }

    public int getVel() {
        return vel;
    }

    public void setNombre(String n){
        if (n.equals("")){
            System.err.println("Error, el nombre no puede estar vacio");
        }else nombre = n;
    }
    public void setPv(int vida){
        if (vida<0){
            pv=0;
        }else pv = vida;
    }
    public void setAtq(int ataque){
        if (ataque<0){
            System.err.println("Error, el valor de atq no puede ser menor a 0");
        }else atq = ataque;
    }
    public void setArm(int armadura) {
        if (armadura < 0) {
            System.err.println("Error, el valor de arm no puede ser menor a 0");
        } else arm = armadura;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setRes(int res) {
        this.res = res;
    }

    public void setVel(int vel) {
        this.vel = vel;
    }

    public void setNivel(int nivel){
        this.nivel = nivel;
    }

    public void beberPocion(int vida){
        if (vida<=30){
            System.out.println("Tomando poción");
        }
    }
    public void inspirar(int cantidad, String tipo){
        System.out.println("Escribe que valor quieres aumentar: ataque o armadura");
        switch (tipo.toLowerCase()){
            case "ataque":
                System.out.println("Aumentando el ataque");
                atq+=cantidad;
                break;
            case "armadura":
                System.out.println("Aumentando la armadura");
                arm+=cantidad;
                break;
            default:
                System.err.println("Elige una opción válida");
        }
    }

    /*
        1. Crear método subirNivel()
        2. Dentro de subir nivel, incrementar el nivel en 1.
        3. Dentro de subir nivel, llamar a todos los métodos subirEstadistica().
        4. En los métodos de subir estadística, quitar nivel++
        5. En las subclases, solo tienes que modificar subirEstadistica, no subirNivel().
     */
    public void subirNivel(){
        nivel++;
        setAtq(atq);
        setArm(arm);
        setPv(pv);
        setRes(res);
        setVel(vel);
    }

    public void subirAtq(){
        int n = (int)(Math.random() * 100) +1;
        if (n >= 50){
            atq++;
        }
    }
    public void subirArm(){
        int n = (int)(Math.random() * 100) +1;
        if (n >= 50){
            arm++;
        }
    }
    public void subirPv(){
        int n = (int)(Math.random() * 100) +1;
        if (n >= 50){
            pv++;
        }
    }
    public void subirRes(){
        int n = (int)(Math.random() * 100) +1;
        if (n >= 50){
            res++;
        }
    }
    public void subirVel(){
        int n = (int)(Math.random() * 100) +1;
        if (n >= 50){
            vel++;
        }
    }
    public boolean estaMuerto(){
        boolean muerto;
        if (pv<=0){
            muerto = true;
        }else muerto = false;
        return muerto;
    }

    public String toString(){
        return "El personaje" + nombre + "tiene unas estadśiticas de " + pv + " puntos de vida" + atq + " puntos de ataque" + arm + " puntos de armadura" + "se encuentra el nivel " + nivel;
    }

    public Personaje clon (){
        Personaje clon = new Personaje(this);
        return clon;
    }

    public boolean equals(Personaje otro) {
        if (!this.nombre.equals(otro.nombre)){
            return false;
        }
        if (this.pv != otro.pv){
            return false;
        }
        if (this.atq != otro.atq) {
            return false;
        }
        if (this.arm != otro.arm) {
            return false;
        }
        if (this.nivel != otro.nivel) {
            return false;
        }
        else return true;
    }

    public String realizarTurno(String turno){ //Hacer las acciones del switch
        switch (turno.toLowerCase()){
            case "atacar":
                break;
            case "acción especial":
                break;
            case "defender":
                break;
            case "pasa turno":
                break;
            default:
                return turno = "";
        }
        return turno;
    }

    //Hacer método defender y atacar


}