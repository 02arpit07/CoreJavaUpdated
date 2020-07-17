package BinarySearch;

import java.util.Scanner;

public class AlphabeticCeil7 {
    public static void main(String[] args)
    {
        String str="admruxz";
        char[] arr=str.toCharArray();
        char key='a';
        System.out.print(getAnss(arr,key));
    }
    static char getAnss(char[] arr,char key)
    {
        int start=0;
        int end=arr.length-1;
        char result='\u0000';
        while(start<=end)
        {
            int mid=start+((end-start)/2);
            if(arr[mid]==key)
            {
                start=mid+1;
            }
            else if(arr[mid]<key)
            {
                start=mid+1;
            }
            else if(arr[mid]>key){
                result=arr[mid];
                end=mid-1;
            }
        }
        return  result;
    }

}
