public class Gato extends Animal{
    private String raza;

    public Gato(String nombre,String raza) {
        super(nombre);
        this.raza = raza;
    }
    @Override
    public void sonido(){
        System.out.println(this.getNombre()+" dice: MIAU");
    }

    public void prueba(){
        System.out.println("HOla prueba");
    }

}
