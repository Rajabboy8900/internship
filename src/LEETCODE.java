//import java.util.Arrays;
//import java.util.Scanner;
//
//public class leetcode {
//    public static int LEETCODE(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int[] a = new int[]{};
//        int[] b = new int[]{};
//
//        Arrays.sort(a);
//        Arrays.sort(b);
//
//        int i = 0;
//        int j = 0;
//
//        while (i < a.length && j < b.length) {
//            if (a[i] <= b[j]) {
//
//                i++;
//                j++;
//            } else {
//
//                j++;
//            }
//        }
//        return a.length - i;
//    }
//
//
//
//        System.out.println(numOfUnplacedFruits(a, b));
//
//    }
//}
//
////////////////////////////////////////////////////////////////////////
////option two//////////////////////////////////////////////////////////
////class Solution {
////    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
////        int n = fruits.length;
////        int unplaced = 0;
////
////        for (int i = 0; i < n; i++) {
////            boolean placed = false;
////            for (int j = 0; j < n; j++) {
////                if (baskets[j] >= fruits[i]) {
////                    unplaced += 1;
////                    baskets[j] = 0;
////                    break;
////                }
////            }
////        }
////
////        return n - unplaced;
////    }
////
//
//
//
//
//
//public static int numOfUnplacedFruits(int[] fruits, int[] baskets) {
//    Arrays.sort(fruits);
//    Arrays.sort(baskets);
//
//    int i = 0;
//    int j = 0;
//
//    while (i < fruits.length && j < baskets.length) {
//        if (fruits[i] <= baskets[j]) {
//
//            i++;
//            j++;
//        } else {
//
//            j++;
//        }
//    }
//    return fruits.length - i;
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
