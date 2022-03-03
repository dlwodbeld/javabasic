package pm;

public class Exam7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int i = 0;
//		for (int j = 0;j <= 1000;j++) {
//			if (j % 3 == 0){
//				i += j;
//			}
//		}
//		System.out.println(i);
//		
//		
		
//		for(int i = 0; i <5 ; i++) {
//			for(int j = 0; j < 5 ;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for(int i = 6; i >1 ; i--) {
//			for(int j = 6; j > i ;j--) {
//
//				System.out.print("*");
//			}
//			System.out.println();
//			if (i== 0) {
//				break;
//			}
//		}
		
		int scores[] = {70,60,55,75,95,90,80,80,85,100};
		int sum = 0;
		int max = 0;
		int min = scores[0];
		int avg = 0;
		
		for (int score:scores) {
			sum += score;
			avg = sum / scores.length;
			if(score > max) {
				max = score;
			}
			else if(score < min) {
				min = score;
			}

		}
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+avg);
		System.out.println("최고점수 : "+max);
		System.out.println("최저점수 : "+min);
		
		
		
		

	}

}
