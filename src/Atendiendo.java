import java.util.Scanner;

public class Atendiendo implements EstadoRobot{

    Robot robot;

    public Atendiendo(Robot robot){
        this.robot=robot;
    }

    public void suspender(){
        System.out.println("Suspender Robot.El robot no  puede suspenderse debido a que esta atendiendo");
    }

    public void caminar(){
        System.out.println("Robot Camina.El robot no puede caminar debido a que esta atendiendo");
    }

    public void atender(){
        System.out.println("Robot atiende.El robot ya esta antendiendo a alguien");
    }

    public void cocinar(){
        Platillo platillo;
        Scanner teclado=new Scanner(System.in);
        System.out.println("El robot esta listo para enpezar a cocinar su platillo"+
        "\nPrimero que nada elija que menu desea ver: "+
        "\n1) Menu general"+
        "\n2) Menu del dia"+
        "\n3) Menu especial");

        int eleccion = teclado.nextInt();
        switch (eleccion) {
            case 1:
                robot.mostrarMenuGeneral();
                System.out.println("ingresa el id del platillo que quieres que se te cocine");
                eleccion = teclado.nextInt();
                platillo = robot.buscarPlatilloMG(eleccion);
                robot.setPlatilloActual(platillo);
                robot.asignarEstadoRobot(robot.getCosinando());
                break;
            case 2:
                robot.mostrarMenuDelDia();
                System.out.println("ingresa el id del platillo que quieres que se te cocine");
                eleccion = teclado.nextInt();
                platillo = robot.buscarPlatilloMDD(eleccion);
                robot.setPlatilloActual(platillo);
                robot.asignarEstadoRobot(robot.getCosinando());
                break;
            default:
                robot.mostrarMenuEspecial();
                System.out.println("ingresa el id del platillo que quieres que se te cocine");
                eleccion = teclado.nextInt();
                platillo = robot.buscarPlatilloME(eleccion);
                robot.setPlatilloActual(platillo);
                robot.asignarEstadoRobot(robot.getCosinando());
       }
        
        teclado.close();

    }   

    public void mostrarPreparacion(){
        System.out.println("Robot cocina. El robot todabia no esta cocinando nada");
    }
    

}