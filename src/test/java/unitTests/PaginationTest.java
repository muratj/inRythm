package unitTests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.theories.DataPoints;
import utils.PaginationHelper;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PaginationTest {
    // Test Data
    char[] charArr = {'a','b','c','d','e','f'};
    int[] intArr = {1,2,3,4,5,6,3,2,1};
    String[] strArr = {"a", "b", "c", "d","e","f"};


    PaginationHelper helper;
    @Test
    public void classVerification() {
        PaginationHelper helper = new PaginationHelper(charArr, 4 );

        Assert.assertEquals(helper.getItems().toString(), "[[a, b, c, d], [e, f]]");
    }

    @Test
    public void pagesTest() {
        helper = new PaginationHelper(intArr, 4);

        Assert.assertEquals(helper.pageCount(), 2);
    }

    @Test
    public void itemsCount() {
        helper = new PaginationHelper(intArr, 4);

        System.out.println(helper.itemCount());
    }

    @Test
    public void itemsPerPage() {
        helper = new PaginationHelper(strArr, 4);

        System.out.println(helper.pageItemCount(3));
    }

    @Test
    public void findPageByItemIndex() {
        helper = new PaginationHelper(strArr, 4);
        System.out.println(helper.pageIndex(8));
    }

    @Test
    public void test1() {
        Object arr = new int[]{2,3,4,4};
        System.out.println(Arrays.toString((int[]) arr));
    }
}
