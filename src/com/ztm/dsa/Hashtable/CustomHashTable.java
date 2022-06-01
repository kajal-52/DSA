package com.ztm.dsa.Hashtable;

public class CustomHashTable {
    private int size;
    private String[] data;

    public CustomHashTable(int size) {
        this.data = new String[size];
    }
    public int generateHash(String key){
        int hash = 0;
        for (int i = 0;i<key.length(); i++){
            hash = (hash+Character.codePointAt(key,i)* i) % this.data.length;
            System.out.println(hash);
        }
        return hash;
        
    }
//    public void Set(String key, String value){
//        int address = generateHash(key);
//        if(!this.data[address]){
//            this.data[address]=new String[100];
//
//        }
//
//    }

    public static void main(String[] args) {
        CustomHashTable customHashTable = new CustomHashTable(50);
        int res = customHashTable.generateHash("Grapes");

    }
}
