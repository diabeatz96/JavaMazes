import java.util.Map;

public class Cell {
    public Integer row;
    public Integer col;
    public Cell north, south, east, left;
    private Map<Cell, Boolean> links;
    public enum Direction {NORTH, SOUTH, EAST, WEST};
    private Map<Direction, Cell> neighbors;

    public Cell() {

    };

    public Cell(Integer row, Integer col) {
        this.row = row;
        this.col = col;
    }

    public Cell link(Cell cellLink) {
        links.put(cellLink, true);
        cellLink.links.put(this, true);
        return this;
    }

    public Cell unlink(Cell cellLink) {
        links.remove(cellLink);
        cellLink.links.remove(this);
        return this;
    }
}
