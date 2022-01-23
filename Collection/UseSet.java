package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class UseSet {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        boolean value1 = hashSet.add("AAA");
        boolean value2 = hashSet.add("BBB");
        boolean value3 = hashSet.add("AAA");

        System.out.println(hashSet.size()); //2 Hashset은 중복 값을 허용하지 않는 자료구조

        System.out.println("value1 = " + value1);
        System.out.println("value2 = " + value2);
        System.out.println("value3 = " + value3); // 중복 값은 false 리턴

        Iterator<String> iter = hashSet.iterator();



    }
}
