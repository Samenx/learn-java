package learnjava;
import java.util.Scanner;

import javax.swing.JOptionPane;

import java.util.ArrayList;
import java.util.Random;
import java.lang.reflect.Array;
import java.util.*;
//------------------------------------------------------------------------------------------------------------------------v1 VARIABELS


public class P1 {

	public static void main(String[] args) {
		
		//int x = 123; // initiolization
		 //long y = 112;
		 
		 //boolean z = true;
		 
		 //char symbol = 'A';
		 
		 //String name = "Ahmad omar abu alsamen";
				 
		//System.out.println("My number is " + y);
		//System.out.println("My number is " + z);
		//System.out.println("My number is " + symbol );
		
		//System.out.println(name);
		
		
		
	



//---------------------------------------------------------------------------------------------------------------------------V2 SWAP


//String a = "Water";
//String b = "Kool-Aid";
//String temp;

//temp = a;
//a = b;
//b = temp;

//System.out.println("a : " + a);
//System.out.println("b : " + b);



//----------------------------------------------------------------------------------------------------------------------------V3 User Input


//Scanner input = new Scanner(System.in);

//System.out.println("Enter You name lil Bro");
//String Name = input.nextLine();
//System.out.println("Lil Bro are your name is: " + Age);
//System.out.println("Lil Bro are your name is: " + Name);



//System.out.println("Enter Your Age Lil Bro");
//int Age = input.nextInt();
//System.out.println("Damn lil bro you are " + Age + " Years Old");


/*  if You want to make another scanner or input it does not going to work becouse you use the next line statment in the scanner so the last input will 
be /n which meen nothing to avoid this bropble you can but an empty input statment like this input.nextLine();     */




//---------------------------------------------------------------------------------------------------------------------------V4 EXPRESSIONS


// expression = oprands and operatores 
// operands = values, variables, numbers, quntity 
// operators = + - * / % 

int friends = 10;
friends = friends + 1;
//System.out.println(friends);

//     OR            //



int friend = 12;
friend++;
//System.out.println(friend);




double friend2 = 12;
friend2 =  friend2 / 5;
//System.out.println(friend2);


//----------------------------------------------------------------------------------------------------------------------------V5 GUI intro





//String Name = JOptionPane.showInputDialog("Enter Your Name");
//JOptionPane.showMessageDialog(null, "Hallow " + Name);



//int Age =  Integer.parseInt( JOptionPane.showInputDialog("Enter Your Age"));
//JOptionPane.showMessageDialog(null, "You are  " + Age + " Yers Old");


//----------------------------------------------------------------------------------------------------------------------------V6 Math Class



//double x = 3.14;
//double y = -10;


//double z = Math.max(x, y); // also there are min 
//System.out.println(z);


//double f = Math.abs(y); // also there are sqrt
//System.out.println(f);




//double a;
//double b;
//double c;

//Scanner input = new Scanner(System.in);


//System.out.println("Enter the First Line (a)");
//a = input.nextDouble();


//System.out.println("Enter the Second Line (b) to find the Hypotenuse");
//b = input.nextDouble();

//c = Math.sqrt((a*a) + (b*b));

//System.out.println("the Hypotenuse is: " + c);

//-------------------------------------------------------------------------------------------------------------------------V7 Random Numbers



	//Random random = new Random();


	//int x = random.nextInt(6)+1; // use +1 becouse if just 6 the max random number is going to be 5 or just write 7
	
	//boolean y = random.nextBoolean();
	
	//System.out.println(x);
	//System.out.println(y);


//--------------------------------------------------------------------------------------------------------------------------V8 If Statments 



//if statement = performs a block of code if it's condition evaluates to be true

		//int age = 75;
		
		//if(age==75) {
		//	System.out.println("Ok Boomer!");
		//}
		//else if(age>=18) {
		//	System.out.println("You are an adult!");
		//}
		//else if(age>=13) {
		//	System.out.println("You are a teenager!");
		//}
		//else {
		//	System.out.println("You are not an adult!");
		//}



//---------------------------------------------------------------------------------------------------------------------------V9 Switch Statments
		
		
		// Switch : statmetn that allaows a variable to be tested for equality against a list of values 


	// String Day = "Sunday";
	
	//switch(Day) {
	//case "Satarday": System.out.println("it it satarday");
	//break;
	
	//case "monday": System.out.println("it is monday");
	//break;
	
	//case "Sunday": System.out.println("it is Sunday");
	//break;
	
	//default: System.out.println("Bro that is not a day"); 
	
	//}


//--------------------------------------------------------------------------------------------------------------------------V10 Logic Operatores
	
	// logical operators = used to connect two or more expressions
			//
			//						&& = (AND) both conditions must be true
			// 						|| = (OR) either condition must be true
			//						! = (NOT) reverses boolean value of condition

	// -------------------------------- Example 1 --------------------------------
	/*
			int temp = 15;
			
			if(temp>30) {
				System.out.println("It is hot outside");
			}
			else if(temp>=20 && temp<=30) {
				System.out.println("It is warm outside");
			}
			else {
				System.out.println("It is cold outside");
			}

	*/
	// -------------------------------- Example 2 --------------------------------
	/*
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("You are playing a game! Press q or Q to quit");
			String response = scanner.next();
			
			if(!response.equals("q") && !response.equals("Q")) {
				System.out.println("YOu are still playing the game *pew pew*");
			}
			else {
				System.out.println("You quit the game");
			}
	*/	



//-------------------------------------------------------------------------------------------------------------------V11 While Loop

/*

Scanner input = new Scanner(System.in);


String name = "";

while(name.isBlank())
{
	System.out.println("enter your name");
	 name = input.nextLine();
}

*/


//------------------------------------------------------------------------------------------------------------------V12 For Loop


// for loop execute the bock of code limited amount of time 
/*

for(int i=0; i<= 10; i++)
{
	System.out.println(i);
}

*/

//------------------------------------------------------------------------------------------------------------------V13 Nested Loop

/*
Scanner input = new Scanner(System.in);

int rows;
int coloumns;
String number;


System.out.println("Enter number of rows");
rows = input.nextInt();

System.out.println("Enter number of coloumns");
coloumns = input.nextInt();

System.out.println("enter any symbol");  // solve the broplem by using next instid of next line
number = input.next();



for(int i = 0;i< rows;i++)
{
	
	
	for(int j=0; j< coloumns;j++)
	{
		System.out.print(number);
	}
	
	System.out.println( );
	
}
*/

//-------------------------------------------------------------------------------------------------------------V14 Arrays


/*

String[] cars = {"KIA","Tesla","Corvette"};




cars[0] = "Mustang";
//System.out.println(cars[0]);

for(int i=0; i< cars.length;i++)
{
	System.out.println(cars[i]);
}


// String[] CARs = new String[3]; // new way off creating array without assign 
//CARS[0] = "sss";

*/



//----------------------------------------------------------------------------------------------------------V15 2D arrays

/*

String[][] cars = new String[3][3];




cars[0][0] = "Kia";
cars[0][1] = "Corvette";
cars[0][2] = "Silverado";



cars[1][0] = "Mustang";
cars[1][1] = "Tesla";
cars[1][2] = "Mercadece";



cars[2][0] = "ferrari";
cars[2][1] = "911";
cars[2][2] = "lambo";



for(int i=0; i< cars.length; i++)
{
	System.out.println();
	for(int j=0; j<cars[i].length; j++)
	{
		System.out.print(cars[i][j] +" ");
		
	}
}

*/


//--------------------------------------------------------------------------------------------------------V16 String methods

/*
String name = "Ahmad";

boolean res = name.equals("ahmad");
System.out.println(res);

boolean res2 = name.equalsIgnoreCase("ahmad");
System.out.println(res2);
*/


//boolean result = name.equalsIgnoreCase("bro");
//int result = name.length();
//char result = name.charAt(0);
//int result = name.indexOf("o");
//boolean result = name.isEmpty();
//String result = name.toUpperCase();
//String result = name.toLowerCase();
//String result = name.trim();
//String result = name.replace('o', 'a');


//-------------------------------------------------------------------------------------------------------V17 Wrapper Classes

//wrapper class = 	provides a way to use primitive data types as reference data types
		//					reference data types contain useful methods
		//					can be used with collections (ex.ArrayList)
		
		//primitive		//wrapper
		//---------		        //-------
		// boolean		Boolean
		// char			Character
		// int			Integer
		// double		Double
		
		// autoboxing = the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes
		// unboxing = the reverse of autoboxing. Automatic conversion of wrapper class to primitive


		/*
		Boolean a = true;
		Character b = '@';
		Integer c = 123;
		Double d = 3.14;

		 */

//----------------------------------------------------------------------------------------------------V18 Array List


	/*
	// ArrayList = a resizable array.
	// Elements can be added or removed after cpmilation phase
	// store refrence data types


	ArrayList<String> food = new ArrayList<String>(); // to add a valued you need a function 
	
	
	food.add("Pizza");
	food.add("burger");
	food.add("HotDog");

	food.set(0, "Mansaf");
	food.remove(2);
	food.clear();
	

	for(int i=0; i< food.size();i++)
	{
		System.out.println(food.get(i));
	}




*/

//---------------------------------------------------------------------------------------------------V19 2D ArrayList

/*

ArrayList<ArrayList<String>> groceryList = new ArrayList();

ArrayList<String> bakeryList = new ArrayList();
bakeryList.add("pasta");
bakeryList.add("garlic bread");
bakeryList.add("donuts");

ArrayList<String> produceList = new ArrayList();
produceList.add("tomatoes");
produceList.add("zucchini");
produceList.add("peppers");

ArrayList<String> drinksList = new ArrayList();
drinksList.add("soda");
drinksList.add("coffee");

groceryList.add(bakeryList);
groceryList.add(produceList);
groceryList.add(drinksList);

System.out.println(groceryList);

*/

//--------------------------------------------------------------------------------------------------V20 for each loop




//String animals[] = {"Cat", "Dog", "Rat", "Bird"};


//for(String i : animals)
//{
//	System.out.println(i);
//}



//-------------------------------------------------------------------------------------------------V21 Methods


/*



HI();

int x =6;
int y =9;

int z = add(x,y);
System.out.println(z);

//---------------------------------

static void HI()
{
	System.out.println("Hi");
}



static int add(int x, int y)
{
	int sum;
	sum = x + y;
	
	return sum;
}



*/

//----------------------------------------------------------------------------------------------V22 Over Loaded Method

/*


static int add( int a, int b)
{
	return a + b;
}


static int add( int a, int b, int c)
{
	return a + b;
}


static double add( double a, double b, double c)
{
	return a + b;
}


*/


//----------------------------------------------------------------------------------------------Printf


//printf() = 	an optional method to control, format, and display text to the console window
		//				two arguments = format string + (object/variable/value)
		//				% [flags] [precision] [width] [conversion-character]
		/*		
		boolean myBoolean = true;
		char myChar = '@';
		String myString = "Bro";
		int myInt = 50;
		double myDouble = 1000;
		*/
			
		// [conversion-character]
		//System.out.printf("%b",myBoolean);
		//System.out.printf("%c",myChar);
		//System.out.printf("%s",myString);
		//System.out.printf("%d",myInt);
		//System.out.printf("%f",myDouble);
		
		//[width]
		// minimum number of characters to be written as output
		//System.out.printf("Hello %10s",myString);
		
		//[precision]
		// sets number of digits of precision when outputting floating-point values
		//System.out.printf("You have this much money %.1f",myDouble);
		
		// [flags]
		// adds an effect to output based on the flag added to format specifier
		// - : left-justify
		// + : output a plus ( + ) or minus ( - ) sign for a numeric value
		// 0 : numeric values are zero-padded
		// , : comma grouping separator if numbers > 1000
		
		//System.out.printf("You have this much money %,f",myDouble);



//----------------------------------------------------------------------------------------------Final KeyWord

/*
final double pi = 3.14159;

//pi = 4; cant work becouse it is final

System.out.println(pi);
*/

//---------------------------------------------------------------------------------------------Objects OOP ==> object orianted programming 

/*
// objects: is an instance of a class that may contain attributes or methods 
// example (phone, desk, computer, coffee cup)
 


//Car mycar = new Car();
//Car mycar2 = new Car();
	
	System.out.println(mycar.color);
	System.out.println(mycar.model);
	
	mycar.drive();
	mycar.brake();
System.out.println();
	
	System.out.println(mycar2.color);// Gives the Same input becouse you dont have constructors
	System.out.println(mycar2.model);


*/


//------------------------------------------------------------------------------------------- V26 Constructors

/*
 
 
	Human human = new Human("Rick",65,70.0);
	
	
	Human human2 = new Human("Ahmad", 12, 55.0);
	
	System.out.println(human.name);

*/



//------------------------------------------------------------------------------------------V27 Variable scope



// local objects:   // dicalred inside a method 
					// visable only on that method


// Global objects:  // declared outside a methode but within a class
					// visable to all parts of a class




//DiceRoller Dice = new DiceRoller();


//----------------------------------------------------------------------------------------V28 overloaded constructor

/*


Pizza pizza = new Pizza("thicc crust","tomato","mozzerella","pepperoni");

System.out.println("Here are the ingredients of your pizza: ");
System.out.println(pizza.bread);
System.out.println(pizza.sauce);
System.out.println(pizza.cheese);
System.out.println(pizza.topping);

*/

//---------------------------------------------------------------------------------------toString method



//toString() = special method that all objects inherit, 
//    that returns a string that "textually represents" an object.
//    can be used both implicitly and explicitly


/*
Car2 car2 = new Car2();


System.out.println(car2.toString());

// or

System.out.println(car2);


*/

//-------------------------------------------------------------------------------------- Array Of Objects


/*

Food[] refregiator = new Food[3];

Food food1 = new Food("Pizza");

Food food2 = new Food("Koopa");


refregiator[0] = food1;
refregiator[1] = food2;

System.out.println(refregiator[0].name);

*/

//------------------------------------------------------------------------------------- objects Passing


/*

	Garage garage = new Garage();
	
	Car3 car = new Car3("BMW");
	Car3 car2 = new Car3("Tesla");
	
	
	garage.park(car2);

*/


//-------------------------------------------------------------------------------------V32 Static Keyword


// Static :modifier. a single copy of a method/ variable is created and shared 
// the class owns the static member 


/*


Friend friend1 = new Friend("Sponegbob");
Friend friend2 = new Friend("Patrick");
Friend friend3 = new Friend("Patrick");

System.out.println(Friend.numberOfFriends);
}
}
//**********************************************
public class Friend {


String name;

static int numberOfFriends;

Friend(String name){
this.name=name;
numberOfFriends++;
}	
}//**********************************************



*/

//----------------------------------------------------------------------------------Inheritance 


/*
//inheritance = 	the process where one class acquires,
		//					the attributes and methods of another.
		
		Car car = new Car();
		
		car.go();
		
		Bicycle bike = new Bicycle();
		
		car.go();
		bike.stop();
		
		System.out.println(car.doors);
		System.out.println(bike.pedals);
				
	}
}
//*************************************
public class Vehicle{
double speed;

void go(){
System.out.println("This vehicle is moving");
}
void stop(){
System.out.println("This vehicle is stopped");
}
}
//*************************************
public class Car extends Vehicle{
int wheels = 4;
int door = 4;
}
//*************************************
public class Bicycle extends Vehicle{
int wheels = 2;
int pedals = 2;
}
//*************************************

*/

//------------------------------------------------------------------------------Method Overriding


/*
// method overriding = 	Declaring a method in sub class,
//						which is already present in parent class.
//						done so that a child class can give its own implementation

Animal animal = new Animal();
Dog dog = new Dog();

dog.speak();
		
}
}
//*******************************************
public class Animal {



void speak() {
System.out.println("The animal speaks");
}
}//*******************************************
public class Dog extends Animal{

@Override
void speak() {
System.out.println("The dog goes *bark*");
}
}
//*******************************************



*/

//-----------------------------------------------------------------------------Super Key Word


//Hero hero1 = new Hero("Ahmad", 22, "Lazer Eyes");

//System.out.println(hero1.name);

//----------------------------------------------------------------------------V36 Abstraction 


//----------------------------------------------------------------------------Access modifiers 



/*
 * 
public: visible in all classes in all packages
protected: visible to all classes in the same package or classes in other packages that are a subclass
default: visible to all classes in the same package 
private: visible only in the same class
 * 
 * 
 */

//---------------------------------------------------------------------------Encapsulation 


 /*
//Encapsulation = 	attributes of a class will be hidden or private, 
		//					Can be accessed only through methods (getters & setters)
		//					You should make attributes private if you don't have a reason to make them public/protected
		
		Car car = new Car("Chevrolet","Camaro",2021);
		
		car.setYear(2022);
		
		System.out.println(car.getMake());
		System.out.println(car.getModel());
		System.out.println(car.getYear());
		
	}

}
//***********************************************
public class Car {

	
	private String make;
	private String model;
	private int year;
	
	Car(String make,String model,int year){
		this.setMake(make);
		this.setModel(model);
		this.setYear(year);
	}
	
	public String getMake() {
		return this.make;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public int getYear() {
		return this.year;
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
		
}
//***********************************************

*/

//---------------------------------------------------------------------------Interface











}
}