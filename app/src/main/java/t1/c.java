package t1;

import a6.q;
import android.content.Context;
import android.view.KeyEvent;
import b6.p;
import java.io.File;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import qe.x;
import ya.hc;

/* loaded from: classes.dex */
public abstract class c {
    public static final long a(KeyEvent keyEvent) {
        return hc.a(keyEvent.getKeyCode());
    }

    public static final int b(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                return 1;
            }
            return 0;
        }
        return 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.util.Map, java.lang.Object] */
    public static final void c(Context context) {
        LinkedHashMap linkedHashMap;
        String str;
        context.getClass();
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        databasePath.getClass();
        if (databasePath.exists()) {
            q.d().a(p.f1767a, "Migrating WorkDatabase to the no-backup directory");
            File databasePath2 = context.getDatabasePath("androidx.work.workdb");
            databasePath2.getClass();
            File file = new File(b6.a.f1714a.a(context), "androidx.work.workdb");
            String[] strArr = p.f1768b;
            int b10 = x.b(strArr.length);
            if (b10 < 16) {
                b10 = 16;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(b10);
            for (String str2 : strArr) {
                linkedHashMap2.put(new File(databasePath2.getPath() + str2), new File(file.getPath() + str2));
            }
            if (linkedHashMap2.isEmpty()) {
                Object singletonMap = Collections.singletonMap(databasePath2, file);
                singletonMap.getClass();
                linkedHashMap = singletonMap;
            } else {
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(linkedHashMap2);
                linkedHashMap3.put(databasePath2, file);
                linkedHashMap = linkedHashMap3;
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                File file2 = (File) entry.getKey();
                File file3 = (File) entry.getValue();
                if (file2.exists()) {
                    if (file3.exists()) {
                        q.d().g(p.f1767a, "Over-writing contents of " + file3);
                    }
                    if (file2.renameTo(file3)) {
                        str = "Migrated " + file2 + "to " + file3;
                    } else {
                        str = "Renaming " + file2 + " to " + file3 + " failed";
                    }
                    q.d().a(p.f1767a, str);
                }
            }
        }
    }
}