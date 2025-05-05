package com.hilal.multithreading;

public class PetrolPumpSimulation {

	public static void main(String[] args) {
		
		PetrolPump p = new PetrolPump();
		
		Car c1=new Car("BMW",p);
		Car c2=new Car("Audi",p);
		Car car[]=new Car[2];
		car[0]=c1;
		car[1]=c2;
//		Car c3=new Car("jhkhk",p1);
//		Thread t1=new Thread(c3);
		
		Thread thread[]=new Thread[car.length];
//		Thread t1=new Thread(c1);
//		Thread t2=new Thread(c2);
//		t1.start();t2.start();
//		
		
		
		
		for(Thread t:thread)
		{
			for(Car cc:car)
			{
				t=new Thread(cc);
				t.start();		
			}
		}
	}

}
