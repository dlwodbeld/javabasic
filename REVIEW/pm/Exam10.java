package pm;

public class Exam10 {
    public static void main(String[] args) {
        /*
        매서드는 클래스의 기능에 해당하는 요소이다.

        먹기,잠자기,공부하기,전진하기,후진하기 ......

        접근제어자  리턴타입    매개변수(인수)
        public static int sum(int a, int b){
                매서드명
            return a;
        }
        매서드명은 간례적으로 소문자로 작성하고 소괄호 안에는 입력 매개변수로
        매서드를 호출할때 전달되는 값의 자료형과 값을 저장할 지역 변수명을 정의한다.

        입력되는 값으로 int형 2개를 입력받아 처리하는 sum이라는 이름의 매서드이고
        출력되는 결과 즉 리턴 값의 자료형을 int이고 접근은 public으로 선언되어있다.

        매서드 호출
        매서드도 클래스의 맴버이므로 객체안에 존재한다
         클래스 외부에서 매서드를 사용하려면 객체를 먼저 생성해야 한다.
        클래스 내부에 있는 매서드끼리는 객체를 생성하지 않고 서로를 호출할수 있다.

        매서드 오버로딩

        매개변수의 갯수와 자료형에 따라서 각기 다른 매서드가 실행되는 것을 의미한다.
        print();
        print(3);
        print(5.89);
        print(2,4);
        4의 print()매서드가 오버로딩, 각각은 다른 매개변수의 개수 또는 타입에 따라 다른 각각의 매서드가 실행된다.
        

        */
    }
}

class B{
    //1.인풋 아웃푸 다 존재
    
    //2.인풋 아웃풋 다 없는 케이스
    void noinnoput(){
        System.out.println("호출이 되었습니다.");
    }
    //3.인풋만 있는 케이스

    //4. 아웃풋만 있는 케이스
}