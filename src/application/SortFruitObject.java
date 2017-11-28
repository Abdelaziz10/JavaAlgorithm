package application;

import java.util.Arrays;

import domain.Fruits;

public class SortFruitObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruits[] fruits = new Fruits[4];

		Fruits pineappale = new Fruits("Pineapple", "Pineapple description",70);
		Fruits apple = new Fruits("Apple", "Apple description",100);
		Fruits orange = new Fruits("Orange", "Orange description",80);
		Fruits banana = new Fruits("Banana", "Banana description",90);

		fruits[0]=pineappale;
		fruits[1]=apple;
		fruits[2]=orange;
		fruits[3]=banana;
		int i=0;
		Arrays.sort(fruits);
		for(Fruits temp: fruits){
			   System.out.println("fruits " + ++i + " : " + temp.getFruitName() +
				", Quantity : " + temp.getQuantity());
			}


	}

}
