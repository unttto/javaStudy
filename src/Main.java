//import java.util.*;
//
//// 두수의 합 구하기 nums 정수 배열 , tearget이 주어질때 두수의 합이 target이 되게끔하는 nums의 인덱스를 반환
//
//public class TwoSum {
//    public int[] twoSum(int[] nums, int target){
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i<nums.length; i++){
//            int complement = target - nums[i];
//            if(map.containsKey(complement)){
//                return new int[] {map.get(complement),i};
//
//            }
////            map.put(nums[i],i);
//        }
////        throw new IllegalArgumenException("new two sum solution");
////    }
//}