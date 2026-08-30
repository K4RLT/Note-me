package u7;
import b8.c0;
import b8.p2;
import o0.h;
import o7.b;
import q.d;
import r0.a1;
import r0.e1;
import r0.f1;

import android.content.Context;

/* loaded from: classes.dex */
public final /* synthetic */ class d4 implements df.a {
    public final /* synthetic */ d A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Object E;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f26064u = 0;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ a1 f26065v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f1 f26066w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ a1 f26067x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ m3 f26068y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ pf.z f26069z;

    public /* synthetic */ d4(b bVar, m3 m3Var, Context context, a1 a1Var, pf.z zVar, a1 a1Var2, f1 f1Var, f1 f1Var2, f1 f1Var3, d dVar) {
        this.B = bVar;
        this.f26068y = m3Var;
        this.C = context;
        this.f26065v = a1Var;
        this.f26069z = zVar;
        this.f26067x = a1Var2;
        this.f26066w = f1Var;
        this.D = f1Var2;
        this.E = f1Var3;
        this.A = dVar;
    }

    @Override // df.a
    public final Object invoke() {
        int i;
        int i10;
        switch (this.f26064u) {
            case 0:
                b bVar = (b) this.B;
                Context context = (Context) this.C;
                f1 f1Var = (f1) this.D;
                f1 f1Var2 = (f1) this.E;
                this.f26067x.setValue(Boolean.FALSE);
                f1 f1Var3 = this.f26066w;
                int h3 = f1Var3.h();
                if (h3 > 0) {
                    i = h3 - 1;
                } else {
                    i = h3 + 1;
                }
                int i11 = i;
                m3 m3Var = this.f26068y;
                a1 a1Var = this.f26065v;
                if (i11 >= 0 && i11 < bVar.f21850c) {
                    pf.b0.x(this.f26069z, null, new z5(this.A, i11, m3Var, context, h3, a1Var, f1Var, f1Var3, f1Var2, null), 3);
                } else {
                    int S = m3Var.S(f1Var.h(), h3, context);
                    k6.v((l2) a1Var.getValue(), m3Var.C0(f1Var.h()), h3);
                    f1Var3.i(S);
                    f1Var2.i(S);
                }
                return pe.z.f22715a;
            default:
                o1 o1Var = (o1) this.B;
                e1 e1Var = (e1) this.C;
                d dVar = (d) this.D;
                d dVar2 = (d) this.E;
                a1 a1Var2 = this.f26065v;
                if (((Boolean) a1Var2.getValue()).booleanValue()) {
                    a1Var2.setValue(Boolean.FALSE);
                    this.f26066w.i(0);
                    a1 a1Var3 = this.f26067x;
                    String str = (String) a1Var3.getValue();
                    int b10 = o1Var.b(ff.a.b(e1Var.h()));
                    int[] iArr = (int[]) qe.k.o(o1Var.i().e, o1Var.k());
                    if (iArr != null && b10 >= 0 && b10 < iArr.length) {
                        i10 = iArr[b10];
                    } else {
                        i10 = -1;
                    }
                    if (str != null && i10 >= 0) {
                        m3 m3Var2 = this.f26068y;
                        pf.b0.x(androidx.lifecycle.h(m3Var2), null, new p2(m3Var2, str, i10, (te.c) null), 3);
                    }
                    s4 s4Var = new s4(this.A, o1Var, null, 1);
                    pf.z zVar = this.f26069z;
                    pf.b0.x(zVar, null, s4Var, 3);
                    pf.b0.x(zVar, null, new c0(14, dVar, null), 3);
                    pf.b0.x(zVar, null, new t4(dVar2, a1Var3, null, 1), 3);
                }
                return pe.z.f22715a;
        }
    }

    public /* synthetic */ d4(a1 a1Var, f1 f1Var, a1 a1Var2, o1 o1Var, e1 e1Var, m3 m3Var, pf.z zVar, d dVar, d dVar2, d dVar3) {
        this.f26065v = a1Var;
        this.f26066w = f1Var;
        this.f26067x = a1Var2;
        this.B = o1Var;
        this.C = e1Var;
        this.f26068y = m3Var;
        this.f26069z = zVar;
        this.A = dVar;
        this.D = dVar2;
        this.E = dVar3;
    }
}
