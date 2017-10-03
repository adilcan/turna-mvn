package classifier;

import weka.classifiers.bayes.NaiveBayesUpdateable;
import weka.core.Instances;
import weka.core.converters.ArffLoader;

/**
 * Created on October, 2017
 *
 * @author Adilcan Eren
 */
public interface NaiveBayes {

	public NaiveBayesUpdateable train(ArffLoader loader, Instances structure) throws Exception;

}
