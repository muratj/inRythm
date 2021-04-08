package unitTests;

import org.junit.Test;
import utils.PaginationHelper;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PaginationTest {
    @Test
    public void classVerification() {
//        char[] arr = {'1','2','3','4','5','6'};
        int[] arr = {1,2,3,4,5,6};
        PaginationHelper helper = new PaginationHelper(arr, 4 );

        System.out.println(helper.getItems());
    }

    @Test
    public void test1() {
    }
}
