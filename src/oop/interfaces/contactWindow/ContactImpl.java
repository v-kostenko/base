package oop.interfaces.contactWindow;

public abstract class ContactImpl implements ContactI {
    private String name;
    private String address;
    private int phone;
    private String email;
    private String type;

    public ContactImpl(String name, String address, int phone, String email, String type){
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.type = type;
    }

    @Override
    public String getName(){
        return this.name;
    }

    @Override
    public void setName(String name){
        this.name = name;
    }

    @Override
    public int getPhone(){
        return this.phone;
    }

    public void setPhone(int phone){
        this.phone = phone;
    }

    @Override
    public String getAddress(){
        return this.address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    @Override
    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    @Override
    public String getType(){
        return this.type;
    }

    public String toString(){
        return getClass().getSimpleName() + "\nName - " + name + "\nAddress - " + address +
        "\nPhone - " + phone + "\nEmail - " + email + "\nType - " + type;
    }

    @Override
    public boolean equals(Object object){
        if (object == null){
            return false;
        }
        if (object == this){
            return true;
        }
        if ((getClass() != object.getClass())){
            return false;
        }
        ContactImpl temp = (ContactImpl) object;
        return this.name == temp.name && this.address == temp.address && this.phone == temp.phone &&
                this.email == temp.email && this.type == temp.type;
    }

    @Override
    public int hashCode(){
        int hashCode = 7;
        hashCode = 7 * hashCode + name.hashCode();
        hashCode = 7 * hashCode + address.hashCode();
        hashCode = 7 * hashCode + phone;
        hashCode = 7 * hashCode + email.hashCode();
        hashCode = 7 * hashCode + type.hashCode();
        return hashCode;
    }


}
