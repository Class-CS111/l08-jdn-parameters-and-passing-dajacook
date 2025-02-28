// PARTNER NAME: Daniel Cook
// PARTNER NAME: 
// CS111 SECTION #: 3033
// DATE: February 27, 2025

public class Main
{
    public static void main(String[] args)
    {
        //Declaration
        int month = 0;
        int day = 0;
        int year = 0;
        int jdnDate = 0;

        month = 8;
        day = 26;
        year = 1918;
        
        jdnDate = Main.calcJulianDate(month, day, year);
        System.out.println("Katherine Johnson's Birthday: " + jdnDate);
        
        month = 10;
        day = 15;
        year = 1993;

        jdnDate = Main.calcJulianDate(month, day, year);
        System.out.println("The Julian date for my birthday is: " + jdnDate);

        month = 7;
        day = 9;
        year = 1868;

        jdnDate = Main.calcJulianDate(month, day, year);
        System.out.println("The Julian date for the day the 14th amendment was ratified is: " + jdnDate);

    }
        // Description: calculate julian date given month and year
        // Precondition: we need valid integers for month, day, and year, month < 12
        // Postcondition: return an integer of the calculated julian
        public static int calcJulianDate (int month, int day, int year)
        {
            int a = 0;
            int m = 0;
            int y = 0;
            int jdnToday = 0;
            
            a = (14 - month) / 12;
            m = month + (12 * a) - 3;
            y = year + 4800 - a;
            jdnToday = day + ((153 * m + 2) / 5 + (365 * y) + (y / 4) - (y / 100) + (y / 400) - 32045);
            
            return jdnToday;
        } 
    }
