public class Main {
    public static  void main(String[] args) {
        //Aqui estamos creando un objeto para poder llamar a nuestro metodo constructor
        System.out.println("  ");
        System.out.println("  ");
        System.out.println("Primero se mostraran 3 videojuegos con sus caracteristicas");
        System.out.println("Los cuales son creados con el metodo constructor");
        System.out.println(" ");
        prueba videojuegos = new prueba("Apex legends", 2019, "Shooter", "multiplataforma", "EA-sport");
        prueba videojuegos1 = new prueba("Resident Evil", 2006, "Shooter", "Multiplataforma", "Capcom");
        prueba videojuego2 = new prueba("Overwach", 2018, "Shooter", "Multiplatafroma", "Blizzard");


        videojuegos.mostar();
        videojuegos1.mostar();
        videojuego2.mostar();
        System.out.println("");
        System.out.println("");

        System.out.println("Los 2 ultimos videojeugos han sido creados con los setters y getters.....");
        System.out.println("  ");


      prueba1 lista = new prueba1();
      lista.setNombre("God of war");
      lista.setAnio(2008);
      lista.setTipo("Campaña");
      lista.setConsola("Play Station");
        System.out.println("El nombre del videojuego es: "+lista.getNombre());
        System.out.println("Su año de estreno fue:"+lista.getAnio());
        System.out.println("El videojuego e de tipo campaña: "+lista.getTipo());
        System.out.println("Fue lanzado por la compañia de: "+lista.getConsola());
        System.out.println("   ");


        prueba1 lista1 = new prueba1();
        lista1.setNombre("Mario");
        lista1.setAnio(1990);
        lista1.setTipo("Aventura");
        lista1.setConsola("Nintendo");
        System.out.println("El nombre del videojuego es: "+lista1.getNombre());
        System.out.println("Su año de estreno fue:"+lista1.getAnio());
        System.out.println("El videojuego e de tipo campaña: "+lista1.getTipo());
        System.out.println("Fue lanzado por la compañia de: "+lista1.getConsola());

















    }
}
