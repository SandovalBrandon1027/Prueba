public class prueba {
    /*
    Implemetar 5 instansias de una clase sobre la tematica de videojuegos
    capturas pdf
    link del repositorio
     */

    //Aqui estamos poniendo los parametros para nuestra clase prueba
    String nombre;
    int anio;
    String tipo;
    String consola;
    String compañia;

    //aqui estamos inicializando el metodo constructor

    public prueba(String nombre, int anio, String tipo, String consola, String compañia) {
        this.nombre = nombre;
        this.anio = anio;
        this.tipo = tipo;
        this.consola = consola;
        this.compañia = compañia;
    }
//creamos un metodo llamado mostrar para imprimir los valores en pantalla
    public void mostar(){
        System.out.println("El videojuego se llama: "+nombre);
        System.out.println("Su año de estreno es: "+anio);
        System.out.println("El tipo de videojuego es: "+tipo);
        System.out.println("El juego esta diseñado para la consola de: "+consola);
        System.out.println("Fue lanzado por la compañia de: "+compañia);
        System.out.println("    ");
    }





}
