package pm;

public class AccessObj {
    public int p = 3;//다 접근가능
    protected int p2 = 4;//같은 페키지인 경우만 접근허용
    int k = 2;  //default, 같은 페키지에서만 접근 허용
    private int i = 1;  //자기 자신 클래스에서만 접근 허용
    


}
