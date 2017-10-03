package handler;

import weka.core.Instances;
import weka.core.converters.ArffLoader;

/**
 * Created on October, 2017
 *
 * @author Adilcan Eren
 */
public interface DataHandler {

	Instances getDataSetByPath(ArffLoader loader, String path) throws Exception;

}
