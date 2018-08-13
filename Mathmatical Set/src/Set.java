/*
 *
 *   - Mathematical set program
 *     This class takes the union, intersection and difference of two sets.
 *     Included are several methods:
 *      - Contains method: checks if element exists in set
 *      - Add method: adds element to set
 *      - Remove method: removes element from set
 *      - isEmpty method: checks if set is empty
 *      - Clear method: clears all elements in set by overwriting with zeros
 *      - Size method: returns size of set
 *      - Union method gathers all elements of two sets
 *      - Intersection method gathers only common elements to two sets
 *      - Difference method gathers all uncommon elements between two sets
 *
 * */

public class Set {

    private int[] set;
    private int size;
    private int capacity;
    private int capacity2;

    /* Constructor */
    public Set(int c) {
        capacity = c;
        capacity2 = 0;
        set = new int[capacity];
        size = 0;
    } // End of Set constructor

    /* Contains method: checks if element exists in set */
    public boolean contains(int x) {

        // Loop through set capacity
        for (int i = 0; i < capacity; i++) {
            // If value at set index is equal to parameter x return true
            if (set[i] == x)
                return true;
        } // End of for loop

        return false;
    } // End of contains method

    /* Add method: adds element to set */
    public void add(int x) {

        for (int i = 0; i < capacity; i++) {
            if (!contains(x) && size < capacity) {
                set[size] = x;
                size++;
            } // End of if
            else if (size > capacity) {
                System.out.println("no more capacity for" + x);
            } // End of else if

        } // End of for loop(i)
    } // End of add method

    /* Remove method: removes element from set */
    public void remove(int x) {

        for (int i = 0; i < size; i++) {
            if (set[i] == x) {
                for (int j = i; j < size - 1; j++)
                    set[j] = set[j + 1];

            } // End of if
        } // End of for loop (i)
        size--;
    } // End of remove method

    /* Clear method: clears all elements in set by overwriting with zeros */
    public void clear() {
        for (int i = 0; i < capacity; i++) {
            set[i] = 0;
        }
    } // End clear method

    /* Size method: returns size of set */
    public int Size() {
        size = 0;

        for (int i = 0; i < capacity; i++) {

            if (set[i] == 0)
                return size;
            else if (set[i] != 0)
                size++;

        } // End of for loop(i)
        return size;
    } // End of Size method

    /* Empty method: checks if set is empty */
    public String isEmpty() {
        String yes = " > The set is empty";
        String no = " > The set is not empty";

        if (Size() == 0)
            return yes;
        else
            return no;
    }

    /* To Array method */
    public void toArray(Set arr) {

        for (int i = 0; i < arr.set.length; i++) {
            if (arr.set[i] != 0) {
                System.out.print(arr.set[i] + "," + " ");
            }
        }

    } // End of toArray method

    /* Prints result of contains function */
    public void printContains(int x) {

        if (contains(x) == true) {
            System.out.println(" > " + x + " does exist in set");
        } else
            System.out.println(" > " + x + " does not exist in set");

    }

    /* Union method gathers all elements of two sets */
    public Set union(Set anySet) {

        capacity2 = capacity * 5;

        Set temp = new Set(capacity2);

        for (int i = 0; i < set.length; i++) {

            temp.set[i] = set[i];

            for (int j = 0; j < anySet.Size(); j++) {

                if (anySet.set[j] != 0) {

                    if (anySet.set[j] != temp.set[j] && !anySet.contains(set[j]))
                        temp.set[Size() + j] = anySet.set[j];
                }

            } // End of for loop(i)

        } // End of forloop(j)

        return temp;

    } // End of union method

    /* Intersection method gathers only common elements to two sets*/
    public Set intersection(Set anySet) {

        capacity2 = capacity * 3;

        Set temp = new Set(capacity2);

        for (int i = 0; i < set.length; i++) {
            for (int j = 0; j < anySet.Size(); j++) {

                if (anySet.set[j] != 0) {

                    if (set[j] == anySet.set[j])
                        temp.set[j] = anySet.set[j];
                }

            } // End of for loop(i)

        } // End of forloop(j)

        return temp;

    } // End of union method

    /* Difference method gathers all uncommon elements between two sets*/
    public Set difference(Set anySet) {

        capacity2 = capacity * 2;

        Set temp = new Set(capacity2);

        for (int i = 0; i < set.length; i++) {
            if (set[i] != anySet.set[i])
                temp.set[i] = set[i];
            for (int j = 0; j < anySet.Size(); j++) {

                if (anySet.set[j] != 0) {

                    if (anySet.set[j] != temp.set[j] && !anySet.contains(set[j]))
                        temp.set[Size() + j] = anySet.set[j];
                }

            } // End of for loop(i)

        } // End of forloop(j)

        return temp;

    } // End of union method

} // End Set