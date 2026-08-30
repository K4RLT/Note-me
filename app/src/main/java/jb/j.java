package jb;

import android.content.Context;
import java.io.File;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final Context f19122a;

    public j(Context context) {
        this.f19122a = context;
    }

    public static long a(File file) {
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] listFiles = file.listFiles();
        long j10 = 0;
        if (listFiles != null) {
            for (File file2 : listFiles) {
                j10 += a(file2);
            }
        }
        return j10;
    }
}
