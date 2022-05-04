# CLI vs GUI


![](https://velog.velcdn.com/images/minthug94_/post/9d57c338-c53b-4353-b84c-f15e9ca2e890/image.png)


### 명령줄 인터페이스 (Commnd-Line Interface, CLI)
명령어로 컴퓨터를 제어하는 방식 



![](https://velog.velcdn.com/images/minthug94_/post/5f558c73-4faf-4055-8204-053c54c32597/image.png)

### 그래픽 사용자 인터페이스 (Graphic User Interface)
보통 사람들이 컴퓨터를 사용할 때 적용되는 컴퓨터 제어 방식

CLI 장점 & 단점

* 상대적으로 높은 안정성과 빠른 속도
* GUI 보다 컴퓨터의 자원을 적게 사용하여, 더 빠르게 동작한다

* 사용자가 쉽게 컴퓨터를 제어 하기 힘들다.


GUI 장점 & 단점

* 사용자가 쉽게 컴퓨터를 제어할 수 있다.

* 컴퓨터의 자원을 사용하게 되어 비교적 느리다.

--------
컴퓨터를 조작하기 위해서는 다양한 <span style="color: 
rgb(224,210,50)">입력(input)</span>이 필요하다.
현재 보고있는 이 벨로그를 보기 위해서도 마우스와 키보드를 사용하여 해당 
화면까지 도달 해야한다.

입력을 담당하는 키보드나 마우스를 (Input Source)라고 하며,
키보드, 마우스 이외에도 마이크, 카메라 등 컴퓨터에 새로운 명령을 전달하는 
모든 소스들을 입력 소스라고 한다.

반대로 입력 소스에 의해 또는 작성된 프로그램에 의해 모니터에 화면을 
나타내거나, 음악을 재생하면 소리를 전달하여 사용자가 인식 할 수 있도록 
하는 일을 <span style="color: rgb(224,210,50)">출력(Output)</span>이라 
한다.
시각적 출력을 담당하는 모니터, 청각적 출력을 담당하는 스피커를 출력 소스 
(Output Source)라고 한다.

모니터나 스피커 이외에도 스마트홈 등을 연결하여 집안의 전등,보일러,냉장고 
등을 조작하는 경우, 전등이나 냉장고도 '출력 소스'가 될 수 있다.

* 컴퓨터를 조작하기 위한 입&출력을 I/O(Input/Output)이라 표기하며, 
"아이오"라고 읽는다.

## 리눅스(Linux)
리눅스의 터미널은 키보드이 입력과 모니터의 출력으로 모든 작업을 할 수 
있다.
리눅스 터미널은 GUI가 개발되기 이전부터 컴퓨터를 조작하기 위해 사용 되었기 
때문에,
GUI가 할 수 있는 모든 작업은 CLI로 할 수 있다.
다만 GUI로 작업하는 것이 익숙해진 현대인에게 낯설게 느껴질뿐

### 프롬프트(prompt)
맥에서 사용하는 터미널은 CLI(Command-Line Interface) 이다.

명령어를 입력해서 현재 위치 확인을 해보자

```
pwd
```
#### pwd란?
print working directory의 약자이다.
여기서 디렉토리는 폴더라고도 한다.

![](https://velog.velcdn.com/images/minthug94_/post/58dad078-837e-4ab0-8fcd-728ec0ee10b9/image.png)

#### mkdir
CLI에서 폴더를 생성하기 위해 사용하는 명령어
<code>mkdir<code>은 make directories의 약자이다.

```
mkdir helloWorld
```
해당 명령어를 입력하면 별도의 출력 없이 폴더가 생성된다

#### ls
<code>ls</code>란 list의 약자로 특정 폴더에 포함된 파일이나 폴더의 
리스트를 출력한다.

명령어 ls에는 자주 사용하는 옵션인 <code>l</code> 과 <code>a</code>가 
있다.
CLI에서 특정 명령어의 옵션을 사용하는 경우에는 <code>-</code> 를 이용해 

<ul>
	<li><code>ls-l</code></li>
	<li><code>ls-a</code></li>
	<li><code>ls-al 또는 ls-la </code></li>
</ul>

세번째 예시 옵션을 뜻하는(dash, <code>-</code>)뒤에 오는 **옵션의 
순서는**<code>la</code> or <code>al</code>
**기능에 영향을 미치지 않습니다.**

명령어 <code>ls</code>의 옵션 <code>a</code>는 "all"을 의미합니다.
숨어있는 폴더나 파일을 포함한 모든 항목을 터미널에서 출력

옵션 <code>a</code>와 함께, 자주 사용되는 옵션 옵션 <code>l</code>은 
폴더나 파일의
포맷을 전부 표현하라는 의미


명령어 <code>ls</code>와 함께 옵션 <code>l</code>을 사용하면, 가장 왼쪽에 
출력되는 두 글자 <code>d</code>와 <code>-</code>를 확인할 수 있다. 
여기서 <code>d</code>로 출력된 경우는 디렉토리를, <code>-</code>로 출력된 
경우는 파일을 나타낸다, 디렉토리는 다음 명령어 <code>cd</code>를 통해 
진입할 수 있지만, 파일이라면 진입할 수 없다.

#### 명령어를 이용해 폴더를 GUI의 탐색기로 실행하기
>macOs

```
open .
```

#### cd: 폴더 진입

명령어 <code>cd</code>는 change directory의 약자
프롬프트로 상호작용 하는 폴더를 다른 폴더로 변경한다는 의미

명령어 <code>pwd</code> 를 사용해 현재 위치를 확인 후, 명령어 
<code>ls</code>를 이용해
helloWorld 폴더를 확인 이후 명령어 <code>cd</code>를 이용해 helloWorld 
폴더로 진입

```
pwd
ls
cd helloWorld
pwd 
# 현 위치 확인 가능
```

#### touch: 파일 생성
파일(File)은 서류철을 뜻 한다.
컴퓨터나 스마트폰 등 전자기기에서 문서의 형태로 작성된 모든 것을 
파일이라고 한다.
그중에서 가장 쉽게 접근 할 수 있는 파일은 텍스트(text) 파일이다.

#### cat: 파일의 내용을 터미널에 출력
CLI로 만든 폴더와 파일을 GUI와 동일하게 확인 할 수 있다.

#### rm : 폴더나 파일 삭제하기
명령어 <code>rm</code>은 폴더나 파일을 삭제 할 때 사용된다.

명령어 <code>rm</code>의 뜻은 remove 이다.
명령어 <code>rm</code>으로 삭제한 폴더나 파일은, 휴지통을 거치지 않고 
삭제된다.

또한 명령어 <code>rm</code> 은 단일 파일을 삭제 할 수 있다.
만약 폴더를 삭제하려면 옵션을 사용 해야한다, 대시(<code>-</code>)를 
사용하여 <code>r</code>과 <code>f</code>를 쓴다.
```
rm -rf bye
```

옵션 <code>r</code>은 "recursive"를 뜻하고,옵션 <code>f</code>은 "force"를 
의미한다.
옵션 <code>r</code>은 폴더를 지울ㄷ 때 사용하고, 옵션 <code>f</code>는 
질문을 받지 않고 지울 때 사용


#### mv: 폴더나 파일의 이름을 변경 혹은 폴더나 파일 위치 옮기기
명령어 <code>mv</code>는 "move" 의 약자로, 폴더나 파일을 이동 할때 사용
GUI에서 폴더나 파일을 이동하려면 몇 가지 과정이 필요합니다.

<ul>
<li>폴더나 파일에 마우스를 올리고, 마우스 왼쪽 버튼을 꾹 눌러 drag 상태로 
만듭니다.</li>
<li>선택된 폴더나 파일을 그대로 끌어(drag) 다른 폴더에 
놓습니다(drop).</li>
<li>폴더나 파일이 다른 폴더로 이동합니다.</li>
</ul>

위 방식을 Drag&Drop 이라고 한다.

CLI에선 명령어 <code>mv</code>로 폴더나 파일을 다른 폴더로 옮길 수 있다.
```
mkdir op
touch gg.txt
```
명령어 <code>mv</code>를 통해 파일 "gg.txt"를 "op"폴더로 이동 시키자
```
mv gg.txt op/
```

명령어 <code>mv</code> 뒤에는 순서대로 \[\폴더나 파일의 이름\]\ \[\도착 
폴더의 이름\]\

명령어 <code>mv</code>의 다른 기능은 폴더나 파일의 이름을 변경 할 수 있다.
```
mv gg.txt opgg.txt
```

#### cp : 폴더나 파일을 복사
명령어 <code>cp</code> 는 "copy"의 약자로 폴더나 파일을 복사할 때 사용
<code>cp [원본 파일 이름] [복사할 파일 이름]</code> 를 프롬프트에 입력
```
cp opgg.txt lolps.txt
```
----------
## Read,Write,Execute
![](https://velog.velcdn.com/images/minthug94_/post/910b2e26-1df2-4a7b-bbbf-a6e7c1e5e1e9/image.png)

<code>-rw-r--r--</code> 는 not directory/read,write,x/read,x,x/read
폴더에 있지않고, 소유자는 읽기 쓰기가 가능 / 그룹은 읽기만 / 그 외는 
읽기만 가능하다라 설명이 가능하다

  
### user, group, and other
user:
user는 파일의 소유자이며, 기본적으로 파일을 만든 사람이 소유자가 된다. 
따라서 user를 소유자라 한다
  
group:
group에는 여러 user가 포함 있다
그룹에 속한 모든 user는 파일에 대한 동일한 group 액세스 권한을 갖는다. 
많은 사람이 파일에 액세스해야 하는 프로젝트가 있다고 가정할 때,  각 
user에게 일일이 권한을 할당하는 대신 모든 user를 group에 추가해서 파일에 
group 권한을 할당할 수 있다.
  
other:
파일에 대한 액세스 권한이 있는 다른 user, 파일을 만들지 않은 다른 모든 
user를 의미한다. 
따라서 other 권한을 설정하면, 해당 권한을 global 권한 설정이라 생각하면 
편하다

#### chmod: 권한 변경 명령어

명령어 <code>chmod</code> 폴더나 파일의 읽기, 쓰기, 실행 권한을 변경, OS에 
로그인한 user와, 폴더나 파일의 user가 같을 경우에 명령어  
<code>chmod</code> 로 폴더나 파일의 권한을 변경할 수 있다.
  
만약 OS에 로그인한 사용자와, 폴더나 파일의 소유자가 다를 경우에는 관리자 
권한을 획득하는 명령어 <code>sudo</code> 를 이용해 폴더나 파일의 권한을 
변경할 수 있다.
  
명령어 <code>chmod</code> 로 권한을 변경하는 방식은 두 가지

* 첫 번째는 더하기(+), 빼기(-), 할당(=)과 accessor 유형을 표기해서 
변경하는 Symbolic method

 * 두 번째는 rwx를 3 bit로 해석하여, 숫자 3자리로 권한을 표기해서 변경하는 
Absolute form

  
>Symbolic method는 액세스 클래스, 연산자, 액세스 타입으로 구분

|Access class|Opreator|Access Type|
|:---:|:---:|:---:|
|u(user)|+ (add access)	|r(read)|
|g(group)|- (remove access)	|w(write)|
|o(other)|= (set exact access)|x(execute)|
|a(all:u,g,o)|||
  
명령어 <code>chmod</code> 뒤에 변경할 권한을 입력
액세스 클래스의 u, g, o, a를 변경할 조건에 따라 조합 입력하고, 연산자와 
액세스 타입을 순서대로 입력 후 다음은 명령어 chmod 를 입력한 예시와 결과
 ```
chmod g-r filename # removes read permission from group
chmod g+r filename # adds read permission to group
chmod g-w filename # removes write permission from group
chmod g+w filename # adds write permission to group
chmod g-x filename # removes execute permission from group
chmod g+x filename # adds execute permission to group
chmod o-r filename # removes read permission from other
chmod o+r filename # adds read permission to other
chmod o-w filename # removes write permission from other
chmod o+w filename # adds write permission to other
chmod o-x filename # removes execute permission from other
chmod o+x filename # adds execute permission to other
chmod u+x filename # adds execute permission to user
```

 ```
  chmod a=rw hello.java # -rw-rw-rw-
chmod u= hello.java # ----rw-rw-
chmod a+rx hello.java # -r-xrwxrwx
chmod go-wx hello.java # -r-xr--r--
chmod a= hello.java # ----------
chmod u+rwx hello.java # -rwx------
  ```
액세스 클래스와 연산자, 액세스 타입을 모두 기억해야만 Symbolic method를 
이용해 권한을 변경할 수 있다.

Absolute form은 숫자 7까지 나타내는 3 bits의 합으로 표기

사용자, 그룹, 또는 다른 사용자나 그룹마다 rwx 가 나타나고, 각 영역의 
<code>boolean</code> 값으로 표기할 수 있다.

|-|Permission|Number|
|--|---|---|
|Read |(r)|	4|
|Write| (w)|	2|
|Execute |(x)|	1|
  
  만약, user는 <code>rwx</code> 를, group과 other은 <code>r-- </code> 로 
권한을 변경하려고 한다면, 위 표에 나와있는 숫자의 합을 user, group, other 
순으로 입력하여 사용

|#|	Sum|	rwx|	Permission|
-|---|---|---|
7|	4(r) + 2(w) + 1(x)|	rwx|	read, write, execute|
6|	4(r) + 2(w) + 0(-)|	rw-	|read, write|
5|	4(r) + 0(-) + 1(x)|	r-x	|read and execute|
4|	4(r) + 0(-) + 0(-)|	r—	|read only|
3|	0(-) + 2(w) + 1(x)|	-wx|	write, execute|
2|	0(-) + 2(w) + 0(-)|	-w-|	write only|
1|	0(-) + 0(-) + 1(x)|	—x	|execute only|
0|	0(-) + 0(-) + 0(-)|	—-	|none|

  
  
  
---------

참고 URL
https://dorudoru.tistory.com/1958
https://oriyong.tistory.com/56

