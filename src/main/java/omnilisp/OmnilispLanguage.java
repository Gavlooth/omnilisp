package omnilisp;
import  omnilisp.grammar.*;

import java.io.IOException;

import com.oracle.truffle.api.CallTarget;
import com.oracle.truffle.api.TruffleLanguage;
import com.oracle.truffle.api.frame.FrameSlot;


public class OmnilispLanguage {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
        System.out.println(new OmnilispLanguage().getGreeting());
    }
}
