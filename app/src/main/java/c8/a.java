package c8;

import b8.b7;
import com.google.android.gms.internal.ads.wd0;
import java.io.Serializable;
import java.util.Map;
import mf.f;
import qe.k;
import qe.l;
import w7.i1;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f4005a = new Object();

    public static Serializable a(String str, String str2, String str3) {
        return i("POST", wd0.n(c(), "/functions/v1/", str), str2, str3);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.io.Serializable b(java.lang.String r13, java.io.File r14, df.l r15) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c8.a.b(java.lang.String, java.io.File, df.l):java.io.Serializable");
    }

    public static String c() {
        Object subSequence;
        char[] cArr = {'/'};
        int i = 39;
        while (true) {
            int i10 = i - 1;
            if (!k.b(cArr, "https://oqbcvhdykmiasihzbnus.supabase.co".charAt(i))) {
                subSequence = "https://oqbcvhdykmiasihzbnus.supabase.co".subSequence(0, i + 1);
                break;
            }
            if (i10 < 0) {
                subSequence = "";
                break;
            }
            i = i10;
        }
        return subSequence.toString();
    }

    public static boolean d() {
        if (!f.u(c()) && !f.u("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6Im9xYmN2aGR5a21pYXNpaHpibnVzIiwicm9sZSI6ImFub24iLCJpYXQiOjE3ODY4NTI4MTIsImV4cCI6MjEwMjQyODgxMn0._ijhLPCjqyZtZmWXnWtJwwJr8t9fgRkfkNwMyZwBgFc")) {
            return true;
        }
        return false;
    }

    public static Serializable e(String str, Map map) {
        String concat;
        String B = l.B(map.entrySet(), "&", null, null, new b7(12), 30);
        String c10 = c();
        if (B.length() == 0) {
            concat = "";
        } else {
            concat = "?".concat(B);
        }
        return i("GET", i1.d(c10, "/rest/v1/", str, concat), null, null);
    }

    public static Serializable f(String str, String str2, String str3) {
        return i("PATCH", wd0.n(c(), "/", f.K(str, '/')), str2, str3);
    }

    public static Serializable g(String str, String str2) {
        return i("POST", wd0.n(c(), "/", f.K(str, '/')), str2, null);
    }

    public static String h(String str, String str2) {
        str2.getClass();
        return c() + "/storage/v1/object/public/" + str + "/" + f.K(str2, '/');
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.io.Serializable i(java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c8.a.i(java.lang.String, java.lang.String, java.lang.String, java.lang.String):java.io.Serializable");
    }

    public static Serializable j(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        return i("POST", wd0.n(c(), "/rest/v1/rpc/", str), str2, str3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0133  */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.net.HttpURLConnection, java.net.URLConnection] */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object k(java.lang.String r9, java.lang.String r10, java.io.File r11, java.lang.String r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c8.a.k(java.lang.String, java.lang.String, java.io.File, java.lang.String, java.lang.String):java.lang.Object");
    }
}
