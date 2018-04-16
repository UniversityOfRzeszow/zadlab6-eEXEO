package zad3;

public class Complex 
{
    static public double module(double a, double b)
    {
        return Math.sqrt((a*a)+(b*b));
    }
    
    static public double angle(double mod, double angle)
    {
        double cos = mod / module(mod, angle);
        double sin = angle / module(mod, angle);

        if (Math.toDegrees(Math.asin(sin)) > 0 && Math.toDegrees(Math.acos(cos)) > 0) 
        {
            return Math.toDegrees(Math.asin(sin));
        }else if (Math.toDegrees(Math.asin(sin)) > 0 && Math.toDegrees(Math.acos(cos)) < 0)
        {
            return Math.toDegrees(Math.asin(sin) + (Math.PI / 2));
        }else if (Math.toDegrees(Math.asin(sin)) < 0 && Math.toDegrees(Math.acos(cos)) < 0)
        {
            return Math.toDegrees(Math.asin(sin) + (Math.PI * (3 / 2)));
        }else
        {
            return Math.toDegrees(Math.asin(sin) + (Math.PI * 2));
        }
    }
    
    static public double coupling(double i)
    {
        return -i;
    }
    
    static public String alglec(double a, double b)
    {
        return "postac wykladnicza: " + module(a, b) + "*e^(" + angle(a, b) + "*i)";
    }
    
    static public String lecalg(double a, double b)
    {
        return "postac algebraiczna: " + (a * Math.cos(Math.toRadians(b))) + "+(" + (a * Math.sin(Math.toRadians(b))) + ")i";
    }
    
    static public double lecsum(double moda, double anga, double modb, double angb)
    {
        Math.toRadians(anga);
        Math.toRadians(angb);
        double a = moda * Math.cos(anga) + moda * Math.cos(angb);
        double b = moda * Math.sin(angb) + modb * Math.sin(angb);
        return angle(a, b);
    }
    
    static public String lecdiv(double moda, double anga, double modb, double angb)
    {
        double mod = moda / modb;
        double ang = anga - angb;
        return "dzielenie: " + mod + " * e^" + ang + "i)";
    }
    
    static public String algsum(double ai, double bi, double aj, double bj)
    {
        return "dodawanie: " + (ai + aj) + " + " + (bi + bj) + "i";
    }
    
    static public String algdiv(double ai, double bi, double aj, double bj)
    {
        return "dzielenie: " + (ai * aj - bi * bj) / (Math.pow(aj, 2) + Math.pow(bj, 2)) + " + " + (ai * (-bj) + bi * aj) / (Math.pow(aj, 2) + Math.pow(bj, 2)) + "i";

    }
    
    static public String algmul(double ai, double bi, double aj, double bj)
    {
        return "mnozenie: " + (ai * aj - bi * bj) + " + " + (aj * bi + ai * bj) + "i";
    }
}
