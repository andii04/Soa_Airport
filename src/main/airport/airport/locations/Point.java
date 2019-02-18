package airport.airport.locations;

public class Point extends Location
{
    private final PointName pointName;

    public ControlPoint controlPoint;

    public void setControlpoint(final ControlPoint controlPoint)
    {
        this.controlPoint=controlPoint;
    }

    public boolean isControlpoint(){
        return controlPoint!=null;
    }
    public ControlPoint getControlPoint(){
        return controlPoint;
    }

    public enum PointName
    {
        M1, O1, N1, L1,
        M2, O2, N2, L2,
        M3, O3, N3, L3,
        M4, O4, N4, L4,
        M5, O5, N5, L5,
        M6, O6, N6, L6,
    }

    public Point(PointName pointname){
        this.pointName = pointname;
    }
}