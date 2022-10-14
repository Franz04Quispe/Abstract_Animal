public class Perro extends Animal{
    private String raza;
    public Perro(String nombre,String raza) {
        super(nombre);
        this.raza = raza;
    }
    //Crear un metodo en la clase Perro
    public void registroPerro(){
        Scanner LOL = new Scanner(System.in);
        System.out.print("- Ingrese el nombre del perro: ");
        nombre=LOL.nextLine();
        System.out.print("- El nombre del perro es:"+nombre);
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void sonido(){
        System.out.println(this.getNombre()+" dice GUAU");
    }
}
