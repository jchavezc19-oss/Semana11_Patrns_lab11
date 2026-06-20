// Chavez Castillo Jorge Leonardo
// Clase principal encargada de ejecutar y simular las órdenes de compra utilizando el patrón Decorator
public class Main {
    public static void main(String[] args) {
        
        System.out.println("--- SIMULACIÓN DE PEDIDOS (CAFETERÍA NEGRITO) ---");
        System.out.println("Estudiante: Chavez Castillo Jorge Leonardo\n");
        
        // Chavez Castillo Jorge Leonardo - Ejemplo de prueba base: Tostado negro con Moca y Crema
        Cafe bebida = new TostadoNegro();
        bebida = new Moca(bebida);
        
        System.out.println("Producto: " + bebida.getDescripcion());
        System.out.printf("Costo Total: $%.2f\n", bebida.costo());
    }
}