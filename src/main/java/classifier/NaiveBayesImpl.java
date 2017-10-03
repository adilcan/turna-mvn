package classifier;

import weka.classifiers.bayes.NaiveBayesUpdateable;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.converters.ArffLoader;

/**
 * Created on October, 2017
 *
 * @author Adilcan Eren
 */
public class NaiveBayesImpl implements NaiveBayes {

	@Override
	public NaiveBayesUpdateable train(ArffLoader loader, Instances structure) throws Exception {
		NaiveBayesUpdateable naiveBayes = new NaiveBayesUpdateable();
		naiveBayes.buildClassifier(structure);
		Instance current;
		while ((current = loader.getNextInstance(structure)) != null)
			naiveBayes.updateClassifier(current);
		return naiveBayes;
	}

}
