class Box1
{
double width;
double height;
double depth;
}
class box
{
public static void main(String args[])
{
Box mybox1 = new Box();
Box mybox2 = new Box();
double vol; 

mybox1.width = 10;
mybox1.height = 20;
mybox1.depth = 15;

mybox2.width = 40;
mybox2.height = 12;
mybox2.depth = 5;

vol = mybox1.width * mybox1.height * mybox1.depth;
System.out.println("Volume is" + vol);

vol = mybox2.width * mybox2.height * mybox2.depth;
System.out.println("Volume is" + vol);
}
}