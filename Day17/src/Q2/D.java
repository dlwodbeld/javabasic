package Q2;

import Q1.A;

public class D extends A{
	void def() {
		System.out.println(this.a);
		System.out.println(this.b);
//		System.out.println(this.c,d); 오류
	}

}

/*
페키지 Q1에는 a,b 클래스 Q2에는 c,d 클래스가 있다.
이들 4개의 소스파일에서 클래스A에 포함된 4개의 필드를 사용하려고한다.
이떄 각 클래스의 위치에서 사용할수 있는 모든 필드를 쓰시오.

*/