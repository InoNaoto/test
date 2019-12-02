
public class Test {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
Person taro = new Person();
taro.name="山田太郎";
taro.age=20;
taro.talk();
taro.walk();
taro.run();
System.out.println(taro.name);
System.out.println(taro.age);
;
taro.name="木村次郎";
taro.age=18;
System.out.println(taro.name);
System.out.println(taro.age);
taro.talk();
taro.walk();
taro.run();

taro.name="鈴木花子";
taro.age=16;
System.out.println(taro.name);
System.out.println(taro.age);
taro.talk();
taro.walk();
taro.run();

taro.name="井野夏翔";
taro.age=26;

System.out.println(taro.name);
System.out.println(taro.age);

taro.talk();
taro.walk();
taro.run();


Robot aibo = new Robot();
aibo.name="aibo";
aibo.talk();
aibo.walk();
aibo.run();
System.out.println(aibo.name);

Robot asimo = new Robot();
asimo.name="asimo";
asimo.talk();
asimo.walk();
asimo.run();
System.out.println(asimo.name);

Robot pepper = new Robot();
pepper.name="pepper";
pepper.talk();
pepper.walk();
pepper.run();
System.out.println(pepper.name);




	}

}
