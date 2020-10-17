import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class controller implements ActionListener {
    private RightTriangle model;
    private TriangleView view;

    public controller(RightTriangle model, TriangleView view){
        this.model = model;
        this.view = view;
    }

    public void setTriangleHeight(float height){
        model.setHeight(height);
    }

    public float getTriangleHeight(){
        return model.getHeight();
    }

    public void setTriangleBase(float base){
        model.setBase(base);
    }

    public float getTriangleBase(){
        return model.getHeight();
    }

    public void actionPerformed(ActionEvent e){
        view.printDetails(model.getHeight(), model.getBase(), model.getHypotenuse());
    }
}

