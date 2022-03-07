/*
Trent Blair
3/7/22
This is the driver for the Hash Table
 */
public class HashDriver {
        public static void main(String[] args) {
            HashTable test = new HashTable(100);

            System.out.println("Testing put (true): ");
            System.out.println(test.put("b", "two"));
            System.out.println(test.put("a", "one"));
            System.out.println(test.put("c", "three"));

            System.out.println("Should return two " + test.get("b"));
            System.out.println("Should return one " + test.get("a"));

            System.out.println("Should return null " + test.get("z"));
            System.out.println("Should return null " + test.get("d"));

            System.out.println("Should return three " + test.get("c"));
            System.out.println("Should be false " + test.put("b", "four"));
        }


}
