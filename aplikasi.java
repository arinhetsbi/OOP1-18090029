public class aplikasi {


    public static void main(String args[]) {
       // System.out.println("Selamat datang di oop");
       //mhs = object. mahasiswa = kelasnya. new mahasiswa itu konstruktornya

       Mahasiswa mhs = new Mahasiswa();      
       mhs.nama = "Arin";
       System.out.println(mhs.info());
       
       Mahasiswa mhs2 = new Mahasiswa("18090029","Ariningtyas","B");
       
       System.out.println(mhs2.info() + " " + mhs2.nama);
        System.out.println(mhs.info() + " " + mhs.nama);
    }

}

//jii erorrr testernyaaa