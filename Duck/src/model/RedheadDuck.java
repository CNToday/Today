package model;

public class RedheadDuck extends Duck {
	public RedheadDuck() {
		// TODO Auto-generated constructor stub
	quackBehavior=new  Quack();
	flyBehavior=new  FlywithWings();
	}
	public void display(){
		System.out.println("我有我红头鸭的display方式");			
	}	
}
