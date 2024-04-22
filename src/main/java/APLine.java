public class APLine
{
  private int a,b,c;
  /* your code here */
  APLine(int a1,int b1,int c2){
    a =a1; 
    b= b2;
    c=c2;
  }

  public double getSlope(){
    return -(double)(a)/b;
  }
  public boolean isOnLine(int x, int y){
    return a*x + b*y +c =0;
  }
}
