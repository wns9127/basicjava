package c_sentence;

public class Sentence_01 {
	public static void main(String[] args) {
		/*
		
		1. 조건문 (If문, Switch문) : 조건식과 문장을 포함하는 블럭{}으로 구성되어 있다.
		 - 조건식의 연산결과에 따라서 프로그램의 실행흐름을 변경할 수 있다.
		 
		if
			-구조 
				1) 기본
					if(조건식){ 조건식이 true일떄 수행될 문장
		     	
		     		}
				2) 1단 변형
			 		if(조건식){ 조건식이 true일떄 수행될 문장
		     		} else { 조건식이 false일떄 수행될 문장
			 		}
			 	3) 2단 변형
			 		if(조건식1){
			 			조건식이 true일떄 수행될 문장
		     		} else if(조건식2){
		     		 	조건식1이 false이고 조건식2가 true일떄 수행될 조건식
			 		} else {
			 			조건식1 과 조건식2가 모두 false일떄 수행될 조건식
			 		}
			 		
			 		
		 */
//		1. 변수 a에 20의 값을 저장해주세요
		int a = -20;	
		
//		2. a의 값이 0보다 크면 "양수"를 출력해 주세요
		if(a>0){
			System.out.println("양수");
		} else {
			System.out.println("양수아님");		
		}
//		3. a의 값이 0보다 크면 "양수"를 ,0보다 작으면"음수"를, 둘다 아니면 "0"을 출력해 주세요
		if(a>0){
			System.out.println("양수");
		} else if(a<0){
			System.out.println("음수");
		} else {
			System.out.println("0");
		}
		
//		4. 0~100 사이의 램덤한 정수를 변수 score에 저장해주세요
		
//		5. score의 점수가 90점 이상이면 "A"를 출력해주세요
//		   score의 점수가 80점 이상이면 "B"를 출력해주세요
//		   score의 점수가 70점 이상이면 "C"를 출력해주세요
//		   score의 점수가 60점 이상이면 "D"를 출력해주세요
//		   score의 점수가 60점 미만이면 "나가"를 출력해주세요
		
//		Math = 0<=m<1
		
		int score = (int)(Math.random()*101);
		System.out.println(score);
		if(score>=90){
			System.out.print("A");
//			95점 이상이면 + 95미만이면 -
			if(score>=95){
				System.out.println("+");
			} else {
				System.out.println("-");
			}
//			%%%%% "+", "-" 가 같은 라인에 나오기 위해 ln을 버린다%%%%%%%%%
		} else if(score>=80) {
			System.out.print("B");
			if(score>=85){
				System.out.println("+");
			} else {
				System.out.println("-");
			}
			
		} else if(score>=70) {
			System.out.print("C");
			if(score>=75){
				System.out.println("+");
			} else {
				System.out.println("-");
			}
			
		} else if (score>=60) {
			System.out.print("D");
			if(score>=65){
				System.out.println("+");
			} else {
				System.out.println("-");
			}
			
		} else {
			System.out.println("나가");
			
		}
		
		/*
		2. switch문
		 - 조건의 경우의 수가 많을때는 if문 보다 switch문을 사용하는 것이 더 간결하다. (다만 범위를 정할 수 없다.) 
		 - 조건의 결과값으로 int 형 범위의 정수값을 허용한다.
		 - 구조
		 	switch(조건식=결과값){
		 		case 값1 :
		 		  조건식 == 값1일대 수행될 문장
		 		  break; <----수행을 끊어버려야 하기 때문에 
		 		case 값2 :
		 		  조건식 == 값2일대 수행될 문장
		 		  break;
		 		case 값3 :
		 		  조건식 == 값3일대 수행될 문장
		 		  break;
		 		default :
		 		 - 조건식의 값과 일치하는 case가 없을떄 수행될 문장.
		 	}
		 
		 */
		
//		1. 1~5 사이의 랜덤한 정수값을 변수 aa에 저장해주세요
		int aa = (int)(Math.random()*5+1);
		System.out.println(aa);
//		2. aa값이 1이면 "강남의 32평 아파트 당첨"
//		3. aa값이 2이면 "람보르기니"
//		2. aa값이 3이면 "LG 시그니쳐 셋트"
//		2. aa값이 4이면 "자전거"
//		2. aa값이 5이면 "영만빌딩내놔"
		
		switch(aa){
		case 1 : System.out.println("강남의 32평 아파트 당첨");
			break;
		case 2 : System.out.println("람보르기니 당첨");
			break;
		case 3 : System.out.println("LG시그니쳐 세트 당첨");
			break;
		case 4 : System.out.println("자건거 당첨"); 
			break;
		default : System.out.println("영민빌딩내놔");
			
		
				
		}
		
//		3. score의 점수가 90점 이상이면 "A"를 출력해주세요
//		   score의 점수가 80점 이상이면 "B"를 출력해주세요
//		   score의 점수가 70점 이상이면 "C"를 출력해주세요
//		   score의 점수가 60점 이상이면 "D"를 출력해주세요
//		   score의 점수가 60점 미만이면 "나가"를 출력해주세요
//		 를 switch 문으로 만드세요.
		
		
		int point = (int)(Math.random()*101);
//		int point = 100;
		System.out.println(point);
		switch(point/10){
		case 10 : case 9 : 
			System.out.println("A");
			break;			
		case 8 : 
			System.out.println("B");
			break;
		case 7 : 
			System.out.println("C");
			break;
		case 6 : 
			System.out.println("D");
			break;
		default : 
			System.out.println("나가");
		}
		
		
		
		
		
		
		
		
		
	}
		
}
