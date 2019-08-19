package a_variable;

import sun.applet.Main;

public class VariableType {
	public static void main(String[] args){
		/*
		 변수의 타입
		 
		 1. 기본형 (primitive type) - 하나의 값을 저장한다. 
		 	- boolean, char, byte, short, int, long, float, double
		 	
		 2. 참조형 (reference type)
		 	- 8개의 기본형을 제외한 나머지 타입
		 	- 객체의 주소를 저장한다.
		 	
		 3. 종류
		 	- 논리형 : true, false 중 하나의 값을 가지며, 조건식과 논리적 계산에 사용된다. 
		 			ex) boolean
		 	- 문자형 : 문자 하나를 저장하는데 사용된다. 
		 			ex) char(''를 꼭 사용해야한다.)
		 	- 정수형 : 정수값을 저장하는데 사용합니다.
		 			ex) byte, short, int, long
		 	- 실수형 : 실수형값을 저장하는데 사용된다.
		 			ex) float, double
		 			
		 4. 기본형 변수의 크기(1byte = 8bit)
		 - 1byte : boolean, byte
		 - 2byte : char, short
		 - 4byte : int, float
		 - 8byte : long, double
		 
		 5. 논리형 =boolean (기본값 false)
		   - boolean형 변수에는 true, false를 저장할 수 있다.
		   - boolean형 변수는 대답(yes,no), 스위치(on, off)
		   - 데이터를 저장하는 최소단위가 1byte임으로 1byte의 크기를 가진다.
		 
		 6.문자형 -char
		 - 문자하나를 저장하기 위해 사용한다.(스페이스도가능) 'A'
		 - 값을 정수형으로도 표현이 가능하다.
		 - java는 Unocode문자체계를 이용한다.   (16진수)
		 
		 7. 정수형 - byte, short, int, long
		   - 대표 자료형은 int이다.
		   - byte나 short의 경우 크기가 작아서 범위를 넘어서 잘못된 결과를
		      얻기 쉽다.   ==> int형을 사용하는 것이 좋다.
		   - JVM의 피연산자 스택이 피연자를 4byte단위로 저장하기 때문에 4byte형보다
		      작은 녀석들의 연산시에 4byte형태로 변환하여 연산한다.
		   
		 8.실수형 - float, double
		  - 대표 자료형은 double 
		  - 실수형 값을 저장하는데 사용한다.
		  - float : 1+8+23
		    double: 1+11+52
		  - 실수형은 자료형을 선택할때 값의 범위뿐만 아니라 정밀도 또한 중요한 요소가 된다.
		  
		 9. 형변환(casting)
		  - 기본형 변수간에는 형변환이 가능하다.
		  
		   byte -> short -> int -> long -> float -> double
		                     ^
		                     ㅣ  char
		  
		
		 
	
		      
		   
		 
		 
		 	
		
		
			
		 	
		 	*/
		
			// 변수 ab를 true의 값으로 초기화해주세요
		 	 			 			 
		 boolean ab = true;
			// 변수 ac를 'p'의 값으로 초기화해주세요
		 char ac = 'p';
		 	// byte형 변수 ad에 5000의 값을 저장해주세요
		 short ad = 5000;
		 
//		 변수 power에 false의 값으로 초기화해주세요
		 
		 boolean power = false;
		 
		 // power의 값을 true로 변경해주세요
		 
		 power = true;
		 
		 char aa = 'A';
		 char ba = 65;
		 char ca ='\u0041';
		 		 		 
		 System.out.println(ca);
		 
//		String 역슬러시 n은 뉴라인, t는 tap
		 String str = "=======\t-------";
		 
		 System.out.println(str);
		 
		 
		 //1. byte형 변수에 51을 저장해주세요.
		 
		 byte cc = 51;
		 System.out.println(cc);
		 		 
		 //2. short형 변수에 500000을 저장해주세요.
		 short oo = 5000;
		 
		 //3. int형 변수에 20억을 저장해주세요.
		 int ww = 2000000000;
		 System.out.println(ww);
//		 long형 변수에 50억을 저장해주세요.
		 long qq = 5000000000L;
//		 4byte보다 큰 long은 끝자리에 L(가독성을 위해)을 넣어준다.
		 
//		 1. float타입의 변수에 3.1415925414을 저장해주세요.
//		 double이 기본형이기 때문에 값의 뒤쪽에 f를 넣어준다.
		 float tt = 3.1415925414F;
		 System.out.println(tt);
//		 2. double타입의 변수에 3.1415925414을 저장해주세요.
		 
		 double yy= 3.1415925414;
		 
		 System.out.println(yy);
		 
		 byte b2 = 126;
		 System.out.println(b2);
		 b2++;
		 System.out.println(b2);
		 b2++;
		 System.out.println(b2);
 //		 - overflow - b2의 최대값이 127이기 떄문에 최대값을 넘어가면 가장 작은값으로 돌아간다
		 
		 
		 short ss = 200;
		 
		 byte b3 = (byte)ss;
		 System.out.println(b3);
//		 short===>byte로 넘어가면서 생긴 오류?
		 
		 
		 
		 
//		1. short타입의 변수에 600의 값을 저장해주세요.
		short a2 = 600;
				 
//		2. int 타입의 변수에 50000을 저장해주세요.
		int ss2 = 50000; 
		 
//		3. char타입의 변수에 'T'를 저장해주세요.
		 
		char xx = 'T';
		
//		4. a2의 값을 byte 타입의 변수에 저장해주세요
		byte b4 = (byte)a2;
		
//		5. ss2의 값을 char 타입에 저장해주세요
		char b5 =(char)ss2;
		
//		6. xx의 값을 int 타입에 저장해주세요.
		int x1 = (int)xx;
		
		System.out.println(x1);
	
		float ff2 = 3.14f;
		double dd2 = 3.14;
		
		int rr = (int)ff2;
		
		System.out.println(rr);
		
		System.out.println(3/2);
		
		
//		casting은
//		type이 큰쪽을 따라서 이동한다.
//		tpye이 같은것 끼리 연산하면 같은 타입의 결과값이 나온다.
//		byte+byte가 4byte보다 작을경우 JVM이 int+int로 변환하여서 연산한다.
		
		
		byte kk = 50;
		byte kk2 = 60;
		char zz = 'A';
		char zz2 = 'C';
		
		int kk3 = kk + kk2; //byte + byte ==> int + int
		
		int kk4 = kk+zz; //byte + char ==> int + int
		
		System.out.println(kk4);
		
		int zz3 = zz+zz2; //char + char ==> int + int
		
		System.out.println(zz3);
		
		
		int aaaa = 3; 
		int bbbb = 2;
		
		
		System.out.println(aaaa/(float)bbbb);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
		
		
		 
		 
		 
		 
	}
	
}
	
	

