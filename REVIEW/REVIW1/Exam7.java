package REVIW1;

public class Exam7 {
    public static void main(String[] args) {
        //배열은 동일한 자료형을 묶어 저장하는 자료형이다.
        //배열은 생성할 때 지정된 크기를 수정할 수 없다.

        int[] arr1 = new int[3];
        int[] arr2;
        arr2 = new int[3];


        //배열값 넣기
        arr1[0] = 1;
        arr1[1] = 2;

        String[] str2 = {"hi","hello"};

        for (String each:str2){
            System.out.println(each);
        }
        System.out.println(str2.length);

    }
}
