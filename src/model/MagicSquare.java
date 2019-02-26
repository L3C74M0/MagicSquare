package model;

public class MagicSquare {
	private int[][] magicSquare;

	public MagicSquare() {

	}

	public void fillSquare(int size, String sence, String ubication) {
		int numero = 1;
		magicSquare = new int[size][size];
		if (sence.equalsIgnoreCase("NO")) {
			if (ubication.equalsIgnoreCase("UP")) {
				// The user chose to fill the magic cube in the northwest direction and start at the top
				noUp(numero,size);
			} else if (ubication.equalsIgnoreCase("LEFT")) {
				// The user chose to fill the magic cube in the northwest direction and start on the left
				noLeft(numero,size);
			}
		} else if (sence.equalsIgnoreCase("NE")) {
			if (ubication.equalsIgnoreCase("UP")) {
				// The user chose to fill the magic cube in the northeast direction and start at the top
				neUp(numero,size);
			} else if (ubication.equalsIgnoreCase("RIGHT")) {
				// The user chose to fill the magic cube in the northeast direction and start on the right
				neRight(numero,size);
			}
		} else if (sence.equalsIgnoreCase("SO")) {
			if (ubication.equalsIgnoreCase("DOWN")) {
				// The user chose to fill the magic cube in the southwest direction and start at the bottom
				soDown(numero,size);
			} else if (ubication.equalsIgnoreCase("LEFT")) {
				// The user chose to fill the magic cube in the southwest direction and start on the left
				soLeft(numero,size);
			}
		} else if (sence.equalsIgnoreCase("SE")) {
			if (ubication.equalsIgnoreCase("DOWN")) {
				// The user chose to fill the magic cube in the southeast direction and start at the bottom
				seDown(numero,size);
			} else if (ubication.equalsIgnoreCase("RIGHT")) {
				// The user chose to fill the magic cube in the southeast direction and start on the right
				seRight(numero,size);
			}
		}
	}
	public void noUp(int numero,int size) {
		int fila = 0;
		int column = (int) Math.floor(size / 2);
		for (int i = 0; i < magicSquare.length * magicSquare.length; i++) {
			magicSquare[fila][column] = numero;
			if ((fila - 1 < 0)) {
				if ((fila - 1) < 0 && (column - 1) < 0) {
					fila++;
					magicSquare[fila][column] = numero++;
				} else {
					fila = magicSquare.length - 1;
					column--;
					magicSquare[fila][column] = numero++;
				}
			} else if ((column - 1) < 0) {
				if ((fila - 1) < 0 && (column - 1) < 0) {
					fila++;
					magicSquare[fila][column] = numero++;
				} else {
					fila--;
					column = magicSquare.length - 1;
					magicSquare[fila][column] = numero++;
				}
			} else if (magicSquare[fila - 1][column - 1] == 0) {
				fila--;
				column--;
				magicSquare[fila][column] = numero++;
			} else {
				fila++;
				numero++;
			}
		}
	}

	public void noLeft(int numero,int size) {
		int fila = (int) Math.floor(size / 2);
		int column = 0;
		for (int i = 0; i < magicSquare.length * magicSquare.length; i++) {
			magicSquare[fila][column] = numero;
			if ((column - 1) < 0) {
				if ((fila - 1) < 0 && (column - 1) < 0) {
					column++;
					magicSquare[fila][column] = numero++;
				} else {
					fila--;
					column = magicSquare.length - 1;
					magicSquare[fila][column] = numero++;
				}
			} else if ((fila - 1 < 0)) {
				if ((fila - 1) < 0 && (column - 1) < 0) {
					column++;
					magicSquare[fila][column] = numero++;
				} else {
					column--;
					fila = magicSquare.length - 1;
					magicSquare[fila][column] = numero++;
				}
			} else if (magicSquare[fila - 1][column - 1] == 0) {
				fila--;
				column--;
				magicSquare[fila][column] = numero++;
			} else {
				column++;
				numero++;
			}
		}
	}
	
	public void neUp(int numero,int size) {
		int fila = 0;
		int column = (int) Math.floor(size / 2);
		for (int i = 0; i < magicSquare.length * magicSquare.length; i++) {
			magicSquare[fila][column] = numero;
			if ((fila - 1 < 0)) {
				if ((fila - 1) < 0 && (column + 1) > magicSquare.length - 1) {
					fila++;
					column = magicSquare.length - 1;
					magicSquare[fila][column] = numero++;
				} else {
					column++;
					fila = magicSquare.length - 1;
					magicSquare[fila][column] = numero++;
				}
			} else if ((column + 1) > magicSquare.length - 1) {
				if ((fila - 1) < 0 && (column + 1) > magicSquare.length - 1) {
					fila++;
					magicSquare[fila][column] = numero++;
				} else {
					fila--;
					column = 0;
					magicSquare[fila][column] = numero++;
				}
			} else if (magicSquare[fila - 1][column + 1] == 0) {
				fila--;
				column++;
				magicSquare[fila][column] = numero++;
			} else {
				fila++;
				numero++;
			}
		}
	}
	
