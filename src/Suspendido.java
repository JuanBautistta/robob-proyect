public class Suspendido implements EstadoRobot{
    
    Robot robot;

    public Suspendido(Robot robot){
        this.robot=robot;
    }

    public void suspender(){
        System.out.println("Suspender Robot.El robot ya se encuentra suspendido");
    }

    public void caminar(){
        System.out.println("Robot Camina.El Robot se ha encendido y empezo a caminar");
        robot.asignarEstadoRobot(robot.getCaminando());
    }

    public void atender(){
        System.out.println("Robot atiende.El robot no puede atender debido a que esta suspendido");
        robot.asignarEstadoRobot(robot.getAtendiendo());

    }

    public void cocinar(){
        System.out.println("Robot cocina.El robot no puede cocinar debido a que esta suspendido");
    }

    public void mostrarPreparacion(){
        System.out.println("Robot mostrar preparacion.El robot no esta cocinando nada en este momento");
    }
}