package inflearn.java.algorithm.problem.solving.beginner.ch9;

/**
 * 6. 친구인가? (Disjoint-Set : Union & Find)
 */
public class IsFriend {
  static int[] umf;

  static int Find(int v){
    if(umf[v] == v){
      return v;
    }
    return umf[v] = Find(umf[v]);
  }

  static void Union(int a,int b){
    int fa = Find(a);
    int fb = Find(b);

    if(fa != fb){
      umf[fa] = fb;
    }
  }

  public static void main(String[] args) {
    int n = 9;
    int m = 7;

    umf = new int[n+1];

    for (int i = 1; i <= n; i++) {
      umf[i] = i;
    }

    int a,b;
    a=1; b=2;
    Union(a,b);
    a=2; b=3;
    Union(a,b);
    a=3; b=4;
    Union(a,b);
    a=1; b=5;
    Union(a,b);
    a=6; b=7;
    Union(a,b);
    a=7; b=8;
    Union(a,b);
    a=8; b=9;
    Union(a,b);

    int fa = 3;
    int fb = 8;

    int find = Find(fa);
    int find1 = Find(fb);

    if (find == find1) {
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }


  }
}
