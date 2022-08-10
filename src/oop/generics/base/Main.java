package oop.generics.base;

import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        OldGeneric oldGeneric1 = new OldGeneric("str");
        OldGeneric oldGeneric2 = new OldGeneric(12);

        System.out.println(oldGeneric1);
        System.out.println(oldGeneric2);

        oldGeneric1.setField1(33);
        oldGeneric1.setField1("ERTYUI");

        System.out.println(oldGeneric1);
        System.out.println(oldGeneric2);


        oldGeneric1 = oldGeneric2;
        System.out.println(oldGeneric1.getField1());

        ArrayList arrayList = new ArrayList();
        arrayList.add("WERTYu");
        arrayList.add(33);

        System.out.println(arrayList);

        FirstGeneric<String> firstGeneric = new FirstGeneric<>("str generic T");
        System.out.println(firstGeneric.getField1());

        FirstGeneric<String> firstGenericString = new FirstGeneric<>("DFGHJKLKJHGG");

        FirstGeneric<Double> firstGenericDouble = new FirstGeneric<>(33.2);
        firstGenericDouble.setField1(22.5);

        firstGeneric = firstGenericString;

        SecondGeneric<Double, Integer> secondGenericLong = new SecondGeneric<>(4433.3, 55555);
        System.out.println(secondGenericLong.getField1());
        System.out.println(secondGenericLong.getField2());

        ChildGeneric<Double, Integer> childGeneric = new ChildGeneric<>(22.11, 999);
        int child = childGeneric.getFieldQ();
        System.out.println(child);

        Child child1 = new Child("zxcv", new Date(2022 - 1900, 0, 31));

        TestGeneric<Date> testGeneric = new TestGeneric<>(12, "Bob", "Name Generic", new Date(2022 - 1900, 1, 2));
        testGeneric.getTest1();
        testGeneric.setTest1(new Date(2000 - 1900, 3, 12));

        Person person = new Person(30, "Vova", "Kostenko");

        Vova<Person> vova = new Vova<>();
        String s = vova.text(person);
        System.out.println(s);

        Vova<Double> vovaDouble = new Vova<>();
        String s1 = vovaDouble.text(12.4);
        System.out.println(s1);

        NotGenericClass notGenericClass = new NotGenericClass();
        notGenericClass.genericMethod(new Date(2000 - 1900, 3, 7));

        Cat cat = new Cat(1, "Cat");
        Dog dog = new Dog(2, "Dog");
        Zoo<Animal> animalZoo = new Zoo<>();
        animalZoo.add(cat);
        animalZoo.add(dog);
        animalZoo.printVoice();

        ClassNew<Cat> classNew = new ClassNew<>();
        classNew.method(cat);
        System.out.println(classNew.test());





    }
}
