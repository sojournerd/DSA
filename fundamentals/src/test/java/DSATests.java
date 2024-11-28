import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.java.Quicksort;
import com.java.BinarySearch;
import com.java.Bubblesort;
import com.java.SelectionSort;
import com.java.Mergesort;

public class DSATests {

    @Test
    public void quicksortTest1(){
        int[] actual = Quicksort.sort(new int[]{15, 5, 8, 25, 63, 62, 1, 0});
        int[] expected = new int[]{0, 1, 5, 8, 15, 25, 62, 63};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void quicksortTest2(){
        int[] actual = Quicksort.sort(new int[]{15, 5, 25, 13, 18, 23, 88, 9});
        int[] expected = new int[]{5, 9, 13, 15, 18, 23, 25, 88};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void quicksortTest3(){
        int[] actual = Quicksort.sort(new int[]{3, 105, 2});
        int[] expected = new int[]{2, 3, 105};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void quicksortTest4(){
        int[] actual = Quicksort.sort(new int[]{1});
        int[] expected = new int[]{1};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void quicksortTest5(){
        int[] actual = Quicksort.sort(new int[]{});
        int[] expected = new int[]{};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void bubblesortTest1(){
        int[] actual = Bubblesort.sort(new int[]{15, 5, 8, 25, 63, 62, 1, 0});
        int[] expected = new int[]{0, 1, 5, 8, 15, 25, 62, 63};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void bubblesortTest2(){
        int[] actual = Bubblesort.sort(new int[]{15, 5, 25, 13, 18, 23, 88, 9});
        int[] expected = new int[]{5, 9, 13, 15, 18, 23, 25, 88};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void bubblesortTest3(){
        int[] actual = Bubblesort.sort(new int[]{3, 105, 2});
        int[] expected =  new int[]{2, 3, 105};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void bubblesortTest4(){
        int[] actual = Bubblesort.sort(new int[]{1});
        int[] expected = new int[]{1};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void bubblesortTest5(){
        int[] actual = Bubblesort.sort(new int[]{});
        int[] expected = new int[]{};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void selectionsortTest1(){
        int[] actual = SelectionSort.sort(new int[]{15, 5, 8, 25, 63, 62, 1, 0});
        int[] expected = new int[]{0, 1, 5, 8, 15, 25, 62, 63};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void selectionsortTest2(){
        int[] actual = SelectionSort.sort(new int[]{15, 5, 25, 13, 18, 23, 88, 9});
        int[] expected = new int[]{5, 9, 13, 15, 18, 23, 25, 88};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void selectionsortTest3(){
        int[] actual = SelectionSort.sort(new int[]{3, 105, 2});
        int[] expected =  new int[]{2, 3, 105};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void selectionsortTest4(){
        int[] actual = SelectionSort.sort(new int[]{1});
        int[] expected = new int[]{1};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void selectionsortTest5(){
        int[] actual = SelectionSort.sort(new int[]{});
        int[] expected = new int[]{};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void mergesortTest1(){
        int[] actual = Mergesort.sort(new int[]{15, 5, 8, 25, 63, 62, 1, 0});
        int[] expected = new int[]{0, 1, 5, 8, 15, 25, 62, 63};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void mergesortTest2(){
        int[] actual = Mergesort.sort(new int[]{15, 5, 25, 13, 18, 23, 88, 9});
        int[] expected = new int[]{5, 9, 13, 15, 18, 23, 25, 88};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void mergesortTest3(){
        int[] actual = Mergesort.sort(new int[]{3, 105, 2});
        int[] expected =  new int[]{2, 3, 105};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void mergesortTest4(){
        int[] actual = Mergesort.sort(new int[]{1});
        int[] expected = new int[]{1};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void mergesortTest5(){
        int[] actual = Mergesort.sort(new int[]{});
        int[] expected = new int[]{};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void binarySearchIterativeTest1(){
        int expected = 5;
        assertEquals(expected, BinarySearch.binarySearchIterative(new int[]{2, 5, 8, 12, 16, 23, 38, 56, 72, 91}, 23));
    }

    @Test
    public void binarySearchIterativeTest2(){
        int expected = 7;
        assertEquals(expected, BinarySearch.binarySearchIterative(new int[]{2, 5, 8, 12, 16, 23, 38, 56, 72, 91}, 56));
    }

    @Test
    public void binarySearchIterativeTest3(){
        int expected = 7;
        assertEquals(expected, BinarySearch.binarySearchIterative(new int[]{2, 5, 8, 12, 16, 23, 38, 56, 72, 91}, 56));
    }

    @Test
    public void binarySearchIterativeTest4(){
        int expected = 0;
        assertEquals(expected, BinarySearch.binarySearchIterative(new int[]{2, 5, 8, 12, 16, 23, 38, 56, 72, 91}, 2));
    }

    @Test
    public void binarySearchIterativeTest5(){
        int expected = 0;
        assertEquals(expected, BinarySearch.binarySearchIterative(new int[]{2}, 2), 0);
    }

    @Test
    public void binarySearchIterativeTest6(){
        int expected = -1;
        assertEquals(expected, BinarySearch.binarySearchIterative(new int[]{}, 2));
    }

}
