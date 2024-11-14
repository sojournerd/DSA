import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

import com.java.Quicksort;
import com.java.Bubblesort;
import com.java.InsertionSort;

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
    public void insertionsortTest1(){
        int[] actual = InsertionSort.sort(new int[]{15, 5, 8, 25, 63, 62, 1, 0});
        int[] expected = new int[]{0, 1, 5, 8, 15, 25, 62, 63};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void insertionsortTest2(){
        int[] actual = InsertionSort.sort(new int[]{15, 5, 25, 13, 18, 23, 88, 9});
        int[] expected = new int[]{5, 9, 13, 15, 18, 23, 25, 88};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void insertionsortTest3(){
        int[] actual = InsertionSort.sort(new int[]{3, 105, 2});
        int[] expected =  new int[]{2, 3, 105};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void insertionsortTest4(){
        int[] actual = InsertionSort.sort(new int[]{1});
        int[] expected = new int[]{1};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void insertionsortTest5(){
        int[] actual = InsertionSort.sort(new int[]{});
        int[] expected = new int[]{};
        assertArrayEquals(expected, actual);
    }

}
