import java.util.*;

public class SomaColunaMatriz {
    public static void main(String[] args) {
        int mat[][] = new int[4][3];
        int soma = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o valor da posição [" + i + "," + j + "]: ");
                mat[i][j] = sc.nextInt();
            }
        }

        for (int j = 0; j < 3; j++) {
            soma = 0;
            for (int i = 0; i < 4; i++) {
                soma = soma + mat[i][j];
            }
            System.out.println("Soma da coluna " + j + " :" + soma + "\n");
        }
        sc.close();
    }
}
