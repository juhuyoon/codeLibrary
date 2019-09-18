package com.example.Google.Easy;


/*
In a row of trees, the i-th tree produces fruits with type tree[i];

You start at any tree fo your choice, then repeatedly perform the following steps.
 1. Add one piece of fruits from this tree to your baskets. If you cannot, stop.
 2. Move to the next tree to the right of the current tree. If there is no tree to the right, stop.

Note that you do not have any choice after the initial choice of starting tree:
you must perform step 1, then step 2, then back to step 1, then step 2, and so on until you stop.

You have two baskets, and each basket can carry any quantity of fruit, but you want each basket to only carry one type of fruit each.

What is the total amount of fruit you can collect with this procedure?


Input: [3,3,3,1,2,1,1,2,3,3,4]
Output: 5
Explanation: We can collect [1,2,1,1,2].
If we started at the first tree or the eighth tree, we would only collect 4 fruits.
 */

public class FruitIntoBaskets {
    public int totalFruit(int[] tree) {
        int max = 0;
        int count = 0;

        for(int i = 0, first = 0, second = -1; i < tree.length; i++) {
            count++;
            if(tree[i] == tree[first]) {
                first = i;
            } else if (second == -1 || tree[i] == tree[second]) {
                second = i;
            } else {
                max = Math.max(count - 1, max);
                count = Math.abs(first - second) + 1;
                first = i - 1;
                second = i;
            }
        }
        return Math.max(count, max);
    }
}
