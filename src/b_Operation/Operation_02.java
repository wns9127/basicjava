package b_Operation;

public class Operation_02 {
		public static void main(String[] args) {
		
			
			
			/*
			 1. 증강연산자( ++, --)
			  - 증가연산자(++) : 피연산자의 값을 1증가 시킨다.
			  - 감소연산자(--) : 피연산자의 값을 1감소 시킨다.
					 
			 
			 */
			//int 형 변수 i의 3의 값을 저장해주세요.
			
			int i = 3;
			i++;
			System.out.println(i);
			++i;
			System.out.println(i);
			
			int j = ++i +3;// i=6 , j=8 (++앞은 9, ++뒤는 8 / 단항연산 앞에 증강연산이 있을경우 먼저해준다.)
						
			System.out.println(j);
			
			int k = 50;
			int t = 20;
			
			int result = k++ + ++t + 10 + ++k;
			// 50 + 21 +10 +52 k=52, t=21
			char c3 = 'A';
			c3++;
			
			System.out.println(result);
			
			/*
			 2. 부호연산자 (+,-양수 음수)
			  - 부호연산자는 피연산자의 부호를 변경하는데 사용된다.
			  - char, boolean 사용할 수 없다.
			  
			  
			 */
			int i2 = -10;
			i2 = -i2;
			/*
			3. 비트전환 연산자(~) (컴퓨터는 2진수 0,1이 뭐가 양수인지 인지못함)
			 - 정수형과 char에만 사용가능하다.
			 - 1의 보수(-1).2의 보수(부호만 바뀜)
			    10 : 00001010 => 10
			   ~10 : 11110101 => -11 (1의보수)
			 ~10+1 : 11110110 => -10 (2의보수)
			  
			 */
			
			// ~ 연산의 경우  byte, short, char의 경우 4byte 형으로 int형을 변환후 연산한다.
			byte b3 = 10;
			int b4 = ~b3;//1의보수 -11
			System.out.println(b4);
			/*
			4. 논리부정연산자(!)
			 - boolean 형에만 사용한다.
			 - true=> false,   false => true
			 
			
			
			*/
			
			
			boolean power = false;
			// power의 값을 부정하여 power 변수에 저장해주세요.
			
			power = !power;
			
			System.out.println(power);
					
			/*
			5.  산술연산자
			 - 사칙연산자(+,-,*,/), 나머지 연산자(%), 쉬프트연산자(<<,>>,>>>)
			  두개의 피연산자를 취하는 이항 연산자 이다.
			   
			6. 사칙연산자(+,-,*,/)
			 - int형 보다 작은 자료형간의 연산은 int 형으로 형변환후 연산을 수행한다.
			  : byte + short => int +int => int
			 - 두개의 피연산자중 하나 이상 4byte형보다 큰 경우에는 큰쪽의 자료형에
			    맞춰서 형변환 후 연산을 수행한다.
			    
			  : char + float => float + float => float
			 - 정수형 간의 나눗셈에서 0으로 나누는 것은 금지되어 있다.
			  
			 */
			byte aa = 1;
			short bb = 129;
			
			//aa와 bb의 합을 변수 cc에 저장해주세요.
			
			int cc = aa + bb;
			System.out.println(cc);
			
			
			//aa와 bb의 합을 byte 형 변수 dd에 저장해주세요.
			// 연산 순서를 생각한다.
			
			byte dd = (byte)(aa + bb);
			
			System.out.println(dd);
			
			/*
			7. 나머지연산자
			 - 왼쪽의 피연산자를 오른쪽의 피연산자를 나누고 난 나머지 값을 돌려주는 연산자
			 - boolean 형을 제외한 모든 기본자료형에 사용가능하다.
			*/
			
			int firstNum = 1532;
			int secondNum = 7;
			
			// firstNum을 secondNum으로 나눈 결과를 share라는 변수에 저장해주세요.
			
			int share = firstNum/secondNum;//몫
			System.out.println(share);
			
			//firstNum을 secondNum으로 나눈 나머지를 remain라는 변수에 저장해주세요.
			int remain = firstNum%secondNum;
			System.out.println(remain);
			
			//10을 3으로 나눈 몫은 3이고 나머지는 1이다.
			
			System.out.println(firstNum + "을 " + secondNum + "으로 " +"나눈 " + "몫은 " + share + "이고 " + "나머지는 " + remain + "이다.");
			
			/*
			8. 쉬프트연산자(<<[2*2^X]>>[2/2^X],>>>[색상을관리])
			 - 정수형에만 사용 가능하다.
			 - byte형에 따른 바퀴수 계산.
			 - 피연산자의 각자리(2진수)를 오른쪽 또는 왼쪽으로 이동한다.
			 - 연산속도가 매우 뛰어남으로 사용한다.
			 - << : x<<n x*2^n의 결과와 같다.
			 - >> : x>>n x/2^n의 결과를 가진다.
			 
			 */
			byte bbb = 10;
			int result2 = bbb << 32;
			System.out.println(result2);
			
			
			/*
			 9. 비교연산자
			  - 두 개의 변수 또는 리터럴을 비교하는데 사용된다.
			  - 주로 조건문과 반복문의 조건식에 사용되며, 연산결과는 true, false 이다.
			  - 이항연산이기 때문에 변수타입을 맞춰준다.
			  
			 10. 대소비교연산자(<, >, <=, >=)
			  - boolean형을 제외한 기본형변수에 사용가능하다.
			  - 
			  
			 11. 등가비교연산자(==, !=)
			  - 모든자료형에 사용가능하다.
			   
			 수식          l               연산결과
			 x>y        l        x가y보다 클떄만 true, 그외에는 false
			 x<y        l        x가y보다 작을떄 true, 그외에는 false
			 x>=y       l        x가y보다 크거나 같을떄 true 그외에는 false
			 x>=y       l        x가y보다 작거나 같을떄 true 그외에는 false         
			 */
			
			
//			12. 비트연산자
//			 - 이진비트연산을 수행한다.
//			 - 실수형인 float과 double을 제외한 모든 기본형에 사용 가능하다.
			
//			&(and연산) : 피연산자를 양쪽의 값이 1이면 1의 결과를 얻는다.
//			l(연산) : 피연산자를 한쪾의 값이 1이면 1의 결과를 얻는다.
//			^(XOR) : 피연산자의 값이 서로 다르면 1의 결과를 얻는다.

			
//			3 -> 00000011
//			7 -> 00000111
//			3^7 ->00000100   => 4
//			3|7 -> 00000111 =>7
//			3&7 -> 00000011 =>3
			
		System.out.println(3&7);
		System.out.println(3|7);
		System.out.println(3^7);
		
		/*
		  논리연산자(&&,||)
		   - 피연산자로 boolean형 값또는 boolean형에 결과를 하는 조건식만 허용
		   - 조건식과 반복문에 조건식 값의 결합에 활용된다.
		   - && 연산자가 ||보다 우선순위가 높다.
		   ||(OR결합) : 피연산자중 어느 한쪽만 true이면 true의 결과를 얻는다.
		   &&(AND결합) : 피연산자중 양쪽모두 true일떄 true의 결과를 얻는다.
		   
		   
		 10<=x<=20
		 x=17
		 10<=x&&<=20
		 */
		
//		1. 변수 x에1 'J'의 값을 저장해주세요
		char x ='J';
		
//		2. x의 값이 영어 대문자 이면 true의 결과를 출력하면 조건식을 만들어주세요.
//		'A'<=x<='Z'
		System.out.println('A'<=x && x<='Z'); 
		
//		3. x의 값이 영어 소문자 이면 true의 결과를 출력하면 조건식을 만들어주세요.
		
		System.out.println('a'<=x && x<='z'); 
		
//		4. x의 값이 영문자 이면 true의 결과를 출력하면 조건식을 만들어주세요.
//		A~z까지하면 특문5개가 포함되어 있다.			
//		영문자=대문자or소문자
//		System.out.println('A'<=x && x<='Z' || 'a'<=x&&x<='z');
		
//		5. x의 값이 숫자형 이면 true의 결과를 출력하면 조건식을 만들어주세요.
		
		System.out.println('0' <=x && x<='9');
		
//		6.영문자or숫자형 true의 결과를 출력하면 조건식을 만들어주세요.
		
		System.out.println('A'<=x && x<='Z' || 'a'<=x&&x<='z' && '0' <-x && x<='9');
		
		
		/*
		14. 삼항연산자
		  - 세 개의 피연산자를 필요로 하기 때문에 삼항연산자로 이름지어 졌다.
		  - 삼항연산자의 조건식의 결과에 따라 true또는 false 인 식이 사용된다.
		  - 기본구조
		  		(조건식) ? true 식1
		  				? false 식2
		  				
		 */
		
		int x2 = -10;
//		%%%%%%절대값구하는 방법%%%%%
		int result3 = x2 > 0 ? x2 : -x2;
		System.out.println(result3);
		
		
//	 	1. x3의 100의 값을 저장해주세요.
		
//		2. x3의 값이 양수이면 "양수", 음수이면 "음수", 0이면 "0"의 결과값을
//		result4에 저장해주세요.
		
//		result4의 값을 출력해주세요.
		
		
		int x3 = 100;
		String result4 = x3 > 0 ? "양수" : x==0 ? "0" : "음수";
		System.out.println(result4);
//		결과 type은 같아야 출력된다.
		
//		15. 대입연산자(=,op=)
//		 - 변수에 값 또는 수식의 연산결과를 저장하는데 사용된다.
//		 - 연산 우선순위가 가장 낮다.(값을 저장하는것이기 때문에 순위가 낮다.)
//		1. int형 변수 i5에 5의 값을 저장해주세요.
		int i5 =5;
//		i5에 10을 더하여 i5에 저장해주세요.
		
//		i5 = i5 + 10;
		i5 <<= 10; //i5 = i5 <<10;
//		(원래 type을 유지한다.)
		
		//%%%%%%%%random%%%%%%
//		Math =  0<=m<1
//		m*6+1 소수점있으니 정수로 캐스팅
		int random1 = (int)(Math.random()*6+1);
//		1~45
		
		int random2 = (int)(Math.random()*45+1);
		
//		47(미포함)~537(포함)
//		48~537			48<=    <538
		int random3 = (int)(Math.random()*490+48);
		System.out.println(random3);
						
		//%%%%%%%%%%반올림%%%%%%%%%%%%
//		1. float타입의 변수 f4에 3.141592를 저장해주세요.
		
		float f4 = 3.141592f;
		int result7 = (int)(f4+0.5);
		System.out.println(result7);
//		보고싶은 자리까지 곱하여서 인트형으로 뒷자리를 지워버린다.
		float result8 = (int)(f4*1000+0.5)/1000f;
		System.out.println(result8);
		
//		2. 158.5987
		float ex = 158.5987f;
		float result10 =(int)(ex*100+0.5)/100f;
		System.out.println(result10);
		
		
		
		
		
		
		
		
		

		
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
			
			
			
			
			
			
		}

}
