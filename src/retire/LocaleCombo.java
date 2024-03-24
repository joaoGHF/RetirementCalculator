package retire;

import java.text.*;
import java.util.*;

import javax.swing.*;

// This class should work well, but pay attemption: THIS CLASS NOT WORKED WELL...
public class LocaleCombo extends JComboBox<String> {
    private Map<String, Locale> table = new TreeMap<>();

    public LocaleCombo(Locale[] locales) {
        Collator collator = Collator.getInstance(Locale.getDefault());
        collator.setStrength(Collator.SECONDARY);
        collator.setDecomposition(Collator.CANONICAL_DECOMPOSITION);
        Arrays.sort(locales, (l1, l2) -> {
            return collator.compare(l1.getDisplayName(), l2.getDisplayName());
        });
        for (Locale locale : locales) {
            String name = locale.getDisplayName().toUpperCase();
            table.put(name, locale);
            
            addItem(locale.getDisplayName().toUpperCase());
        }
        setSelectedItem(locales[0]);
    }

    public Locale getValue() {
        return table.get(getSelectedItem());
    }
}