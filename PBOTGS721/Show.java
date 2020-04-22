/* 	Rulia
	130 2018 0064
*/

//nomor 7
//Program inheritance interface
public class Show {
	public static void main (String[] args) {
		Data d = new Data();
		
		d.namaMhs();
		d.stb();
		d.mk();
		
		
		System.out.println("Stambuk = " + d.stb());
		System.out.println("Mata kuliah = " + d.mk());
	}
}