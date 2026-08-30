package p1;

import a0.f0;
import b2.l0;
import ic.c;
import k1.s;
import kotlin.jvm.internal.l;
import y2.m;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public f0 f22359a;

    /* renamed from: b, reason: collision with root package name */
    public s f22360b;

    /* renamed from: c, reason: collision with root package name */
    public float f22361c = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    public m f22362d = m.f30814u;

    public abstract void a(float f10);

    public abstract void b(s sVar);

    public final void c(l0 l0Var, long j10, float f10, s sVar) {
        m1.b bVar = l0Var.f1533u;
        if (this.f22361c != f10) {
            a(f10);
            this.f22361c = f10;
        }
        if (!l.a(this.f22360b, sVar)) {
            b(sVar);
            this.f22360b = sVar;
        }
        m layoutDirection = l0Var.getLayoutDirection();
        if (this.f22362d != layoutDirection) {
            this.f22362d = layoutDirection;
        }
        int i = (int) (j10 >> 32);
        float intBitsToFloat = Float.intBitsToFloat((int) (bVar.e() >> 32)) - Float.intBitsToFloat(i);
        int i10 = (int) (j10 & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat((int) (bVar.e() & 4294967295L)) - Float.intBitsToFloat(i10);
        ((c) bVar.f20424v.f18636v).w(0.0f, 0.0f, intBitsToFloat, intBitsToFloat2);
        if (f10 > 0.0f) {
            try {
                if (Float.intBitsToFloat(i) > 0.0f && Float.intBitsToFloat(i10) > 0.0f) {
                    e(l0Var);
                }
            } finally {
                ((c) bVar.f20424v.f18636v).w(-0.0f, -0.0f, -intBitsToFloat, -intBitsToFloat2);
            }
        }
    }

    public abstract long d();

    public abstract void e(l0 l0Var);
}
