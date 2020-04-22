/* Rulia
	130 2018 0064
*/

//nomor 3
//Program abstract class
public class Manusia extends MakhlukHidup {
    private String duaKaki;
    public Manusia(String duaKaki){
        this.duaKaki = duaKaki;
    }
    public void berdiri (){
        System.out.println("Manusia berdiri menggunakan :  "+duaKaki);
    }
}