# QA Engineer Exercise inRhythm
## This version only based on arithmetic methods

## Setup

Maven project

All necessary dependencies and Java version in `pom.xml` file

## Structure

### Main Code
Main code located in `src/main/java/utils`

`PaginationHelper.java` constructs the pages and
provides information about pages and items:
* `pageCount` - Returns how many pages in the pagination
* `itemCount` - Returns how many items in the pagination
* `pageItemCount` - Returns how many items in the provided page
* `pageIndex` - Returns page index where located the item provided as a parameter

### Test environment
Test environment located in `src/test/java/unitTests/PaginationTest.java`