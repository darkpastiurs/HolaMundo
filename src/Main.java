import sv.edu.unab.clase.Automovil;

public class Main {

    public static void main(String[] args) {
        Automovil automovil = new Automovil("P189634", 1616589, "Corolla", "Toyota");
        Automovil automovil1 = new Automovil("P169798");
        Automovil automovil2 = new Automovil();

        System.out.println("Automovil " + automovil + " Automovil 1 " + automovil1 + " Automovil 2 " + automovil2);
        System.out.println("Automovil " + automovil.hashCode());
        System.out.println("Automovil 1" + automovil1.hashCode());
        System.out.println("Probando cambios");

    }
}