	public void neRight(int numero,int size) {
		int column = magicSquare.length - 1;
		int fila = (int) Math.floor(size / 2);
		for (int i = 0; i < magicSquare.length * magicSquare.length; i++) {

			magicSquare[fila][column] = numero;
			if ((fila - 1 < 0)) {
				if ((fila - 1) < 0 && (column + 1) > magicSquare.length - 1) {
					column--;
					fila = 0;
					magicSquare[fila][column] = numero++;

				} else {
					column++;
					fila = magicSquare.length - 1;
					magicSquare[fila][column] = numero++;
				}
			} else if ((column + 1) > magicSquare.length - 1) {
				if ((fila - 1) < 0 && (column + 1) < magicSquare.length - 1) {
					column--;
					magicSquare[fila][column] = numero++;
				} else {
					fila--;
					column = 0;
					magicSquare[fila][column] = numero++;
				}
			} else if (magicSquare[fila - 1][column + 1] == 0) {
				fila--;
				column++;
				magicSquare[fila][column] = numero++;
			} else {
				column--;
				numero++;
			}
		}
	}
	
	public void soDown(int numero,int size) {
		int column = (int) Math.floor(size / 2);
		int fila = magicSquare.length - 1;
		for (int i = 0; i < magicSquare.length * magicSquare.length; i++) {

			magicSquare[fila][column] = numero;
			if ((column - 1) < 0) {
				if ((fila + 1) > magicSquare.length - 1 && (column - 1) < 0) {
					fila--;
					column = 0;
					magicSquare[fila][column] = numero++;
				} else {
					fila++;
					column = magicSquare.length - 1;
					magicSquare[fila][column] = numero++;
				}
			} else if ((fila + 1 > magicSquare.length - 1)) {
				if ((fila + 1) > magicSquare.length - 1 && (column - 1) < 0) {
					fila--;
					column = 0;
					magicSquare[fila][column] = numero++;
				} else {
					fila = 0;
					column--;
					magicSquare[fila][column] = numero++;
				}
			} else if (magicSquare[fila + 1][column - 1] == 0) {
				fila++;
				column--;
				magicSquare[fila][column] = numero++;
			} else {
				fila--;
				numero++;
			}
		}
	}
	
	public void soLeft(int numero,int size){
		int fila = (int) Math.floor(size / 2);
		int column = 0;
		for (int i = 0; i < magicSquare.length * magicSquare.length; i++) {

			magicSquare[fila][column] = numero;
			if ((column - 1) < 0) {
				if ((fila + 1) > magicSquare.length - 1 && (column - 1) < 0) {
					fila = magicSquare.length - 1;
					column++;
					magicSquare[fila][column] = numero++;
				} else {
					fila++;
					column = magicSquare.length - 1;
					magicSquare[fila][column] = numero++;
				}
			} else if ((fila + 1 > magicSquare.length - 1)) {
				if ((fila + 1) > magicSquare.length - 1 && (column - 1) < 0) {
					fila = magicSquare.length - 1;
					column++;
					magicSquare[fila][column] = numero++;
				} else {
					fila = 0;
					column--;
					magicSquare[fila][column] = numero++;
				}
			} else if (magicSquare[fila + 1][column - 1] == 0) {
				fila++;
				column--;
				magicSquare[fila][column] = numero++;
			} else {
				column++;
				numero++;
			}
		}
	}
	
	public void seDown(int numero,int size) {
		int fila = magicSquare.length - 1;
		int column = (int) Math.floor(size / 2);
		for (int i = 0; i < magicSquare.length * magicSquare.length; i++) {

			magicSquare[fila][column] = numero;
			if ((column + 1) > magicSquare.length - 1) {
				if ((fila + 1) > magicSquare.length - 1 && (column + 1) > magicSquare.length - 1) {
					column = magicSquare.length - 1;
					fila--;
					magicSquare[fila][column] = numero++;
				} else {
					fila++;
					column = 0;
					magicSquare[fila][column] = numero++;
				}
			} else if ((fila + 1 > magicSquare.length - 1)) {
				if ((fila + 1) > magicSquare.length - 1 && (column + 1) > magicSquare.length - 1) {
					column = magicSquare.length - 1;
					fila--;
					magicSquare[fila][column] = numero++;
				} else {
					fila = 0;
					column++;
					magicSquare[fila][column] = numero++;
				}
			} else if (magicSquare[fila + 1][column + 1] == 0) {
				fila++;
				column++;
				magicSquare[fila][column] = numero++;
			} else {
				fila--;
				numero++;
			}
		}
	}

	public void seRight(int numero,int size) {
		int fila = magicSquare.length - 1;
		int column = (int) Math.floor(size / 2);
		for (int i = 0; i < magicSquare.length * magicSquare.length; i++) {
			magicSquare[fila][column] = numero;
			if ((column + 1) > magicSquare.length - 1) {
				if ((fila + 1) > magicSquare.length - 1 && (column + 1) > magicSquare.length - 1) {
					column--;
					fila = magicSquare.length - 1;
					magicSquare[fila][column] = numero++;
				} else {
					fila++;
					column = 0;
					magicSquare[fila][column] = numero++;
				}
			} else if ((fila + 1 > magicSquare.length - 1)) {
				if ((fila + 1) > magicSquare.length - 1 && (column + 1) > magicSquare.length - 1) {
					column--;
					fila = magicSquare.length - 1;
					magicSquare[fila][column] = numero++;
				} else {
					fila = 0;
					column++;
					magicSquare[fila][column] = numero++;
				}
			} else if (magicSquare[fila + 1][column + 1] == 0) {
				fila++;
				column++;
				magicSquare[fila][column] = numero++;
			} else {
				column++;
				numero++;
			}
		}
	}
		
	public int[][] getMagicSquare(){
		return magicSquare;
	}
}
