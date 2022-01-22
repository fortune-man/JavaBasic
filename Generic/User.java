package Generic;

public class User {
    public static void main(String[] args) {
//        Super super = new Super();
//        super.setObj(new Object());
//        Object obj = super.getObj();
//
//        super.setObj("hello");
//        String str = (String) super.getObj();
//        System.out.println("str = " + str);
//
//        super.setObj(1);
//        int value = (int) super.getObj();

        // 매번 형변환 해줘야하는 번거로움 -> 중복 해결을 위해 자바 5부터 Generic 문법 추가
        // Generic : instance를 생성할 때 사용할 데이터 타입을 지정하는 문법

        Super<Object> superObject = new Super<>();
        superObject.setObj(new Object());
        Object obj = superObject.getObj();

        Super<String> superString = new Super<>();
        superString.setObj("hello !!");
        String str = superString.getObj();

        Super<Integer> superInteger = new Super<>();
        superInteger.setObj(220122);
        Integer integer = superInteger.getObj();

        System.out.println("Obj = " + obj);
        System.out.println("String = " + str);
        System.out.println("Integer = " + integer);

    }
}
