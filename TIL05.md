## Order

![](https://velog.velcdn.com/images/minthug94_/post/941e77e4-01c8-45ea-9b6b-742983fd675f/image.png)

```
.item {
  order: 5; /* default is 0 */
}
```
>각 아이템들의 시각적 나열 순서를 결정하는 속성
숫자값이 들어가며, 작은 숫자일 수록 먼저 배치 “시각적” 순서일 뿐, HTML 
자체의 구조를 바꾸는 것은 아니므로 접근성 측면에서 사용에 주의 요망!
시각 장애인분들이 사용하는 스크린 리더로 화면을 읽을 때, order를 이용해 
순서를 바꾼 것은 의미가 없다는 것을 유념!


## flew-basis

flex-basis는 Flex 아이템의 기본 크기를 설정합니다(flex-direction이 row일 
때는 너비, column일 때는 높이).



```
.item {
	flex-basis: auto; /* 기본값 */
	/* flex-basis: 0; */
	/* flex-basis: 50%; */
	/* flex-basis: 300px; */
	/* flex-basis: 10rem; */
	/* flex-basis: content; */
}
```

flex-basis의 값으로는 우리가 width, height 등에 사용하는 각종 단위의 수가 
들어갈 수 있고, 기본값 auto는 해당 아이템의 width값을 사용
width를 따로 설정하지 않으면 컨텐츠의 크기가 되지만, content는 컨텐츠의 
크기로, width를 따로 설정하지 않은 경우와 같다.

```
.item {
	flex-basis: 100px;
}
```

원래의 width가 100px이 안되는 AAA와 CCC는 100px로 늘어났고, 원래 100px이 
넘는 BBB는 그대로 유지

![](https://velog.velcdn.com/images/minthug94_/post/9b8b9d31-5a42-457d-ad55-eaa57ff4bb49/image.png)

반면에 width를 설정하면, 원래 100px을 넘는 BBB도 100px로 맞춰집니다.
(아래처럼 BBBBBBBBBBB가 다음 줄로 넘어가도록 하려면, CSS에 word-wrap: 
break-word;를 적용해주세요. 안그러면 영역만 100px로 줄어들고 BBBBBB는 
옆으로 쭉- 삐져나간답니다.)

```
.item {
	width: 100px;
}
```

![](https://velog.velcdn.com/images/minthug94_/post/c9ab43c7-f52c-4444-9886-f50d6855aca9/image.png)

둘 다 설정 시,

```
.item {
	flex-basis: 100px;
	width: 100px;
}
```

![](https://velog.velcdn.com/images/minthug94_/post/221fdf5f-b8ad-4096-8f3d-dbf96f497a35/image.png)

## flew-grow

flex-grow는 아이템이 flex-basis의 값보다 커질 수 있는지를 결정하는 속성

flex-grow에는 숫자값이 들어가는데, 몇이든 일단 0보다 큰 값이 세팅이 되면 
해당 아이템이 유연한(Flexible) 박스로 변하고 원래의 크기보다 커지며 빈 
공간을 메우게 된다.
기본값이 0이기 때문에, 따로 적용하기 전까지는 아이템이 늘어나지 않았던 것

```
.item {
	flex-grow: 1;
	/* flex-grow: 0; */ /* 기본값 */
}
```
![](https://velog.velcdn.com/images/minthug94_/post/da807cb2-039a-4c82-b778-d5098829f4bd/image.png)
###### 0 설정
![](https://velog.velcdn.com/images/minthug94_/post/7fad4ee6-9931-4aaf-bc1e-d9e50ebe02b2/image.png)

###### 1로 설정 할때 예시


flex-grow에 들어가는 숫자의 의미는, 아이템들의 flex-basis를 제외한 여백 
부분을 flex-grow에 지정된 숫자의 비율로 나누어 가진다고 생각하면 된다.

![](https://velog.velcdn.com/images/minthug94_/post/e733f2e2-6f66-40c0-b25f-89e0c6eeb67b/image.png)

애매한 비율로 보이지만, 여백의 비로 생각해 보면 정확히 1:2:1
정수 뿐 아니라 3.141592같은 소수도 가능

## flex-shrink
flex-shrink는 flex-grow와 쌍을 이루는 속성으로, 아이템이 flex-basis의 
값보다 작아질 수 있는지를 결정

flex-shrink에는 숫자값이 들어가는데, 몇이든 일단 0보다 큰 값이 세팅이 되면 
해당 아이템이 유연한(Flexible) 박스로 변하고 flex-basis보다 작아진다

기본값이 1이기 때문에 따로 세팅하지 않았어도 아이템이 flex-basis보다 
작아질 수 있었다.

```
.item {
	flex-basis: 150px;
	flex-shrink: 1; /* 기본값 */
}
```

flex-shrink를 0으로 세팅하면 아이템의 크기가 flex-basis보다 작아지지 않기 
때문에 고정폭의 컬럼을 쉽게 만들 수 있어요. 고정 크기는 width로 
설정합니다.

```
.container {
	display: flex;
}
.item:nth-child(1) {
	flex-shrink: 0;
	width: 100px;
}
.item:nth-child(2) {
	flex-grow: 1;
}
```

![](https://velog.velcdn.com/images/minthug94_/post/673235a1-42cd-48c4-a445-95b7e4d1f13c/image.png)
##### 100% 설정시
![](https://velog.velcdn.com/images/minthug94_/post/a9aaa458-f673-4b68-8711-b3aeb74a36af/image.png)
##### 250% 설정시


## flex
flex-grow, flex-shrink, flex-basis를 한 번에 쓸 수 있는 축약형 속성
```
item {
	flex: 1;
	/* flex-grow: 1; flex-shrink: 1; flex-basis: 0%; */
	flex: 1 1 auto;
	/* flex-grow: 1; flex-shrink: 1; flex-basis: auto; */
	flex: 1 500px;
	/* flex-grow: 1; flex-shrink: 1; flex-basis: 500px; */
}

```
주의할 점은, flex: 1; 이런 식으로 flex-basis를 생략해서 쓰면 flex-basis의 
값은 0 이 된다.

#### 축약형 예시
```
.item {
	flex: 1 1 0;
}
.item:nth-child(2) {
	flex: 2 1 0;
}
```
![](https://velog.velcdn.com/images/minthug94_/post/3d5aab6c-f2f9-4507-99bd-2820dd93d3ad/image.png)

flex-basis: 0; 으로, 기본 점유 크기를 0으로 만들어버려 결국 전체 크기를 
1:2:1로 나누어 가져서, 영역 자체의 크기가 정확히 1:2:1의 비율로 설정이 
된다.

여백의 비가 아닌, 영역 자체를 원하는 비율로 분할하기를 원한다면 이렇게 
flex-basis을 0으로 하면 손쉽게 처리할 수 있다.

flex-wrap과 flex-basis를 이용해서 2단 컬럼의 사각형 목록을 만들어 볼게요.

```
.container {
	display: flex;
	flex-wrap: wrap;
}
.item {
	flex: 1 1 40%;
}
```

flex-basis가 40%면, 100%에는 2개까지만 들어가므로 하나의 row에는 2개까지만 
남고 다음줄로 넘어가게 되어서 2단 컬럼이 유지

![](https://velog.velcdn.com/images/minthug94_/post/2172bca3-50c7-43d2-9e59-68c073d88fe7/image.png)
##### 1 1 40%

![](https://velog.velcdn.com/images/minthug94_/post/b01d4590-7d51-4189-998f-c4fe46ae1764/image.png)

##### 1 1 30%

flex: 1 1 40%는 2단, flex: 1 1 30%는 3단

## align-self
align-items의 아이템 버전

align-items가 전체 아이템의 수직축 방향 정렬이라면, align-self는 해당 
아이템의 수직축 방향 정렬
```
.item {
	align-self: auto;
	/* align-self: stretch; */
	/* align-self: flex-start; */
	/* align-self: flex-end; */
	/* align-self: center; */
	/* align-self: baseline; */
}
```
기본값은 auto로, 기본적으로 align-items 설정을 상속
align-self는 align-items보다 우선권이 있어요~ 전체 설정보다 각각의 개별 
설정이 우선한다는 것
auto외의 나머지 값들은 align-items와 동일

아래는 align-self 값을 BBB는 center, CCC는 flex-start로 설정한 예시

![](https://velog.velcdn.com/images/minthug94_/post/0d943deb-d2c0-4e07-a42f-1301c46c1169/image.png)



----
참고 URL
https://studiomeal.com/archives/197
https://css-tricks.com/snippets/css/a-guide-to-flexbox/
