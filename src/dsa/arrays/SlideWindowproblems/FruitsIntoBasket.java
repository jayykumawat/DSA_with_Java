package dsa.arrays.SlideWindowproblems;

import java.util.*;

public class FruitsIntoBasket {
    public static void main(String[] args) {
        int[]fruits={1,2,3,2,2};
        int maxFruits=totalFruit(fruits);
        System.out.println("The Maximum Number Of Fruits in The Basket is "+maxFruits);
    }
    public static int totalFruit(int[]fruits){
        Map<Integer,Integer>map=new HashMap<>();
        int left=0;
        int maxFruits=0;

        for (int right = 0; right < fruits.length; right++) {
            int currentFruit=fruits[right];
            map.put(currentFruit, map.getOrDefault(currentFruit, 0)+1);

            while (map.size()>2) {
                int leftFruit=fruits[left];
                map.put(leftFruit,map.get(leftFruit)-1);
                if(map.get(leftFruit)==0){
                    map.remove(leftFruit);
                }
                left++;
            }
            maxFruits=Math.max(maxFruits,right-left+1);
        }
        return maxFruits;
    }
}
