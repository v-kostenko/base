package patterns.singletone;

public class Main {
    public static void main(String[] args) {

        Sun sun = Sun.getSun();
        Sun sun2 = Sun.getSun();
        Sun sun3 = Sun.getSun();
        Sun sun4 = Sun.getSun();

        System.out.println(sun);
        System.out.println(sun2);
        System.out.println(sun3);
        System.out.println(sun4);

        TaxOffice taxOffice = TaxOffice.TAX_OFFICE;
        TaxOffice taxOffice2 = TaxOffice.TAX_OFFICE;
        TaxOffice taxOffice3= TaxOffice.TAX_OFFICE;
        TaxOffice taxOffice4 = TaxOffice.TAX_OFFICE;

        String name = TaxOffice.TAX_OFFICE.info(223);
        System.out.println(name);

        System.out.println(taxOffice.hashCode());
        System.out.println(taxOffice2.hashCode());
        System.out.println(taxOffice3.hashCode());
        System.out.println(taxOffice4.hashCode());


    }
}
