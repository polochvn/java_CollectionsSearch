package practice;

import java.util.*;

public class CoolNumbers {

    public static List<String> generateCoolNumbers() {

        String[] letters = {"А", "В", "Е", "К", "М", "Н", "О", "Р", "С", "Т", "У", "Х"};
        List<String> list = new ArrayList<>();

        for (String firstLetter : letters) {
            String letter1 = firstLetter;
            for (int n = 0; n < 10; n++) {
                for (String secondLetter : letters) {
                    String letter2 = secondLetter;
                    for (String thirdLetter : letters) {
                        String letter3 = thirdLetter;
                for (int k = 1; k < 199; k++) {
                    String region = String.valueOf(k);
                    if (k < 10) {
                        region = "0" + region;
                    }
                    String number = String.format
                            ("%s%d%d%d%s%s%s", letter1, n, n, n, letter2, letter3, region);
                    list.add(number);
                }
                    }
                }
            }
        }
        return list;
    }

    public static boolean bruteForceSearchInList(List<String> list, String number) {
        for (String num : list) {
            if (num.equals(number)) {
                return true;
            }
        }
        return false;
    }

    public static boolean binarySearchInList(List<String> sortedList, String number) {
        if (Collections.binarySearch(sortedList, number) == 0) {
            return true;
        }
        return false;
    }

    public static boolean searchInHashSet(HashSet<String> hashSet, String number) {
        for (String num : hashSet) {
            if (num.equals(number)) {
                return true;
            }
        }
        return false;
    }

    public static boolean searchInTreeSet(TreeSet<String> treeSet, String number) {
        if (treeSet.contains(number)) {
            return true;
        }
        return false;
    }
}
