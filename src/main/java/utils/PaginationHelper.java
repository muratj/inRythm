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
        this.items = createPages(items, itemsPerPage);
        this.itemsPerPage = itemsPerPage;
    }
    public PaginationHelper(char[] items, int itemsPerPage) {
        this.items = createPages(items, itemsPerPage);
        this.itemsPerPage = itemsPerPage;
    }
    public PaginationHelper(String[] items, int itemsPerPage) {
        this.items = createPages(items, itemsPerPage);
        this.itemsPerPage = itemsPerPage;
    }


    /**
     * Gives how many pages in the pagination
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
     * Returns page index where located the item provided as a parameters
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
     * Method will create List of List items from int[]
     * @param items require parameter int array
     * @param itemsPerPage how many Items per page
     * @return List of List items
     */
    public List<List<Object>> createPages(int[] items, int itemsPerPage) {
        int pages = (int) Math.ceil((double) items.length / itemsPerPage);
        List<List<Object>> pagination = new ArrayList<>();

        for (int i = 0; i < pages; i++) {
            int startIndex = i * itemsPerPage;
            int length = Math.min(items.length-startIndex, itemsPerPage);

            List<Object> page = new ArrayList<>();
            int[] temp = new int[length];
            System.arraycopy(items, startIndex, temp, 0, length);
            for (int c : temp) {
                page.add(c);
            }

            pagination.add(page);
        }

        return pagination;
    }
    /**
     * Method will create List of List items from char[]
     * @param items require parameter int array
     * @param itemsPerPage how many Items per page
     * @return List of List items
     */
    public List<List<Object>> createPages(char[] items, int itemsPerPage) {
        int pages = (int) Math.ceil((double) items.length / itemsPerPage);
        List<List<Object>> pagination = new ArrayList<>();

        for (int i = 0; i < pages; i++) {
            int startIndex = i * itemsPerPage;
            int length = Math.min(items.length-startIndex, itemsPerPage);

            List<Object> page = new ArrayList<>();
            char[] temp = new char[length];
            System.arraycopy(items, startIndex, temp, 0, length);
            for (Object c : temp) {
                page.add(c);
            }

            pagination.add(page);
        }

        return pagination;
    }
    /**
     * Method will create List of List items from char[]
     * @param items require parameter int array
     * @param itemsPerPage how many Items per page
     * @return List of List items
     */
    public List<List<Object>> createPages(String[] items, int itemsPerPage) {
        int pages = (int) Math.ceil((double) items.length / itemsPerPage);
        List<List<Object>> pagination = new ArrayList<>();

        for (int i = 0; i < pages; i++) {
            int startIndex = i * itemsPerPage;
            int length = Math.min(items.length-startIndex, itemsPerPage);

            List<Object> page = new ArrayList<>();
            String[] temp = new String[length];
            System.arraycopy(items, startIndex, temp, 0, length);
            for (Object c : temp) {
                page.add(c);
            }

            pagination.add(page);
        }

        return pagination;
    }

    /**
     * getter for List<List<Object>> items
     * @return List<List<Object>> items
     */
    public Object getItems() {
        return items;
    }
}
