public class ProgPrinc {

	public static void main(String[] args) {
	/*point*/	
		point A=new point();
		point B=new point(5);
		point C=new point(3,8);
System.out.println("le point A mes coordonées sont :"+A.toString());
System.out.println("le point B mes coordonées sont :"+B.toString());
System.out.println("le point c mes coordonées sont :"+C.toString());
System.out.println("l'image de A est : "+A.Symetrie());
System.out.println("l'image de B est : "+B.Symetrie());
System.out.println("l'image de c est : "+C.Symetrie());

   /*segment*/
segment AB=new segment(A,B);
segment BC=new segment(B,C);
System.out.println("le segment AB est:"+AB.distance());
System.out.println("la segment BC est:"+BC.distance());

System.out.println("l'mage de BC est CB "+BC.Symetrie());

  /*cercle*/
cercle c1=new cercle(4);
cercle c2=new cercle(B,3);
System.out.println("le cercle c1  : " + c1.toString() +
"périmetre=" + c1.Périmetre(c1.rayon) + " son image  c1 " + c1.Symetrie(c1.o).toString());
System.out.println("le cercle c2  : " + c2.toString() + "périmetre=" + c2.Périmetre(c2.rayon)
		+ " son image  c2 " + c2.Symetrie(c2.o).toString());
	}

}
