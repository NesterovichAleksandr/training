package oop.inheritance.i2;

class Insect {
    private int i = 9;                                                    //[9]
    int j;                                                                //[10]
    Insect() {                                                            //[8]
        System.out.println("i = " + i + ", j = " + j);                    //[11]
        j = 39;                                                           //[12]
    }
    private static int x1 = printInit("static Insect.x1 initialized"); //[2]
    static int printInit(String s) {                                     //[3]
        System.out.println(s);
        return 47;
    }
}

class Beetle extends Insect {
    private int k = printInit("Beetle.k initialized");                 //[13]
    private Beetle() {                                                   //[7]
        System.out.println("k = " + k);                                  //[14]
        System.out.println("j = " + j);                                  //[15]
    }
    private static int x2 = printInit("static Beetle.x2 initialized"); //[4]
    public static void main(String[] args) {                             //[1]
        System.out.println("Beetle constructor");                        //[5]
        Beetle b = new Beetle();                                         //[6]
    }
}
