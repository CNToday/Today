package model;

public class RubberDuck extends Duck {
	public RubberDuck() {
		// TODO Auto-generated constructor stub
	quackBehavior=new  Quack();
	flyBehavior=new  Flynoway();
	}
	public void display(){
		System.out.println("我有我机器鸭的display方式");			
	}	
}
