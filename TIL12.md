# 가변배열
가변 배열 사용하는 방법 : 2차원 이상의 다차원 배열에서는 1차원 보다는 
자유로운 형태로 배열을 선언하고 공간을 만들 수 있다.

```
int[][] arr = new int[10][10];
// 배열은 아래와 같이 초기화가 된다. 
// {
//   {0,0,0,0,0,0,0,0,0,0},
//   {0,0,0,0,0,0,0,0,0,0},
//   {0,0,0,0,0,0,0,0,0,0},
//   {0,0,0,0,0,0,0,0,0,0},
//   ...
//   {0,0,0,0,0,0,0,0,0,0}
// }

arr[0][0] = 1;
arr[0][1] = 2;
arr[0][2] = 3;
...
arr[0][9] = 10;
arr[1][0] = 11;
arr[1][1] = 12;
...
arr[9][9] = 100;

// 배열은 아래와 같이 값을 저장 
// {
//   {1,2,3,4,5,6,7,8,9,10},
//   {11,12,13,14,15,16,17,18,19,20},
//   ...
//   {91,92,93,94,95,96,97,98,99,100}
// }
```

```
가변배열은 아래와 같은 방식으로도 선언하고 초기화할 수 있다.
int [][]  arr = new int [10][]
```
첫번째 배열에는 10이라는 크기를 초기화했지만 그 공간 간에 넣을 배열들은 
초기화시키지 않고 참조 변수를 담을 공간만 만들어 놓았다.

그러면 이제 그 공간에 원하는 크기만큼 값을 저장할 공간을 new 키워드로 
만들어 메모리가 비효율적으로 사용되는 것을 막을수 있다.

# 문자열 배열
## 배열과 문자열
문자열도 하나 하나 글자들이 순서에 맞게 묶여있는 형태이기 때문에 배열을 
사용해서 저장할 수 있다.

## 문자열 배열의 선언 및 초기화
```
char  letter1 = 'H';
char  letter2 = 'e';
char  letter3 = 'l';
char  letter4 = 'l';
char  letter5 = 'o';
```
위 방식처럼 문장의 순서에 맞게 저장이 가능하다, 하지만 비효율적이다.

```
2차원 배열은?
char[][] letters = new char[2][];
letters[0] = new char[5];
letters[1] = new char[4];

letters[0][0] = 'H';
letters[0][1] = 'e';
letters[0][2] = 'l';
letters[0][3] = 'l';
letters[0][4] = 'o';

letters[1][0] = 'J';
letters[1][1] = 'a';
letters[1][2] = 'v';
letters[1][3] = 'a';
```
이 방식처럼도 가능하지만 여전히 비효율적이다, 선언 후 초기화 과정도 많고 
특정 문자가 중복될 경우엔 메모리를 하나 이상 차지하기 때문이다.
그렇기에 자바에선 문자열을 저장하기 위해 Class인 String을 사용한다.

```
// 선언 후 각 배열에 값을 넣어 초기화하는 경우
String[] str = new String[3];
str[0] = "Hello";
str[1] = "Java";
str[2] = "World";

// 선언과 동시에 값을 넣어 초기화하는 경우
String[] str = new String[] {"Hello", "Java", "World"};
String[] str = {"Hello", "Java", "World"}; // new String[] 생략 가능

// String Class를 사용해서 선언하고 초기화하면 이렇게 간편하게 만들 수 
있습니다.
String str = "Hello Java World";
```

# 배열 탐색
## 배열의 길이와 인덱스
배열에는 같은 타입의 값들의 묶음이 담겨있다.
따라서 그 값을 꺼내오려면 필요한 것이 2가지 있다.
* 배열의 인덱스(Index)
* 배열의 길이
배열을 생성하면 각 저장 공간을 배열의 요소(Element)라고 한다.

💡 인덱스의 시작은 1이 아닌 0 부터 이다.

![](https://velog.velcdn.com/images/minthug94_/post/1f6210ea-2c04-40be-8d15-60fe62af96b4/image.png)

```
int[] arr = {1, 2, 3, 4, 5};
System.out.println(arr[2]); // return 3 

arr[2] = 6;
System.out.println(arr[2]); // return 6
```

```
배열 길이 구하는 법
int[] arr = {1, 2, 3, 4, 5};
System.out.println(str.length);  // return 5

문자열 길이 구하는 방법
String str = "Hello World";
System.out.println(str.length();) // return 11

2차원 배열의 경우의 길이 구하는 법
int[][] arr = {{1, 2, 3,}, {{4, 5}};
System.out.printfln(arr.length); // return 2
System.out.printfln(arr[0].length)); // return 3 
System.out.printfln(arr[1].length)); // return 2
```

## 반복문을 통한 배열 탐색
```
int[] arr = {1, 2, 3, 4, 5}

//for문 사용 탐색 경우
for (int i = 0; i < arr.length; i++) {
	System.out.println(arr[i]);
}

```

```
//for each문 사용 탐색 경우



int[] arr = {1, 2, 3, 4, 5};

for (tupe var: iterate) {
	body-of-loop
}

// ex
for (int num: arr) {
	System.out.println(num);
}

```
for each문은 일반적인 for문처럼 조건식과 증감식을 가지지 않는다. 
자동으로 배열을 처음부터 끝까지 순회해주기 때문, for each문을 사용하면, 
배열의 맨 처음부터 마지막 요소까지 순차적으로 순회하면서 각 요소를 
선언부에서 선언한 변수에 할당해준다. 
즉, 위의 예시로 설명하자면, for each문이 실행되면 arr을 순회하면서 각 순회 
시의 arr의 요소를 num에 할당 
for each문의 블럭 내부에서는 num을 통해 arr의 각 요소에 접근할 수 있는 
것이다.

```
int[] arr1 = {1, 2, 3, 4, 5};

// 일반적인 for문은 arr1이 가진 요소의 값을 재할당할 수 있다. 
for (int i = 0; i < arr1.length; i++) {
	arr1[i] += 1;
}

// arr1 return : {2, 3, 4, 5, 6}
for (int i = 0; i < arr1.length; i++) {
	System.out.printf("%d", arr1[i]);
}

int[] arr2 = {1, 2, 3, 4, 5};

// for each문은 arr2이 가진 요소의 값을 재할당할 수 없다. 
for (int num: arr2) {
	num += 1;
}

// arr2 return : {1, 2, 3, 4, 5}
for (int num: arr2) {
	System.out.printf("%d", num);
}
```


