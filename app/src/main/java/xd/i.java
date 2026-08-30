package xd;

import com.facebook.ads.AdError;
import kotlin.jvm.internal.l;
import pf.b0;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: c, reason: collision with root package name */
    public static final b4.e f30758c = new b4.e("firebase_sessions_enabled");

    /* renamed from: d, reason: collision with root package name */
    public static final b4.e f30759d = new b4.e("firebase_sessions_sampling_rate");
    public static final b4.e e = new b4.e("firebase_sessions_restart_timeout");

    /* renamed from: f, reason: collision with root package name */
    public static final b4.e f30760f = new b4.e("firebase_sessions_cache_duration");

    /* renamed from: g, reason: collision with root package name */
    public static final b4.e f30761g = new b4.e("firebase_sessions_cache_updated_time");

    /* renamed from: a, reason: collision with root package name */
    public final y3.f f30762a;

    /* renamed from: b, reason: collision with root package name */
    public c f30763b;

    public i(y3.f fVar) {
        this.f30762a = fVar;
        b0.C(te.h.f25707u, new l5.a(this, null, 22));
    }

    public static final void a(i iVar, b4.b bVar) {
        iVar.getClass();
        iVar.f30763b = new c((Boolean) bVar.a(f30758c), (Double) bVar.a(f30759d), (Integer) bVar.a(e), (Integer) bVar.a(f30760f), (Long) bVar.a(f30761g));
    }

    public final boolean b() {
        c cVar = this.f30763b;
        if (cVar != null) {
            Long l10 = cVar.e;
            if (cVar != null) {
                Integer num = cVar.f30744d;
                if (l10 != null && num != null && (System.currentTimeMillis() - l10.longValue()) / AdError.NETWORK_ERROR_CODE < num.intValue()) {
                    return false;
                }
                return true;
            }
            l.h("sessionConfigs");
            throw null;
        }
        l.h("sessionConfigs");
        throw null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(4:18|19|20|(1:22))|11|12|13))|26|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0025, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0050, code lost:
    
        android.util.Log.w("SettingsCache", "Failed to update cache config value: " + r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(b4.e r10, java.lang.Object r11, ve.c r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof xd.h
            if (r0 == 0) goto L13
            r0 = r12
            xd.h r0 = (xd.h) r0
            int r1 = r0.f30757w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30757w = r1
            goto L18
        L13:
            xd.h r0 = new xd.h
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.f30755u
            int r1 = r0.f30757w
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L28
            pe.a.e(r12)     // Catch: java.io.IOException -> L25
            goto L63
        L25:
            r0 = move-exception
            r10 = r0
            goto L50
        L28:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            q.x.o(r10)
            r10 = 0
            return r10
        L2f:
            pe.a.e(r12)
            y3.f r12 = r9.f30762a     // Catch: java.io.IOException -> L25
            b8.u9 r3 = new b8.u9     // Catch: java.io.IOException -> L25
            r8 = 8
            r7 = 0
            r6 = r9
            r5 = r10
            r4 = r11
            r3.<init>(r4, r5, r6, r7, r8)     // Catch: java.io.IOException -> L25
            r0.f30757w = r2     // Catch: java.io.IOException -> L25
            b4.c r10 = new b4.c     // Catch: java.io.IOException -> L25
            r11 = 1
            r10.<init>(r3, r7, r11)     // Catch: java.io.IOException -> L25
            java.lang.Object r10 = r12.a(r10, r0)     // Catch: java.io.IOException -> L25
            ue.a r11 = ue.a.f27192u
            if (r10 != r11) goto L63
            return r11
        L50:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "Failed to update cache config value: "
            r11.<init>(r12)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            java.lang.String r11 = "SettingsCache"
            android.util.Log.w(r11, r10)
        L63:
            pe.z r10 = pe.z.f22715a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: xd.i.c(b4.e, java.lang.Object, ve.c):java.lang.Object");
    }
}
