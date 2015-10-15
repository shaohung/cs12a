//exacty.java
class exacty {
  public static void main (String[] args) {
    System.out.println ("t      v      y      yexact");

    double a = -9.8, v = 0.0, y = 0.0, t = 0, yexact, oldt = 0, oldv, oldy, avgv;

    yexact = 0.5 * -9.8 * t * t;

    System.out.println (t+"    "+v+"    "+y+"    "+yexact);

    while (t >= 0 && t <= 101) {
      //t = t/10.;
      oldv = v;
      oldy = y;
      v = oldv + a * (t - oldt);
      avgv = (v + oldv) / 2.;
      y = oldy + avgv * (t - oldt);
      yexact = 0.5 * -9.8 * t * t;
      v = Math.round(v);
      y = Math.round(y);
      yexact = Math.round(yexact);
      //t = Math.round(t);
      if (t%1 < 0.01) {
        System.out.println (t+"    "+v+"    "+y+"    "+yexact);
      }
      oldt = t;
      t = t + 0.1;
    }
  }
}
