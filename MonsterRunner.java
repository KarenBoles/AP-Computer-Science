
public class MonsterRunner {

	public static void main(String[] args) {
		MarshmallowMonster joe = new MarshmallowMonster("joe",7,4,1,false);
		System.out.println(joe.getName());
		joe.setName("Roger");
		System.out.println(joe.getName());
		System.out.println(joe.toString());
		System.out.println(joe);
		
		
		

	}

}
