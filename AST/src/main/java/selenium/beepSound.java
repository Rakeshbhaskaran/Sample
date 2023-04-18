package selenium;

import java.awt.Toolkit;

public class beepSound {
    public static void main(String[] args) {
        // Get a reference to the default toolkit
        Toolkit toolkit = Toolkit.getDefaultToolkit();

        // Play a beep sound
        toolkit.beep();
    }
}

