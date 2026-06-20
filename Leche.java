// Chavez Castillo Jorge Leonardo
// Decorador concreto que añade dinámicamente el condimento Leche a cualquier Café
public class Leche extends ComplementoDecorator {

    // Chavez Castillo Jorge Leonardo - Recibe en el constructor el objeto bebida que va a envolver internamente
    public Leche(Cafe cafe) {
        this.cafe = cafe;
    }

    // Chavez Castillo Jorge Leonardo - Concatena recursivamente la descripción anterior con el nuevo ingrediente
    @Override
    public String getDescripcion() {
        return cafe.getDescripcion() + ", Leche";
    }

    // Chavez Castillo Jorge Leonardo - Suma el costo específico de la Leche ($0.10) al costo acumulado interior
    @Override
    public double costo() {
        return cafe.costo() + 0.10;
    }
}