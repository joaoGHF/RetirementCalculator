package retire;

import java.awt.*;

/**
 * These are the Brazillian non-string resources for the retirement calculator.
 */
public class RetireResources_pt extends java.util.ListResourceBundle {
    private static final Object[][] contents = {
        // BEGIN LOCALIZE
        { "colorPre", Color.BLUE }, { "colorGain", Color.GREEN }, { "colorLoss", Color.YELLOW }
        // END LOCALIZE
    };

    @Override
    protected Object[][] getContents() {
        return contents;
    }    
}
