package oop.generics.base;

public class TestGeneric<T> extends ParentNotGeneric{
    private String nameGeneric;
    private T test1;

    public TestGeneric(int age, String name, String nameGeneric, T test1) {
        super(age, name);
        this.nameGeneric = nameGeneric;
        this.test1 = test1;
    }

    public T getTest1(){
        return test1;
    }

    public void setTest1(T test1){
        this.test1 = test1;
    }

    public String getNameGeneric() {
        return nameGeneric;
    }

    public void setNameGeneric(String nameGeneric) {
        this.nameGeneric = nameGeneric;
    }

    @Override
    public String toString() {
        return "TestGeneric{" +
                "nameGeneric='" + nameGeneric + '\'' +
                "test1= " + test1 +
                '}';
    }
}
