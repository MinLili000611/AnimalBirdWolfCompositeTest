package AnimalBirdWolfCompositeTest;

public class Wolf {
	
	//将原来的父类组合到原来的子类，　作为子类的一部分
	private Animal a;
    
    public Wolf(Animal a) {
   	 this.a = a;
    }

    public void breath() {
   	 a.breath();
    }
    
  //重新定义一个自己的breath方法
    public void run() {
    	System.out.println("I run very fast...");
	}
    
  }


