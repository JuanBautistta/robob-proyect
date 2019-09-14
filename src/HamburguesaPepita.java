public class HamburguesaPepita extends Platillo{

    public HamburguesaPepita(int id,double precio){
        super(id,"Hamburguesa de Pepita","Es una hamburguesa vegana de pepitas con pimientos",precio,false,true);   
    }

    @Override
    void prepararProteina(){
        System.out.println("--Preparando proteina:\n\n"+
        "1- Cortamos los pimientos limpios y la cebolla a tiras\n"+
        "2- Calentamos una sartén y ponemos una cantidad generosa de aceite.\n"+
        "3- Pondremos a freír primero el pimiento y cuando esté bien blando, añadiremos la cebolla.\n"+
        "4- Cocinamos nuestras hamburguesas unos 5 minutos.\n"
        +"\n--Listo proteina preparada");
    }

    @Override
    void ponerVegetales(){
        System.out.println("añadiendo almendras,pimentones,jitomate y cebolla");
    }

    @Override
    void añadirCondimentosExtra(){
        System.out.println("Añadiendo agua simple:)\n"+
        "Añadiendo papas fritas");
    }
}