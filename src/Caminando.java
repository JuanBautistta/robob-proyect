public class Caminando implements EstadoRobot{

    Robot robot;

    public Caminando(Robot robot){
        this.robot=robot;
    }

    public void suspender(){
        System.out.println("Suspender Robot.El robot se ha suspendido");
        
    }

    public void caminar(){
        System.out.println("Caminar Robot.El robot se ha encendido y va havia tu lugar");
    }

    public void atender(){
        System.out.println("El robot no puede atender debido a que esta suspendido");
    }

    public cocinar(Platillo platillo){
        System.out.println("Robot cocina.El robot no puede cocinar debido a que esta caminando");
    }    
    
}