package stra;

public class TestMyClass {

	public static void main(String[] args) {
		Human [] humans = {new Human("山内", 167, 80, 53),
				new Human("公之", 177, 60, 23)};
		// MyClass myClass = new MyClass(new HeightComparator()); // 身長
		MyClass myClass = new MyClass(new AgeComparator()); // 年齢
		int ret = myClass.compare(humans[0], humans[1]);
		if (ret > 0) {
			System.out.println(humans[0].name + "が大きい");
		} else if(ret < 0) {
			System.out.println(humans[1].name + "が大きい");
		} else {
			System.out.println(humans[0].name + "と" + humans[1].name + "は同じです");
		}
	}
}

