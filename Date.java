/**
  Represent a date
 */
public class Date implements Comparable {
    private int y,m,d;


    // -------- previously-written code --------
    // constructor
    public Date( int y, int m, int d) {
        this.y = y;
        this.m = m;
        this.d = d;
    }

    // checks for most future date
    public int compareTo (Object obj) {

      if (y > ((Date) obj).y)
      return 1;

      else if (y < ((Date) obj).y)
      return -1;

      else if (m > ((Date) obj).m)
      return 1;

      else if (m < ((Date) obj).m)
      return -1;

      else if (d > ((Date) obj).d)
      return 1;

      else if (d < ((Date) obj).d)
      return -1;

      else
      return 0;
    }

    /**
      @return a string representation of this instance
     */
    public String toString() {
        // ISO 8601 rules!
        return String.format("%4d-%02d-%02d",y, m, d);
    }

}
