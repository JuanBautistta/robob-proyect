public class PruebaRobot{
    public static void main(String[] args) {
        Platillo platillo1=new HamburguesaArabe(1, 140);
        Platillo platillo2=new HamburguesaMexica(2, 344);
        Platillo platillo3=new HamburguesaGriega(3, 142);
        Platillo platillo4=new HamburguesaDeCerdo(4, 865);
        Platillo platillo5=new HamburguesaPepita(5, 350);
        Platillo platillo6=new HamburguesaVegetariana(6, 740);


        Robot robot = new Robot(); 

        robot.menuDelDia.add(platillo1);
        robot.menuDelDia.add(platillo2);
        robot.menuDelDia.add(platillo3);

        robot.menuEspecial.put(platillo4.id,platillo4);
        robot.menuEspecial.put(platillo5.id,platillo5);
        robot.menuEspecial.put(platillo6.id,platillo6);

        //robot.getEstadoActual();
        robot.suspender();
        robot.encaminar();
        robot.atender();
        robot.cosinar();
        robot.estadoActual.mostrarPreparacion();
        
    }
}