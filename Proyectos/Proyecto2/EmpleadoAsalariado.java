package mx.unam.fi.poo.project2;

public class EmpleadoAsalariado extends Empleado {
    private double salarioSemanal;

    public EmpleadoAsalariado(String nombre, String apellidoPaterno, String numeroSeguroSocial, double salarioSemanal){
        super(nombre, apellidoPaterno, numeroSeguroSocial);
        setSalarioSemanal(salarioSemanal);
    }

    public double getSalarioSemanal(){
        return salarioSemanal;
    }

    public void setSalarioSemanal(double salarioSemanal){
        if (salarioSemanal < 0.0){
            System.out.println("El salario semanal debe ser >= 0.0");
        }
        this.salarioSemanal = salarioSemanal;
    }

    @Override
    public double ingresos(){
        return getSalarioSemanal();
    }

    @Override
    public String toString(){
        return String.format("Emleado asalariado: %s\nSalario semanal: $%.2f", super.toString(), getSalarioSemanal());
    }
}
