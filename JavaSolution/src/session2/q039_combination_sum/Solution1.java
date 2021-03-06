package session2.q039_combination_sum;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution1 {
    public static void main(String[] args){
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        System.out.println(combinationSum(candidates,target));
    }

    private static List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> lists = new LinkedList<>();
        if(candidates.length == 0){
            return lists;
        }
        List<Integer> tempList = new LinkedList<>();
        backTracking(candidates,lists,tempList,0,0,target);
        return lists;
    }

    private static void backTracking(int[] candidates,List<List<Integer>> lists,List<Integer> tempList,int currPos,int tempSum,int target){
        if(tempSum > target){
            tempList.remove(tempList.size()-1);
            return;
        }
        if(tempSum == target){
            if(!lists.contains(tempList)){
                List<Integer> addList = new LinkedList<>(tempList);
                lists.add(addList);
            }
        }
        else{
            for(int i=currPos;i<candidates.length;i++){
                tempList.add(candidates[i]);
                backTracking(candidates,lists,tempList,i,tempSum + candidates[i],target);
            }
        }
        if(tempList.size() > 0){
            tempList.remove(tempList.size() -1);
        }
    }
}
