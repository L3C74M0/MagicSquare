package model;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

class MagicSquareTest {
	private MagicSquare magic;

	public void setupScenary1() {
		magic = new MagicSquare();
	}

	@Test
	public void testFillSquareForm1() {
		setupScenary1();
		try {
			magic.fillSquare(3, "NO", "UP");
			int[][] matrix = magic.getMagicSquare();
			int[][] verified = { { 6, 1, 8 }, { 7, 5, 3 }, { 2, 9, 4 } };

			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					assertTrue(matrix[i][j] == verified[i][j]);
				}
			}
		} catch (Exception e) {
			
		}
	}

	@Test
	public void testFillSquareForm2() {
		setupScenary1();
		try {
			magic.fillSquare(3, "NO", "LEFT");
			int[][] matrix = magic.getMagicSquare();
			int[][] verified = { { 6, 7, 2 }, { 1, 5, 9 }, { 8, 3, 4 } };

			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					assertTrue(matrix[i][j] == verified[i][j]);
				}
			}
		} catch (Exception e) {
			
		}		
	}

	@Test
	public void testFillSquareForm3() {
		setupScenary1();
		try {
			magic.fillSquare(3, "NE", "UP");
			int[][] matrix = magic.getMagicSquare();
			int[][] verified = { { 8, 1, 6 }, { 3, 5, 7 }, { 4, 9, 2 } };

			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					assertTrue(matrix[i][j] == verified[i][j]);
				}
			}
		} catch (Exception e) {
			
		}		
	}

	@Test
	public void testFillSquareForm4() {
		setupScenary1();
		try {
			magic.fillSquare(3, "NE", "RIGHT");
			int[][] matrix = magic.getMagicSquare();
			int[][] verified = { { 2, 7, 6 }, { 9, 5, 1 }, { 4, 3, 8 } };

			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					assertTrue(matrix[i][j] == verified[i][j]);
				}
			}
		} catch (Exception e) {
			
		}	
	}

	@Test
	public void testFillSquareForm5() {
		setupScenary1();
		try {
			magic.fillSquare(3, "SO", "DOWN");
			int[][] matrix = magic.getMagicSquare();
			int[][] verified = { { 2, 9, 4 }, { 7, 5, 3 }, { 6, 1, 8 } };

			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					assertTrue(matrix[i][j] == verified[i][j]);
				}
			}
		} catch (Exception e) {
			
		}
	}

	@Test
	public void testFillSquareForm6() {
		setupScenary1();
		try {
			magic.fillSquare(3, "SO", "LEFT");
			int[][] matrix = magic.getMagicSquare();
			int[][] verified = { { 8, 3, 4 }, { 1, 5, 9 }, { 6, 7, 2 } };

			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					assertTrue(matrix[i][j] == verified[i][j]);
				}
			}
		} catch (Exception e) {
		
		}
	}

	@Test
	public void testFillSquareForm7() {
		setupScenary1();
		try {
			magic.fillSquare(3, "SE", "DOWN");
			int[][] matrix = magic.getMagicSquare();
			int[][] verified = { { 4, 9, 2 }, { 3, 5, 7 }, { 8, 1, 6 } };

			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					assertTrue(matrix[i][j] == verified[i][j]);
				}
			}
		} catch (Exception e) {
			
		}
	}

	@Test
	public void testFillSquareForm8() {
		setupScenary1();
		try {
			magic.fillSquare(3, "SE", "RIGHT");
			int[][] matrix = magic.getMagicSquare();
			int[][] verified = { { 4, 3, 8 }, { 9, 5, 1 }, { 2, 7, 6 } };

			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					assertTrue(matrix[i][j] == verified[i][j]);
				}
			}
		} catch (Exception e) {
		
		}
		
	}

	@Test
	public void testFillSquareForm9() {
		setupScenary1();
		boolean f=true;
		try {
			magic.fillSquare(4, "NO", "UP");
		} catch (Exception e) {
			f = false;
		}
		assertFalse(f);
	}
	
	@Test
	public void testFillSquareForm10() {
		setupScenary1();
		boolean f=true;
		try {
			magic.fillSquare(3, "", "");
		} catch (Exception e) {
			f = false;
		}
		assertFalse(f);
	}
	
	@Test
	public void testFillSquareForm11() {
		setupScenary1();
		boolean f=true;
		try {
			magic.fillSquare(0, "NO", "UP");
		} catch (Exception e) {
			f = false;
		}
		assertFalse(f);
	}
	
	@Test
	public void testFillSquareForm12() {
		setupScenary1();
		boolean f=true;
		try {
			magic.fillSquare(-4, "NO", "UP");
		} catch (Exception e) {
			f = false;
		}
		assertFalse(f);
	}
}
