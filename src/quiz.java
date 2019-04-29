import java.util.Arrays;

public class quiz {
	private int num = 0;
	public domande[] quiz = new domande[num];
	domande d = new domande(num, null, " ");

	public quiz(int num, domande[] quiz) {
		super();
		this.num = num;
		this.quiz = quiz;
	}

	public void nuovoQuiz(domande quiz[], int num) {
		for (int i = 0; i < num; i++) {
           quiz[i]=d;
		}

	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public domande[] getQuiz() {
		return quiz;
	}

	public void setQuiz(domande[] quiz) {
		this.quiz = quiz;
	}

	@Override
	public String toString() {
		return "quiz [num=" + num + ", quiz=" + Arrays.toString(quiz) + "]";
	}

}
