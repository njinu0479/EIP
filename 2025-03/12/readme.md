## 정답은 super이다.
* Java에서 자식 클래스의 생성자는 부모 클래스의 생성자를 반드시 호출해야 한다. 
* 이때 사용하는 키워드가 바로 super다.
1. 부모 클래스의 생성자 호출: Rectangle 클래스는 int width, int height를 받는 생성자를 가지고 있다.
2. 자식 클래스의 책임: Square는 Rectangle을 상속받았으므로, 객체가 생성될 때 부모의 멤버 변수인 width와 height를 초기화해줘야 한다.
3. 호출 방식: super(a, a)를 호출함으로써 부모인 Rectangle(int width, int height) 생성자에게 값을 전달하여 초기화 작업을 위임하는 것이다.

</br></br>
⁕ this(): 현재 클래스의 다른 생성자를 호출할 때 사용
⁕ super(): 부모 클래스의 생성자를 호출할 때 사용