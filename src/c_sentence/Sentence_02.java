package c_sentence;

public class Sentence_02 {
	public static void main(String[] args) {
		/*
		1. 반복문 (for, while, do-while)
			- 어떤 작업을 반복적으로 수행하도록 할떄 사용된다.
			- 반복분은 주어진 조건을 만족하는 동안 주어진 문장을 반복적으로 수행한다.
			- for 문은 반복횟수를 알고 있을때 while 문은 주로 반복횟수를 모를떄 사용.
		
		2. for문
			- 기본구조
				for(초기화;조건식;증감식){
					수행될문장
				}
			 초기화 -> 조건식 -> 수행 -> 증감식
			 -> 조건식 -> 수행 -> 증감식 -> ...
			 	
			
		
		
		 */
//		System.out.println(0);
//		System.out.println(1);
//		System.out.println(2);
//		System.out.println(3);
//		System.out.println(4);
//		System.out.println(5);
//		System.out.println(6);
//		System.out.println(7);
//		System.out.println(8);
//		System.out.println(9);
				
		for(int i=0;i<10;i++){
			System.out.println(i);
		}
		int add = 0;
//		add += 1;
//		add += 2;
//		add += 3;
//		add += 4;
//		add += 5;
//		add += 6;
//		add += 7;
//		add += 8;
//		add += 9;
//		add += 10;
//		(for 문 안에서는 새로운 영역이라 여러변수 사용가능)
//		for(int i=1;i < 11;i++){
//			add += i;
//		}
		
		
//		1. 시작 1, 끝 10, 증가량 1(짝수일때)
		for(int i=1;i < 11;i++){
			if(i%2==0){
				add += i;
			}
		}
		System.out.println(add);
//		7~30까지의 곱을 구해주세요.
		long gob =1;
//		gob*7;
//		gob*8;
//		gob*9;
//		  .
//		  .
//		  .
//		gob*29;
//		gob*30;
//		시작 ,끝30,증가량1
		for(int i=7;i<31;i++){
			gob *= i;
		} 		
		System.out.println(gob);
//		2 * 1 = 2 출력
		
//		System.out.println(2+" * "+1+" = "+2*1);
//		System.out.println(2+" * "+2+" = "+2*2);
//		System.out.println(2+" * "+3+" = "+2*3);
//		System.out.println(2+" * "+4+" = "+2*4);
//		System.out.println(2+" * "+5+" = "+2*5);
//		System.out.println(2+" * "+6+" = "+2*6);
//		System.out.println(2+" * "+7+" = "+2*7);
//		System.out.println(2+" * "+8+" = "+2*8);
//		System.out.println(2+" * "+9+" = "+2*9);
//		시작1, 최대값9 증가량 1
//		for(int i=1;i<10;i++){
//			System.out.println(2+" * "+i+" = "+2*i);
//		}

//		for(int i=1;i<10;i++){
//			System.out.println(3+" * "+i+" = "+3*i);
//		}
//
//		for(int i=1;i<10;i++){
//			System.out.println(4+" * "+i+" = "+4*i);
//		}
//
//		for(int i=1;i<10;i++){
//			System.out.println(5+" * "+i+" = "+5*i);
//		}
//
//		for(int i=1;i<10;i++){
//			System.out.println(6+" * "+i+" = "+6*i);
//		}
//
//		for(int i=1;i<10;i++){
//			System.out.println(7+" * "+i+" = "+7*i);
//		}
//		
//		
//		for(int i=1;i<10;i++){
//			System.out.println(8+" * "+i+" = "+8*i);
//		}
//		
//		for(int i=1;i<10;i++){
//			System.out.println(9+" * "+i+" = "+9*i);
//		}
				
//		for(int a=2;a<10;a++){
//			for(int i=1;i<10;i++){
//				System.out.println(a+" * "+i+" = "+a*i);
//			}
//		}
		
//		짝수단만찍히게
		
		for(int a=2;a<10;a++){
			if(a%2==0){
				for(int i=1;i<10;i++){
					System.out.println(a+" * "+i+" = "+a*i);
				}
			}
		}
//		홀수 곱만 출력되도록
		for(int a=2;a<10;a++){
			for(int i=1;i<10;i++){
				if(i%2!=0){
					System.out.println(a+" * "+i+" = "+a*i);
				}
			}
		}
//		짝수단의 홀수곱만 출력
		for(int a=2;a<10;a++){
			if(a%2==0){
				for(int i=1;i<10;i++){
					if(i%3==0){
						System.out.println(a+" * "+i+" = "+a*i);
					}
				}
			}
		}
		
		/*
		3. while문
		  - 조건식과 수행해야될 블럭{}만으로 구성되어 있다.
		  - 기본구조
		  	while(조건식){
		  		조건식이 true일떄 수행될 문장
		  	}
		*/
		
//		for문
//		for(int i = 1; i < 10; i++){
//			System.out.println(i);
//		}
//		
//		while문
//		int num =1;
//		while(num<10){
//			System.out.println(num);
//			num++;
//		}
		
//		1. 1~10까지의 합을 구해주세요.
		int total = 0;
		int wh =1;
		while(wh < 11){
			total +=wh;
			wh++;
		}
		System.out.println(total);
		
//		2. 1~10까지의 홀수의 합을 구해주세요.
		int total2 = 0;
		int wh2= 1;
		while(wh2<11){
			if(wh2%2==1){
				total2 +=wh2;
			}
			wh2++;
		}
		System.out.println(total2);
//		3. 구구단을 while문을 이용해서 만들어주세요.
//		%%%%%%%숙제%%%%%%%%
//		5~? 까지 더하였을때 200 이 되는가?
		
		int sum =0;
		int adad =5;
		
		while(sum<200){
			if(sum<200){
				sum +=adad;
			}
			adad++;
		}
		System.out.println(adad);
		
//		String
		
		String str = "12345";
		char c= str.charAt(0);
		System.out.println(c);
		
		
		 
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

