package unitTests;

import org.junit.Assert;
import org.junit.Test;
import utils.PaginationHelper;

import java.util.Arrays;

public class PaginationTest {
    PaginationHelper helper;

    @Test
    public void classVerification() {
        helper = new PaginationHelper(new char[]{'a','b','c','d','e','f'}, 4 );

        Assert.assertEquals(helper.getItems().toString(), "[[a, b, c, d], [e, f]]");
    }

    @Test
    public void pagesTest() {
        helper = new PaginationHelper(new int[]{1,2,3,4,5,6,3,2,1}, 4);

        Assert.assertEquals(helper.pageCount(), 3);
    }

    @Test
    public void itemsCount() {
        helper = new PaginationHelper(new int[]{1,2,3,4,5,6,3,2,1}, 4);

        Assert.assertEquals(helper.itemCount(), 9);
    }

    @Test
    public void itemsPerPage() {
        helper = new PaginationHelper(new String[]{"a", "b", "c", "d","e","f"}, 4);

        Assert.assertEquals(helper.pageItemCount(0), 4);
    }

    @Test
    public void findPageByItemIndex() {
        helper = new PaginationHelper(new String[]{"a", "b", "c", "d","e","f"}, 4);

        Assert.assertEquals(helper.pageIndex(5), 1);
    }

    @Test
    public void test1() {
        Object arr = new int[]{2,3,4,4};
        System.out.println(Arrays.toString((int[]) arr));
    }
}
