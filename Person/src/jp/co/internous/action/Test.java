package jp.co.internous.action;

public class Test {

	public static void main(String[] args){
		Person jiro = new Person();
		jiro.name  = "木村次郎";
		jiro.age = 18;
		jiro.phoneNumber = "080-1111-1111";
		jiro.address = "ccccc@mail.com";


		Person hanako = new Person();
		hanako.name  = "鈴木花子";
		hanako.age = 16;
		hanako.phoneNumber = "080-0000-1111";
		hanako.address = "eeeec@mail.com";

		Person daisaku = new Person();
		daisaku.name  = "清水大策";
		daisaku.age = 25;
		daisaku.phoneNumber = "080-7777-1111";
		daisaku.address = "cccdddd@mail.com";

		Robot aibo = new Robot();
		aibo.name = "aibo";
		Robot asimo = new Robot();
		asimo.name = "asimo";
		Robot pepper = new Robot();
		pepper.name = "pepper";

		System.out.println(jiro.name + "、"+ jiro.age + "、"+jiro.phoneNumber + "、"+ jiro.address );
		jiro.talk();
		jiro.walk();
		jiro.run();
		System.out.println(hanako.name + "、"+ hanako.age+ "、"+hanako.phoneNumber + "、"+ hanako.address );
		hanako.talk();
		hanako.walk();
		hanako.run();
		System.out.println(daisaku.name + "、"+ daisaku.age+ "、"+daisaku.phoneNumber + "、"+ daisaku.address );
		daisaku.talk();
		daisaku.walk();
		daisaku.run();

		System.out.println(aibo.name);
		aibo.talk();
		aibo.walk();
		aibo.run();

		System.out.println(asimo.name);
		asimo.talk();
		asimo.walk();
		asimo.run();

		System.out.println(pepper.name);
		pepper.talk();
		pepper.walk();
		pepper.run();

	}

}
