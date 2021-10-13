package BT_mang;

public class Test2 {
    public static void main(String[] args) {
        boolean [] [] suHao;
        int [][] bapCai = {
                {1,2,3},
                {4,5,6},
                {7,8,12}
        };
        int [] rau = {1,2,3,40};
        for (int i = 0; i< bapCai.length; i++) {
            for (int j = 0; j < bapCai[0].length; j++) {
                System.out.print(bapCai[i] [j] + " ");
            }
            System.out.println(" ");
        }
        for (int rau2 : rau) {
            System.out.print(rau2);
        }
        for (int [] rau3 : bapCai) {
            System.out.print("\n"+ rau3[0] + " ");
            System.out.print( rau3[1]+ " ");
            System.out.print( rau3[2] + "\n");
        }
        System.out.println("=================================");
        for (int [] rau4 : bapCai) {
            for (int rau5 : rau4) {
                System.out.print(rau5 + " ");
            }
            System.out.println("");
        }

    }
}
