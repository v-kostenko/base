package patterns.singletone;

public enum TaxOffice {
    TAX_OFFICE("str. GFgkfkggkc 12", "0999983838");

    private String address;
    private String phone;

    TaxOffice(String address, String phone) {
        this.address = address;
        this.phone = phone;
    }

    public String info(long id) {
        return "Logic .... ";
    }

}
