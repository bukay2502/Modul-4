import java.util.Scanner;
import java.util.HashMap;
public class Mahasiswa {
    String nama, kelas, matkulPraktikum;
    int nim;

    public Mahasiswa (String nm, String kl, String mat, int ni){
        nama = nm;
        kelas = kl;
        matkulPraktikum = mat;
        nim = ni;

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String , Mahasiswa> mhs = new HashMap<>();
        String input;
        Mahasiswa data;

        mhs.put("1", new Mahasiswa("Putri", "3H", "Struktur Data", 2020000));
        mhs.put("2", new Mahasiswa("Agus", "3A", "Matematika", 2020012));
        mhs.put("3", new Mahasiswa("Arro", "3D", "Pemrograman", 2020017));


        System.out.println("MASUKKAN ID :");
        input= in.nextLine();
        data = mhs.get(input);
        if ((data != null)) {
            System.out.println("Data Mahasiswa :"+data.nama +", kelas:"+ data.kelas+", mata kuliah praktikum :"+data.matkulPraktikum+", nim :"+data.nim);
        }
    }
}
