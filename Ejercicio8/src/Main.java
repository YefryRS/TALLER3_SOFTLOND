import java.util.ArrayList;
import java.util.List;

public class Main {
    /*8. Empleados y salarios: Crea una jerarquía de clases para representar diferentes tipos de empleados, como asalariados y por horas. Cada clase debe tener un método para calcular el salario. Utiliza el polimorfismo para calcular el salario de diferentes tipos de empleados en un array.*/
    public static void main(String[] args) {
        List<Empleados> empleados = new ArrayList<>();
        Asalariados asalariados = new Asalariados("Yefry",1000,4833,"limpieza");
        PorHoras porHoras = new PorHoras("Fernando",2000,30000,"Jefe Planta",40);

        empleados.add(asalariados);
        empleados.add(porHoras);

        for (Empleados empleado: empleados) {
            System.out.println("El empleado: " + empleado.getNombre() + " tiene un salario total de: " + empleado.calcularSalario());
        }
        
    }
}