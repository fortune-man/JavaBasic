package Member;

public class Member {
    public static void main(String[] args) {
        String id = "enter id";
        String password = "password";

        User member = new User();
        User member1 = new User();
        User member2 = new User();

        //클래스 변수는 인스턴스화 하지 않아도 접근 가능
        System.out.println("member = " + member.id + "| " + member.password);
        //인스턴스화한 후에도 클래스 변수에 접근 가능
        System.out.println("member1 = " + member1.login(id, password));
        //서로 다른 인스턴스라도 클래스 변수는 공유 가능
        System.out.println("member2 = " + member2.login("AAA", "qwer"));

    }
}
