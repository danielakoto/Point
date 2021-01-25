//Daniel Akoto
//Lab#3 COSC 237#001
//2-26-2020
import java.util.*;
public class pointClass{
  public static void main (String[]args){
    Scanner kb = new Scanner(System.in);
    Point p = new Point(0,0);
    Point p2 = new Point(3,10);
    Point p3 = new Point(6,10);
    //Point x = new Point();
    //BEGIN
    System.out.println("---After declaration, constructors invoked--- Using toString():");
    System.out.println("The first point is " + p.toString());
    System.out.println("The second point is " + p2.toString());
    System.out.println("The third point is " + p3.toString());
    
    //POINTS Vertical and Horizontal...
    if(p2.isVertical(p3))
      System.out.println("Second point " + p2.toString()+ " lines up vertically with third point" + p3.toString());
    else
      System.out.println("Second point " + p2.toString()+ " doesn't line up vertically with third point" + p3.toString());
    if(p2.isHorizontal(p3))
      System.out.println("Second point " + p2.toString()+ " lines up horizontally with third point" + p3.toString());
    else
      System.out.println("Second point " + p2.toString()+ " doesn't line up horizontally with third point" + p3.toString());
    
    //set your own points...
    System.out.println("Enter the x-coordinate for first point: ");
    int x = getInt(kb);
    //Validation
    while(x < 0){
      System.out.println("ERROR! Should be positive.");
      x = getInt(kb);
    }
    System.out.println("Enter the y-coordinate for first point: ");
    int y = getInt(kb);
    //Validation
    while(y < 0){
      System.out.println("ERROR! Should be positive.");
      y = getInt(kb);
    }
    System.out.println("Enter the x-coordinate for second point: ");
    int x2 = getInt(kb);
    //Validation
    while(x2 < 0){
      System.out.println("ERROR! Should be positive.");
      x2 = getInt(kb);
    }
    System.out.println("Enter the y-coordinate for second point: ");
    int y2 = getInt(kb);
    //Validation
    while(y2 < 0){
      System.out.println("ERROR! Should be positive.");
      y2 = getInt(kb);
    }
    Point pFirst = new Point(x, y);
    Point pSecond = new Point(x2, y2);
    System.out.println("First point (after call to set) is " + pFirst);
    System.out.println("Second point (after call to set) is " + pSecond);
    //Distance from origin
    System.out.printf("Distance from origin for first point = %,.2f%n", pFirst.distanceFromOrigin());
    System.out.printf("Distance from origin for second point = %,.2f%n", pSecond.distanceFromOrigin());
    System.out.printf("Distance between first point and second point = %,.2f%n", pFirst.distance(pSecond));
    
    //translate time
    System.out.println("Enter the x-coordinate shift for first point: ");
    //FIRST SHIFT POINTS...
    int shiftX = getInt(kb);
    //Validation
    while(shiftX < 0){
      System.out.println("ERROR! Should be positive.");
      shiftX = getInt(kb);
    }
    System.out.println("Enter the y-coordinate shift for first point: ");
    int shiftY = getInt(kb);
    //Validation
    while(shiftY < 0){
      System.out.println("ERROR! Should be positive.");
      shiftY = getInt(kb);
    }
    Point pShift = new Point(shiftX, shiftY);
    System.out.println("First point (after call to translate " + pFirst.toString() + " is " + pShift.translate(pFirst));
    
    //translate time
    System.out.println("Enter the x-coordinate shift for second point: ");
    //SECOND SHIFT POINTS...
    shiftX = getInt(kb);
    //Validation
    while(shiftX < 0){
      System.out.println("ERROR! Should be positive.");
      shiftX = getInt(kb);
    }
    System.out.println("Enter the y-coordinate shift for second point: ");
    shiftY = getInt(kb);
    //Validation
    while(shiftY < 0){
      System.out.println("ERROR! Should be positive.");
      shiftY = getInt(kb);
    }
    Point pShift2 = new Point(shiftX, shiftY);
    System.out.println("Second point (after call to translate " + pSecond.toString() + " is " + pShift2.translate(pSecond));
    
    //Call to equals...
    if(pFirst.equals(pSecond))
      System.out.println("---Call to equals: The 2 points are equal.");
    else
      System.out.println("---Call to equals: The 2 points are NOT equal.");
    
    //Calls to copy...
    System.out.println("---Calls to copy and print--- ");
    pFirst.copy(pSecond);
    System.out.println("First point (after call to copy) is " + pFirst);
    pSecond.copy(pFirst);
    System.out.println("Second point (after call to copy) is " + pSecond);
    
    //Call to equals after copy...
    if(pFirst.equals(pSecond))
      System.out.println("---Call to equals after call to copy: The 2 points are equal.");
    else
      System.out.println("---Call to equals after call to copy: The 2 points are NOT equal.");
  } 
  public static int getInt(Scanner kb){
    while(!kb.hasNextInt()){
      System.out.println("Not an integer, try again!");
      kb.next();
    }
    return kb.nextInt();
  }
}