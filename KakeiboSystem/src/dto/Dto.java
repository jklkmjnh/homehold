package dto;

public class Dto {

	private int tosi;
	private int tuki;
	private int hiniti;
	private String koumoku;
	private int syuunyuu;
	private int sisyutu;

	public Dto(int tosi,int tuki,int hiniti,String koumoku, int syuunyuu,int sisyutu){
		this.tosi = tosi;
		this.tuki = tuki;
		this.hiniti = hiniti;
		this.koumoku = koumoku ;
		this.syuunyuu = syuunyuu;
		this.sisyutu = sisyutu;
	}

	public int getTosi() {
		return tosi;
	}

	public int getTuki() {
		return tuki;
	}

	public int getHiniti() {
		return hiniti;
	}

	public String getKoumoku() {
		return koumoku;
	}

	public int getSyuunyuu() {
		return syuunyuu;
	}

	public int getSisyutu() {
		return sisyutu;
	}

	public void setTosi(int tosi) {
		this.tosi = tosi;
	}

	public void setTuki(int tuki) {
		this.tuki = tuki;
	}

	public void setHiniti(int hiniti) {
		this.hiniti = hiniti;
	}

	public void setKoumoku(String koumoku) {
		this.koumoku = koumoku;
	}

	public void setSyuunyuu(int syuunyuu) {
		this.syuunyuu = syuunyuu;
	}

	public void setSisyutu(int sisyutu) {
		this.sisyutu = sisyutu;
	}

}