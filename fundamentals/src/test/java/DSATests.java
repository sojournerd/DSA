import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

import com.java.Quicksort;

public class DSATests {

    @Test
    public void quicksortTest1(){
        int[] actual =  Quicksort.sort(new int[]{15, 5, 8, 25, 63, 62, 1, 0});
        int[] expected =  new int[]{0, 1, 5, 8, 15, 25, 62, 63};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void quicksortTest2(){
        int[] actual =  Quicksort.sort(new int[]{15, 5, 25, 13, 18, 23, 88, 9});
        int[] expected =  new int[]{5, 9, 13, 15, 18, 23, 25, 88};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void quicksortTest3(){
        int[] actual =  Quicksort.sort(new int[]{3, 105, 2});
        int[] expected =  new int[]{2, 3, 105};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void quicksortTest4(){
        int[] actual =  Quicksort.sort(new int[]{1});
        int[] expected =  new int[]{1};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void quicksortTest5(){
        int[] actual =  Quicksort.sort(new int[]{});
        int[] expected =  new int[]{};
        assertArrayEquals(expected, actual);
    }

}
