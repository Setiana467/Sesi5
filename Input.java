package sesi5;

import java.util.Scanner;

public class Input {
    public static void Input(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("nama dosen : ");
        String nama = sc.nextLine();
        System.out.print("alamat dosen : ");

        String alamat = sc.nextLine();

        Dosen dosen1 = new Dosen(nama, alamat);

        for(int i = 0; i < 3; i++){
            System.out.print("masukan nama mata kuliah yang diimput: ");
            String matkul = sc.nextLine();
            dosen1.addCourse(matkul);
        }

        System.out.println(dosen1);

    }
}
