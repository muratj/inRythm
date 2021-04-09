package unitTests;

import org.junit.Assert;
import org.junit.Test;
import utils.PaginationHelper;

import java.util.Arrays;

public class PaginationTest {
    PaginationHelper helper;

    @Test
    public void classTest() {
        PaginationHelper helperInt = new PaginationHelper(new int[]{1, 2, 3, 4, 4, 5, 3, 2}, 4);
        PaginationHelper helperStr = new PaginationHelper(new String[]{"a", "b", "c"}, 4);
        PaginationHelper helperChar = new PaginationHelper(new char[]{'a', 'b', 'c'}, 4);
    }

    @Test
    public void pageCountTest() {
        helper = new PaginationHelper(new int[]{1, 2, 3, 4, 4, 5, 3, 2}, 4);
        Assert.assertEquals(2, helper.pageCount());
        helper = new PaginationHelper(new int[]{1, 2, 3, 4, 4, 5, 3, 2, 3, 5, 6}, 4);
        Assert.assertEquals(3, helper.pageCount());
    }

    @Test
    public void itemCountTest() {
        helper = new PaginationHelper(new int[]{1, 2, 3, 4, 5, 6}, 4);
        Assert.assertEquals(6, helper.itemCount());
    }

    @Test
    public void pageItemCount() {
        helper = new PaginationHelper(new int[]{1, 2, 3, 4, 4, 5, 3, 2, 3, 5, 6}, 4);

        Assert.assertEquals(4, helper.pageItemCount(0));
        Assert.assertEquals(4, helper.pageItemCount(1));
        Assert.assertEquals(3, helper.pageItemCount(2));
        Assert.assertEquals(-1, helper.pageItemCount(4));
        Assert.assertEquals(-1, helper.pageItemCount(-20));
    }

    @Test
    public void pageIndexTest() {
        helper = new PaginationHelper(new int[]{1, 2, 3, 4, 4, 5, 3, 2, 3, 5, 6}, 4);

        Assert.assertEquals(0, helper.pageIndex(0));
        Assert.assertEquals(1, helper.pageIndex(5));
        Assert.assertEquals(2, helper.pageIndex(9));
        Assert.assertEquals(-1, helper.pageIndex(11));
    }

    @Test
    public void test1() {
        Object arrObj = new int[]{1, 2, 3, 4, 5};
        String arr = Arrays.toString((int[]) arrObj);
        System.out.println(arr.substring(1, arr.length() - 1));
    }
}
