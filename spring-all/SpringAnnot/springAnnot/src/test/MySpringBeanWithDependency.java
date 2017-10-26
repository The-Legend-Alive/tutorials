package test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import technicalwriter.TechnicalWriter;

@Service
public class MySpringBeanWithDependency {
    private TechnicalWriter techwriter;

    @Autowired
    public void setTechnicalWriter(TechnicalWriter techwriter) {
        this.techwriter = techwriter;
    }

    public void run() {
        String s = "First Eval @ Baeldung ";
        techwriter.techwriter(s);
    }
}