컬레션 프레임워크는 뭘까?
다수의 데이터를 쉽고 효과적으로 처리할 수 있는 표준화된 방법을 제공하는 
클래스의 집합이라고 한다
즉, 데이터를 저장하는 자료 구조와 데이터를 처리하는 알고리즘을 구조화해 
클래스로 구현한 것

자바의 인터페이스를 사용해 구현한다.

### 컬렉션
- 여러 객체를 모아 놓은 것을 말한다
### 프레임워크
- 표준화, 정형화된 체계적인 프로그래밍 방식

### 컬렉션 프레임워크
- 컬렉션 (다수의 객체)를 다루기 위한 표준화된 프로그래밍 방식
- 컬렉션을 쉽고 편리하게 다룰 수 있는 다양한 클래스 제공
- java.util패키지에 포함 JDK1.2부터 제공

### 컬렉션 클래스
- 다수의 데이터를 저장할 수 있는 클래스 (Vector, ArrayList, HashSet)

## 컬렉션 프레임워크 핵심 인터페이스
|인터페이스|특징|
|---|---|
|List Interface| 순서가 있는 데이터의(집합 데이터의 중복을 허용) ex. 
대기자 명단|
|Set Interface| 순서를 유지하지 않는 데이터의 집합. (데이터 중복 불허) ex. 
양의 정수집합, 소수의 집합 등|
|Map Interface| 키와 값의 쌍으로 이루어진 데이터 집합, 순서는 유지되지 
않으며, 키는 중복을 허용하지않지만 값은 중복이 허용된다 ex. 우편번호, 
지역번호(전화번호)|

List와 Set 인터페이스는 모두 Collection 인터페이스를 상속받지만, 구조상의 
차이로 인해 Map 인터페이스는 별도로 정의된다.

[ORACLE - The Collections 
Framework](https://docs.oracle.com/javase/8/docs/technotes/guides/collection)

## 주요 인터페이스 간의 상속 관계

![](https://velog.velcdn.com/images/minthug94_/post/93ab3f03-61b7-46ae-a55f-da7314a76afe/image.png)

예제 > 수정 예정

<E\>나 <K,V> 라는 것은 컬렉션 프레임워크를 구성하는 모든 클래스가 
제네릭으로 표현되어 있음을 말한다.
  
  
아이패드 정리 이미지 추가 예정
  

## 컬렉션 클래스
컬렉션 프레임워크에 속하는 인터페이스를 구현한 클래스를 컬렉션 클래스라 
한다.

모든 컬렉션 클래스는 List와 Set, Map 인터페이스 중 하나의 인터페이스를 
구현하고 있으며
또한 클래스 이름에도 구현한 인터페이스의 이름이 포함되므로 바로 구분이 
가능하다

```
public class ExampleCollection{
	public static void main(String[] args){
    
    // ArrayList 생성
    ArrayList<String> arrList = ArrayList<>();

	// 리스트 요소 저장
    arrList.add("삼");
    arrList.add("이")
    arrList.add("사")
    arrList.add("일")
    
	// 리스트 출력
    for (int i = 0; i <arrList.size(); i++) {
    	
        System.out.println(arrList.get(i));
        }
	}
}
출력값
삼
이
사
일
```

## Collection 인터페이스
List & Set 인터페이스의 공통된 많은 부분은 Collection 인터페이서에서 
정의되며, 두 인터페이스는 그것을 상속받는다.

Collection 인터페이스는 컬렉션을 다루는데 가장 기본적인 동작들을 정의하고, 
그것을 메소드로 제공한다.

![](https://velog.velcdn.com/images/minthug94_/post/74d951de-632f-476d-87de-aecb4fa243a1/image.png)
이미지 수정 예정

## ArrayList method
생성자
ArrayList() // 기본생성자 
ArrayList(Collection c) // 컬렉션을 대입하면 컬렉션을 저장하는 array리스트 
생성가능
ArrayList(int initialCapacity) // 배열의 길이를 늘려줄수있다


