import java.util.Scanner;

public class VendedorSopaipillas {
    public int precioUnidad;
    public int unidadesDisponibles;
    public int totalDinero;
    VendedorSopaipillas(int unidad, int precioUnidad,int totalDinero){
        this.unidadesDisponibles=unidad;
        this.precioUnidad=precioUnidad;
        this.totalDinero=totalDinero;
    }
    public void realizarVenta(int unidades){
        int costo = precioVenta(unidades);
        int dineroRecibido = cobrarCosto();
            if (verificarDisponibilidad(unidades) && verificarVuelto(calcVuelto(costo, dineroRecibido))) {
                if (dineroRecibido >= costo) {
                    cobrarVenta(costo);
                    descontarUnidades(unidades);
                    System.out.println("Transacción realizada con éxito.");
                    System.out.println("Nuevo total de dinero: " + this.totalDinero);
                    System.out.println("Nuevo número de unidades disponibles: " + this.unidadesDisponibles);
                } else {
                    System.out.println("Cantidad insuficiente para pagar");
                }
            }
    }
    public int cobrarCosto(){
        while (true) {
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextInt()) {
                return sc.nextInt();
            } else {
                System.out.println("Valor inválido, intente nuevamente.");
            }
        }
    }
    public boolean verificarDisponibilidad(int unidades){
        if(unidades<=this.unidadesDisponibles)
            return true;
        else{
            System.out.println("El vendedor no posee suficientes unidades para la venta.");
        }
        return false;
    }
    public int precioVenta(int unidades){
        int costo = unidades*this.precioUnidad;
        System.out.println("Precio de venta calculado");
        return costo;
    }
    public void cobrarVenta(int costo){
        this.totalDinero = this.totalDinero+costo;
        System.out.println("Venta procesada");
    }
    public void descontarUnidades(int numeroUnidades){
        this.unidadesDisponibles= this.unidadesDisponibles-numeroUnidades;
        System.out.println("Unidades vendidas descontadas del total, nuevo total = "+this.unidadesDisponibles);
    }
    public int calcVuelto(int costo, int dineroRecibido){
        return dineroRecibido-costo;
    }
    public boolean verificarVuelto(int vueltoNecesario){
        if(this.totalDinero >= vueltoNecesario){
            return true;
        }
        else
            System.out.println("El vendedor no posee suficiente para entregar vuelto, venta cancelada.");
        return false;
    }
}