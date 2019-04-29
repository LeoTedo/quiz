import java.util.Arrays;

public class domande {
	private int num2 = 0;

	public risposte[] domanda = new risposte[num2];
    quiz q = new quiz(0, null);
	private String testo;
    domande d = new domande(num2, domanda, testo);



	public domande(int num2, risposte[] domanda, String testo) {
		super();
		this.num2 = num2;
		this.domanda = domanda;
		this.testo= testo;
	}
	public void inseriscidomande(risposte[]domanda, String testo) {
		for (int i = 0; i <q.quiz.length ; i++) {
			q.quiz[i]=d;
		}
		
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public risposte[] getDomanda() {
		return domanda;
	}
	public void setDomanda(risposte[] domanda) {
		this.domanda = domanda;
	}
    public String getTesto() {
		return testo;
	}
	public void setTesto(String testo) {
		this.testo = testo;
	}
	@Override
	public String toString() {
		return "domande [domanda=" + Arrays.toString(domanda) + ", testo=" + testo + "]";
	}
	
}
