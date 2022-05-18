/*
Write a program in Java to join two arrays.]
This program demonstrates that two variables can reference the same array.
 */
public class Twoarrays {
    public static void main(String[]args) {
        String [] arry1= {	"Samsung", " Sony ", " Iphone", " Lenovo"," Nokia"};
        String [] arry2= arry1;

        // Change one of the elements using array1.
        arry1[4]="HBC";

        // Change one of the elements using array2
        arry2[0]="Motorola";

        //Display all the elements using array120
        System.out.println("The names of cellphone's name from array1 are:");
        for (String name :arry1)
            System.out.print( name + " ");
        System.out.println();

        // Display all the elements using array
        System.out.println("The cellphone's name from  arry2 are:");
        for (String name : arry2)
            System.out.print(name + " ");
        System.out.println();
    }
}



