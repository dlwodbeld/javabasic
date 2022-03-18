package REVIW1;

public class Exam6 {
    public static void main(String[] args) {
        // for(int i = 0; i <= 10; i ++){
        //     if(i % 2 == 0)
        //     continue;
        //     System.out.println(i);
        // }
        // for(;;){
        //     System.out.println("Hello world");
        // }
        // while(true){
        //     System.out.println("Hello world");
        //     break;

        // }
        // int i = 0;
        // do{

        //     System.out.println("helloworld    " + i);
        //     i++;
        // }while(i<10);
        int i = 1;
        do{
            if(i%10==3|i%10==6|i%10==9){//1의 자리수가 3,6,9일때
                System.out.print("짝\t");
            }else if(((i/10)*10)==30|((i/10)*10)==60|((i/10)*10)==90)   //10의 자리수가 3,6,9일때
            System.out.print("짝\t");
            else    //1,10의자리수중 3,6,9가 없는나머지
            System.out.print(i + "\t");
            if(i%10 == 0){ //10번때가 출력됬을 때
                System.out.println();
            }
            
            i++;

        }while(i<=100);//100번까지 출력
    }
}
