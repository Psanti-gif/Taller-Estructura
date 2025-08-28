package punto3;
import java.util.Scanner;

public class libreria{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el número de filas de la librería:");
        int filas = sc.nextInt();
        System.out.println("Ingrese el número de columnas de la librería:");
        int columnas = sc.nextInt();
        
        Libro[][] libreria = new Libro[filas][columnas];
        
        llenarLibreria(libreria, sc);
        

        mostrarLibreria(libreria);
        
        Libro libroMasCaro = encontrarLibroMasCaro(libreria);
        System.out.println("\nEl libro más caro es:");
        System.out.println("Título: " + libroMasCaro.getTitulo());
        System.out.println("Autor: " + libroMasCaro.getAutor());
        System.out.println("Precio: $" + libroMasCaro.getPrecio() + " COP");
    }
    
    public static void llenarLibreria(Libro[][] libreria, Scanner sc) {
        System.out.print(libreria + " Esto es libreria");
        for (int i = 0; i < libreria.length; i++) {
            for (int j = 0; j < libreria[i].length; j++) {
                System.out.println("\nLibro en posición [" + i + "," + j + "]:");
                
                System.out.print("Ingrese el título: ");
                sc.nextLine();
                String titulo = sc.nextLine();
                
                System.out.print("Ingrese el autor: ");
                String autor = sc.nextLine();
                
                System.out.print("Ingrese el precio: ");
                double precio = sc.nextDouble();
                
                libreria[i][j] = new Libro(titulo, autor, precio);
            }
        }
    }
    
    public static void mostrarLibreria(Libro[][] libreria) {
        System.out.println("\nLibrería:");
        System.out.println("========================");
        
        for (int i = 0; i < libreria.length; i++) {
            for (int j = 0; j < libreria[i].length; j++) {
                Libro libro = libreria[i][j];
                System.out.printf("[%d,%d] %s - %s ($%.0f COP)\n", 
                    i, j, libro.getTitulo(), libro.getAutor(), libro.getPrecio());
            }
        }
    }
    
    public static Libro encontrarLibroMasCaro(Libro[][] libreria) {
        Libro libroMasCaro = libreria[0][0];
        
        for (int i = 0; i < libreria.length; i++) {
            for (int j = 0; j < libreria[i].length; j++) {
                if (libreria[i][j].getPrecio() > libroMasCaro.getPrecio()) {
                    libroMasCaro = libreria[i][j];
                }
            }
        }
        
        return libroMasCaro;
    }
}

class Libro {
    private String titulo;
    private String autor;
    private double precio;
    
    public Libro(String titulo, String autor, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public String getAutor() {
        return autor;
    }
    
    public double getPrecio() {
        return precio;
    }
}
