package oop.interfaces.base;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Vasya");
        Human person = new Person(1000, "Kyiv, 1", "Petya");
        Human student = new Student("Mohilanska Academia", 999, 12222, "Kyiv, 1", "Vasya",
                Sportsman.SPORT1, Musician.INSTRUMENT2);
        PartTimeStudent partTimeStudent = new PartTimeStudent("Lvivska Politehnika", 888, 777, "Lviv",
                "Petro", Sportsman.SPORT2, Musician.INSTRUMENT1);
        FullTimeStudent fullTimeStudent = new FullTimeStudent("Poplavsk", 222, 8888, "Kharkiv",
                "Kolia", Sportsman.SPORT3, 4.5, Musician.INSTRUMENT2);
        Barber barber = new Barber(456, "Kyiv, 77", "Serhii", "Khreshatyk", Musician.INSTRUMENT1);

        Gym gym = new Gym();
        MusicBand musicBand = new MusicBand();

        gym.addSportsman((Sportsman) student);
        gym.addSportsman(partTimeStudent);
        gym.addSportsman(fullTimeStudent);

        musicBand.addMusician((Musician) student);
        musicBand.addMusician(barber);
        musicBand.addMusician(fullTimeStudent);
        musicBand.addMusician(partTimeStudent);

        musicBand.perform();
        System.out.println();
        gym.warmSportsmen();
        System.out.println();
        gym.trainSportsmen();








    }
}
