
public class risposte {
	private String risposta;
	private boolean isTrue;
	domande d = new domande(0, null, risposta);
    risposte r = new risposte(risposta, isTrue);
	public risposte(String risposta, boolean isTrue) {
		super();
		this.risposta = risposta;
		this.isTrue = isTrue;
	}

	public void inseriscirisposte (String risposta, boolean isTrue) {
		for (int i = 0; i <d.domanda.length ; i++) {
			d.domanda[i]=r;
		}
	}

	@Override
	public String toString() {
		return "risposte [risposta=" + risposta + ", isTrue=" + isTrue + "]";
	}
	
}
