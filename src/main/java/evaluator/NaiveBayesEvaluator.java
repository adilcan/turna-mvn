package evaluator;

import classifier.NaiveBayes;
import classifier.NaiveBayesImpl;
import handler.DataHandler;
import handler.DataHandlerImpl;
import handler.OptionHandler;
import handler.OptionHandlerImpl;
import weka.core.Instances;
import weka.core.converters.ArffLoader;

/**
 * Created on October, 2017
 *
 * @author Adilcan Eren
 */
public class NaiveBayesEvaluator {

	public static void main(String args[]) throws Exception {
		ArffLoader arffLoader = new ArffLoader();
		DataHandler dataHandler = new DataHandlerImpl();
		OptionHandler optionHandler = new OptionHandlerImpl();
		NaiveBayes naiveBayes = new NaiveBayesImpl();
		//Give your arff data-set's path below
		String path = "";
		//String path = "/home/cylon/turna-mvn/src/main/resources/static/dataset/soybean.arff";
		Instances structure = dataHandler.getDataSetByPath(arffLoader, path);
		structure.setClassIndex(structure.numAttributes() - 1);
		System.out.println(naiveBayes.train(arffLoader, structure));
	}

}
