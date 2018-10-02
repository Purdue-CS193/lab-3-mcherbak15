public class MathUtils {
    /**
     * divideNumbers -- a / b
     * Divide a by b and return the result
     */
    public static double divideNumbers(double dividend, double divisor) {
        /* Do some casual division ... Super easy ... Shouldn't be any problems here */
        double res = dividend / divisor;
        /* Return the DEFINITELY CORRECT result */
        return res;
    }

    /**
     * raiseToPower -- (base)^(exp)
     * Raise the number base to power exp
     */
    public static double raiseToPower(double base, double exp) {
        /* Set initial result to be just the number */
        double res;


        // sorry sean, I couldn't read your spaghetti code with nasty if statements
        // and for loops... so I deleted it ALL and used a handy method from the
        // math library! Sorry bout it.
        res = Math.pow(base, exp);

        return res;
    }    
}