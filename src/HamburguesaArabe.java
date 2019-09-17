public class HamburguesaArabe extends Platillo{
    
    public HamburguesaArabe(int id,double precio){
        super(id,"Hamburguesa Arabe",
        "Es una hamburguesa que contiene carne de res cocinada a termino medio mezcladas con especias de la mas alta calidad",
        precio,true,false);   
    }
    
    @Override
    void prepararProteina(){
        System.out.println("--Preparando proteina:\n"+
        "1- Mezclando carne molida de res con ajo,huevo,cebolla,oregano y sal pimienta\n"+
        "2- Formando torta con la carne mezclada anteriormente\n"+
        "3- Asando la torta de carne a fuego medio\n"+
        "\n--Listo proteina preparada");
    }

    @Override
    void ponerVegetales(){
        System.out.println("añadindo lechuga,col y jitomate la hamburguesa");
    }

    /*@Override
    void añadirCondimentosExtra(){
        System.out.println("Añadiendo coctel de  :)\n"+
        "Añaniendo Cocacola");
    }*/
}