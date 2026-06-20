// Chavez Castillo Jorge Leonardo
// Clase concreta que representa la variedad de café Tostado Negro
public class TostadoNegro extends Cafe {

    // Chavez Castillo Jorge Leonardo - Constructor encargado de asignar el nombre al producto
    public TostadoNegro() {
        descripcion = "Café Tostado Negro";
    }

    // Chavez Castillo Jorge Leonardo - Implementa el precio base estipulado en la práctica ($0.99)
    @Override
    public double costo() {
        return 0.99;
    }
}