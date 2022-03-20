package task2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class MergeSortTest {

    @Test
    @DisplayName("Check positive values")
    void checkSorting() {
        assertAll(
                () -> assertArrayEquals(new int[]{3, 4, 5, 33}, MergeSort.sort(new int[]{33, 3, 4, 5})),
                () -> assertArrayEquals(new int[]{1,3,4,7,9}, MergeSort.sort(new int[]{4,1,3,9,7})),
                () -> assertArrayEquals(new int[]{1,2,3,4,5,6,7,8,9,10}, MergeSort.sort(new int[]{10,9,8,7,6,5,4,3,2,1})),
                () -> assertArrayEquals(new int[]{22, 28, 30, 82, 159, 166, 166, 287, 289, 338, 365, 371, 444, 451, 520, 527, 567, 623, 676, 714, 719, 741, 771, 783, 818, 874, 884, 914, 960, 970, 983},
                        MergeSort.sort(new int[]{444, 520, 166, 874, 676, 22, 338, 783, 365, 970, 623, 30, 287, 451, 914, 371, 741, 818, 527, 714, 166, 159, 960, 289, 567, 82, 771, 983, 719, 884, 28}))
        );
    }

    @Test
    @DisplayName("Check empty")
    void checkEmpty() {
        assertArrayEquals(new int[]{}, MergeSort.sort(new int[]{}));
    }

    @Test
    @DisplayName("Check negative values")
    void checkNegativeValues() {
        assertArrayEquals(new int[]{-5, -4, -3, -2, -1}, MergeSort.sort(new int[]{-5, -1, -4, -3, -2}));
    }

    @Test
    @DisplayName("Check zeros")
    void checkZeros() {
        assertArrayEquals(new int[]{0,0,0,0,0}, MergeSort.sort(new int[]{0,0,0,0,0}));
    }

    @Test
    @DisplayName("Check null")
    void checkNull() {
        assertThrows(NullPointerException.class, () -> MergeSort.sort(null));
    }


    @Test
    @DisplayName("Check Standard Sort")
    void checkStandardSort() {
        int[] test = new int[]{-5, -4, -3, -2, -1};
        int[] res = MergeSort.sort(test);
        Arrays.sort(test);
        assertArrayEquals(test,res);
    }

    @Test
    @DisplayName("Check merge")
    void checkMerge() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        MergeSort privateObject = new MergeSort();

        Method privateStringMethod = MergeSort.class.
                getDeclaredMethod("merge", int[].class, int[].class, int[].class, int.class, int.class);


        privateStringMethod.setAccessible(true);


        int[] test_0 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] test = new int[10];

        int[] l_arr_0 = new int[]{1, 2, 3, 4, 5};
        int[] l_arr = new int[]{1, 2, 3, 4, 5};

        int[] r_arr_0 = new int[]{6, 7, 8, 9, 10};
        int[] r_arr = new int[]{6, 7, 8, 9, 10};

        int l_len = 5;
        int r_len = 5;

        privateStringMethod.invoke(privateObject, test, l_arr, r_arr, l_len, r_len);

        assertArrayEquals(test_0, test);

        assertArrayEquals(r_arr_0, r_arr);

        assertArrayEquals(l_arr_0, l_arr);
    }
}