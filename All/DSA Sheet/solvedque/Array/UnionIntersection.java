import java.io.*;
import java.util.*;
public class UnionIntersection {
    static void union(int a[], int b[], int m, int n){
        HashSet<Integer> s=new HashSet<>();
        for(int i=0; i<m; i++){
            s.add(a[i]);
        }
        for(int i=0; i<n; i++){
            s.add(b[i]);
        }
        System.out.println(s.size());
    }
    static void intersection(int a[], int b[], int m, int n){
        HashSet<Integer> hs= new HashSet<>();
        HashSet<Integer> hs1= new HashSet<>();

        for(int i=0; i<m; i++){
            hs.add(a[i]);
        }
        for(int i=0; i<n; i++){
            if(hs.contains(b[i]))
            hs1.add(b[i]);
            
        }System.out.println(hs1.size());
    }
    
      public static void main(String[] args){
          int a[]={4, 3, 7, 1, 9, 5};
          int b[]={3, 1, 5, 0};
          int m=a.length;
          int n=b.length;
          Arrays.sort(a);
          Arrays.sort(b);
          union(a, b, m, n);
          intersection(a, b, m, n);
          
      }
    }