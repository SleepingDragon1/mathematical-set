/*
 *
 *   - Mathematical set program
 *     This class takes hard coded input for two sets, then formats and prints results.
 *
 * */

public class Driver {
    public static void main(String[] args) {

        System.out.println("\nStart###########################################");

        Set set = new Set(5);

        System.out.println("\nDemonstrates size method before populating: ");

        System.out.println(" > Set size = " + set.Size());

        // Populate set to test functions
        set.add(8);
        set.add(3);
        set.add(18);
        set.add(14);
        set.add(7);

        System.out.println("\nDemonstrates size method after populating: ");

        // Print size of set
        System.out.println(" > Set size = " + set.Size());

        System.out.println("\n---------------------------------");

        System.out.println("\nDemonstrates contains method before calling remove method: ");

        // Check if value exists is set
        set.printContains(18);

        System.out.println("\nDemonstrates remove method: ");

        // Remove value from set
        set.remove(18);

        // Show removed value is gone
        set.printContains(18);

        System.out.println("\n---------------------------------");

        System.out.println("\nDemonstrates isEmpty method while not empty: ");

        // Display set status
        System.out.println(set.isEmpty());

        System.out.println("\nDemonstrates isEmpty method after clear method is called: ");

        // Clear set
        set.clear();

        // Display set status
        System.out.println(set.isEmpty());

        System.out.println("\n---------------------------------");

        System.out.println("\nDemonstrates Union, Intersection and Difference methods: \n");

        // Set one
        Set arr1 = new Set(5);

        // Populate set one
        arr1.add(1);
        arr1.add(5);
        arr1.add(6);
        arr1.add(3);
        arr1.add(4);

        System.out.println("The 1st Set:");
        System.out.print("[ ");
        arr1.toArray(arr1);
        System.out.print("]\n");

        // Set two
        Set arr2 = new Set(5);

        System.out.println("The 2nd Set:");

        // Populate set two
        arr2.add(10);
        arr2.add(5);
        arr2.add(2);
        arr2.add(3);
        arr2.add(4);

        System.out.print("[ ");
        arr2.toArray(arr2);
        System.out.print("]\n");

        // Union
        System.out.println("\nThis shows the union of the two sets:");
        System.out.print("[ ");
        arr1.toArray(arr1.union(arr2));
        System.out.print("]\n");

        // Intersection
        System.out.println("\nThis shows the intersections between the two sets:");
        System.out.print("[ ");
        arr1.toArray(arr1.intersection(arr2));
        System.out.print("]\n");

        // Difference
        System.out.println("\nThis shows the difference between two sets:");
        System.out.print("[ ");
        arr1.toArray(arr1.difference(arr2));
        System.out.print("]\n");

        System.out.println("\nEnd###########################################");


    } // End of main

} // End of class
