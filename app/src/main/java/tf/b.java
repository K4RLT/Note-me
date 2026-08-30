package tf;

import java.util.Arrays;
import pe.z;
import sf.d0;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: u, reason: collision with root package name */
    public d[] f25711u;

    /* renamed from: v, reason: collision with root package name */
    public int f25712v;

    /* renamed from: w, reason: collision with root package name */
    public int f25713w;

    /* renamed from: x, reason: collision with root package name */
    public x f25714x;

    public final d c() {
        d dVar;
        x xVar;
        synchronized (this) {
            try {
                d[] dVarArr = this.f25711u;
                if (dVarArr == null) {
                    dVarArr = f();
                    this.f25711u = dVarArr;
                } else if (this.f25712v >= dVarArr.length) {
                    Object[] copyOf = Arrays.copyOf(dVarArr, dVarArr.length * 2);
                    this.f25711u = (d[]) copyOf;
                    dVarArr = (d[]) copyOf;
                }
                int i = this.f25713w;
                do {
                    dVar = dVarArr[i];
                    if (dVar == null) {
                        dVar = d();
                        dVarArr[i] = dVar;
                    }
                    i++;
                    if (i >= dVarArr.length) {
                        i = 0;
                    }
                } while (!dVar.a(this));
                this.f25713w = i;
                this.f25712v++;
                xVar = this.f25714x;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (xVar != null) {
            xVar.w(1);
        }
        return dVar;
    }

    public abstract d d();

    public abstract d[] f();

    public final void g(d dVar) {
        x xVar;
        int i;
        te.c[] b10;
        synchronized (this) {
            try {
                int i10 = this.f25712v - 1;
                this.f25712v = i10;
                xVar = this.f25714x;
                if (i10 == 0) {
                    this.f25713w = 0;
                }
                dVar.getClass();
                b10 = dVar.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (te.c cVar : b10) {
            if (cVar != null) {
                cVar.resumeWith(z.f22715a);
            }
        }
        if (xVar != null) {
            xVar.w(-1);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [sf.d0, tf.x] */
    public final x h() {
        x xVar;
        synchronized (this) {
            x xVar2 = this.f25714x;
            xVar = xVar2;
            if (xVar2 == null) {
                int i = this.f25712v;
                d0 d0Var = new d0(1, Integer.MAX_VALUE, rf.a.f24770v);
                d0Var.q(Integer.valueOf(i));
                this.f25714x = d0Var;
                xVar = d0Var;
            }
        }
        return xVar;
    }
}