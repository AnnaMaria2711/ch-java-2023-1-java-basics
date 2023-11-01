public class Arrays {
    public static void main(String[] args) {


        String name = "Anni";
        String name2 = "dkfnslf";
        String name3 = "hehe";
        String name4 = "h";

        String[] names = new String[3];
        names[0] = "Anni";
        names[1] = "hehe";
        names[2] = "h";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);


        int[] kontoAuszug = new int[5];
        kontoAuszug[0] = 9;
        kontoAuszug[1] = 8;
        kontoAuszug[2] = 91;
        kontoAuszug[3] = 32;
        kontoAuszug[4] = 22;





        for(int i = 0; i < 10; i++) {
            System.out.println("Schleifendurchgang " + i);
        }
        for(int i = 0; i < kontoAuszug.length; i++){
            System.out.println(kontoAuszug[i]);

        }

    }
}