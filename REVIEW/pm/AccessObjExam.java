package pm;

public class AccessObjExam {
    public static void main(String[] args) {
        AccessObj obj = new AccessObj();

        System.out.println(obj.p);
        System.out.println(obj.p2);
        // System.out.println(obj.i);//자기 자신 클래스 내에서만 사용 가능한거라 불러오기 불가능.
        System.out.println(obj.k);
    }
}
