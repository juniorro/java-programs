package array;

/**
 * Array Data Structures.
 *
 * This class demonstrates the Array data structures in
 * the Java programming language, with appropriate main Algorithms
 * to search, insert, and delete data.
 *
 * This is part of a series of learning core Java.
 *
 * @author Roland Junior Toussaint
 * @version 1.0
 */

public class Array {

    //declare an array to hold 60 int values
    private int[] array = new int[60];

    //define the array size
    private int size = 10;

    /**
     This method generates random values from 1 to 20 and add them to the array
     A for loop and Math.random is used to generate the random values.
     Random Integers in a Specific Range
     int min = 20, max = 150;
     int value = (int)(Math.random()*(max - min)) + min;
     @return an array with random numbers
     @exception ---
     @see
     **/
    public void randomArray(){
        for(int i  = 0; i < size; i++){
            array[i] = (int) (Math.random()*9) + 1;
        }
    }

    /**
     This method prints the array to the console in human readable manner.
     @return prints array with array index
     @exception ---
     @see
     **/
    public void printTheArray(){
        System.out.println("------------");
        for(int i  = 0; i < size; i++){
            System.out.print(" | " + i + " |");
            System.out.println(array[i] + " |");
            System.out.println("------------");
        }
    }

    /**
     This method array values at specific index in the array.
     @return array values at specific index
     @exception "Some problem occurred"
     @see
     **/
    public int searchElementInArayAtIndex(int index){
        //check to make sure the index is not larger than the array size
        if(index < size) {
            return array[index];
        }else {
            System.out.println("Element not found at specified index.");
            return -1;
        }
    }

    /**
     This method search for a value in the array.
     @return value passed in the method if it exists in the array
     @exception ---
     @see
     **/
    public int searchElementInAray(int element){
        for(int i = 0; i < size; i++){
            if(array[i] == element){
                System.out.println("Integer " + element + " is in the array.");
                return element;
            }
        }
        System.out.println("Did not find " + element + " in the array.");
        return 0;
    }

    /**
     This method deletes a value in the array at the specified index
     @return void
     @exception ---
     @see
     **/
    public void deleteElementAtIndex(int index){
        if(index < size) {
            for (int i = index; i < (size - 1); i++) {
                array[i] = array[i + 1];
            }
        }
        size--;
    }

    /**
     This finds all the indexes an element in the array appears.
     @return void
     @exception ---
     @see
     **/
    public void linearSearch(int element){
        System.out.print("This value in the array was found at index: ");
        for(int i = 0; i < size; i++){
            if(array[i] == element)
                System.out.print(i + ",");
        }
    }

    /**
     This method inserts a value in the array at the end of it
     @return void
     @exception ---
     @see
     **/
    public void inserElementInArray(int element){
        if(size < 60) {
                array[size] = element;
        }
        size++;
    }

    public static void main(String[] args) {

        //create an object of the class above
        Array array = new Array();

        //call randomArray() method
        array.randomArray();

        //call printTheArray() method
        array.printTheArray();

        //call printTheArray() method and print result
        System.out.println("Number at index is: " + array.searchElementInArayAtIndex(8));

        //call searchElementInAray() method
        array.searchElementInAray(2);

        //call deleteElementAtIndex() method
        array.deleteElementAtIndex(3);

        //call printTheArray() method
        array.printTheArray();

        //call deleteElementAtIndex() method
        array.inserElementInArray(33);

        //call printTheArray() method
        array.printTheArray();

        //call linearSearch() method
        array.linearSearch(6);



    }
}
