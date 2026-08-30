package u7;

import java.io.File;
import java.io.FileFilter;

/* loaded from: classes.dex */
public final /* synthetic */ class k7 implements FileFilter {
    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        if (file.isDirectory()) {
            String name = file.getName();
            name.getClass();
            if (name.startsWith("pdf_")) {
                return true;
            }
            return false;
        }
        return false;
    }
}
