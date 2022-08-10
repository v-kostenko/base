package oop.statics.basik;

public class Sun {
    private String color = "White";
    private long diametr = 99999999999l;

    public void sunShine(){
        System.out.println("Shining! " + color);
    }

    public String setColor(String color){
        return this.color = color;
    }


}
