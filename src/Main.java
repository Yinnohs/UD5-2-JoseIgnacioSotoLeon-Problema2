import utils.implementation.VeredaGt;

public class Main {
    public static void main(String[] args) {
        VeredaGt tesla = new VeredaGt(0.2f, "El-4M0-555");

        System.out.println(tesla.status());
        System.out.println("se mueve el coche");
        tesla.move();
        System.out.println();
        System.out.println("energia actual del coche: " + tesla.energyLevel() + "%");
        System.out.println("se mueve el coche");
        tesla.move();
        System.out.println();

        System.out.println("Paramos para recargar");
        System.out.println(tesla.status());


        System.out.println();
        tesla.recharge();
        System.out.println("CARGA COMPLETA");
        System.out.println(tesla.status());





    }
}
