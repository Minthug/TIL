HTML과 CSS 를 활용하여 트위터 클론(?)을 만들었다.
물론 첫 페어와 함께 만드는 과정이였지만,
1+1=2 가 안되었지만 1.5는 되었던거 같다

4일간 아무것도 늘지 않았다고 생각했지만,
오늘 10 중에 7까지는 아는 내용에서 활용 해낸거 같다.

아직은 지저분하고 두서 없는 '코드' 이지만,
점점 깔끔하고 10 에 7 이 아닌 10에 10 까지 활용해보자🔥

![](https://velog.velcdn.com/images/minthug94_/post/06e95c9d-2430-4c3c-a0b2-faf53be5c9bc/image.png)


https://uteehh.csb.app/

```
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8" />
    <title>twittler</title>
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <link rel="stylesheet" type="text/css" media="screen" href="main.css" 
/>
  </head>
  <body>
    <div id="greeting">🚀twittler</div>
    <div class="tweet-container">
      <div>Username</div>
      <input id="usernameInput" type="text" placeholder="Input Name" />
      <div>Message</div>
      <input id="messageInput" type="text" placeholder="Input Message" />
      <div class="tweettag"><button id="tweetButton">Tweet!</button></div>
    </div>

    <div class="randomtag">
      <div class="icon1">
        <button id="randomButton">Check New Tweets!</button>
      </div>
      
      <!-- Tweet lists -->
      <section id="tweetlist" class="white"></section>

      <script src="script.js"></script>
    </div>

  </body>
</html>

```

```
CSS
#greeting {
  font-size: 7vh;
  font-family: cursive;
  font-weight: bold;
  border: 0px solid #ccc;
  border-radius: 1em;
  color: rgb(255, 255, 255);
  background-color: rgba(255, 255, 255, 0);
  text-shadow: 0 6px rgb(95, 79, 79);
  text-align: center;
  margin: 0.5em;
  padding: 0.5em;
}

html {
  background-color: rgb(79, 162, 187);
}

.tweet-container {
  font-family: cursive;
  font-weight: bold;
  border: 1px solid whitesmoke;
  border-radius: 1em;
  text-align: center;
  background-color: rgba(255, 255, 255, 0.562);
  color: white;
  display: flex;
  flex-direction: column;
}
#usernameInput {
  width: 10em;
  margin: 0.5em;
  align-self: center;
  border-radius: 1em;
  border: 0px solid;
  text-align: center;
}
#messageInput {
  width: 25em;
  height: 5em;
  margin: 0.5em;
  padding: 0em;
  align-self: center;
  border-radius: 1em;
  border: 0px solid;
  text-align: center;
}

.tweettag {
  align-self: center;
  padding: 0.5em;
}

#tweetButton {
  padding: 0.5em;
  font-family: cursive;
  font-weight: bold;
  border-radius: 1em;
  background-color: rgba(238, 130, 238, 0.61);
}

.randomtag {
  background-color: rgba(255, 255, 255, 0.562);
  height: 3em;
  align-self: flex-end;
  font-style: sans-serif;
  font-weight: bold;
  border-radius: 1em;
  display: flex;

}
.icon1 {
  align-self: center;
}

#randomButton {
  margin: 10px;
  border-radius: 1em;
  background-color: ghostwhite;
  font-weight: bold;
  height: 30px;
}

#tweetWrapper {
  background-color: rgba(255, 255, 255, 0.562);
  color: white;
  text-shadow: 0 0 5px #333;
  padding: 0em;
  display: flex;
  flex-direction: column;
  margin-top: 5px;
  border-radius: 1em;
}

.white {
  border-bottom: 1px dotted white;
  list-style: none;
  margin: 0em;
}
.tweet {
  padding: 0.5em 1em;
}

.tweet__username {
  font-size: 25px;
}

.tweet__createdAt {
  display: inline;
  float: right;
}

.randomtag {
  display: flex;
  flex-direction: column;
  margin-top: 0.5em;
}

ul > li:last-child {
  border: 0px;
}

```


