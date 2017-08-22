
public class Question {
	public String[] answer = new String[30];
	public String[] hint = new String[30];

	public Question() {
		// 0~9 직업, 10~19 인물, 20~29 가수

		answer[0] = "소방사";
		answer[1] = "경찰";
		answer[2] = "대통령";
		answer[3] = "대학생";
		answer[4] = "축구선수";
		answer[5] = "야구선수";
		answer[6] = "변호사";
		answer[7] = "공무원";
		answer[8] = "디자이너";
		answer[9] = "의사";
		answer[10] = "류현진";
		answer[11] = "박지성";
		answer[12] = "김연아";
		answer[13] = "강동원";
		answer[14] = "유관순";
		answer[15] = "원빈";
		answer[16] = "강정호";
		answer[17] = "노준호";
		answer[18] = "김문기";
		answer[19] = "황길수";
		answer[20] = "소녀시대";
		answer[21] = "마마무";
		answer[22] = "걸스데이";
		answer[23] = "여자친구";
		answer[24] = "싸이";
		answer[25] = "아이유";
		answer[26] = "원더걸스";
		answer[27] = "에프엑스";
		answer[28] = "박정현";
		answer[29] = "트와이스";

		for (int i = 0; i < 10; i++) {
			hint[i] = "직업";
		}
		for (int i = 10; i < 20; i++) {
			hint[i] = "인물";
		}
		for (int i = 20; i < 30; i++) {
			hint[i] = "가수";
		}

	}

	public String setQuestion() {
		int stage = (int) (Math.random() * 30);
		String question = answer[stage];
		return question;
	}

	public String setHint(String question) {
		String r_hint = null;
		for (int i = 0; i < 29; i++) {
			if (answer[i].equals(question)) {
				int index = i;
				r_hint = hint[index];
			}
		}
		return r_hint;
	}

	public boolean checkAnswer(int stage, String str) { // 미사용
		if (answer[stage] == str) {
			boolean check = true;
			return check;
		} else {
			boolean check = false;
			return check;
		}
	}

}
