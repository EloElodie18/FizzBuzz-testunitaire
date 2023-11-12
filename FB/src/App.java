/*je vais devoir faire appel à la fonction contenue dans cette class pour évaluer si mon int de la class FizzBuzz est entre -5 et 103
 *  et c'est d'ici que doit partir l'info pour l'afficher*/

public class App {

	
	public static void main(String[] args) { /*pq là je n'ai pas besoin de changer le void, car neutre? pq ça marche qd même en laissant string[]args?*/ 
		//int FB n'est pas nécessaire car initialiser directement ds la boucle for!!
		/*q° que je me suis posée? dois-je a nouveau déclarer int? bien sûr car sinon inconnu= réponse oui mais directement ds ma boucle for!!!, 
		 * il ne peut pas être déclaré ds une autre classe et utilisé par tt mon projet: NON, ms si j'avais declaré une constante? 
		 * oui possible mais en créant comme une fontion dédie qui s'écrirait public final String nomdelavariable, etc etc*/
		for (int FB = -5; FB <= 103; FB++){
		/*FizzBuzz.check(FB);*/
		 System.out.println(FizzBuzz.check(FB));/*appel de fonction, q° que je me suis posée: comment je dois l'appeler? nomdelaclasse.nomdelafonction(nomdelavariable)A RETENIR*/
			}
		
	}
	
		
	}
