package handler;

import weka.core.Utils;

/**
 * Created on October, 2017
 *
 * @author Adilcan Eren
 */
public class OptionHandlerImpl implements OptionHandler {

	@Override
	public String[] options(String quotedOptionString) throws Exception {
		return Utils.splitOptions(quotedOptionString);
	}

}
