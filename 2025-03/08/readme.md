## 정답은 implements이다.
* implements (구현): 부모가 인터페이스(interface) 일 때 사용한다. 
<br/>인터페이스는 껍데기(메서드 이름)만 제공하므로, 
<br/>자식 클래스에서 반드시 그 안의 내용을 직접 작성해서 완성(구현)해야 한다.
* extends (상속): 부모가 일반 클래스(class) 이거나 추상 클래스(abstract class)일 때 사용한다. 
<br/>부모의 이미 완성된 기능을 그대로 물려받아 확장할 때 쓴다.
<br/>문제 코드의 첫 줄을 보면 interface Machine 이라고 명시되어 있으므로, <br/>이를 뼈대로 삼는 WashingMachine 클래스는 반드시 implements 키워드를 사용해야 한다.