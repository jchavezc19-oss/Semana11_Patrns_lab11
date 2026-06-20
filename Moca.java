// Chavez Castillo Jorge Leonardo
// Decorador concreto que añade dinámicamente el condimento Moca a cualquier Café
public class Moca extends ComplementoDecorator {

    // Chavez Castillo Jorge Leonardo - Recibe en el constructor el objeto bebida que va a envolver internamente
    public Moca(Cafe cafe) {
        this.cafe = cafe;
    }

    // Chavez Castillo Jorge Leonardo - Concatena recursivamente la descripción anterior con el nuevo ingrediente
    @Override
    public String getDescripcion() {
        return cafe.getDescripcion() + ", Moca";
    }

    // Chavez Castillo Jorge Leonardo - Suma el costo específico del Moca ($0.20) al costo acumulado interior
    @Override
    public double costo() {
        return cafe.costo() + 0.20;
    }
}