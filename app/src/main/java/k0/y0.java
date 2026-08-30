package k0;
import t0.a;
import t0.b;
import h.a;
import r.e1;
import r.t0;
import r0.a1;

import android.os.Build;
import androidx.datastore.preferences.protobuf.s1;

/* loaded from: classes.dex */
public final class y0 extends kotlin.jvm.internal.m implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f19455u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ y2.c f19456v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a1 f19457w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y0(y2.c cVar, a1 a1Var, int i) {
        super(1);
        this.f19455u = i;
        this.f19456v = cVar;
        this.f19457w = a1Var;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        e1 e1Var;
        e1 e1Var2;
        switch (this.f19455u) {
            case 0:
                float b10 = y2.h.b(((y2.h) obj).f30807a);
                y2.c cVar = this.f19456v;
                this.f19457w.setValue(new y2.l((cVar.t0(b10) << 32) | (cVar.t0(y2.a(r0)) & 4294967295L)));
                return pe.z.f22715a;
            case 1:
                x0 x0Var = new x0(0, (df.a) obj);
                y0 y0Var = new y0(this.f19456v, this.f19457w, 0);
                if (t0.a()) {
                    if (Build.VERSION.SDK_INT == 28) {
                        e1Var = e1.f24061b;
                    } else {
                        e1Var = e1.f24062c;
                    }
                    return t0.b(x0Var, y0Var, e1Var);
                }
                s1.k("Magnifier is only supported on API level 28 and higher.");
                return null;
            case 2:
                float b11 = y2.h.b(((y2.h) obj).f30807a);
                y2.c cVar2 = this.f19456v;
                this.f19457w.setValue(new y2.l((cVar2.t0(b11) << 32) | (cVar2.t0(y2.a(r0)) & 4294967295L)));
                return pe.z.f22715a;
            default:
                x0 x0Var2 = new x0(1, (df.a) obj);
                y0 y0Var2 = new y0(this.f19456v, this.f19457w, 2);
                if (t0.a()) {
                    if (Build.VERSION.SDK_INT == 28) {
                        e1Var2 = e1.f24061b;
                    } else {
                        e1Var2 = e1.f24062c;
                    }
                    return t0.b(x0Var2, y0Var2, e1Var2);
                }
                s1.k("Magnifier is only supported on API level 28 and higher.");
                return null;
        }
    }
}
