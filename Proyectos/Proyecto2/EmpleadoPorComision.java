package mx.unam.fi.poo.g1.project2;

public class EmpleadoPorComision extends Empleado {

    private double ventasNetas;
    private double tarifaComision;

    public EmpleadoPorComision(String nombre, String apellidoPaterno, String nss, double ventasNetas, double tarifaComision) {
        
        super(nombre, apellidoPaterno, nss);
        setVentasNetas(ventasNetas);
        setTarifaComision(tarifaComision);
    }

    public void setVentasNetas(double ventasNetas) {
        if (ventasNetas >= 0.0) {
            this.ventasNetas = ventasNetas;
        }else{
            System.out.println("Error en el numero de ventas");
        }
    }

    public void setTarifaComision(double tarifaComision) {
        if (tarifaComision >= 0.0 && tarifaComision <= 1.0) {
           this.tarifaComision = tarifaComision;
        }else{
            System.out.println("Error en tarifa");
        }
    }

    public double getVentasNetas() {
        return ventasNetas;
    }

    public double getTarifaComision() {
        return tarifaComision;
    }

    @Override
    public double ingresos() {
        return getTarifaComision() * getVentasNetas();
    }

    @Override
    public String toString() {
        return String.format(
            "Empleado por Comisión: %s\n%s: %.2f\n%s: %.2f",
            super.toString(),
            "Ventas Netas", getVentasNetas(),
            "Tarifa de Comisión", getTarifaComision()
        );
    }
}
