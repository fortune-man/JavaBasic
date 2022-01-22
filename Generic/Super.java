package Generic;

public class Super<G> { //가상 클래스 G의 데이터 타입을 사용한다는 의미
    private G obj;

    public G getObj() {
        return obj;
    }

    public void setObj(G obj) {
        this.obj = obj;
    }
}
