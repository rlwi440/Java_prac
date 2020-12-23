package prac04;

public class Arrayprac {
	public static void main(String[] args) {
        /**
         * 혼자풀어보는  실기 테스트 문제들 연습구간
         * @autor 깔끔한청년
         * @Date 2020.12.23
         */
		Arrayprac ki =new Arrayprac();
		ki.test();
		ki.test2();
		ki.test3();
		ki.test4();
	}

		public void test() {
			/**
			 * 배열에 들어있는 데이터 중 홀수의 값을출력하고 합을 구한다. 
			 * 단 ,continue 를 이용하여 작성한다.
			 * int [] num = {1,2,3,4,5,6,7,8,9,10};
			 */
		 int [] array = {1,2,3,4,5,6,7,8,9,10};		//input 과 output 개념익히기
		 double sum =0; 
		for(int i=0; i<array.length ; i++) {
			/**
			 * continue 반복을 건너 뛴다.   
			 * break 반복을 그만한다 .
			 * 문제 7번 문제 continue와 break 
			 */
			if(array[i]%2==1) {		//배열 [i],괄호  
			continue; 
		}
			sum+=array[i];
	}
		System.out.println("합계 : " +sum);
		}
		public void test2() {
			/**
			 *다차원의 배열 합계 평균구하기 
			 *int sum =0; double avg =0; int count =0 ; 
			 *체크 해야 할것들 다차원의 쓰는이해와 input 과 output차이  	
			 */
			int sum =0; double avg =0 ; int count =0;  // 초기값 연습 
			int [][] array= {{12,41,36,56},{12,41,36,56},{12,41,36,56},{12,41,36,56}};
			for(int i=0; i<array.length; i++) {		//다차원 배열 .. 생각하자 기원아 
				for(int k=0; k<array[i].length ; k++) {
					sum+=array[i][k];
					count++;
				}
			}
				System.out.println("다차원 배열의 합계 :" +sum);
				avg=(double)sum/count;
				System.out.println("다차원의 평균값 :" +avg );
			}
		public void test3() {
			/**
			 * 
			 * 9번 문제 
			 * -2차원 배열에 들어있는 데이터중 가장 큰값과 작은값을 구한다.
			 * 1. 사용데이터 
			 * 	int [][] array= {{12,41,36,56},{82,11,12,56},{12,41,46,56},{12,41,73,56}};
			 *  
			 * 
			 */
			int max =0; int min=0;
			int [][] array= {{12,41,36,56},{82,11,12,56},{12,41,46,56},{12,41,73,56}};
			for(int i=0; i<array.length; i++){
				for (int k=0; k<array[i].length; k++){
					if(array[i][k]>max) {
							max=array[i][k];
					}
					if(min>array[i][k]) {
						// min 
						min=array[i][k];
						}
					}
				System.out.println("가장큰값: " +max);
				break;	//break 문을 사용 가장 큰값 하나만 출력 가능 ..
				}
			System.out.println("가장작은값: "+min);
			}
	
		public void test4() {
			/**
			 * 문제 10)  2차원 배열에에 들어있는 데이터 들중의 3의배수만골라내서 새로운 1차원배열에 기록히고 출력한다.
			 * 단 중복값은 하나 만 기록하게된다.
			 * 
			 */
			   int [][] array={{12,41,36,56},{82,10,12,61},{14,16,18,78},{45,26,72,23}};
			      
			      int[] copyAr = new int[array.length * array[0].length];	//행 갯수와 열갯수 
			      
			      int tmp = 0;	//임시변수 
			      
			        for(int i =0 ; i<array.length; i++) {
			           
			           for(int k=0; k<array[i].length; k++) {
			              
			              tmp = array[i][k];
			              
			              if (array[i][k] % 3 == 0) {
			                 
			                 for(int j=0; j<array[i].length; j++) {
			   
			                       if(tmp == copyAr[j]) {
			                          break;
			                       }
			                       
			                       copyAr[( i * array[i].length ) + k] = tmp;
			                   }
			                 
			                 
			              }
			           }
			           
			        }
			        
			        String tmp2 = "";
			        
			        for(int j=0; j<copyAr.length; j++) {
			           
			           if(copyAr[j] == 0) {
			              continue;
			           }
			           
			           tmp2 += (tmp2 == "") ? copyAr[j] : "," + copyAr[j];
			        }
			        
			        System.out.print("copyAr : " + tmp2 + " ");
		}
	}
