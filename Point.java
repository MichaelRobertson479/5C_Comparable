/**
  Represent a point, using Cartesian coordinates
 */
public class Point implements Comparable {
    private double xcor;
    private double ycor;

    /**
      @return  a negative integer, zero, or a positive integer
      depending on whether this Point is closer,
      equidistant, or farther than the Point referred to
      by the parameter.
     */
    public int compareTo( Object otherObj){
        /* Use the Pythagorean theorem.
           Double.compare helped me.
           If the math is a problem, use a simpler
           relationship, like "higher is bigger"
           and change the tests accordingly */

        double dist1 = (xcor * xcor) + (ycor * ycor);
        double dist2 = (((Point) otherObj).xcor * ((Point) otherObj).xcor) + (((Point) otherObj).ycor * ((Point) otherObj).ycor);

        if (dist1 > dist2)
        return 1;

        else if (dist1 < dist2)
        return -1;

        else
        return 0; // temp: all Points are One
    }

    // -------- previously-written code ----------
    // constructor
    public Point( double xcor, double ycor) {
        this.xcor = xcor;
        this.ycor = ycor;
    }

    /**
      @return a string representation of this instance
     */
    public String toString() {
        return "(" + xcor + "," + ycor + ")";
    }

}
