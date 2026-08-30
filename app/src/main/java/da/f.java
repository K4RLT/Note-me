package da;
import d.e;
import f.c;
import l.b;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.internal.ads.mu;
import fa.y;
import java.util.Collections;
import java.util.Set;
import va.t;

/* loaded from: classes.dex */
public abstract class f {
    public final t A;
    public final ea.d B;

    /* renamed from: u, reason: collision with root package name */
    public final Context f15822u;

    /* renamed from: v, reason: collision with root package name */
    public final String f15823v;

    /* renamed from: w, reason: collision with root package name */
    public final mu f15824w;

    /* renamed from: x, reason: collision with root package name */
    public final b f15825x;

    /* renamed from: y, reason: collision with root package name */
    public final ea.a f15826y;

    /* renamed from: z, reason: collision with root package name */
    public final int f15827z;

    public f(Context context, mu muVar, b bVar, e eVar) {
        String str;
        y.i(context, "Null context is not permitted.");
        y.i(muVar, "Api must not be null.");
        y.i(eVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        y.i(applicationContext, "The provided context did not have an application context.");
        this.f15822u = applicationContext;
        if (Build.VERSION.SDK_INT >= 30) {
            str = context.getAttributionTag();
        } else {
            str = null;
        }
        this.f15823v = str;
        this.f15824w = muVar;
        this.f15825x = bVar;
        this.f15826y = new ea.a(muVar, bVar, str);
        ea.d e = ea.e(applicationContext);
        this.B = e;
        this.f15827z = e.B.getAndIncrement();
        this.A = eVar.f15821a;
        bb.a aVar = e.G;
        aVar.sendMessage(aVar.obtainMessage(7, this));
    }

    public final ra.e b() {
        ra.e eVar = new ra.e(28, false);
        Set set = Collections.EMPTY_SET;
        if (((n.f) eVar.f24675v) == null) {
            eVar.f24675v = new n.f(0);
        }
        ((n.f) eVar.f24675v).addAll(set);
        Context context = this.f15822u;
        eVar.f24677x = context.getClass().getName();
        eVar.f24676w = context.getPackageName();
        return eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ib.o c(int r14, com.google.android.gms.internal.mlkit_vision_digital_ink.i8 r15) {
        /*
            r13 = this;
            ib.h r0 = new ib.h
            r0.<init>()
            va.t r1 = r13.A
            ea.d r3 = r13.B
            r3.getClass()
            int r4 = r15.f14469c
            if (r4 == 0) goto L81
            ea.a r5 = r13.f15826y
            boolean r2 = r3.a()
            if (r2 != 0) goto L19
            goto L56
        L19:
            fa.l r2 = fa.b()
            java.lang.Object r2 = r2.f16895u
            fa.m r2 = (fa.m) r2
            r6 = 1
            if (r2 == 0) goto L58
            boolean r7 = r2.f16899v
            if (r7 == 0) goto L56
            boolean r2 = r2.f16900w
            java.util.concurrent.ConcurrentHashMap r7 = r3.D
            java.lang.Object r7 = r7.get(r5)
            ea.l r7 = (ea.l) r7
            if (r7 == 0) goto L54
            da.c r8 = r7.f16017v
            boolean r9 = r8 instanceof fa.e
            if (r9 == 0) goto L56
            fa.e r8 = (fa.e) r8
            fa.g0 r9 = r8.P
            if (r9 == 0) goto L54
            boolean r9 = r8.e()
            if (r9 != 0) goto L54
            fa.f r2 = ea.q.a(r7, r8, r4)
            if (r2 == 0) goto L56
            int r8 = r7.F
            int r8 = r8 + r6
            r7.F = r8
            boolean r6 = r2.f16852w
            goto L58
        L54:
            r6 = r2
            goto L58
        L56:
            r2 = 0
            goto L70
        L58:
            ea.q r2 = new ea.q
            r7 = 0
            if (r6 == 0) goto L63
            long r9 = java.lang.System.currentTimeMillis()
            goto L64
        L63:
            r9 = r7
        L64:
            if (r6 == 0) goto L6a
            long r7 = android.os.SystemClock.elapsedRealtime()
        L6a:
            r11 = r9
            r8 = r7
            r6 = r11
            r2.<init>(r3, r4, r5, r6, r8)
        L70:
            if (r2 == 0) goto L81
            ib.o r4 = r0.f18363a
            bb.a r5 = r3.G
            r5.getClass()
            ea.j r6 = new ea.j
            r6.<init>(r5)
            r4.c(r6, r2)
        L81:
            ea.v r2 = new ea.v
            r2.<init>(r14, r15, r0, r1)
            java.util.concurrent.atomic.AtomicInteger r14 = r3.C
            ea.s r15 = new ea.s
            int r14 = r14.get()
            r15.<init>(r2, r14, r13)
            bb.a r14 = r3.G
            r1 = 4
            android.os.Message r15 = r14.obtainMessage(r1, r15)
            r14.sendMessage(r15)
            ib.o r14 = r0.f18363a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: da.c(int, com.google.android.gms.internal.mlkit_vision_digital_ink.i8):ib.o");
    }
}
