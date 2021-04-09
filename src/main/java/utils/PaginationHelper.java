package utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PaginationHelper {
    private final List<Object> items = new ArrayList<>();
    private final int itemsPerPage;

    /**
     * Pagination Constructors transfers primitive arrays into List<Object>
     * @param itemsArr
     * @param itemsPerPage
     */
    public PaginationHelper(int[] itemsArr, int itemsPerPage) {
        for (Object item : itemsArr) {
            this.items.add(item);
        }
        this.itemsPerPage = itemsPerPage;
    }
    public PaginationHelper(char[] itemsArr, int itemsPerPage) {
        for (Object item : itemsArr) {
            this.items.add(item);
        }
        this.itemsPerPage = itemsPerPage;
    }
    public PaginationHelper(String[] itemsArr, int itemsPerPage) {
        this.items.addAll(Arrays.asList(itemsArr));
        this.itemsPerPage = itemsPerPage;
    }


    /**
     * Returns how many pages in the pagination
     * @return pages size
     */
    public int pageCount(){
        return (int) Math.ceil((double) items.size() / itemsPerPage);
    }

    /**
     * Returns how many items in the pagination
     * @return count of items
     */
    public int itemCount() {
        return items.size();
    }

    /**
     * Returns how many items in the provided page
     * @param pageIndex
     * @return items count in the page
     */
    public int pageItemCount(int pageIndex) {
        int pageItems = 0;
        int pages = (int) Math.ceil((double) items.size() / itemsPerPage);
        int fullPages = (int) Math.floor((double) items.size() / itemsPerPage);
        int rest = items.size() % itemsPerPage;
        if (pageIndex >= pages || pageIndex < 0) {
            return -1;
        } else if(pageIndex < fullPages) {
            pageItems = itemsPerPage;
        } else {
            pageItems = rest;
        }

        return pageItems;
    }

    /**
     * Returns page index where located the item provided as a parameter
     * @param itemIndex
     * @return page index
     */
    public int pageIndex(int itemIndex){
        if (itemIndex >= itemCount() || itemIndex < 0) return -1;

        return (int) Math.floor((double) itemIndex / itemsPerPage);
    }

}
