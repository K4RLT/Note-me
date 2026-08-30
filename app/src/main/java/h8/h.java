package h8;
import j.i;

import d1.r;
import pe.z;
import r0.y;
import wa.s7;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements df.p {
    public final /* synthetic */ pe.d A;
    public final /* synthetic */ pe.d B;
    public final /* synthetic */ pe.d C;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f17942u = 0;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f17943v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f17944w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f17945x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f17946y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f17947z;

    public /* synthetic */ h(r rVar, f fVar, boolean z3, df.l lVar, df.l lVar2, df.l lVar3, df.p pVar, int i) {
        this.f17945x = rVar;
        this.f17946y = fVar;
        this.f17943v = z3;
        this.f17947z = lVar;
        this.A = lVar2;
        this.B = lVar3;
        this.C = pVar;
        this.f17944w = i;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f17942u) {
            case 0:
                r rVar = (r) this.f17945x;
                f fVar = (f) this.f17946y;
                df.l lVar = (df.l) this.f17947z;
                df.l lVar2 = (df.l) this.A;
                df.l lVar3 = (df.l) this.B;
                df.p pVar = (df.p) this.C;
                ((Integer) obj2).getClass();
                rVar.getClass();
                fVar.getClass();
                lVar3.getClass();
                pVar.getClass();
                s7.a(rVar, fVar, this.f17943v, lVar, lVar2, lVar3, pVar, (r0.m) obj, y.L(this.f17944w | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                int L = y.L(24577);
                x7.i((String) this.f17945x, (String) this.f17946y, this.f17943v, (Integer) this.f17947z, (df.a) this.A, (df.a) this.B, (df.a) this.C, (r0.m) obj, L, this.f17944w);
                break;
        }
        return z.f22715a;
    }

    public /* synthetic */ h(String str, String str2, boolean z3, Integer num, df.a aVar, df.a aVar2, df.a aVar3, int i, int i10) {
        this.f17945x = str;
        this.f17946y = str2;
        this.f17943v = z3;
        this.f17947z = num;
        this.A = aVar;
        this.B = aVar2;
        this.C = aVar3;
        this.f17944w = i10;
    }
}
