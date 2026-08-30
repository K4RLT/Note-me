package xd;
import g.b;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.play_billing.o1;
import j.i0;
import kotlin.jvm.internal.l;
import vd.c0;
import vd.t;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: c, reason: collision with root package name */
    public static final e f30751c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final a4.b f30752d = o1.a(t.f27642b, new u.c(d.f30745u));

    /* renamed from: a, reason: collision with root package name */
    public final u.c f30753a;

    /* renamed from: b, reason: collision with root package name */
    public final b f30754b;

    public g(bc.g gVar, te.g gVar2, te.g gVar3, hd.e eVar) {
        gVar.a();
        Context context = gVar.f3177a;
        context.getClass();
        c0 c0Var = c0.f27556a;
        vd.b a10 = c0.a(gVar);
        u.c cVar = new u.c(context);
        i0 i0Var = new i0(a10, gVar2);
        f30751c.getClass();
        b bVar = new b(gVar3, eVar, a10, i0Var, f30752d.a(context, e.f30746a[0]));
        this.f30753a = cVar;
        this.f30754b = bVar;
    }

    public final double a() {
        Double d2;
        Bundle bundle = (Bundle) this.f30753a.f25764v;
        if (bundle.containsKey("firebase_sessions_sampling_rate")) {
            d2 = Double.valueOf(bundle.getDouble("firebase_sessions_sampling_rate"));
        } else {
            d2 = null;
        }
        if (d2 != null) {
            double doubleValue = d2.doubleValue();
            if (0.0d <= doubleValue && doubleValue <= 1.0d) {
                return doubleValue;
            }
        }
        c cVar = this.f30754b.b().f30763b;
        if (cVar != null) {
            Double d10 = cVar.f30742b;
            if (d10 != null) {
                double doubleValue2 = d10.doubleValue();
                if (0.0d <= doubleValue2 && doubleValue2 <= 1.0d) {
                    return doubleValue2;
                }
            }
            return 1.0d;
        }
        l.h("sessionConfigs");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(ve.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof xd.f
            if (r0 == 0) goto L13
            r0 = r7
            xd.f r0 = (xd.f) r0
            int r1 = r0.f30750x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30750x = r1
            goto L18
        L13:
            xd.f r0 = new xd.f
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f30748v
            int r1 = r0.f30750x
            pe.z r2 = pe.z.f22715a
            r3 = 2
            r4 = 1
            ue.a r5 = ue.a.f27192u
            if (r1 == 0) goto L39
            if (r1 == r4) goto L33
            if (r1 != r3) goto L2c
            pe.a.e(r7)
            goto L57
        L2c:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            q.x.o(r7)
            r7 = 0
            return r7
        L33:
            xd.g r1 = r0.f30747u
            pe.a.e(r7)
            goto L49
        L39:
            pe.a.e(r7)
            r0.f30747u = r6
            r0.f30750x = r4
            u.c r7 = r6.f30753a
            r7.getClass()
            if (r2 != r5) goto L48
            goto L56
        L48:
            r1 = r6
        L49:
            xd.b r7 = r1.f30754b
            r1 = 0
            r0.f30747u = r1
            r0.f30750x = r3
            java.lang.Object r7 = r7.d(r0)
            if (r7 != r5) goto L57
        L56:
            return r5
        L57:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: xd.b(ve.c):java.lang.Object");
    }
}
