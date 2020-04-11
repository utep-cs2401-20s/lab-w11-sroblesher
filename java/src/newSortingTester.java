import static org.junit.jupiter.api.Assertions.*;

class newSortingTester {

    /*1st test case: This first test case checks whether or not QuickSort
    * works properly in newSorting, this by making "size" bigger or equal than the
    * length of the array to be sorted and therefore the method newSorting implementing QuickSort
    * right away instead of doing it first with a MergeSort technique.*/
    //STATUS: PASSED
    @org.junit.jupiter.api.Test
    void newSorting1() {
        newSorting ns = new newSorting();
        int[] sort = {1,3,2,8,7,4,5,6};
        int[] exp = {1,2,3,4,5,6,7,8};

        ns.newSorting(sort,8);

        assertArrayEquals(sort, exp);
    }

    /*2nd test case: This test case assures that even if "size" is 0, and therefore
    * making QuickSort unreachable, so since QuickSort is the base case of the entire
    * newSorting method, it is necessary of this edge case to add an if statement to stop
    * the recursive calls from the MergeSort part of the method*/
    //STATUS: PASSED
    @org.junit.jupiter.api.Test
    void newSorting2() {
        newSorting ns = new newSorting();
        int[] sort = {1,4,5,2,3};
        int[] exp = {1,2,3,4,5};

        ns.newSorting(sort, 0);

        assertArrayEquals(sort, exp);
    }

    /*3rd test case: This edge case checks if the method takes in account when the
    * array to be sorted has no elements, and consequently the array expected too.
    * This will test if the base cases of the QuickSort and MergeSort parts works
    * when the length of the array is 0.*/
    //STATUS: PASSED
    @org.junit.jupiter.api.Test
    void newSorting3() {
        newSorting ns = new newSorting();
        int[] sort = {};
        int[] exp = {};

        ns.newSorting(sort, 1);

        assertArrayEquals(sort, exp);
    }

    /*4th test case: This test checks if the method newSoring still
    * works even when the array to be sorted is already sorted*/
    //STATUS: PASSED
    @org.junit.jupiter.api.Test
    void newSorting4() {
        newSorting ns = new newSorting();
        int[] sort = {1,2,3,4,5,6,7,8,9,20};
        int[] exp = {1,2,3,4,5,6,7,8,9,20};

        ns.newSorting(sort, 3);

        assertArrayEquals(sort, exp);
    }

    /*5th test case: After the previous test cases, that were trying
    * to find errors in edge cases, this is the first test case that checks
    * properly the functionality of the method by setting an unsorted array to be sorted,
    * and size less than the length of the array and also not equal to 0.*/
    //STATUS: PASSED
    @org.junit.jupiter.api.Test
    void newSorting5() {
        newSorting ns = new newSorting();
        int[] sort = {3,2,4,5,1};
        int[] exp = {1,2,3,4,5};

        ns.newSorting(sort, 3);

        assertArrayEquals(sort, exp);
    }

    /*6th test case: This test case expects to demonstrate the functionality
    * of newSorting, when the array to be sorted has negative numbers/elements,
    * and therefore could imply errors*/
    //STATUS: PASSED
    @org.junit.jupiter.api.Test
    void newSorting6() {
        newSorting ns = new newSorting();
        int[] sort = {3,2,4,5,1,-10,-20};
        int[] exp = {-20,-10,1,2,3,4,5};

        ns.newSorting(sort, 3);

        assertArrayEquals(sort, exp);
    }
}