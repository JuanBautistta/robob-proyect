public abstract class Platillo{
    
    int id;
    String nombreDelPlatillo;
    String descripcion;
    double precio;
    boolean tieneQueso;
    boolean esVegetariano;    

    public Platillo(int id,String nombreDelPlatillo,String descripcion,double precio,boolean tieneQueso,boolean esVegetariano){
        this.id=id;
        this.nombreDelPlatillo=nombreDelPlatillo;
        this.descripcion=descripcion;
        this.precio=precio;
        this.tieneQueso=tieneQueso;
        this.esVegetariano=esVegetariano;
    }

    public final void preparaPlatillo(){
        ponerPan();
        ponerMayonesa();
        prepararProteina();
        ponerProteina();
        ponerVegetales();
        if(tieneQueso){
            ponerQueso();
        }
        ponerPan();
        añadirCondimentosExtra();
    }

    void ponerPan(){
        System.out.println("Poniendo pan a la Hamburguesa");
    }

    void ponerMayonesa(){
        System.out.println("Poniendo mayonesa al pan de la Hamburguesa");
    }

    void ponerProteina(){
        System.out.println("Piniendo la proteina a la Hamburguesa");
    }

    void ponerQueso(){
        System.out.println("poniendo queso a la hamburguesa");
    }

    abstract void ponerVegetales();

    abstract void prepararProteina();

    abstract void añadirCondimentosExtra();





}