package handler;

import weka.core.Instances;
import weka.core.converters.ArffLoader;

import java.io.File;

/**
 * Created on October, 2017
 *
 * @author Adilcan Eren
 */

public class DataHandlerImpl implements DataHandler {

	@Override
	public Instances getDataSetByPath(ArffLoader loader, String path) throws Exception {
		loader.setFile(new File(path));
		return loader.getStructure();

	}

}
