package k1;
import a0.f0;
import l.a;
import u.a;

import android.graphics.Paint;
import android.graphics.Shader;

/* loaded from: classes.dex */
public abstract class n0 extends n {

    /* renamed from: a, reason: collision with root package name */
    public ic.c f19505a;

    /* renamed from: b, reason: collision with root package name */
    public long f19506b = 9205357640488583168L;

    @Override // k1.n
    public final void a(float f10, long j10, f0 f0Var) {
        Shader shader;
        ic.c cVar = this.f19505a;
        Shader shader2 = null;
        if (cVar == null || !j1.e.a(this.f19506b, j10)) {
            if (j1.e.e(j10)) {
                this.f19505a = null;
                this.f19506b = 9205357640488583168L;
                cVar = null;
            } else {
                cVar = this.f19505a;
                if (cVar == null) {
                    cVar = new ic.c(6, false);
                    this.f19505a = cVar;
                }
                cVar.f18393v = b(j10);
                this.f19505a = cVar;
                this.f19506b = j10;
            }
        }
        long c10 = l0.c(((Paint) f0Var.f48c).getColor());
        long j11 = r.f19513b;
        if (!pe.a(c10, j11)) {
            f0Var.H(j11);
        }
        Shader shader3 = (Shader) f0Var.f49d;
        if (cVar != null) {
            shader = (Shader) cVar.f18393v;
        } else {
            shader = null;
        }
        if (!kotlin.jvm.internal.a(shader3, shader)) {
            if (cVar != null) {
                shader2 = (Shader) cVar.f18393v;
            }
            f0Var.L(shader2);
        }
        if (((Paint) f0Var.f48c).getAlpha() / 255.0f == f10) {
            return;
        }
        f0Var.F(f10);
    }

    public abstract Shader b(long j10);
}
