# Github workflow overview
![](https://velog.velcdn.com/images/minthug94_/post/e04c7f02-bb25-457f-8b34-aa6b557ed3e2/image.png)


## Fork
다른 계정의 Remote Repository를 내 계정으로 가지고 올 때


## Git clone
원격 Repository를 내 로컬에서 이용할 수 있도록 복사

명령어 <code>git clone</code> <레파지토리 주소>
![](https://velog.velcdn.com/images/minthug94_/post/8e3629c5-28cd-4d09-8738-ff146fe686e6/image.png)


![](https://velog.velcdn.com/images/minthug94_/post/9f9f2f6d-c09e-4e2f-b79c-22a090fbde04/image.png)

## Git Status
내 로컬로 복사해 온 디렉토리의 commit 되기 전 까지의 상태를 표시

![](https://velog.velcdn.com/images/minthug94_/post/775b47c8-2fb9-44b3-bd8f-13413a4a32ac/image.png)

<code>git status</code> 명령어를 통해 staging area와 untracked files 
list에 어떤 것들이 있는지 확인 가능

## Git restore
Commit 혹은 staged 되지 않은 변경 사항을 폐기
![](https://velog.velcdn.com/images/minthug94_/post/4d705592-eb80-4871-b185-faea10840d5e/image.png)

만약 작업하던 코드가 잘못되거나 원하는 방식이 맞지 않아 다 밀어버리고 
작업을 원할때 처음 Clone을 받았던 상태로 되돌리는 방법이 있을까?

명령어 <code>restore <파일명></code>로 할 수 있다.

commit 되지 않은 Local Repositoty의 변경 사항을 폐기 할 수 있다.

git restore mypage.java 명령어를 통해 Work space의 변경 사항을 폐기하고 
다시 처음에 받아온 clone 상태가 된다.

## Git add
Untracked files를 Staging area로 추가해서 Git의 관리하에 둠

  
![](https://velog.velcdn.com/images/minthug94_/post/a9c58375-a29a-4b6a-ac8a-ff1f1c7af72b/image.png)

 <code> git add <파일명></code>
내 Local 의 untracked file을 Git 의 관리 하인 staging area로 추가할 수 
있다.
 
   <code> git add .</code>
   Staging area에 모든 파일을 한번에 추가할 수 있다.

💡 git add를 했을때 터미널 창에는 변화가 없다.

   
## Git commit
   수정 작업이 끝났을 때 변경 사항을 저장
   
![](https://velog.velcdn.com/images/minthug94_/post/f00cf046-8fbf-4c25-9734-2e44a6ee9fd2/image.png)

<code> git commit -m '커밋 메세지'</code>
   -m 옵션을 통해 커밋할 내용의 코멘트를 작성할 수 있다.
 💡commit 기록은 날짜, commit을 한 사람, commit 메세지가 모두 기록된다.
   
   
   ----
   # Staging area란?
commit 하기 전에 내용을 기록하는 장소


만약에 git add 명령어로 파일을 staging area에 올려놓은 상태인데 파일을 또 
수정한다면 어떻게 될까? 이렇게 터미널에 보이는 것처럼 파일이 staged이면서 
modified인 상태가 된다.
이 시점에서 터미널은 우리가 선택할 수 있는 행동을 안내하고 있다.

즉 git add 명령을 실행하면 Git은 파일을 바로 Staged 상태로 만든다.
지금 이 시점에서 commit 을 하면 git add 명령을 실행해서 staged 되어 있는 
파일만 commit 된다.
그러니까 git add 명령을 실행한 후에 또 파일을 수정한다면 git add 명령을 
다시 실행해서 최신 버전을 Staged 상태로 만들어야 한다.

아까 활용했던 restore 명령어에 대한 설명도 확인할 수 있다. 이는 discard 
changes, 즉 변경사항을 폐기하는 명령어
   

# Git 의 세가지 영역 및 상태
Committed, Modified, Staged
   
![](https://velog.velcdn.com/images/minthug94_/post/69eb362f-2388-404b-ae5a-01fcbeba61bb/image.png)

git의 Local Repository에는 다음 영역들이 있다.
Untracked area는 Git이 관리하고 있지 않은 영역
Tracked area에 들어온 파일들만 Git의 관리를 받을 수 있으며, Tracked area 
내부에서도 세 가지 상태로 나뉜다.
그 세 가지 상태가 바로 Unmodified, Modified, Staged
   
Unmodified : 기존에 Commit했던 파일을 수정하지 않은 상태
   
Modified : 기존에 Commit했던 파일을 수정한 상태
   
Staged : commit이 가능한 상태, 수정한 파일을 commit 하기 위해서는 staged 
area에 add 하는 작업이 필요!
   
   ## Git reset
   Local 에서 commit 한 내용을 취소 할 때
   

![](https://velog.velcdn.com/images/minthug94_/post/f8e41c69-ddf2-4e8c-b879-e2ff270b0c6b/image.png)


마이페이지를 새로고침했더니 에러가 발생
방금 commit한 기록을 취소하고 에러를 수정하고싶으면?

아직 Remote Repository에 업로드되지 않고 Local Repository에만 commit 해 
놓은 기록이라면 reset 명령어를 통해서 commit 을 취소할 수 있다.

   
   <code>git reset HEAD^</code> 명령어로 가장 최신 commit을 취소 할 수 
있다.
   HEAD의 연속된 ^의 shortcut 이다.
 예) <code>HEAD3</code> === <code>HEAD^^^</code> 이다.
   위 상황은 <code>HEAD~1</code> 명령도 가능하다.

💡hard,soft 옵션도 있다
   git reset --hard vs --soft 구글링
   
 ## Git push
   Local에서 변경, commit 된 사항을 Remote Repository에 업로드
   
![](https://velog.velcdn.com/images/minthug94_/post/c87aee58-d683-4da2-809a-39bd6bdb0f9e/image.png)

   <code> git push <origin\> <branch\></code>
remote에 있는 origin의 master 브랜치에 Local Repository의 변경 사항을 
업로드하기 위해서는 <code>git push origin master</code>라 입력   
     
   ## Git log
  현재까지 commit된 내역들을 터미널 창에서 확인 가능
  
![](https://velog.velcdn.com/images/minthug94_/post/97402564-1588-4184-b9c3-b44613b89866/image.png)

   해당 창을 종료하는 법 : q
 
  ## Pull Request
  Pull Request는 내가 Remote Repository에 Push 해 놓은 변경 사항에 대해서 
함께 작업하는 다른 사람들에게 알리는 것을 말한다
![](https://velog.velcdn.com/images/minthug94_/post/0cb517db-744a-41bf-b1a3-c65f5a2c9eaf/image.png)

