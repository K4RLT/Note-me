package g0;
import g0.i;
import m2.g0;
import m2.g;
import m2.q0;

import java.util.List;

/* loaded from: classes.dex */
public final class o1 {

    /* renamed from: a, reason: collision with root package name */
    public final g f17232a;

    /* renamed from: b, reason: collision with root package name */
    public final q0 f17233b;
    public final boolean e;

    /* renamed from: g, reason: collision with root package name */
    public final y2.c f17237g;

    /* renamed from: h, reason: collision with root package name */
    public final q2.h f17238h;

    /* renamed from: j, reason: collision with root package name */
    public com.google.android.gms.internal.mlkit_vision_digital_ink.u0 f17239j;

    /* renamed from: k, reason: collision with root package name */
    public y2.m f17240k;

    /* renamed from: c, reason: collision with root package name */
    public final int f17234c = Integer.MAX_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public final int f17235d = 1;

    /* renamed from: f, reason: collision with root package name */
    public final int f17236f = 1;
    public final List i = qe.s.f24023u;

    public o1(g gVar, q0 q0Var, boolean z3, y2.c cVar, q2.h hVar, int i) {
        this.f17232a = gVar;
        this.f17233b = q0Var;
        this.e = z3;
        this.f17237g = cVar;
        this.f17238h = hVar;
    }

    public final void a(y2.m mVar) {
        com.google.android.gms.internal.mlkit_vision_digital_ink.u0 u0Var = this.f17239j;
        if (u0Var == null || mVar != this.f17240k || u0Var.a()) {
            this.f17240k = mVar;
            u0Var = new com.google.android.gms.internal.mlkit_vision_digital_ink.u0(this.f17232a, g0.i(this.f17233b, mVar), this.i, this.f17237g, this.f17238h);
        }
        this.f17239j = u0Var;
    }
}
