## λ©μλπ₯
ν΄λμ€μμ λ©μλλ μ΄λ ν νΉμ  μμμ μννκΈ° μν λͺλ Ήλ¬Έμ μ§ν©μ΄λΌ ν  
μ μλ€.
μ¦, λ©μλλ₯Ό μ¬μ©νλ©΄ μ€λ³΅λλ μ½λμ λ°λ³΅μ μΈ νλ‘κ·Έλλ°μ νΌν  μ μκ² 
λλ€.
λν, λͺ¨λνλ‘ μΈν΄ μ μ²΄μ μΈ μ½λμ κ°λμ±μ΄ μ’μμ§λ€.
νλ‘κ·Έλ¨μ λ¬Έμ κ° λ°μνκ±°λ κΈ°λ₯μ λ³κ²½μ΄ νμν  λλ μμ½κ² μ μ§λ³΄μλ₯Ό 
ν  μ μλ€.

>β λ©μλλ₯Ό μμ±ν λ λλλ‘ νλμ λ©μλκ° νλμ κΈ°λ₯μ μννλλ‘ 
μμ±νμ


```
μ κ·Όμ μ΄μ λ°ννμ λ©μλμ΄λ¦(λ§€κ°λ³μ λͺ©λ‘) { // μ μΈλΆ
//κ΅¬νλΆ
}
```
* μ κ·Ό μ μ΄μ
ν΄λΉ λ©μλμ μ κ·Όν  μ μλ λ²μλ₯Ό λͺμνλ€.

* λ°ν νμ (return type)
λ©μλκ° λͺ¨λ  μμμ λ§μΉκ³  λ°ννλ λ°μ΄ν° νμμ λͺμνλ€.

* λ©μλ μ΄λ¦
λ©μλλ₯Ό νΈμΆνκΈ° μν μ΄λ¦μ λͺμνλ€.

* λ§€κ°λ³μ λͺ©λ‘ (parameters)
λ©μλ νΈμΆ μμ μ λ¬λλ μΈμμ κ°μ μ μ₯ν  λ³μλ€μ λͺμνλ€.

* κ΅¬νλΆ
λ©μλμ κ³ μ  κΈ°λ₯μ μννλ λͺλ Ήλ¬Έμ μ§ν©

```
class Vehicle {
	private int currentSpeed;
    private int accelerationTime;
 ...
 
 public void accelerate(int speed, int sec) { // μ μΈλΆ
 // κ΅¬νλΆ
 	System.out.println(sec +" κ° μλλ₯Ό μμ " + speed + " λ‘ κ°μνλ€ 
" );
 }
```

>βλ©μλ μκ·Έλμ² (method signature)
λ©μλ μ μΈλΆμ λͺμλλ λ§€κ°λ³μμ λ¦¬μ€νΈλ₯Ό κ°λ¦¬ν¨λ€.
λ§μ½ λ λ©μλκ° λ§€κ°λ³μμ κ°μμ νμ, κ·Έ μμκΉμ§ λͺ¨λ κ°λ€λ©΄, μ΄ λ 
λ©μλμ μκ·Έλμ²λ κ°λ€κ³  ν  μ μλ€.


### λ©μλ νΈμΆ
μλ°μμ  μ μν λ©μλλ λ©€λ² μ°Έμ‘° μ°μ°μ (.)λ₯Ό μ¬μ©νμ¬ νΈμΆν  μ μλ€.

```
1.κ°μ²΄μ°Έμ‘°λ³μμ΄λ¦.λ©μλμ΄λ¦(); // λ§€κ°λ³μκ° μλ λ©μλ νΈμΆ
2.κ°μ²΄μ°Έμ‘°λ²Όμμ΄λ¦.λ©μλμ΄λ¦(pra1, pra2, ...); // λ§€κ°λ³μκ° μλ λ©μλ 
νΈμΆ
```

>μ) Vehicle myVehicle = new Vehicle(); // κ°μ²΄ μμ±
>> myVehicle.accelerate(60,3); // myVehicle μΈμ€ν΄μ€μ 
accelerate()λ©μλλ₯Ό νΈμΆν¨

```
class Vehicle {
	private int currentSpeed;
    private int accelerationTime;
 ...
 
 public void accelerate(int speed, int sec) { // μ μΈλΆ
 	System.out.println(sec +" μ΄κ° μλλ₯Ό μμ " + speed + " λ‘ 
κ°μνλ€ " );  // κ΅¬νλΆ
 	}
 }
 
 public class Example{
 public static void main(String[] args) {
 	Vehicle myVehicle = new Vehicle(); // κ°μ²΄ μμ±
    myVehicle.accelerate(60,3); // λ©μλ νΈμΆ
 -> 3μ΄κ° μλλ₯Ό 60speed λ‘ κ°μνλ€
 	}
 }
```

