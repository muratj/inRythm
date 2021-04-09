package utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pages {
    /**
     * Method will create List of List items from int[]
     * @param items require parameter int array
     * @param itemsPerPage how many Items per page
     * @return List of List items
     */
    public static List<List<Object>> createPages(int[] items, int itemsPerPage) {
        List<Object> allItems = new ArrayList<>();
        for (Object item : items) {
            allItems.add(item);
        }
        return createPagination(allItems, itemsPerPage);
    }


    /**
     * Method will create List of List items from char[]
     * @param items require parameter int array
     * @param itemsPerPage how many Items per page
     * @return List of List items
     */
    public static List<List<Object>> createPages(char[] items, int itemsPerPage) {
        List<Object> allItems = new ArrayList<>();
        for (Object item : items) {
            allItems.add(item);
        }
        return createPagination(allItems, itemsPerPage);
    }
    /**
     * Method will create List of List items from char[]
     * @param items require parameter int array
     * @param itemsPerPage how many Items per page
     * @return List of List items
     */
    public static List<List<Object>> createPages(String[] items, int itemsPerPage) {
        List<Object> allItems = new ArrayList<>();
        for (Object item : items) {
            allItems.add(item);
        }
        return createPagination(allItems, itemsPerPage);
    }

    /**
     * Method will create List of List items with List<Object>
     * @param allItems List<Object>
     * @param itemsPerPage
     * @return List<List<Object>>
     */
    public static List<List<Object>> createPagination(List<Object> allItems, int itemsPerPage) {
        List<List<Object>> pagination = new ArrayList<>();
        while (allItems.size() > 0){
            List<Object> page = new ArrayList<>();
            for (int i=0; i<itemsPerPage && allItems.size()>0; i++) {
                page.add(allItems.get(0));
                allItems.remove(0);
            }
            pagination.add(page);
        }
        return pagination;
    }
}
