# QA Engineer Exercise inRhythm
## Task has 2 versions: on `master` and `secondWay` branches

## Setup
Maven project

All necessary dependencies and Java version in `pom.xml` file

## Structure

### Main Code
Main code located in `src/main/java/utils`

File `Page.java` created as a utility and 
provide `createPages` method

`createPages` method is overloaded method for 
`int, char, String` arrays. 
Gets two parameter `array` and 
`itemsPerPage` and returns `List<List<Object>>`;

Example:
```
// input
int[] arr = {1,2,3,4,5,6};
createPages(arr, 4);

// output
[ [1,2,3,4], [5,6] ]
```

`PaginationHelper.java` constructs the pages and 
provides information about pages and items:
* `pageCount` - Returns how many pages in the pagination
* `itemCount` - Returns how many items in the pagination
* `pageItemCount` - Returns how many items in the provided page
* `pageIndex` - Returns page index where located the item provided as a parameter

### Test environment
Test environment located in `src/test/java/unitTests/PaginationTest.java`