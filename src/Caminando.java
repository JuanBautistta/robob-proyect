import java.util.Scanner;

public class Caminando implements EstadoRobot{

    Robot robot;

    public Caminando(Robot robot){
        this.robot=robot;
    }

    public void suspender(){
        System.out.println("Suspender Robot.El robot se ha suspendido");
        robot.asignarEstadoRobot(robot.getSuspendido());
    }

    public void caminar(){
        System.out.println("Robot Camina.El robot ya se encuentra caminando");
    }

    public void atender(){
        System.out.println("El robot esta listo para atenderte");
        robot.asignarEstadoRobot(robot.getAtendiendo());
    }

    public void cocinar(){
        System.out.println("Robot cocina.El robot no puede cocinar debido a que esta caminando");
    }    

    public void mostrarPreparacion(){
        System.out.println("Robot muestra preparacion.El robot no esta cocinando nada");
    }
    
}