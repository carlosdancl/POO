package mx.unam.fi.poo.project2;

public class MainApp {
    public static void main(String[] args) {
        Empleado empAsalariado = new EmpleadoAsalariado("Daniel", "Contreras", "111-111-111", 12000.50);
        Empleado empComision = new EmpleadoPorComision("Augusto", "Hori", "222-222-222", 8000.00, 0.15);
        Empleado[] empleados = new Empleado[2];
        empleados[0] = empAsalariado
        empleados[1] = empComision
        System.out.println("----------------");
        for(Empleado empleadoi : empleados){
            System.out.println(empleadoi);
            System.out.println("Ingresos: $%,.2f\n", empleadoi.ingresos());
            System.out.println("----------------");
        }
    }
}
