package oop.statics.basik;
//enum BloodGroup{FIRST, SECOND, THIRD, FOURS}

public class Human {
    private BloodGroup bloodGroup;
    private String name;
    private int race;
    private static int populations = 0;
    public static final int NEGROID_RACE = -345671;
    public static final int ASIAT_RACE = 2;
    public static final int EUROPE_RACE = 3;
    public static Sun sun = new Sun();

    public Human(String name, int race, BloodGroup bloodGroup) {
//        sun = new Sun();
        if (race != Human.ASIAT_RACE && race != Human.EUROPE_RACE && race != Human.NEGROID_RACE){
            race = Human.EUROPE_RACE;
        }
        this.bloodGroup = bloodGroup;

        this.name = name;
        this.race = race;
        populations++;
    }

    public void die(){
        populations--;
    }

    public static int getPopulations(){
        return populations;
    }

    public String getNameAndPopulation(){
        return name + " " + getPopulations();
    }

    public void sunBath(){
        sun.sunShine();
        System.out.println("I'm sun-bathing");
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                "bloodGroup='" + bloodGroup +'\'' +
                "race='" + race + '\'' +
                ", populations=" + populations +
                '}';
    }
}
