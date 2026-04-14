## 객체 생성 시작: new Child();
- 자식 객체를 생성할 때는 가장 먼저 부모 생성자(Parent())가 호출된다.


## 부모 생성자(Parent()) 실행 구간
- total += (++v);
    - 여기서 v는 Parent 클래스에 선언된 v(1)를 가리킨다.
    - ++v에 의해 Parent.v는 2가 되고, total은 0 + 2 = 2가 된다.
- show(); 호출
    - 자바는 생성자 안에서 메서드를 호출할 때도 실제 생성 중인 객체의 오버라이딩된 메서드를 먼저 찾는다.
    - 따라서 Parent의 show()가 아닌, Child의 show()가 호출된다.
- Child.show() 실행
    - total += total * 2; $\rightarrow$ total = 2 + (2 * 2) = 6이 된다.


## 자식 생성자(Child()) 실행 구간
- 부모 생성자가 끝났으므로 이제 자식 생성자가 이어받는다.
    - v += 2;
        - 여기서 v는 Child 클래스에 선언된 v(10)를 가리킨다.
        - Child.v는 10 + 2 = 12가 된다.
    - total += v++;
        - total에 현재의 Child.v(12)를 더한다. -> total = 6 + 12 = 18이 된다.
        - 그 후 v++에 의해 Child.v는 13이 된다.
    - show(); 호출
        - 다시 Child.show()가 실행된다.
    - Child.show() 실행
        - total += total * 2; $\rightarrow$ total = 18 + (18 * 2) = 54가 된다.


## 요약
| 단계 | 실행 지점 | 주요 연산 | total 값 변화 |
| :---: | :---: | :---: | :---: |
| 1 | 부모 생성자 | total += (++Parent.v) | 0 → 2 |
| 2 | 부모 생성자 내 show() | Child.show() 호출 (2×3) | 2 → 6 |
| 3 | 자식 생성자 | total += Child.v (12) | 6 → 18 |
| 4 | 자식 생성자 내 show() | Child.show() 호출 (18×3) | 18 → 54 |
        

⁕ 부모 생성자 안에서 show()를 불렀을 때, 이미 자식 클래스에서 재정의(Override)했다면 무조건 자식의 것을 호출한다.<br/>
⁕ Parent의 v와 Child의 v는 이름만 같을 뿐 메모리 공간이 완전히 다르다. 메서드는 오버라이딩되지만, 변수는 오버라이딩되지 않는다.