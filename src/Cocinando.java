public class Cocinando implements EstadoRobot{
   
    Robot robot;
    Boolean comidaFinalizada;

    public Cocinando(Robot robot){
        this.robot=robot;
    }

    public void suspender(){
        if(comidaFinalizada){
            System.out.println("El robot se ha suspendido");
            robot.asignarEstadoRobot(robot.getSuspendido());
        }else{
            System.out.println("Suspender Robot.El robot no  puede suspenderse debido a que esta cocinando");
        }
    }
    public void caminar(){
        System.out.println("Robot Camina.El robot no puede caminar debido a que esta cocinando");
    }

    public void atender(){
        System.out.println("Robot atiende.El robot no puede antender por que esta cocinando");
    }

    public void cocinar(){
        System.out.println("Robot cocina.El robot ya esta cocinando");
    }    

    public void mostrarPreparacion(){
        robot.platilloActual.preparaPlatillo();
        comidaFinalizada=false;
    }

}