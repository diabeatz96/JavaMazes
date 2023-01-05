import java.util.*;

public class Cell {
    public Integer row;
    public Integer col;
    public Cell north, south, east, west;
    public List<Cell> cellNeighbors;
    private Map<Cell, Boolean> links;
    public enum Direction {NORTH, SOUTH, EAST, WEST};
    private Map<Direction, Cell> neighbors;

    public Cell() {

    };

    public Cell(Integer row, Integer col) {
        this.row = row;
        this.col = col;
        cellNeighbors = new ArrayList<Cell>();
        links = new HashMap<Cell, Boolean>();
        neighbors = new HashMap<Direction, Cell>();
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

    public Set<Cell> links() {
        return links.keySet();
    }

    public Boolean isLinked(Cell cell) {
        return links.get(cell);
    }

    public List<Cell> neighbors() {
        List<Cell> cellNeighbors = new ArrayList<Cell>();;
        if(north != null){
            cellNeighbors.add(north);
        }
        if(south != null){
            cellNeighbors.add(south);
        }
        if(east != null){
            cellNeighbors.add(east);
        }
        if(west != null){
            cellNeighbors.add(west);
        }
        return cellNeighbors;
    }
}
