package StringCoreJavaBasics;
import java.util.*;
import java.lang.*;

public class StringPermutations {
    //Input--------ABC
//Output-------ABC ACB BAC BCA CAB CBA


        public static void main (String[] args) {
            Scanner s=new Scanner(System.in);
            int t=s.nextInt();
            while(t-- >0){
                String str=s.next();
                int n=str.length();
                ArrayList<String> list=new ArrayList<>();
                list=permute(list,str,0,n-1);
                Collections.sort(list);
                for(String st:list)
                    System.out.print(st+" ");
                System.out.println();
            }
        }
        static ArrayList<String> permute(ArrayList<String> list,String str,int f,int l){
            if(f==l)
                list.add(str);
            else{
                for(int i=f;i<=l;i++){
                    str=swap(str,i,f);
                    permute(list,str,f+1,l);
                    str=swap(str,i,f);
                }
            }
            return list;
        }
        static String swap(String str,int i,int j){
            char temp;
            char[] arr=str.toCharArray();
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            return String.valueOf(arr);
        }
    }

