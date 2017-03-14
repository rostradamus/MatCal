package rostradamus.simplematrixcalculator.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import rostradamus.simplematrixcalculator.R;
import rostradamus.simplematrixcalculator.model.CalculationController;
import rostradamus.simplematrixcalculator.model.ICalculationController;

public class VectorCalcuatorUI extends AppCompatActivity {
    private ICalculationController calculationController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        calculationController = CalculationController.getInstance();
        setContentView(R.layout.activity_vector_calcuator_ui);

    }
}
