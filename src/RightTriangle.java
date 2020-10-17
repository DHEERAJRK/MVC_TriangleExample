import java.util.Observable;

public class RightTriangle
{
    private float base;
    private float height;
    private float hypotenuse;

    public float getBase() {
        return this.base;
    }
    public float getHeight() {
        return this.height;
    }

    public float getHypotenuse() {
        return this.hypotenuse;
    }

    public void setBase (float newBase) {
        this.base = newBase;
        setHypotenuse();
    }
    public void  setHeight (float newHeight) {
        this.height = newHeight;
        setHypotenuse();
    }

    public void setHypotenuse() {
        this.hypotenuse = (float) Math.sqrt(base*base + height*height);
    }
}
