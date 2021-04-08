package utils;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class PaginationHelper {
    /**
     * Main logic behind the class:
     * - separate given items into pages
     * - provide information methods for end user
     */

    private List<List<Object>> items;
    private int itemsPerPage;

    /**
     * Page constructor: Gets array of items and separate them into pages
     * @param items gets items as an array
     * @param itemsPerPage required items per page
     */
    public PaginationHelper(int[] items, int itemsPerPage) {
        this.items = Pages.createPages(items, itemsPerPage);
        this.itemsPerPage = itemsPerPage;
    }
    public PaginationHelper(char[] items, int itemsPerPage) {
        this.items = Pages.createPages(items, itemsPerPage);
        this.itemsPerPage = itemsPerPage;
    }
    public PaginationHelper(String[] items, int itemsPerPage) {
        this.items = Pages.createPages(items, itemsPerPage);
        this.itemsPerPage = itemsPerPage;
    }


    /**
     * Returns how many pages in the pagination
     * @return pages size
     */
    public int pageCount() {
        return items.size();
    }

    /**
     * Returns how many items in the pagination
     * @return count of items
     */
    public int itemCount() {
        AtomicInteger count = new AtomicInteger();
        items.forEach(page -> {
            page.forEach(item -> {
                count.getAndIncrement();
            });
        });
        return count.get();
    }

    /**
     * Returns how many items in the provided page
     * @param pageIndex index of the page
     * @return items count in the page
     */
    public int pageItemCount(int pageIndex) {
        if (pageIndex >= items.size()) return -1;
        return items.get(pageIndex).size();
    }

    /**
     * Returns page index where located the item provided as a parameter
     * @param itemIndex index of the item based on initial array
     * @return page index starts from 0
     */
    public int pageIndex(int itemIndex) {
        if (itemIndex >= itemCount()) return -1;
        int pageNumber = 0;
        int endIndex = 0;

        for (int i=0; i<items.size(); i++) {
            int startIndex = i*itemsPerPage;
            endIndex += itemsPerPage-1;

            if(itemIndex>=startIndex && itemIndex<=endIndex){
                pageNumber = i;
            }
        }

        return pageNumber;
    }

    /**
     * getter for List<List<Object>> items
     * @return List<List<Object>> items
     */
    public Object getItems() {
        return items;
    }
}
