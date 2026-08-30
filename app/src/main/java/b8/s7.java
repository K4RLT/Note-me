package b8;
import b0.b;
import b0.d;
import b8.n7;
import b8.s7;
import c7.a;
import c7.c;
import c7.h;
import c7.i;

import android.content.Context;
import android.text.TextUtils;
import com.android.billingclient.api.Purchase;
import com.google.android.gms.internal.ads.wd0;
import java.util.LinkedHashMap;
import ya.lc;

/* loaded from: classes.dex */
public final class s7 {

    /* renamed from: a, reason: collision with root package name */
    public static final s7 f2719a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final fg.s f2720b = wa.a(new b7(1));

    /* renamed from: c, reason: collision with root package name */
    public static final uf.c f2721c;

    /* renamed from: d, reason: collision with root package name */
    public static final sf.n0 f2722d;
    public static final sf.a0 e;

    /* renamed from: f, reason: collision with root package name */
    public static final sf.n0 f2723f;

    /* renamed from: g, reason: collision with root package name */
    public static final sf.a0 f2724g;

    /* renamed from: h, reason: collision with root package name */
    public static final sf.n0 f2725h;
    public static final sf.a0 i;

    /* renamed from: j, reason: collision with root package name */
    public static c f2726j;

    /* renamed from: k, reason: collision with root package name */
    public static final LinkedHashMap f2727k;

    /* renamed from: l, reason: collision with root package name */
    public static volatile Context f2728l;

    /* renamed from: m, reason: collision with root package name */
    public static volatile String f2729m;

    /* renamed from: n, reason: collision with root package name */
    public static final androidx.datastore.preferences.protobuf.s1 f2730n;

    /* JADX WARN: Type inference failed for: r0v0, types: [b8.s7, java.lang.Object] */
    static {
        pf.t1 d2 = pf.d();
        wf.e eVar = pf.l0.f22767a;
        f2721c = pf.b(lc.c(d2, wf.d.f29913w));
        sf.n0 b10 = sf.b(j7.f2260a);
        f2722d = b10;
        e = new sf.a0(b10);
        sf.n0 b11 = sf.b(qe.t.f24024u);
        f2723f = b11;
        f2724g = new sf.a0(b11);
        sf.n0 b12 = sf.b(qe.s.f24023u);
        f2725h = b12;
        i = new sf.a0(b12);
        f2727k = new LinkedHashMap();
        f2729m = "";
        f2730n = new androidx.datastore.preferences.protobuf.s1(6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x0141, code lost:
    
        if (r12 == r2) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0143, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0055, code lost:
    
        if (r12 == r2) goto L59;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v2, types: [te.c, n7] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v12, types: [qe.s] */
    /* JADX WARN: Type inference failed for: r9v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(ve.c r12) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.s7.a(ve.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d1, code lost:
    
        if (b8.s7.f2719a.f(r1, r0) == r6) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d3, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a1, code lost:
    
        if (r15 == r6) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00d1 -> B:11:0x00d4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(ve.c r15) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.s7.b(ve.c):java.lang.Object");
    }

    public static void c(Purchase purchase) {
        c cVar = f2726j;
        if (cVar != null) {
            String b10 = purchase.b();
            if (b10 != null) {
                a aVar = new a(1, false);
                aVar.f3896v = b10;
                cVar.b(aVar, new androidx.datastore.preferences.protobuf.s1(8));
                return;
            }
            q.x.n("Purchase token must be set");
        }
    }

    public static void d(Context context) {
        boolean y10;
        context.getClass();
        f2728l = context.getApplicationContext();
        c cVar = f2726j;
        boolean z3 = false;
        if (cVar != null) {
            if (cVar.f3925y) {
                y10 = true;
            } else {
                y10 = cVar.y();
            }
            if (y10) {
                z3 = true;
            }
        }
        if (z3) {
            return;
        }
        b bVar = new b(context.getApplicationContext());
        bVar.f3901c = f2730n;
        bVar.f3899a = new va.t(9);
        bVar.f3902d = true;
        c a10 = bVar.a();
        f2726j = a10;
        a10.e(new de.b(7));
    }

    public static void e(Purchase purchase, String str, String str2, String str3) {
        Object kVar;
        h hVar;
        long j10;
        String str4;
        String str5;
        try {
            i iVar = (i) f2727k.get(str);
            if (iVar != null) {
                hVar = iVar.a();
            } else {
                hVar = null;
            }
            if (hVar != null) {
                j10 = hVar.f3954b;
            } else {
                j10 = 0;
            }
            long j11 = j10;
            if (hVar != null) {
                str4 = hVar.f3955c;
            } else {
                str4 = null;
            }
            if (str4 == null) {
                str4 = "";
            }
            String str6 = str4;
            String optString = purchase.f4147c.optString("orderId");
            if (TextUtils.isEmpty(optString)) {
                str5 = null;
            } else {
                str5 = optString;
            }
            c.l(str, str2, str3, j11, str6, str5);
            kVar = pe.z.f22715a;
        } catch (Throwable th) {
            kVar = new pe.k(th);
        }
        Throwable a10 = pe.a(kVar);
        if (a10 != null) {
            wd0.o("no se pudo medir la venta: ", a10.getMessage(), "UniverseBilling");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(com.android.billingclient.api.Purchase r21, ve.c r22) {
        /*
            Method dump skipped, instructions count: 562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.s7.f(com.android.billingclient.api.Purchase, ve.c):java.lang.Object");
    }
}
