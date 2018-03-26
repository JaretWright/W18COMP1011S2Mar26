package w18comp1011s2mar26;

import java.util.function.Predicate;

/**
 *
 * @author JWright
 */
public class PWTester implements Predicate
{
    @Override
    public boolean test(Object t)
    {
        String pw= null;
        pw = (String) t;
        return pw.length() >= 8;
    }
}
