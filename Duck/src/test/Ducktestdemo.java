package test;

import model.Duck;
import model.RedheadDuck;
import model.RubberDuck;

public class Ducktestdemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//面向接口，添加不同鸭子时只需要更改接口实现即可。
		Duck duck1=new RedheadDuck();
		duck1.performFly();
		duck1.display();
		Duck duck2=new RubberDuck();
		duck2.performFly();
		duck2.display();
	}
	
	
}
