package utils;

import java.util.ArrayList;
import java.util.List;

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

    /**
     * Method will create List of List items
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

    public Object getItems() {
        return items;
    }
}
