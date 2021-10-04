//Joaquín Ortiz Castillo 20161003619
public class EjemploSopaipillas {
    public static void main(String[] args) {
        VendedorSopaipillas miVendedor = new VendedorSopaipillas(15,1000,15000);
        /*
        unidad se refiere a las unidades disponibles para la venta
        precio unidad es evidente
        totalDinero corresponde al dinero en bolsillo del vendedor disponible para los vueltos
         */
        miVendedor.realizarVenta(5);
        //unidades se refiere a la cantidad que se desea comprar
    }

    /* 1)
    * Objeto vendedor de sopaipillas
    * Atributos:
    * -número de unidades disponibles, integer
    * -precio por unidad, integer
    *
    * Metodos:
    * boolean verificarDisponibilidad(int unidades){
    * Verifica que haya sopaipillas disponibles para vender
    * }
    * int precioVenta(int unidades){
    * Calcula el precio de las unidades que se le piden y lo retorna
    * }
    * void cobrarVenta(int costo){
    * Cobra el precio de las unidades solicitadas
    * }
    * int descontarUnidades(int numeroUnidades){
    * descuenta al total de sopaipillas las que fueron compradas y retorna el valor.
    * }
    * */
    /* 2)
    * Nuevos atributos:
    * -Cantidad de dinero disponible para generar vuelto en caso de que sea necesario, integer
    *
    * Nuevos metodos:
    * int calcVuelto(int costo, int dineroRecibido){
    * Calcula diferencia entre el costo real y el dinero recibido para saber cuanto hay que devolver
    * }
    *
    * int verificarVuelto(int vueltoNecesario){
    * Verifica que haya suficiente para devolver el excedente
    * }
    *
    * */
}
