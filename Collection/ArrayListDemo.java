package Collection;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        String[] arrayObj = new String[2];
        arrayObj[0] = "one";
        arrayObj[1] = "two";
//        arrayObj[2] = "three"; // 오류 발생 : ArrayIndexOutOfBoundsException, 배열의 크기를 매번 변경하는데 불편하다는 한계 보유
        
        for(int i=0; i<arrayObj.length; i++){
            System.out.println("arrayObj = " + arrayObj[i]); // 호출 방식의 차이
        }

        ArrayList<String> arrayList = new ArrayList<String>(); // collections 하위 클래스, 배열 크기 지정 필요 x
        arrayList.add("one"); // add() 메서드는 데이터 타입이 Object 여야 함 -> 모든 데이터 타입도 허용하기 위해
        arrayList.add("two");
        arrayList.add("three");
        for(int i=0; i<arrayList.size(); i++){ // length() == size()
            String value = arrayList.get(i); // 데이터 타입 지정의 제약 사항 -> 컬렉션 프레임워크에서 지네릭 채택한 이유 (데이터 타입 지정의 중복은 번거롭기 때문)
            System.out.println("value = " + value); // 호출 방식의 차이
        }
    }
}
