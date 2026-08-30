package u7;
import o7.b;
import q.d;
import v1.t;

import b8.p8;
import com.google.android.gms.internal.ads.n00;

/* loaded from: classes.dex */
public final /* synthetic */ class k5 implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f26408u = 1;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ n00 f26409v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ float f26410w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ pf.z f26411x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f26412y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f26413z;

    public /* synthetic */ k5(p8 p8Var, n00 n00Var, float f10, o1 o1Var, pf.z zVar) {
        this.f26412y = p8Var;
        this.f26409v = n00Var;
        this.f26410w = f10;
        this.f26413z = o1Var;
        this.f26411x = zVar;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f26408u) {
            case 0:
                b bVar = (b) this.f26412y;
                d dVar = (d) this.f26413z;
                t tVar = (t) obj;
                float floatValue = ((Float) obj2).floatValue();
                tVar.getClass();
                this.f26409v.a(tVar.f27342b, tVar.f27343c);
                int i = bVar.f21850c - 1;
                if (i < 0) {
                    i = 0;
                }
                pf.b0.x(this.f26411x, null, new l5(dVar, floatValue, this.f26410w, i, null), 3);
                return pe.z.f22715a;
            default:
                p8 p8Var = (p8) this.f26412y;
                o1 o1Var = (o1) this.f26413z;
                t tVar2 = (t) obj;
                float floatValue2 = ((Float) obj2).floatValue();
                tVar2.getClass();
                if (((Boolean) p8Var.invoke()).booleanValue()) {
                    this.f26409v.a(tVar2.f27342b, tVar2.f27343c);
                    pf.b0.x(this.f26411x, null, new r5(o1Var, (-floatValue2) * this.f26410w, o1Var.i().f26212a.size() - 1, null, 2), 3);
                }
                return pe.z.f22715a;
        }
    }

    public /* synthetic */ k5(n00 n00Var, b bVar, pf.z zVar, d dVar, float f10) {
        this.f26409v = n00Var;
        this.f26412y = bVar;
        this.f26411x = zVar;
        this.f26413z = dVar;
        this.f26410w = f10;
    }
}
