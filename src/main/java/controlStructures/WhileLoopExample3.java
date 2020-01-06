package controlStructures;

/**
 * @author Matthaiakis Stergios
 */
public class WhileLoopExample3 {
    public static void main(String args[]) {
        System.out.println("--------------------------------------------------------");
        System.out.println("For loop Example");
        int arr[] = {2, 11, 45, 9};
        //i starts with 0 as array index starts with 0 too
        int i = 0;
        while (i < 4) {
            System.out.println(arr[i]);
            i++;
        }
    }

}
