class Item {
	int id;
	String ime;
	double cena;

	//TODO add variable.
	char vid_danok;
	//TODO constructor
	public Item (int id, String ime, double cena, char vid_danok) {
		this.id = id;
		this.ime = ime;
		this.cena = cena;
		this.vid_danok = vid_danok;
	}
	//TODO setters and getters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public double getCena() {
		return cena;
	}

	public void setCena(double cena) {
		this.cena = cena;
	}

	public char getVid_danok() {
		return vid_danok;
	}

	public void setVid_danok(char vid_danok) {
		this.vid_danok = vid_danok;
	}
		double taxReturn (int id,int cena,char vid_danok) {
		double taxr;
		if(vid_danok=='A')
		taxr=float(cena*18*15)/10000
		elseif(vid_danok=='B')
		taxr=float(cena*5*15)/10000
		else
		taxr=float(cena*15)/10000
	}
	public double getTaxRetrun(){
		return taxr;
	}
}
class Receipt{

	List<Item> artikli=new List<Item>();

	public void dodadi(Item item) {
		artikli.add(item);
	}
}
