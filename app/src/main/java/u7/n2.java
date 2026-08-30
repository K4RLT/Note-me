package u7;
import a6.e;
import b2.f1;
import o0.h;
import p.a;
import p7.y0;
import r0.f1;
import w7.x4;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final /* synthetic */ class n2 implements df.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f26595u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ m3 f26596v;

    public /* synthetic */ n2(m3 m3Var, int i) {
        this.f26595u = i;
        this.f26596v = m3Var;
    }

    @Override // df.a
    public final Object invoke() {
        m3 m3Var;
        f1 f1Var;
        switch (this.f26595u) {
            case 0:
                m3Var = this.f26596v;
                f1Var = m3Var.f26543q;
                break;
            case 1:
                m3 m3Var2 = this.f26596v;
                f1 f1Var2 = m3Var2.f26541o;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) f1Var2.A;
                Set keySet = concurrentHashMap.keySet();
                keySet.getClass();
                for (String str : qe.l.P(keySet)) {
                    if (!((ConcurrentHashMap.KeySetView) f1Var2.E).contains(str) && !((ConcurrentHashMap) f1Var2.D).containsKey(str)) {
                        concurrentHashMap.remove(str);
                    }
                }
                y0.f22612b.clear();
                x4.f29438c.clear();
                v6.f26972g = null;
                v6.f26973h = null;
                HashMap hashMap = v6.i;
                synchronized (hashMap) {
                    hashMap.clear();
                }
                new Handler(Looper.getMainLooper()).post(new e(27, m3Var2));
                return pe.z.f22715a;
            case 2:
                m3 m3Var3 = this.f26596v;
                if (!m3Var3.A) {
                    m3Var3.A = true;
                    pf.b0.x(androidx.lifecycle.h(m3Var3), null, new q2(m3Var3, null, 3), 3);
                }
                return pe.z.f22715a;
            case 3:
                m3Var = this.f26596v;
                f1Var = m3Var.f26543q;
                break;
            default:
                this.f26596v.f26544r = SystemClock.uptimeMillis();
                return pe.z.f22715a;
        }
        a.x(f1Var, 1, m3Var);
        return pe.z.f22715a;
    }
}
