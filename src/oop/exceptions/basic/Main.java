package oop.exceptions.basic;

public class Main {
    public static void main(String[] args) {
        try {
            firstMethod();
        } catch (NullPointerException e) {
            System.out.println("Поймали в Main");
        } catch (ColobocException col) {
            System.out.println("Поймали колобка в Мєйне " + col.getMessage());
        } catch (AgroColobok agro){
            System.out.println("Пойман в Мєйне агроколобок" + agro.getMessage());
        }
        catch (RuntimeException e) {
            e.printStackTrace();
        }
            System.out.println("After first");
        }

        public static void firstMethod () throws AgroColobok {
            First.first();
            int x = 0;
            int y = 25 / x;
            System.out.println("first method" + y);
        }
    }
