public class cercle {
	public point o;
	public int rayon;
	
	public cercle(int rayon){
		o=new point();
		this.rayon=rayon;
		
	}
	
	public cercle(point o,int rayon){
		this.o=o;
		this.rayon=rayon;
	}
	
	public double Périmetre(int rayon){
		float PI=(float)3.14;
		return 2*rayon*PI;
	}
	public cercle Symetrie(point o){
		return new cercle(o,rayon);
	}
	public String toString() {
		return  "centre =" + o + "," + "rayon =" + rayon;
	}
}
