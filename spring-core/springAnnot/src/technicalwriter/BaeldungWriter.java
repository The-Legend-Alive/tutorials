package technicalwriter;

import org.springframework.stereotype.Service;

@Service
public class BaeldungWriter implements TechnicalWriter {
    public void techwriter(String s) {
        System.out.println("Technical Spring Java sentence : " + s);
    }
}