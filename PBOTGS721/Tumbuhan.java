/* 	Rulia
	130 2018 0064
*/

//nomor 3
//Program abstract class
public class Tumbuhan extends MakhlukHidup {
    private String Akar;
    public Tumbuhan (String Akar){
        this.Akar = Akar;
    }
    public void berdiri (){
        System.out.println("Tumbuhan berdiri dengan     :  "+Akar);
    }
}