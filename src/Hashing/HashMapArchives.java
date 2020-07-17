/*
Minimum, maximum and average price values for all the items of given type
Given a string array item[] and an integer array price[] where price[i] is the price of the item[i] when purchased from the ith shop. The task is find the lowest, the highest and the average price value for all the purchsed items.

Examples:

Input: item[] = {“toy”, “pen”, “notebook”, “pen”}, price[] = {2, 1, 3, 2}
Output:
Item Min Max Average
pen 1 2 1.5
toy 2 2 2.0
notebook 3 3 3.0
 */

package Hashing;
import java.util.*;
import java.util.HashMap;

public class HashMapArchives {
    static class Item{
        int max,min;
        int qty,sum;
        Item(int price)
        {
            min=price;
            max=price;
            qty=1;
            sum=price;

        }
    }
    public static void main(String[] args)
    {
        String[] items={"toy","pen","notebook","pen"};
        int n =items.length;
        int[] price={2,1,3,2};
        findPrices(items,price,n);
    }
    static void findPrices(String[] item,int[] price,int n)
    {
        HashMap<String,Item> hm=new HashMap<>();

        for(int i=0;i<n;i++)
        {
            if(hm.containsKey(item[i]))
            {
                Item it=hm.get(item[i]);
                it.min=Math.min(it.min,price[i]);
                it.max=Math.max(it.max,price[i]);
                it.qty=it.qty+1;
                it.sum=it.sum+price[i];
            }
            else{
                Item it=new  Item(price[i]);
                hm.put(item[i],it);
            }
        }
        System.out.println("Item Min Max Average");
        for(Map.Entry<String,Item> ob:hm.entrySet())
        {
            String key = ob.getKey();
            Item currItem = ob.getValue();
            System.out.println(key + " " + currItem.min
                    + " " + currItem.max + " "
                    + ((float)currItem.sum / (float)currItem.sum ));
        }
    }
}
