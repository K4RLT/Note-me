package c2;
import t.f1;
import v.a;
import v1.w;

import android.os.Build;
import android.os.Handler;
import android.view.Choreographer;
import com.google.android.gms.internal.ads.qw0;
import u7.t3;
import ya.he;

/* loaded from: classes.dex */
public final class w0 extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f3676u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w0(int i, te.c cVar, int i10) {
        super(i, cVar);
        this.f3676u = i10;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f3676u) {
            case 0:
                return new w0(2, cVar, 0);
            case 1:
                return new w0(2, cVar, 1);
            case 2:
                return new w0(2, cVar, 2);
            case 3:
                return new w0(2, cVar, 3);
            case 4:
                return new w0(2, cVar, 4);
            default:
                return new w0(2, cVar, 5);
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f3676u) {
            case 0:
                return ((w0) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 1:
                return ((w0) create((qw0) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 2:
                return ((w0) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 3:
                w0 w0Var = (w0) create((w) obj, (te.c) obj2);
                pe.z zVar = pe.z.f22715a;
                w0Var.invokeSuspend(zVar);
                return zVar;
            case 4:
                w0 w0Var2 = (w0) create((pf.z) obj, (te.c) obj2);
                pe.z zVar2 = pe.z.f22715a;
                w0Var2.invokeSuspend(zVar2);
                return zVar2;
            default:
                w0 w0Var3 = (w0) create((f1) obj, (te.c) obj2);
                pe.z zVar3 = pe.z.f22715a;
                w0Var3.invokeSuspend(zVar3);
                return zVar3;
        }
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        Object kVar;
        switch (this.f3676u) {
            case 0:
                pe.a.e(obj);
                return Choreographer.getInstance();
            case 1:
                pe.a.e(obj);
                qw0 C = qw0.C();
                C.getClass();
                return C;
            case 2:
                pe.a.e(obj);
                Object obj2 = null;
                try {
                    t3 t3Var = he.f31325a;
                    if (t3Var != null) {
                        kVar = (String) t3Var.invoke();
                    } else {
                        kVar = null;
                    }
                } catch (Throwable th) {
                    kVar = new pe.k(th);
                }
                if (!(kVar instanceof pe.k)) {
                    obj2 = kVar;
                }
                return (String) obj2;
            case 3:
                pe.a.e(obj);
                return pe.z.f22715a;
            case 4:
                pe.a.e(obj);
                boolean z3 = p7.v.f22585a;
                final int i = 2048;
                final int d2 = (int) p7.m0.d();
                if (Build.VERSION.SDK_INT >= 34 && p7.v.f22585a) {
                    ((Handler) p7.v.f22588d.getValue()).post(new Runnable() { // from class: p7.s
                        @Override // java.lang.Runnable
                        public final void run() {
                            a(i, d2);
                        }
                    });
                }
                return pe.z.f22715a;
            default:
                pe.a.e(obj);
                return pe.z.f22715a;
        }
    }
}
