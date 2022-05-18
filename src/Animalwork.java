/*
Write a java program to create a class Animal with properties [id, name, color].
Create another class called Cat and extends it from Animal.
Add new properties sound in String. Create an object of a Cat and print all details.


 */

public class Animalwork {
    public static void main(String[] args) {
            Cat c = new Cat();
            c.id=2;
            c.name = "coco";
            c.color="White";
            c.sound = "Meow";

            c.AnimalInfo();
        }
    }

    class Animal{

         String name;
         int id;
        String color;




        }

    class Cat extends Animal {

        String sound;

        void AnimalInfo() {
            System.out.println("id is " + this.id);
            System.out.println("Name is " + this.name);
            System.out.println("Color is " + this.color);

            System.out.println("the sound of cat is " + this.sound);

        }
    }
