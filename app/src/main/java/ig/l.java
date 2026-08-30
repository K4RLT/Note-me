package ig;
import p.a;
import q.h;
import q.x;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final String[] f18527a;

    public l(f4.h hVar) {
        ArrayList arrayList = hVar.f16717a;
        this.f18527a = (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static void a(String str) {
        if (!str.isEmpty()) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt <= ' ' || charAt >= 127) {
                    Object[] objArr = {Integer.valueOf(charAt), Integer.valueOf(i), str};
                    byte[] bArr = jg.b.f19199a;
                    x.n(String.format(Locale.US, "Unexpected char %#04x at %d in header name: %s", objArr));
                    return;
                }
            }
            return;
        }
        x.n("name is empty");
    }

    public static void b(String str, String str2) {
        if (str != null) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if ((charAt <= 31 && charAt != '\t') || charAt >= 127) {
                    Object[] objArr = {Integer.valueOf(charAt), Integer.valueOf(i), str2, str};
                    byte[] bArr = jg.b.f19199a;
                    x.n(String.format(Locale.US, "Unexpected char %#04x at %d in %s value: %s", objArr));
                    return;
                }
            }
            return;
        }
        g5.h(a.k("value for name ", str2, " == null"));
    }

    public final String c(String str) {
        String[] strArr = this.f18527a;
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }

    public final String d(int i) {
        return this.f18527a[i * 2];
    }

    public final f4.h e() {
        f4.h hVar = new f4.h(1);
        Collections.addAll(hVar.f16717a, this.f18527a);
        return hVar;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof l) && Arrays.equals(((l) obj).f18527a, this.f18527a)) {
            return true;
        }
        return false;
    }

    public final int f() {
        return this.f18527a.length / 2;
    }

    public final String g(int i) {
        return this.f18527a[(i * 2) + 1];
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f18527a);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        int f10 = f();
        for (int i = 0; i < f10; i++) {
            sb2.append(d(i));
            sb2.append(": ");
            sb2.append(g(i));
            sb2.append("\n");
        }
        return sb2.toString();
    }
}
