import java.util.*;
public class SL08 {
  public static void main (String [] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    
    for(int i=1;i<=n;i++){
      if(i==1 || i==n){
        for(int j=1;j<=m;j++){
          System.out.print(j);
        }
      } else {
        for(int j=1;j<=m;j++){
          if(j==1 || j==m){
            System.out.print(j);
          } else {
            System.out.print(" ");
          }
          
        }
      }
      System.out.println();
    }
    
    
  }
  
  
}