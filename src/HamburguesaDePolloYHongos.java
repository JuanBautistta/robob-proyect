public class HamburguesaDePolloYHongos extends Platillo{

    public HamburguesaDePolloYHongos(int id,double precio){
        super(id,"Hamburguesa de Pollo y Hongos",
        "Es una hamburguesa que contiene carne de pollo a  termino medio mezcladas con hogos de la mas alta calidad",
        precio,true,false);   
    }

    @Override
    void prepararProteina(){
        System.out.println("--Preparando proteina:\n"+
        "1- Combinando el pollo con cebolla picada el pan molido,el ajo en polvo y el huevo\n"+
        "2- Formando un tortita con la mezcla anterior\n"+
        "3- Añadiendo salpimienta y aceite de oliva\n"+
        "4- Asando la tortita preparada anteriormente en un sarten a fuego medio\n"+
        "\n--Listo proteina preparada");
    }

    @Override
    void ponerVegetales(){
        System.out.println("añadindo hojas de espinaca y champiñones a la hamburguesa");
    }

    @Override
    void añadirCondimentosExtra(){
        System.out.println("Añadiendo coctel de  :)\n"+
        "Añaniendo Cocacola");
    }
}