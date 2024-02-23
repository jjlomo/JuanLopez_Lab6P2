
package juanlopez_lab6p2;

public class Equipos {
   private String nombre, pais, ciudad, estadio;

    public Equipos() {
    }

    public Equipos(String nombre, String pais, String ciudad, String estadio) {
        this.nombre = nombre;
        this.pais = pais;
        this.ciudad = ciudad;
        this.estadio = estadio;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getEstadio() {
        return estadio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "  País: " + pais + "  Ciudad: " + ciudad + "  Estadio: " + estadio;
    }
   
}
