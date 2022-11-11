package sesi5;

import java.util.ArrayList;

public class Dosen extends Objek{
    private int jumlahmatkul;
    private ArrayList<String> matkuList;

    public Dosen(String name, String address){
        super(name, address);
        jumlahmatkul = 0;
        matkuList = new ArrayList<>();
    }

    public boolean addCourse(String course){
        //Kalau di dalam arraylist ada yang sama maka matkul sudah ada
        if(matkuList.contains(course)){
            System.out.println("matkul sudah ada");
            return false;
        }

        //menambahkan
        jumlahmatkul++;
        matkuList.add(course);
        return true;
    }

    public boolean removeCourse(String course){
        //kalau dalam arraylist tak ada course maka tak bisa menghapus matkul
        if(!matkuList.contains(course)){
            System.out.println("tidak ada matkul yang akan dihapus");
            return false;
        }

        //jika ada maka dihapus
        jumlahmatkul--;
        matkuList.remove(course);
        return true;
    }

    public int getjumlahmatkul() {
        return jumlahmatkul;
    }

    public String toString(){
        return 
        super.toString() + 
        "\n jumlah mata kuliah yang diimput : " + getjumlahmatkul();
    }
}
