package g3;

import android.net.Uri;
import androidx.core.content.FileProvider;
import g5.q;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f17384a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f17385b = new HashMap();

    public b(String str) {
        this.f17384a = str;
    }

    public final File a(Uri uri) {
        String encodedPath = uri.getEncodedPath();
        int indexOf = encodedPath.indexOf(47, 1);
        if (indexOf != -1) {
            String decode = Uri.decode(encodedPath.substring(1, indexOf));
            String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
            File file = (File) this.f17385b.get(decode);
            if (file != null) {
                File file2 = new File(file, decode2);
                try {
                    File canonicalFile = file2.getCanonicalFile();
                    if (FileProvider.a(canonicalFile.getPath()).startsWith(FileProvider.a(file.getPath()).concat("/"))) {
                        return canonicalFile;
                    }
                    throw new SecurityException("Resolved path jumped beyond configured root");
                } catch (IOException unused) {
                    q.g(file2, "Failed to resolve canonical path for ");
                    return null;
                }
            }
            q.g(uri, "Unable to find configured root for ");
            return null;
        }
        q.g(uri, "Unable to find path from root: ");
        return null;
    }
}
