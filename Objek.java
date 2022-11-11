package sesi5;

public class Objek {
    private String name;
    private String address;

    public Objek(String name, String address){
        this.name = name;
        this.address = address;
    }

    public String getName(){
        return this.name;
    }

    public String getAddress(){
        return this.address;
    }

    public void setName(String address){
        this.address = address;
    }

    public String toString(){
        return
        "Nama: " + getName() +
        "\nAlamat: " + getAddress();
    }
}
