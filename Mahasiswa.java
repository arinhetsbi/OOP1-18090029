public class Mahasiswa{
    //file atau atribut 
    String nim; //atribut
    String nama;
    String kelas;

    //konstruktor
    public Mahasiswa(String nim, String nama, String kelas){
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
    }

    public Mahasiswa() {
        nim = "18090029";
        nama = "Ariningtyas Hetsbi Islami";
        kelas = "4 B";
    }

    //method/fungsi/prosedur sama ae
    public String info(){
        return nim + "+" + nama + ":" + kelas;
    }
}