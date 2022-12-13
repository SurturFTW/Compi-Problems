class q7{
    static isLeapYear(int year){    //static void isLeapYear(int year){
        boolean isLeap;
        if(year % 4 == 0){
            if(year % 100 == 0)    //if(year % 100 == 0){
                if(year % 400 == 0){
                    isLeap = true;
                }else{
                    isLeap = false;
                }
            }else{
                isLeap = true;
            }
        }else{
            isLeap = false;
        }

        if(isLeap)
            system.out.println("leap year");    //System.out.println("leap year");
        else
            system.out.println("Not a leap year");  //System.out.println("Not a leap year");
    }

    public static void main(String[] args) {
        isLeapYear(1992);
        isLeapYear(2000);
        isLeapYear(2001);
        isLeapYear(2002);
        isLeapYear(2004);
    }
}

//Medium