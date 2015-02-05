
public class Package {

	int value;
	int wheight;
	String name;
	Package(int value,int wheight,String name){
		this.value=value;
		this.wheight=wheight;
		this.name=name;
	}
	public int getWheight(){
		return wheight;
	}
	public int getValue(){
		return value;
	}
	public String getName(){
		return name;
	}
}
