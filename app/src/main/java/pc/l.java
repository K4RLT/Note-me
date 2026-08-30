package pc;
import l.b;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Locale;

/* loaded from: classes.dex */
public final class l implements c {

    /* renamed from: w, reason: collision with root package name */
    public static final Charset f22672w = Charset.forName("UTF-8");

    /* renamed from: u, reason: collision with root package name */
    public final File f22673u;

    /* renamed from: v, reason: collision with root package name */
    public k f22674v;

    public l(File file) {
        this.f22673u = file;
    }

    @Override // pc.c
    public final void a() {
        oc.g.c(this.f22674v, "There was a problem closing the Crashlytics log file.");
        this.f22674v = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x004b  */
    @Override // pc.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String b() {
        /*
            r7 = this;
            java.io.File r0 = r7.f22673u
            boolean r0 = r0.exists()
            r1 = 0
            r2 = 0
            if (r0 != 0) goto Lc
        La:
            r4 = r2
            goto L3a
        Lc:
            r7.c()
            pc.k r0 = r7.f22674v
            if (r0 != 0) goto L14
            goto La
        L14:
            int[] r3 = new int[]{r1}
            int r0 = r0.B()
            byte[] r0 = new byte[r0]
            pc.k r4 = r7.f22674v     // Catch: java.io.IOException -> L29
            pc.e r5 = new pc.e     // Catch: java.io.IOException -> L29
            r5.<init>(r0, r3)     // Catch: java.io.IOException -> L29
            r4.k(r5)     // Catch: java.io.IOException -> L29
            goto L31
        L29:
            r4 = move-exception
            java.lang.String r5 = "A problem occurred while reading the Crashlytics log file."
            java.lang.String r6 = "FirebaseCrashlytics"
            android.util.Log.e(r6, r5, r4)
        L31:
            c7.x r4 = new c7.x
            r3 = r3[r1]
            r5 = 16
            r4.<init>(r0, r3, r5)
        L3a:
            if (r4 != 0) goto L3e
            r3 = r2
            goto L49
        L3e:
            int r0 = r4.f4002v
            byte[] r3 = new byte[r0]
            java.lang.Object r4 = r4.f4003w
            byte[] r4 = (byte[]) r4
            java.lang.System.arraycopy(r4, r1, r3, r1, r0)
        L49:
            if (r3 == 0) goto L53
            java.lang.String r0 = new java.lang.String
            java.nio.charset.Charset r1 = pc.l.f22672w
            r0.<init>(r3, r1)
            return r0
        L53:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: pc.b():java.lang.String");
    }

    public final void c() {
        File file = this.f22673u;
        if (this.f22674v == null) {
            try {
                this.f22674v = new k(file);
            } catch (IOException e) {
                Log.e("FirebaseCrashlytics", "Could not open log file: " + file, e);
            }
        }
    }

    @Override // pc.c
    public final void i(long j10, String str) {
        c();
        if (this.f22674v != null) {
            try {
                if (str.length() > 16384) {
                    str = "...".concat(str.substring(str.length() - 16384));
                }
                this.f22674v.f(String.format(Locale.US, "%d %s%n", Long.valueOf(j10), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(f22672w));
                while (!this.f22674v.m() && this.f22674v.B() > 65536) {
                    this.f22674v.r();
                }
            } catch (IOException e) {
                Log.e("FirebaseCrashlytics", "There was a problem writing to the Crashlytics log.", e);
            }
        }
    }
}
