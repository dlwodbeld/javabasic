package pm;

public class Exam13 {
    /*
    모든 매서드는 자신이 포함된 클래스 객체를 가리키는 this 참조변수가 있다.
    this. 를 생략해도 항상 자바가 추가해주기떄문에 굳이 신경쓸 필요가 없어보이지만
    this. 명시적으로 꼭 붙여줘야 할 때가 있다.

    this 매서드

    this 키워드와 매우 비슷해보이지만 의미가 전혀 다르다.
    this()매서드는 자신이 속한 클래스의 내부의 다른 생성자를 호출한다.
    this() 매서드의 특징
    1.생성자의 내부에서만 사용된다.
    2.생성자의 첫줄에서만 사용한다.
    이 두개의 규칙중 하나라도 지켜지지 않으면 오류가 발생된다.
    
    */
    public static void main(String[] args) {
        P p = new P();
        p.work();
        System.out.println(p.m);
        System.out.println(p.n);
    }
}


class P{ //생성자는 자바가 자동으로 기본 생성자를 작성해준다.
    int m;
    int n;
    void init(int a,int b){
        int c;
        c=3;
        this.m = a;//this.를 생략하면 자동으로 자바가 붙여준다.
        this.n = b;//this.를 생략하면 자동으로 자바가 붙여준다.
    }
    void work(){
        this.init(2, 3);//this.를 생략하면 자동으로 자바가 붙여준다.
    }
}