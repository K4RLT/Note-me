package u7;
import q.c;
import q.d;
import r0.a1;
import t.f0;
import v1.e;
import v1.w;
import y2.q;

import android.content.Context;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import b8.p8;
import com.google.android.gms.internal.ads.n00;
import wa.b9;
import ya.be;

/* loaded from: classes.dex */
public final class u5 implements PointerInputEventHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f26928a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f26929b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o1 f26930c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f26931d;
    public final /* synthetic */ Context e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d f26932f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ a1 f26933g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ a1 f26934h;
    public final /* synthetic */ pf.z i;

    public u5(float f10, d dVar, o1 o1Var, float f11, Context context, d dVar2, a1 a1Var, a1 a1Var2, pf.z zVar) {
        this.f26928a = f10;
        this.f26929b = dVar;
        this.f26930c = o1Var;
        this.f26931d = f11;
        this.e = context;
        this.f26932f = dVar2;
        this.f26933g = a1Var;
        this.f26934h = a1Var2;
        this.i = zVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(w wVar, te.c cVar) {
        if (this.f26928a < 1.0f) {
            final d dVar = this.f26929b;
            if (((Number) dVar.e()).floatValue() > 0.5f && ((Number) this.f26930c.f26660p.e()).floatValue() > 0.5f) {
                final n00 n00Var = new n00(2);
                float f10 = (2.0f / (this.f26931d * 0.8f)) * 1.0f;
                int i = this.e.getResources().getConfiguration().smallestScreenWidthDp;
                float[] fArr = v1.f26942a;
                if (i < 360) {
                    i = 360;
                }
                float pow = (float) Math.pow(i / 360.0f, 0.75f);
                if (pow > 2.4f) {
                    pow = 2.4f;
                }
                final float f11 = pow * f10;
                final o1 o1Var = this.f26930c;
                p8 p8Var = new p8(dVar, o1Var, this.f26932f, this.f26933g, this.f26934h);
                androidx.ink.authoring.compose.d dVar2 = new androidx.ink.authoring.compose.d(p8Var, 22, n00Var);
                final pf.z zVar = this.i;
                Object i10 = f0.i(wVar, dVar2, new df.a() { // from class: u7.t5
                    @Override // df.a
                    public final Object invoke() {
                        if (((Number) d.this.e()).floatValue() > 0.5f) {
                            o1 o1Var2 = o1Var;
                            d dVar3 = o1Var2.f26660p;
                            d dVar4 = o1Var2.f26661q;
                            if (((Number) dVar3.e()).floatValue() > 0.5f) {
                                float e = b9.e(ff.a.b(((Number) dVar4.e()).floatValue() + e((-q.c(n00Var.b(be.a(Float.MAX_VALUE, Float.MAX_VALUE)))) * f11)), 0, o1Var2.i().f26212a.size() - 1);
                                pf.b0.x(zVar, null, new r5(o1Var2, e, Math.abs(e - ((Number) dVar4.e()).floatValue()), null, 1), 3);
                            }
                        }
                        return pe.z.f22715a;
                    }
                }, new androidx.ink.brush.i(9, dVar, o1Var, zVar), new k5(p8Var, n00Var, f11, o1Var, zVar), cVar);
                if (i10 == ue.a.f27192u) {
                    return i10;
                }
            }
        }
        return pe.z.f22715a;
    }
}
