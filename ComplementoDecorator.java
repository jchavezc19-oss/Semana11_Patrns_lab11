// Chavez Castillo Jorge Leonardo
// Clase abstracta decoradora (Decorator) que hereda de Cafe para mantener la compatibilidad de tipo
public abstract class ComplementoDecorator extends Cafe {
    
    // Chavez Castillo Jorge Leonardo - Atributo protegido que guardará la referencia del café que estamos envolviendo dinámicamente
    protected Cafe cafe;

    // Chavez Castillo Jorge Leonardo - Obliga a que todos los complementos concretos redefinan la descripción obligatoriamente
    @Override
    public abstract String getDescripcion();
}