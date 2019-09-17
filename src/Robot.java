import java.util.*;
public class Robot{
    EstadoRobot suspendido;
    EstadoRobot caminando;
    EstadoRobot atendiendo;
    EstadoRobot cosinando;

    EstadoRobot estadoActual;
    Platillo platilloActual;

    Platillo[] menuGeneral={new HamburguesaArabe(12, 140),new HamburguesaDeCerdo(11,300),new HamburguesaDePolloYGamba(10, 134)};
    List<Platillo> menuDelDia=new ArrayList<Platillo>();
    Hashtable<Integer,Platillo> menuEspecial=new Hashtable<Integer,Platillo>() ;

    public Robot(){
        suspendido = new Suspendido(this);
        caminando = new Caminando(this);
        atendiendo = new Atendiendo(this);
        cosinando = new Cocinando(this);

        estadoActual = suspendido;
    }


    /**
     * @return the platilloActual
     */
    public Platillo getPlatilloActual() {
        return platilloActual;
    }

    /**
     * @param platilloActual the platilloActual to set
     */
    public void setPlatilloActual(Platillo platilloActual) {
        this.platilloActual = platilloActual;
    }

    /**
     * @return the suspendido
     */
    public EstadoRobot getSuspendido() {
        return suspendido;
    }

    /**
     * @return the caminando
     */
    public EstadoRobot getCaminando() {
        return caminando;
    }

    /**
     * @return the atemdiendo
     */
    public EstadoRobot getAtendiendo() {
        return atendiendo;
    }

    /**
     * @return the cosinando
     */
    public EstadoRobot getCosinando() {
        return cosinando;
    }

    /**
     * @return the estadoActual
     */
    public EstadoRobot getEstadoActual() {
        return estadoActual;
    }

    /**
     * @return the menuGeneral
     */
    public Platillo[] getMenuGeneral() {
        return menuGeneral;
    }

    /**
     * @return the menuDelDia
     */
    public List<Platillo> getMenuDelDia() {
        return menuDelDia;
    }

    /**
     * @return the menuEspecial
     */
    public Hashtable<Integer,Platillo> getMenuEspecial() {
        return menuEspecial;
    }

    public void asignarEstadoRobot(EstadoRobot nuevoEstado){
        estadoActual=nuevoEstado;
    }

    public void mostrarMenuGeneral(){
        int i=0;
        for(Platillo platillo:menuGeneral){
            System.out.println("id: "+platillo.id+") Nombre: "+platillo.nombreDelPlatillo);
        }
    }

    public void mostrarMenuDelDia(){
        int i=0;
        for (Platillo platillo :menuDelDia) {
            System.out.println("id: "+platillo.id+") Nombre: "+platillo.nombreDelPlatillo);
        }
    }
    public void mostrarMenuEspecial(){

        int i=0;
        Collection menuGral = menuEspecial.values();
        for (Object platillo : menuGral) {
            Platillo p = (Platillo)platillo;
            System.out.println("id: "+p.id+") Nombre: "+p.nombreDelPlatillo);
        }
    }

    public Platillo buscarPlatilloMG(int id){
        for (Platillo platillo : menuGeneral) {
            if(id==platillo.id)return platillo;
        }
        return null;
    }

    public Platillo buscarPlatilloMDD(int id){
        for(Platillo platillo : menuDelDia) {
            if(id==platillo.id)return platillo;
        }
        return null;
    }

    public Platillo buscarPlatilloME(int id){
        return menuEspecial.get(id);
    }

    public void suspender(){
        estadoActual.suspender();
    }    

    public void encaminar(){
        estadoActual.caminar();
    }

    public void atender(){
        estadoActual.atender();
    }

    public void cosinar(){
        estadoActual.cocinar();
    }

}