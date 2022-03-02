package GeomKennwerte;

public class GeoKennwert {
	
	
	public static String getGeomKennwert(double aRadius, int aKennwert, boolean aKugel) {
			switch(aKennwert) {
			case 0:
				System.out.println("Case 0");
				return "Case 0";
			case 1:
				if(aKugel==true) {
					System.out.println("Case 1 Kugel");
					return "Case 1 Kugel";
				}else {
					System.out.println("Case 1 Keine Kugel");
					return "Case 1 Keine Kugel";
				}
			case 2: 
				if(aKugel==true) {
					System.out.println("Case 2 Kugel");
					return "Case 2 Kugel";
				}else {
					System.out.println("Case 2 keine Kugel");
					return "Case 2 keine Kugel";
				}
			
		}System.out.println("Du bist dumm");
			return "Du bist dumm"; 
	}
}
