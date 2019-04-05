/**
  exercise Comparable types
 */

public class UserOfComparability {

    public static void main(String[] commandLine) {
        System.out.println( System.lineSeparator()
                          + "Point comparisons");

        // Point vs. itself
        Point p0 = new Point( 3., 4.);
        report( "Point vs. itself", p0, p0, "0");

        // // Point vs. its reflection about y = x
        report( "Point vs. its reflection about y = x"
                          , p0, new Point( 4., 3.), "0");

        // // Point vs. point closer to origin
        report( "Point vs. point closer to origin", p0
                          , new Point( 1., 2.), "positive int");

        // // Point vs. distant point
        report( "Point vs. distant point", p0
                          , new Point( 100., 2.), "negative int");
        System.out.println( "---- end of Point comparisons ----");

        System.out.println( System.lineSeparator()
                          + "Date comparisons");

        Date today = new Date(2019,4,4);

        report ("Date vs self", today, today, "0");
        report ("Date vs future year", today, new Date(2020,4,4), "-1");
        report ("Date vs past year", today, new Date(2018,4,4), "1");
        report ("Date vs future month", today, new Date(2019,5,4), "-1");
        report ("Date vs past month", today, new Date(2019,3,4), "1");
        report ("Date vs future day", today, new Date(2019,4,5), "-1");
        report ("Date vs past day", today, new Date(2019,4,3), "1");

        //report ("Date vs past day", new Dog(), new Dog(), "error");

        //report ("Date vs Point", p0, today, "error");
        //java.lang.ClassCastException: Date cannot be cast to Point
    }


    /**
      Print the results of comparing two entities.
     */

     private static void report
       ( String description
       , Comparable a
       , Comparable b
       , String expect
       ) {
         System.out.println( description);

         // check
         System.out.println(
             a + " compareTo " + b + ": "
           + a.compareTo( b)
             /* eventually expecting a compiler warning:
               warning: [unchecked] unchecked call to compareTo(T) as a member of the raw type Comparable
               where T is a type-variable:
                 T extends Object declared in interface Comparable
              */

           + " ...expecting " + expect
           + System.lineSeparator());
      }
}
