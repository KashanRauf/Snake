
/**
 * A class representing a set of 2D coordinates (x,y)
 * Used to define positions of things in the game
 */
public class Coordinate {
    // X and Y coordinate
    public int x;
    public int y;

    // Constructors
    public Coordinate() {
        this.x = 0;
        this.y = 0;
    }
    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()){
            return false;
        }
        
        Coordinate other = (Coordinate) obj;
        if (x != other.x || y != other.y) {
            return false;
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + x;
        result = prime * result + y;
        return result;
    }
}
