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
	
	public double Périmetre(){
		return rayon.distance()*2*3.14;}
	
	public cercle Symetrie(){
	return new Cercle(o.Symetrie(),rayon.Symetrie());
	}
	public String toString() {
		return  "centre =" + o + "," + "rayon =" + rayon;
	}
}
