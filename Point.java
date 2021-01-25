//Daniel Akoto
//Lab#4 COSC 237#001
//2-26-2020

public class Point{
  private int x;
  private int y;
  
  public Point(){
    x = 0;
    y = 0;
  }
  public Point(int x1, int y1){
    x = x1;
    y = y1;
  }
  public void setPoint(int x1, int y1){
    x = (x1>=0)?x:0;
    y = (y1>=0)?y:0;
  }
  public int getX(){
    return x;
  }
  public int getY(){
    return y;
  }
  public void  printPoint(){
    System.out.println("("+x+","+y+")");
  }
  public String toString(){
    return "("+x+","+y+")";
  }
  public boolean equals(Point p){
    return x==p.x&&y==p.y;
  }
  public void copy(Point p){
    x = p.x;
    y = p.y;
  }
  public Point getCopy(){
    return new Point(x,y);
  }
  public double distanceFromOrigin(){
    return Math.sqrt((x*x)+(y*y));
  }
  public double distance(Point thePoint){
    int distanceX = thePoint.x - x;
    int distanceY = thePoint.y - y;
    return Math.sqrt((distanceX*distanceX)+(distanceY*distanceY));
  }
  public String translate(Point thePoint){
    x = x+thePoint.x;
    y = y+thePoint.y;
    return "("+x+","+y+")";
  }
  public boolean isHorizontal(Point thePoint){
    return x == thePoint.x;
  }
  public boolean isVertical(Point thePoint){
    return y == thePoint.y;
  }
  public int slope(int x, int y){
    return (((y-getY())^2)/((x-getX())^2));
  }
}