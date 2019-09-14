public class HamburguesaMexica extends Platillo{

    public HamburguesaMexica(int id,double precio){
        super(id,"Hamburguesa Mexica",
        "Es una hamburguesa que contiene carne de res con chorizo y un exquisito guacamole si señor",
        precio,true,false);   
    }

    @Override
    void prepararProteina(){
        System.out.println("--Preparando proteina:\n"+
        "1- Mezclando carne molida con el pan molido y cebolla picada"+
        "2- Salpimentando la mezcla anterior "+
        "3- Formando un tortita con la mezcla anterior\n"+
        "5- Asando la tortita preparada anteriormente en un sarten con chorizo a fuego alto\n"+
        "\n--Listo proteina preparada");
    }

    @Override
    void ponerVegetales(){
        System.out.println("añadiendo el elote y el pure de aguacate a la hamburguesa");
    }

    @Override
    void añadirCondimentosExtra(){
        System.out.println("Añadiendo coctel de  :)\n"+
        "Añaniendo Cocacola");
    }
}