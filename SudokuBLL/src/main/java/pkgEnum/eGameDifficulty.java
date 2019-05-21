package pkgEnum;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public enum eGameDifficulty {

	EASY(10,9), MEDIUM(30,7), HARD(60,5);
	
	private int iPctRemove;
	private int iMaxMistakes;
	
	private static final Map<Integer, eGameDifficulty> 
			lookup = new LinkedHashMap<Integer, eGameDifficulty>();

	static {
		for (eGameDifficulty d : eGameDifficulty.values()) {
			lookup.put(d.getiPctRemove(), d);
		}
	}
	
	private eGameDifficulty(int iPctRemove, int iMaxMistakes)
	{
		this.iPctRemove = iPctRemove;
		this.iMaxMistakes = iMaxMistakes;
	}

	public int getiPctRemove() {
		return iPctRemove;
	}
	
	
	public int getiMaxMistakes() {
		return iMaxMistakes;
	}

	public static eGameDifficulty get(int iPctRemove) {

		Iterator it = lookup.entrySet().iterator();
		eGameDifficulty eGD = null;

		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry) it.next();
			eGameDifficulty enumDifficulty = (eGameDifficulty) pair.getValue();
			int iDifficultyValue = (int) pair.getKey();
			if (iPctRemove >= iDifficultyValue) {
				eGD = enumDifficulty;
			}
		}
		return eGD;
	}
	
	
	
	
}
