혼자공부하는공간입니다.(2020.12.07 Update )
============================

Java Doc 
----------------
```
1.method 상단에/**../주석을 추가하면,Javadoc 의 대상이된다.

2.comment 는 반드시 /** 시작으로 해야한다./*은Javadoc의 대상이 아니다.

3.method 설명은 html 형식으로 출력된다. 즉, 줄 바꿈을 하려면 <br/> 태그를 사용해야 한다.  

4.@param,@return,@throws는 method에서 필수속성이다.

5.@throws는 사용자가 처리 해야할 예외이다. 따라서 이 예외가 언제 발생하는지에 대해 반드시 설명이 필요하다.

6.@return 에서 반환타입에 대해서 기술할 필요가 없다.

7. interface가 존재한다면, 구현체에서는 주석을 생성할 필요가 없다.

 interface에서 정의된 method의 의도대로 구현을 한 것이므로, interface에서의 주석만으로 충분하다.
 
 ```

#Alone_Java
-------------------
개인적으로 공부하는연습공간입니다 (수정중)
```
String format 문법형식 예)
1) 필수값: %와 conversion 으로 무조건 있어야합니다.
"conversion": 표현 할 데이터의 타입으로, s(문자열), d(정수), x(16진수), o(8진수), f(실수) ex) %s, %d, %x, %o, %f
ex) System.out.println(String.format("%s, %s", "KOREA", "JAPAN"));
2) 옵션값: [argument_index$][flags][width] 는 생략 가능합니다.
````