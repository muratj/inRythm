package unitTests;

import org.junit.Assert;
import org.junit.Test;
import utils.PaginationHelper;

public class PaginationTest {
    PaginationHelper helper;

    @Test
    public void classVerification() {
        helper = new PaginationHelper(new char[]{'a','b','c','d','e','f'}, 4 );

        Assert.assertEquals(helper.getItems().toString(), "[[a, b, c, d], [e, f]]");
    }

    @Test
    public void pagesTest() {
        helper = new PaginationHelper(new char[]{'a','b','c','d','e','f'}, 4);

        Assert.assertEquals(2, helper.pageCount());
    }

    @Test
    public void itemsCount() {
        helper = new PaginationHelper(new char[]{'a','b','c','d','e','f'}, 4);

        Assert.assertEquals(6, helper.itemCount());
    }

    @Test
    public void itemsPerPage() {
        helper = new PaginationHelper(new char[]{'a','b','c','d','e','f'}, 4);

        Assert.assertEquals(4, helper.pageItemCount(0));
        Assert.assertEquals(2, helper.pageItemCount(1));
        Assert.assertEquals(-1, helper.pageItemCount(2));
    }

    @Test
    public void findPageByItemIndex() {
        helper = new PaginationHelper(new char[]{'a','b','c','d','e','f'}, 4);

        Assert.assertEquals(1, helper.pageIndex(5));
        Assert.assertEquals(0, helper.pageIndex(2));
        Assert.assertEquals(-1, helper.pageIndex(20));
        Assert.assertEquals(-1, helper.pageIndex(-10));
    }
}
