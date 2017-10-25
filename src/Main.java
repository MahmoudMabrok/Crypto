/**
 * v1.0
 * Crypto
 * Encryption
 * 1- normalize (remove spaces and special char , UpperCase )
 * 2-Obify add ob before vowel char
 * 3- caeserfiy --shift char based on n
 *
 * Decryption
 * 1-decaeserify :: remove shifts
 * 2-deObify  :: remove OB
 *
 *
 * Created by mo3tamed on 8/27/17.
 * last mod 10/25/2017
 */
public class Main {


    public static String normalize(String  val )
    {
        val = val.toUpperCase() ;
        val = val.replaceAll( " ", "") ;
        //val=val.trim() ;  ???
        val = val.replaceAll("[.,:;\"!?()]" , "") ;

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

    public static String caeserify (String val  , int n  )
    {

        val = normalize(val) ;
        val = obify(val ) ;
        char[] value =val.toCharArray() ;
        for (int i = 0; i < val.length(); i++) {
            if ( (value[i] + n ) >= 'A')  //n + or -
            value[i] =(char) ( 'A' +   (((int)value[i]+n) -(int)'A' )%26  ) ; //i want to get offset from a by (get difference between (new $ a)  modular by  26 )
            else
            {
                value[i] = (char) (  'Z' +  (1+ (value[i]-'A' ) + n )  ) ;
            }
        }
        String s = new String(value);
        return  s ;


    }
    public static String deObify (String val )
    {
            int index = 0 ;
            StringBuilder sb = new StringBuilder(val) ;
            while (sb.indexOf("OB")>= 0 )
            {
                index = sb.indexOf("OB") ;
                sb.delete(index ,index +2) ;//index ,index+1 only index+2 excluded
            }
            return  sb.toString() ; 

    }
    public static String decaeserify(String val  , int n )
    {
        n*=-1;  //to remove shift just back track !!!
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
        s=deObify(s) ;

        return  s.toLowerCase() ;


    }


}
