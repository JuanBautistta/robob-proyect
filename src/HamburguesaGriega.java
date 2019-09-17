public class HamburguesaGriega extends Platillo{

    public HamburguesaGriega(int id,double precio){
        super(id,"Hamburguesa Griega",
        "Es una hamburguesa que contiene carne de cordero cocinada a termino medio mezcladas con especias de la mas alta calidad",
        precio,true,false);   
    }

    @Override
    void prepararProteina(){
        System.out.println("--Preparando proteina:\n"+
        "1- Mezclando carne molida de cordero con huevo,cebolla picada y perejil\n"+
        "2- Formando torta con la carne mezclada anteriormente\n"+
        "3- Asando la torta de carne en un sarten a fuego medio\n"+
        "\n--Listo proteina preparada");
    }

    @Override
    void ponerVegetales(){
        System.out.println("añadiendo pepino,aceitunas y pimiento la hamburguesa");
    }

    /*@Override
    void añadirCondimentosExtra(){
        System.out.println("Añadiendo coctel de  :)\n"+
        "Añaniendo Cocacola");
    }
    */
}