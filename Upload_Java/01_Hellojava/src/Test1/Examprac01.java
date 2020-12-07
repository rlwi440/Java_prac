package com.kt.test.Test1;

public void ExamPrac01(){
            /**
             * @author 깔끔한청년
             * @date 2020.12.07
             *
             */
			System.out.println("A = "+ ('A'+0));  //("65 = "+ ('65'+0));
			
			System.out.println("0 =" + ('0' + 0) ); //48
			System.out.println("(char)65 = " + (char)65);//A
			
			byte bt1 = 125;
			char ch1 = 'C';
			int it1 = bt1 - ch1;
            System.out.println("it1 = "+it1);   //58 125-67 =58
            
			
			
			boolean bool = false;
			
			bool = (2.0 == 5/2);
			System.out.println("bool = " + bool); //fales->true ->false
			
			bool = ('C' == 67);
			System.out.println("bool = " + bool); //false ->true
			
			bool = ('A' == 'B'-1);
			System.out.println("bool = " + bool);//fasle -> true
			git
			bool = ('a' != 97 );//부정연산자    // fales ->!true -> false
			System.out.println("bool = " + bool);
		}