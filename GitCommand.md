<code>git clone <repository주소></code>
:remote repository를 Local에서 이용할 수 있게 복사

  git clone -b { 브랜치명 } { 원격 저장소 URL }

<code>git status</code>
:Local로 복사해 온 디렉토리의 commit 되기 전 까지의 상태를 표시

<code>git restore</code>
:Commit 혹은 staged 되지 않은 변경 사항을 폐기 

restore <파일명>로 할 수 있다.

commit 되지 않은 Local Repositoty의 변경 사항을 폐기 할 수 있다.

<code>git add</code>
  내 Local 의 untracked file을 Git 의 관리 하인 staging area로 추가할 수 
있다.

<code>git add . </code>
Staging area에 모든 파일을 한번에 추가할 수 있다.

git add를 했을때 터미널 창에는 변화가 없다.
  
<code>git commit</code>
  수정 작업이 끝났을 때 변경 사항을 저장
  
<code>git commit -m '커밋 메세지' </code>
-m 옵션을 통해 커밋할 내용의 코멘트를 작성할 수 있다.
💡commit 기록은 날짜, commit을 한 사람, commit 메세지가 모두 기록된다.


  <code>git reset</code>
git reset — hard HEAD^ : commit한 이전 코드 취소하기
git reset — soft HEAD^ : 코드는 살리고 commit만 취소하기
git reset — merge : merge 취소하기
git reset — hard HEAD && git pull : git 코드 강제로 모두 받아오기

  <code>git push</code>
  git push <romote_name> <branch_name> 
  add하고 commit한 코드 git server에 보내기 
  (git push origin main)
  
  <code>git log</code>
  커밋 히스토리 조회하기

  <code>git remote </code>
  원격 저장소 연결하기
 	  <code>git remote add <shortname><remote repository URL\> </code>
 저장소 연결 확인하기	
  <code>git remote -v</code>
	
  <code>git init</code>
   .git 하위 디렉토리 생성	
  
  <code>git pull</code>
  git pull --rebase { 원격 저장소 별명 } { 브랜치명 }

  <code>git merge</code>
    {대상브랜치} : 현재브랜치에서 대상브랜치를 병합시킴
--squash : 대상브랜치를 병합할 때, 커밋 이력을 모두 제거하고 작업된 내용만 
병합
--no-ff : fast-forward 방식으로 병합할 때, 병합된 것임을 알리는 커밋 
메시지 생성

  <code>git checkout </code>
   브랜치로 이동 
 <code> git checkout <브랜치명> </code>  
 브랜치만들고 이동 
 <code>git checkout -b <브랜치명> </code>

 <code>git revert</code>
특정 버전으로 되돌리는데, 파일 내용은 그대로 유지하고 되돌린 버전 이후의 
모든 commit 이력은 그대로 보존
<code>git revert --mainline 1 {취소할 병합 커밋ID} </code>
  -------
   출처: https://nack1400.tistory.com/16 [TIL로 프로 개발자 되기]

