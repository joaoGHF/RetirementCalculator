package retire;

import java.awt.*;

/**
 * These are the English non-string resources for the retirement calculator.
 */
public class RetireResources_en extends java.util.ListResourceBundle {
    private static final Object[][] contents = {
        // BEGIN LOCALIZE
        {"colorPre", Color.BLUE}, {"colorGain", Color.WHITE}, {"colorLoss", Color.RED}
        // END LOCALIZE
    };

    @Override
    protected Object[][] getContents() {
        return contents;
    }    
}
