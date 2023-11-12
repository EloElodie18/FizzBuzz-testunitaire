/*ici on vérifie les conditions et on doit aussi obtenir le resultat*/
public class FizzBuzz {
		
	public static String check (int FB) { /*création de la fonction, les q° que je me suis posées: remplacer void? par unu fonction string car void c'est vide, 
	donner un nom, dc check, avec comme valeur ds ma fonction un entier FB*/
			if (FB %3==0 && FB%5==0) {
			return "FizzBuzz";
			}			
			if (FB%3==0) {
				return "Fizz";
			}
			if (FB%5==0) {
				return "Buzz";
			}
			if (FB > 0) {/*j'ai fait le chemin sur flogowrithm ms j'ai eu du mal a transposer sur java*/
				return /*FB +*/ " est sup ou égal à 0";
			}
			if (FB < 100) {/*j'ai dû simplifier car avec flogo il faut faire plus de chose, notamment des boucles imbriquées alors que sur JAVA j'ai juste a donner mes conditions et le return! */
				return /*FB +*/ " est inf ou égal à 100";
			}
		
	 return String.valueOf(FB);/*trouver sur internet la manière de mettre FB int en string, donc de le retourner ainsi*/
	 /*nécessaire au changement du int en string, ça n'est pas intuitif, il faut juste le savoir et le considerer*/
	 
	}	

	}

