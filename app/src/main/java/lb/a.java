package lb;

import android.util.Base64;
import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final t f20075a = new t(3);

    /* renamed from: b, reason: collision with root package name */
    public static final t f20076b = new t(5);

    public static String a(List list) {
        int read;
        MessageDigest messageDigest = MessageDigest.getInstance("SHA256");
        byte[] bArr = new byte[8192];
        Iterator it = list.iterator();
        while (it.hasNext()) {
            FileInputStream fileInputStream = new FileInputStream((File) it.next());
            do {
                try {
                    read = fileInputStream.read(bArr);
                    if (read > 0) {
                        messageDigest.update(bArr, 0, read);
                    }
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } while (read != -1);
            fileInputStream.close();
        }
        return Base64.encodeToString(messageDigest.digest(), 11);
    }

    public static boolean b(int i) {
        if (i != 2 && i != 7 && i != 3) {
            return false;
        }
        return true;
    }

    public static boolean c(int i, int i10) {
        if (i == 5) {
            if (i10 != 5) {
                return true;
            }
            i = 5;
        }
        if (i == 6) {
            if (i10 != 6 && i10 != 5) {
                return true;
            }
            i = 6;
        }
        if (i == 4 && i10 != 4) {
            return true;
        }
        if (i == 3 && (i10 == 2 || i10 == 7 || i10 == 1 || i10 == 8)) {
            return true;
        }
        if (i == 2) {
            if (i10 == 1 || i10 == 8) {
                return true;
            }
            return false;
        }
        return false;
    }
}
