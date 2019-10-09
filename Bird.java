package AnimalBirdWolfCompositeTest;

public class Bird {
	//将原来的父类组合到原来的子类，　作为子类的一部分
         private Animal a;
         
         public Bird(Animal a) {
        	 this.a = a;
         }
	 
         
         //重新定义一个自己的breath方法
         public void breath() {
        	 
        	 //直接用Animal提供的breath()方法来实现Bird的breath()方法
        	 a.breath();
         }
         
         public void fly() {
        	 System.out.println("I fly in the sky...");
     	}
         
	
}
