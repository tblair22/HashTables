/*
Trent Blair
3/7/22
This program creates Hash tables
 */

public class HashTable {

    private String[] hashTable;
    int bucketsFilled;

    public HashTable(int capacity){
        hashTable = new String[capacity];
        bucketsFilled = 0;
    }

    public boolean put(String key, String value){
        boolean works = false;

        int hash = hashCode(key);
        if(bucketsFilled == hashTable.length){
            String[] newHashTable = new String[hashTable.length * 2];
            for(int i=0; i<hashTable.length; i++){
                newHashTable[i] = hashTable[i];


            }

            hashTable = newHashTable;

        }
        while(hash >= hashTable.length){
            String[] newHashTable = new String[hashTable.length * 2];
            for(int i=0; i<hashTable.length; i++){
                newHashTable[i] = hashTable[i];
            }
            hashTable = newHashTable;
        }


        if (hashTable[hash] == null) {
            works = true;
            hashTable[hash] = value;
            bucketsFilled ++;
        }
        return works;


    }

    private int hashCode(String key){
        String keyValue = "";
        for(int i = 0; i<key.length(); i++){
            keyValue += (int)key.charAt(i)-'a';
        }

        int indexValue = (int) Integer.parseInt(keyValue);
        return indexValue;


    }
    public String get(String key){


        int hash = hashCode(key);
        while(hash >= hashTable.length){
            String[] newHashTable = new String[hashTable.length * 2];
            for(int i=0; i<hashTable.length; i++){
                newHashTable[i] = hashTable[i];
            }
            hashTable = newHashTable;
        }


        return hashTable[hash];


    }
}