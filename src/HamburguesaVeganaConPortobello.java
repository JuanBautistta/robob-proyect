public class HamburguesaVeganaConPortobello extends Platillo{
    
    public HamburguesaVeganaConPortobello(int id,double precio){
        super(id,"Hamburguesa Vegana de Portobello",
        "Es una hamburguesa que contiene portobello que simula la carne de la hamburguesa",
        precio,true,true);   
    }
    
    @Override
    void prepararProteina(){
        System.out.println("--Preparando proteina:\n"+
        "1- Asando portobello y los pimientos con aceite\n"+
        "2- Mezclando espinaca con crema y salpimentando\n"+
        "3- Mezclar los dos ingredientes anteriores"+
        "4- Asando la tortita preparada anteriormente en un sarten a fuego medio\n"+
        "\n--Listo proteina preparada");
    }

    @Override
    void ponerVegetales(){
        System.out.println("añadindo lechiga,jitomates y pimentones a la hamburguesa");
    }

    /*@Override
    void añadirCondimentosExtra(){
        System.out.println("Añadiendo coctel de  :)\n"+
        "Añaniendo Cocacola");
    }
    */
}