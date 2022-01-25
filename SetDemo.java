package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class SetDemo {
    public static void main(String[] args) {
        HashSet<Integer> A = new HashSet<Integer>(); // util패키지 통해 HashSet 객체 생성, 지네릭으로 Integer 타입 지정
        A.add(1);
        A.add(2);
        A.add(3);

        Iterator a = (Iterator) A.iterator();
        while (a.hasNext()){
            System.out.println("a.next() = " + a.next());
        }

        System.out.println("=================");

        HashSet<Integer> B = new HashSet<Integer>();
        B.add(1);
        B.add(2);
        B.add(2);
        B.add(2);
        B.add(2); // HashSet은 중복을 허용하지 않음
        B.add(3);

        Iterator b = (Iterator) B.iterator();
        while (b.hasNext()){
            System.out.println("b.next() = " + b.next());
        }

        System.out.println("=================");

        ArrayList<Integer> C = new ArrayList<Integer>();
        C.add(1);
        C.add(2);
        C.add(2);
        C.add(2);
        C.add(2); // ArrayList는 중복을 허용
        C.add(3);

        Iterator c = (Iterator) C.iterator();
        while (c.hasNext()){
            System.out.println("c.next() = " + c.next());
        }



    }
}
