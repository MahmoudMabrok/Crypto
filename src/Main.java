/**
 * this is
 * Created by mo3tamed on 8/27/17.
 */
public class Main {


    public static void main(String[] args) {

     String s = "This is some\"really\"great. (Text)!?)" ;
       String re =  normalize(s) ;
      /*  System.out.println(s);


        System.out.println(caeserify("B" ,-1 ));
*/

        System.out.println(obify("ASDDSYHUILKO"));

    }

    public static String normalize(String  val )
    {
        val = val.toUpperCase() ;
        System.out.println(val);
        val = val.replaceAll( " ", "") ;
        //val=val.trim() ;
        System.out.println(val);
        val = val.replaceAll("[.,:;\"!?()]" , "") ;
        System.out.println(val);




        return val;

    }
    public static String obify (String val )
    {
        StringBuilder sb = new StringBuilder() ;

        for (int i = 0; i < val.length(); i++) {
            if (val.charAt(i) == 'A' ||
            val.charAt(i) == 'E' ||
            val.charAt(i) == 'O' ||
            val.charAt(i) == 'I' ||
            val.charAt(i) == 'U' ||
            val.charAt(i) == 'Y') {
                  sb.append("OB") ;
                  sb.append(val.charAt(i)) ;
            }else
                  sb.append(val.charAt(i)) ;
        }


        return  sb.toString() ;

    }

    public static String caeserify (String val  , int n )
    {
         char[] value =val.toCharArray() ;
        for (int i = 0; i < val.length(); i++) {
            if ( (value[i] + n ) >= 'A')
            value[i] =(char) ( 'A' +   (((int)value[i]+n) -(int)'A' )%26  ) ; //
            else
            {
                value[i] = (char) (  'Z' +  (1+ (value[i]-'A' ) + n )  ) ;
            }
        }
        String s = new String(value);
        return  s ;


    }


}
