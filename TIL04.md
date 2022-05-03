# HTML 구성
대부분의 경우 콘텐츠의 흐름은 좌에서 우, 위에서 아래로 진행된다. 
CSS로 화면을 구분할 때에는 수직분할, 수평분할을 순서대로 적용해서 콘텐츠의 
흐름을 맞춰서 작업을 진행하자

* 수직분할 : 화면을 수직으로 구분, 콘텐츠가 가로로 배치될 수 있도록 요소를 
배치합니다.

* 수평분할 : 분할된 각각의 요소를 수평으로 구분하여, 내부 콘텐츠가 세로로 
배치될 수 있도록 요소를 배치합니다.
수평으로 구분된 요소에 height 속성을 추가하면, 수평분할을 보다 직관적으로 
할 수 있다.

```
<div class="itembox">
	<div class="item">helloflex</div>
	<div class="item">abc</div>
	<div class="item">helloflex</div>
</div>
```
부모 요소인 div.itembox Flex Container(플렉스 컨테이너)라고 부르고,
자식 요소인 div.item들을 Flex Item(플렉스 아이템)이라고 부릅니다.
'컨테이너가 Flex의 영향을 받는 전체 공간이고, 설정된 속성에 따라 각각의 
아이템들이 어떤 형태로 배치되는 것'이라고 생각하면 된다.


![](https://velog.velcdn.com/images/minthug94_/post/84800d47-c1eb-4b6c-ab8c-475f441e7cca/image.jpeg)

Flex의 속성들은,

* 컨테이너에 적용하는 속성
* 아이템에 적용하는 속성
이렇게 두 가지로 나뉜다.

-----
## <div style="color: brown;">display: flex;</div>
```
.itembox{
display: flex;
<!-- display: inline-block;-->
}
```

![](https://velog.velcdn.com/images/minthug94_/post/1fb8f451-5c35-4eef-a616-91bd2e4bfff5/image.webp)


아이템들이 배치된 방향의 축을 메인축(Main Axis),
메인축과 수직인 축을 수직축 또는 교차축(Cross Axis)

![](https://velog.velcdn.com/images/minthug94_/post/2edef98f-20a1-4c40-b845-ec6f3ec22e0d/image.png)

row (default): 아이템들이 가로 방향으로 배치 됩니다.
row-reverse: 아이템들이 역순이 되어 가로 방향에 배치 됩니다.
column: 아이템들이 세로 방향으로 배치 됩니다.
column-reverse: 아이템들이 역순이 되어 세로 방향으로 배치 됩니다.


## flex-wrap

컨테이너가 더 이상 아이템들을 한 줄에 담을 여유 공간이 없을 때
아이템 줄바꿈을 어떻게 할지 결정하는 속성

![](https://velog.velcdn.com/images/minthug94_/post/11b7efa5-8933-4863-89f3-c18352846d56/image.png)

```
.container {
	flex-wrap: nowrap;
	/* flex-wrap: wrap; */
	/* flex-wrap: wrap-reverse; */
}
```

nowrap (default): 줄바꿈을 하지 않고 한 라인으로 유지
wrap: 줄 바꿈을 한다 (float이나 inline-block으로 배치한 요소들과 비슷하게 
동작)
wrap-reverse: 줄바꿈을 하는데, 아이템을 역순으로 배치


## flew-flow

```
.container {
  flex-flow: column wrap;
  /* flex-direction: row; */
	/* flex-wrap: wrap; */
}
```
flex-direction과 flex-wrap을 한꺼번에 지정할 수 있는 단축 속성
flex-direction, flex-wrap의 순으로 한 칸 떼고 쓰면 된다

## justify-content

![](https://velog.velcdn.com/images/minthug94_/post/2fffff8d-792a-4a7e-91e5-e626873edbda/image.png)

```
.container {
	justify-content: flex-start;
	/* justify-content: flex-end; */
	/* justify-content: center; */
	/* justify-content: space-between; */
	/* justify-content: space-around; */
	/* justify-content: space-evenly; */
}
```

flex-start (default): 
아이템들을 시작점으로 정렬합니다.
flex-direction이 row(가로 배치)일 때는 왼쪽, column(세로 배치)일 때는 
위예요.

flex-end: 아이템들을 끝점으로 정렬
flex-direction이 row(가로 배치)일 때는 오른쪽, column(세로 배치)일 때는 
아래

center: 아이템들을 가운데로 정렬

space-between: 아이템들의 “사이(between)”에 균일한 간격을 만든다.
![](https://velog.velcdn.com/images/minthug94_/post/b168eec3-a047-4304-9dbe-41ebe30c6559/image.png)

space-around: 아이템들의 “둘레(around)”에 균일한 간격을 만든다.
![](https://velog.velcdn.com/images/minthug94_/post/41f6626b-2328-43cf-87fe-ddd3334b6d94/image.png)

space-evenly: 아이템들의 사이와 양 끝에 균일한 간격을 만든다.
![](https://velog.velcdn.com/images/minthug94_/post/63168b83-78ad-4a5c-a0d3-1d189b26b6b4/image.png)


## align-items
![](https://velog.velcdn.com/images/minthug94_/post/1b9ae45e-3d12-4338-9002-aef9740f9d2c/image.png)


```
.container {
	align-items: stretch;
	/* align-items: flex-start; */
	/* align-items: flex-end; */
	/* align-items: center; */
	/* align-items: baseline; */
}
```
stretch (기본값)
아이템들이 수직축 방향으로 끝까지 쭈욱 늘어난다.

flex-start
아이템들을 시작점으로 정렬
flex-direction이 row(가로 배치)일 때는 위, column(세로 배치)일 때는 왼쪽

flex-end
아이템들을 끝으로 정렬
flex-direction이 row(가로 배치)일 때는 아래, column(세로 배치)일 때는 
오른쪽

center
아이템들을 가운데로 정렬

baseline
아이템들을 텍스트 베이스라인 기준으로 정렬

## align-content

![](https://velog.velcdn.com/images/minthug94_/post/8ca57939-246d-471e-aec3-eb0b5f14a6b9/image.png)


flex-wrap: wrap;이 설정된 상태에서, 아이템들의 행이 2줄 이상 되었을 때의 
수직축 방향 정렬을 결정하는 속성



```
.container {
	flex-wrap: wrap;
	align-content: stretch;
	/* align-content: flex-start; */
	/* align-content: flex-end; */
	/* align-content: center; */
	/* align-content: space-between; */
	/* align-content: space-around; */
	/* align-content: space-evenly; */
}
```



-----
참고 사이트 url
https://studiomeal.com/archives/197

https://css-tricks.com/snippets/css/a-guide-to-flexbox/

