public class HamburguesaVegetariana extends Platillo{

    public HamburguesaVegetariana(int id,double precio){
        super(id,"Hamburguesa Vegetariana",
        "Es una hamburguesa que contiene una mezcla de frijoles,avena que simula la carne de la hamburguesa esta a su vez es cocinada a termino medio",
        precio,false,true);   
    }

    @Override
    void prepararProteina(){
        System.out.println("--Preparando proteina:\n"+
        "1- Mezclando frijoles cocidos con avena en hojuelas hasta que se integren en su totalidad\n"+
        "2- Añadiendo a la mezcla anterior cebolla blanca en trozos\n"+
        "3- Añadiendo sal,pimienta negra y aceite de oliva\n"+
        "4- Formando bolita del tamaño de la carne de la hamburguesa"+
        "5- Asando la bolita preparada anteriormente en un sarten a fuego medio\n"+
        "\n--Listo proteina preparada");
    }

    @Override
    void ponerVegetales(){
        System.out.println("añadindo lechuga y calabazas a la hamburguesa");
    }

    @Override
    void añadirCondimentosExtra(){
        System.out.println("Añadiendo coctel de  :)\n"+
        "Añaniendo Cocacola");
    }
}