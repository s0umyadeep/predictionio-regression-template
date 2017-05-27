package ml.predictionio.engine.regression;

import org.apache.predictionio.controller.java.LJavaDataSource;

import ml.predictionio.engine.regression.model.ActualValue;
import ml.predictionio.engine.regression.model.EvaluationInfo;
import ml.predictionio.engine.regression.model.InputQuery;
import ml.predictionio.engine.regression.model.TrainingData;


public class DataSource extends LJavaDataSource<TrainingData, EvaluationInfo, InputQuery, ActualValue> {


	private static final long serialVersionUID = 8221554340796723594L;

	@Override
	public TrainingData readTraining() {
		return null;
	}

}
