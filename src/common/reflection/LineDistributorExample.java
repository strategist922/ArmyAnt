package common.reflection;

import java.util.HashMap;
import java.util.Map;

/*
 * An example of distributor.
 */
public class LineDistributorExample implements LineDistributor {
	@Override
	public Integer distribute(String s) {
		return 1;
	}

}
