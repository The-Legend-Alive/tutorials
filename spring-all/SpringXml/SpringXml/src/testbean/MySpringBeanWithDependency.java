package testbean;

import technicalwriter.TechnicalWriter;

public class MySpringBeanWithDependency {
	private TechnicalWriter techwriter;

	public void setWriter(TechnicalWriter techwriter) {
		this.techwriter = techwriter;
	}

	public void run() {
		String s = "First Eval at Baeldung";
		techwriter.techwriter(s);
	}
}
