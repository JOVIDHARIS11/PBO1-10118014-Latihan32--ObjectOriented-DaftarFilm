/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1.pkg10118014.latihan32.objectoriented.daftarfilm;

/**
 *
 * @author 
 * NAMA     : Jovi D Haris
 * KELAS    : IF-1
 * NIM      : 10118014
 * Deskripsi Program : Program ini untuk menampilkan variabel 
 *                     mahasiswa ke mainclass film.
 */
public class Film {
    public String filmName;
    public String filmGenre;
    public double filmRating;
    public int filmDuration;

    public void nowPlaying(String parJudul, String parGenre, double parRating, int parDuration){
        System.out.println("Judul Film  : "+parJudul);
        System.out.println("Genre Film  : "+parGenre);
        System.out.println("Rating Film : "+parRating);
        System.out.println("Duration Film : "+parDuration+" menit\n");
    }
    
}
