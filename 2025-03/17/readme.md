## Enum(열거형) 구조 파악
Tri라는 이름의 열거형에 3개의 상수가 정의됨.<br/>
A / index = 0 / code = "A"
B / index = 1 / code = "AB"
C / index = 2 / code = "ABC"


## 핵심 실행 코드 분석
```java
Tri t = Tri.values()[Tri.A.name().length()];
```
1. Tri.A.name()
* Enum 상수의 이름 자체를 문자열로 가져온다.
* 결과는 "A"이다.

2. "A".length()
* 문자열 "A"의 길이를 구한다.
* 결과는 1이다.

3. Tri.values()
* Enum의 모든 상수를 선언된 순서대로 배열에 담아 리턴한다.
* 결과는 [Tri.A, Tri.B, Tri.C] 형태의 배열이다.

4. Tri.values()[1]
* 배열의 1번 인덱스 요소를 꺼낸다(0번부터 시작하므로 두 번째 요소).
* 따라서 t는 Tri.B가 된다.

## 최종출력
```java
System.out.print(t.code());
```
* 현재 t는 Tri.B이다.
* Tri.B의 code() 메서드를 호출하면 생성 시 저장했던 필드값인 AB를 리턴한다.

## 최종출력결과
AB
<br/>
<br/>⁕ name() vs toString(): 보통은 같지만, name()은 선언된 이름 그대로를 반환한다.
<br/>⁕ 이 문제에서는 사용되지 않았지만, Tri.A.ordinal()은 0, Tri.B.ordinal()은 1을 반환한다. 이 인덱스 개념이 values() 배열 순서와 일치한다.
<br/>* 배열은 0번부터: 만약 Tri.A.name().length()가 0이었다면 A가 출력되었겠지만, 길이는 1이므로 두 번째 값인 AB가 출력된 것이다.