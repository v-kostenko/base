package patterns.singletone.twoObjects;

public class Ceo {
    private String name;
    private String surname;
    private static Ceo[] ceos = new Ceo[2];

    private Ceo(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public static Ceo getCeo(String name, String surname) {
        int emptyIndex = -1;
        for (int i = 0; i < ceos.length; i++) {
            if (ceos[i] == null) {
                emptyIndex = i;
            }
            if (ceos[i] != null && ceos[i].name.equals(name) && ceos[i].surname.equals(surname)) {
                return ceos[i];
            }
        }

        if (emptyIndex > -1) {
            ceos[emptyIndex] = new Ceo(name, surname);
            return ceos[emptyIndex];
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
