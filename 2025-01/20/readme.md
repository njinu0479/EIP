## 시작점 찾기 (main 함수)
- main에서 calc("5")를 호출했다. 
- 인자가 문자열("5")이므로 자바는 static int calc(String str) 메소드를 선택한다.
1. str은 "5"이고, Integer.valueOf(str)에 의해 value는 정수 5가 된다.
2. value <= 1이 아니므로 다음 줄을 실행한다.
    - return calc(5 - 1) + calc(5 - 3); -> calc(4) + calc(2)를 호출한다.


## 메소드 변경
- 여기서부터는 calc(String)이 아니라 static int calc(int value) 메소드가 호출된다.


## calc(int) 재귀 트리 그리기
- 피보나치 수열과 유사한 calc(int)의 재귀를 풀면 된다.
- 공식은 calc(n) = calc(n-1) + calc(n-2)이다.
- calc(0) = 0
- calc(1) = 1
- calc(2) = calc(1) + calc(0) = 1 + 0 = 1
- calc(3) = calc(2) + calc(1) = 1 + 1 = 2
- calc(4) = calc(3) + calc(2) = 2 + 1 = 3


## 최종 합산
- 다시 처음 calc("5")로 돌아간다.
- calc(4) + calc(2)를 구해야 한다는 것을 알아냈으므로 calc(4)의 결과값 = 3, calc(2)의 결과값 = 1
- 따라서 최종 출력값은 3 + 1 = 4가 된다.

---
⁕ 메소드 이름이 같아도 매개변수의 타입에 따라 호출되는 몸체가 달라진다.
⁕ calc(String)은 n-1, n-3을 호출했고, calc(int)는 n-1, n-2를 호출했다.