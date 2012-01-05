package client;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class JUnitJavaLauncher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(SimpleJMSTestClient.class);
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}

	}

}
