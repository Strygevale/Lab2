package password.generator;
import java.util.*;
import java.lang.*;
public class Main {
        public static void main (String[] args) throws java.lang.Exception
        {
            String str;
            Scanner in = new Scanner(System.in);
            System.out.println("Задайте строку!");
            str = in.nextLine();
            Map<Character, Integer> map = new HashMap<Character, Integer>();
            for ( int i = 0; i < str.length(); i++ )
            {
                Integer n = map.get( str.charAt(i) );
                if ( n == null ) map.put( str.charAt(i), 1 );
                else map.put( str.charAt(i), ++n );
            }
            System.out.println(map);
        }
    }