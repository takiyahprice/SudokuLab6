package pkgGame;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgEnum.eGameDifficulty;

public class SudokuGameDifficultyTest {

	@Test
	public void TestEnum() {
		
		eGameDifficulty eGD1 = pkgEnum.eGameDifficulty.get(1);
		assertNull(eGD1);
		
		eGameDifficulty eGD2 = pkgEnum.eGameDifficulty.get(10);
		assertEquals(eGameDifficulty.EASY, eGD2);
		
		eGameDifficulty eGD3 = pkgEnum.eGameDifficulty.get(11);
		assertEquals(eGameDifficulty.EASY, eGD3);
		
		eGameDifficulty eGD4 = pkgEnum.eGameDifficulty.get(30);
		assertEquals(eGameDifficulty.MEDIUM, eGD4);
		
		eGameDifficulty eGD5 = pkgEnum.eGameDifficulty.get(31);
		assertEquals(eGameDifficulty.MEDIUM, eGD5);
		
		eGameDifficulty eGD6 = pkgEnum.eGameDifficulty.get(60);
		assertEquals(eGameDifficulty.HARD, eGD6);
		
		eGameDifficulty eGD7 = pkgEnum.eGameDifficulty.get(61);
		assertEquals(eGameDifficulty.HARD, eGD7);
	}

}
