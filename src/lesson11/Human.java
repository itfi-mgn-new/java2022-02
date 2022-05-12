package lesson11;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

public class Human implements Serializable {
	private static final long serialVersionUID = -1291687127667970825L;

	String	family;
	String	name;
	String 	patroname;
	transient Object  obj = new Object();	
	int		age;
	House	addr;

	public Human(String family, String name, String patroname, int age, House addr) {
		this.family = family;
		this.name = name;
		this.patroname = patroname;
		this.age = age;
		this.addr = addr;
		System.err.println("HUman");
	}

	@Override
	public String toString() {
		return "Human [family=" + family + ", name=" + name + ", patroname=" + patroname + ", age=" + age + ", addr="
				+ addr + "]";
	}
}
