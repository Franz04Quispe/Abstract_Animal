import java.util.Scanner;

public abstract class Animal {
    protected String nombre;

    public Animal() {
    }

    public Animal(String nombre){

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void comer(){
        System.out.println("esta comiendo");
    }

    public void caminar(){
        System.out.println("esta caminando");
    }

    public abstract void sonido();

    //Añadir un metodo en la clase Anmal
    public void imprimir(){
        String clase;
        Scanner XD = new Scanner(System.in);
        System.out.print("- Ingrese el nombre: ");
        nombre=XD.nextLine();
        System.out.print("- ¿Que clase de animal es? ");
        clase=XD.nextLine();
        System.out.println("El animal se llama: "+nombre+" es de la clase animal: "+clase);
    };
}
