//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Assalariado assalariado1 = new Assalariado("Clara", "Lopes", "13732864669", 1325.30);
        Commissionado commissionado1 = new Commissionado("Maria", "Ferreira", "13732864669", 2.0, 25.0);
        Horista horista1 = new Horista("Ferreira", "Lopes", "132564458", 2.0, 25.0);

        System.out.println("Vencimento: " + assalariado1.vencimento());
        System.out.println("Vencimento: " + commissionado1.vencimento());
        System.out.println("Vencimento: " + horista1.vencimento());


    }
}