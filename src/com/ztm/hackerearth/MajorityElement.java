package com.ztm.hackerearth;

import java.util.HashMap;
public class MajorityElement {
        public static int findMajority(int[] arr, int n) {
            // Write your code here.
            HashMap<Integer,Integer> map =new HashMap<>();
            for(int i=0;i<n;i++){
                if(!map.containsKey(arr[i])){
                    map.put(arr[i],1);
                }else{
                    map.put(arr[i],map.get(arr[i])+1);
                }
                System.out.println(arr[i]+"->"+map.get(arr[i]));
            }
            int value =(int)Math.floor(n/2);
            for(int j=0;j<n;j++){
                if(map.get(arr[j])>=value){
                    return arr[j];
                }
            }
            return -1;
        }

        public static void main(String[] args) {
            int[] arr= {2,4, 5,2,2,5};
            int res= findMajority(arr,arr.length);
            System.out.println(res);
    }
    }
