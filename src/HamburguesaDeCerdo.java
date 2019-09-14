public class HamburguesaDeCerdo extends Platillo{

    public HamburguesaDeCerdo(int id,double precio){
        super(id,"Hamburguesa de cerdo","Es una hamburguesa de carne de cerdo con apio y peregil las cuales forman una exelente combinacion",precio,true,false);   
    }

    @Override
    void prepararProteina(){
        System.out.println("--Preparando proteina:\n"+
        "1- Dorando carne de cerdo con mantequilla\n"+
        "2 -Desmenusando carne\n"+
        "\n--Listo proteina preparada");
    }

    @Override
    void ponerVegetales(){
        System.out.println("añadindo apio y peregil a la hamburguesa");
    }

    @Override
    void añadirCondimentosExtra(){
        System.out.println("Añadiendo papas a la francesa :)\n"+
        "Añaniendo Cocacola");
    }
}