package utils;

import java.util.ArrayList;
import java.util.List;

public class Pages {
    /**
     * Method will create List of List items from int[]
     * @param items require parameter int array
     * @param itemsPerPage how many Items per page
     * @return List of List items
     */
    public static List<List<Object>> createPages(int[] items, int itemsPerPage) {
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
    public static List<List<Object>> createPages(char[] items, int itemsPerPage) {
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
    public static List<List<Object>> createPages(String[] items, int itemsPerPage) {
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

}
