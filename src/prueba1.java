public class prueba1 {
    //Para poder ocupar los setters y getters debemos crear otra clase esto para que no alla ningun problema
    //con el metodo cosntructor
    String nombre;
    int anio;
    String tipo;
    String consola;

    //aqui inicializamos los setters y getters de todos los atributos

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getConsola() {
        return consola;
    }

    public void setConsola(String consola) {
        this.consola = consola;
    }
}
