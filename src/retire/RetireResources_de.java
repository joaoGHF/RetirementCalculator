package retire;

import java.awt.*;

/**
 * These are the German non-string resources for the retirement calculator.
 */
public class RetireResources_de extends java.util.ListResourceBundle {
    private static final Object[][] contents = {
        // BEGIN LOCALIZE
        { "colorPre", Color.YELLOW }, { "colorGain", Color.BLACK }, { "colorLoss", Color.RED }
        // END LOCALIZE
    };

    @Override
    protected Object[][] getContents() {
        return contents;
    }    
}
