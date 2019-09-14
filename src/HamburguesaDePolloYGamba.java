public class HamburguesaDePolloYGamba extends Platillo{

    public HamburguesaDePolloYGamba(int id,double precio){
        super(id,"Hamburguesa de pollo y gamba","Es una hamburguesa que contiene carne de pollo de la mas alta calidad combinada con gamba hacen una exelente combinacion",precio,false,false);   
    }

    @Override
    void prepararProteina(){
        System.out.println("--Preparando proteina:\n\n"+
        "1- Pasar las pechugas de pollo por la picadora\n"+
        "2-Echar en una cazuela la cebolla cortada, el ajo picado y los tomates pelados y despepitados.\n"+
        "3- Cocinar a fuego medio-bajo durante 10 minutos.\n"+
        "4- Añadir el vino blanco y el pernod y dejar cocinar hasta que se evapore el líquido.\n"
        +"\n--listo proteina preparada");
    }

    @Override
    void ponerVegetales(){
        System.out.println("añadiendo almendras,peregil y gambas");
    }

    @Override
    void añadirCondimentosExtra(){
        System.out.println("Añadiendo jugo de limón :)\n"+
        "Añaniendo nachos");
    }
}