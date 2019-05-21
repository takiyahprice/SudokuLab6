package pkgGame;

import java.io.Serializable;
import java.util.Objects;

public class Cell implements Serializable {
	private int iRow;
	private int iCol;
	private int iCellValue;
	
	//only cells that the player adds to the board can be dragged to the trash can
	private boolean bDraggable = false;
	
	public boolean isDraggable() {
		return bDraggable;
	}
	
	public void setbDraggable(boolean b) {
		bDraggable = b;
	}

	public Cell(int iRow, int iCol) {
		super();
		this.iRow = iRow;
		this.iCol = iCol;
	}

	public int getiRow() {
		return iRow;
	}

	public int getiCol() {
		return iCol;
	}

	public int getiCellValue() {
		return iCellValue;
	}

	public void setiCellValue(int iCellValue) {
		this.iCellValue = iCellValue;
	}

	@Override
	public int hashCode() {
		return Objects.hash(iRow, iCol);
	}

}