package oop.generics.base.repeat;

public class Generic <Q, W>{
    private Q fieldQ;
    private W fieldW;

    public Generic(Q fieldQ, W fieldW){
        this.fieldQ = fieldQ;
        this.fieldW = fieldW;
    }



    public String toString(){
        return "fieldQ " + fieldQ + "\nfieldW " + fieldW;
    }
}
