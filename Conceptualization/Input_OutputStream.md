### 표준 입출력
자바에선 콘솔과 같은 표준 입출력 장치를 위해 System이라는 표준 입출력 
클래스를 정의하고 있다.
java.lang 패키지에 포함되어 있는 System 클래스는 표준 입출력을 위해 클래스 
변수를 제공하고있다.

|클래스 변수|입출력 스트림|설명|
|---|---|---|
|System.in|InputStream| 콘솔로부터 데이터를 입력받는다|
|System.out|PrintStream|콘솔로 데이터를 출력한다|
|System.err|PrintStream|콘솔로 데이터를 출력한다|

표준 입출력 스트림은 자바가 자동적으로 생상하기때문에 개발자가 별도로 
스트림을 생성하지 않아도 사용이 가능하다.

--------
## 표준 입출력 대상 변경
위 세 가지 입출력 스트림은 모두 콘솔과 같은 표준 입출력 장치를 대상으로 
한다
하지만 이와 같은 스트림에 다음 System 메소드르 사용하면 스트림의 대상을 
다른 입출력 장치로 변경할수 있다.

|메소드|설명|
|---|---|
|static void setln(InputStream in)| 입력 스트림의 대상을 전달된 입력 
스트림으로 변경|
|static void setOut(PrintStream out) | 출력 스트림의 대상을 전달된 출력 
스트림으로 변경|
|static void setErr(PrintStream err) | 출력 스트림의 대상을 전달된 출력 
스트림으로 변경|

## RandomAccessFile class
순차적인 접근이 아닌 임의의 지점에 접근하여 작업을 수행하고 싶을땐, 
RandomAccessFile 클래스를 사용하면 된다.
이 클래스는 파일만을 대상으로 하며, 임의의 지점에서 입출력을 동시에 수행할 
수 있다.

RandomAccessFile 클래스의 생성자에는 인수로 파일의 이름뿐만 아니라 파일 
모드까지 함께 전달해야 한다.

>⚑파일모드란? 파일의 사용 용도를 나타내는 문자열로, 자바에서 사용할 수 
있는 대표적인 파일 모드 아래와 같다

|파일모드|설명|
|---|---|
|"r"|파일을 오로지 읽는 것만 가능한 모드로 개방한다|
|"rw"|파일을 읽고 쓰는 것이 모두 가능한 모드로 개방한다, 만약 파일이 
없으면 새로운 파일 생성|

## File class
파일의 젝나 디렉터리에 관한 작업 등은 입출력 스트림을 통해서 수행할 수 
없다.

자바는 이런 입출력 작업 이외의 파일과 디렉터리에 관한 작업을 File 클래스를 
통해 처리하도록 하고 있다.

|메소드|설명|
|---|---|
|boolean canRead()|해당 파일이 읽을 수 있는 파일인지 검사
|boolean canWrite()|해당 파일이 쓸 수 있는 파일인지를 검사
|boolean delete()|해당 파일 또는 디렉터리 삭제
|boolean exists()| 해당 파일이 존재하는지 검사
|String getPath()| 해당 파일의 경로명을 문자열로 반환
|boolean isAbsolute()| 해당 파일의 경로명이 절대 경로명인지 검사
|boolean isDirectory()| 해당 파일이 디렉터리인지를 검사
|boolean isFile()| 해당 파일이 파일인지를 검사
|long length()| 해당 파일의 크기를 반환
|boolean mkdir()| 지정된 경로에 디렉터리를 생성함
|boolean mkdirs()| 지정된 경로에 디렉터리를 생성하며, 필요한 모든 상위 
디렉터리도 생성
|booelan renameTo(File dest)| 해당 파일의 이름을 전달된 파일 이름으로 변경
|boolean setExecutable(boolean executable| 파일 속성 변경
|boolean setReadable(boolean readable)|파일 속성 변경
|boolean setWritable(boolean writable)|파일 속성 변경
|boolean setReadOnly()|파일 속성 변경


