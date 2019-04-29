import java.util.Scanner;

public class quiztest {

	public static void main(String[] args) {
		quiz q = new quiz(0, null);
		risposte r = new risposte(null, false);
		domande d = new domande(0, null, null);
		Scanner sc = new Scanner(System.in);
		boolean isTrue = false;
		System.out.println("Quante domande vuoi nel quiz?");
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			System.out.println("Domanda numero" + i);
			System.out.println("Quante risposte ha questa domanda?");
			int num2 = sc.nextInt();
			for (int j = 0; j < num2; j++) {
				System.out.println("testo risposta: ");
				String risposta = sc.nextLine();
				System.out.println("si se vera, altrimenti premere invio");
				String rispostaboolean = sc.nextLine();
				if (rispostaboolean.equalsIgnoreCase("si")) {
					isTrue = true;
				} else {
					isTrue = false;
				}
				r.inseriscirisposte(risposta, isTrue);
			}
			System.out.println("Inserire testo della domanda: ");
			String testo = sc.nextLine();
			d.inseriscidomande(d.domanda, testo);
			q.nuovoQuiz(q.quiz, num);
		}

	}

}
