// Chavez Castillo Jorge Leonardo
// Esta es la clase abstracta base (Componente) que define el esqueleto de todas las variedades de café
public abstract class Cafe {
    
    // Chavez Castillo Jorge Leonardo - Atributo protegido que almacenará el nombre identificativo de cada tipo de café
    protected String descripcion = "Café Base Desconocido";

    // Chavez Castillo Jorge Leonardo - Método público que permite consultar el nombre o descripción de la bebida actual
    public String getDescripcion() {
        return descripcion;
    }

    // Chavez Castillo Jorge Leonardo - Método abstracto que obligará a todas las subclases concretas a calcular su precio base
    public abstract double costo();
}