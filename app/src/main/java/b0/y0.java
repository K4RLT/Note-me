package b0;
import b0.y0;
import c0.d;
import t.f1;
import z.m;

import u7.l2;

/* loaded from: classes.dex */
public final class y0 extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f1288u;

    /* renamed from: v, reason: collision with root package name */
    public int f1289v;

    /* renamed from: w, reason: collision with root package name */
    public int f1290w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f1291x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y0(df.l lVar, int i, int i10, te.c cVar, int i11) {
        super(2, cVar);
        this.f1288u = i11;
        this.f1291x = lVar;
        this.f1289v = i;
        this.f1290w = i10;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f1288u) {
            case 0:
                return new y0((z0) this.f1291x, this.f1290w, cVar, 0);
            case 1:
                y0 y0Var = new y0((m) this.f1291x, cVar, 1);
                y0Var.f1290w = ((Number) obj).intValue();
                return y0Var;
            case 2:
                return new y0((d) this.f1291x, this.f1290w, cVar, 2);
            case 3:
                return new y0((u7.y0) this.f1291x, this.f1289v, this.f1290w, cVar, 3);
            case 4:
                return new y0((u7.y0) this.f1291x, this.f1289v, this.f1290w, cVar, 4);
            default:
                return new y0((l2) this.f1291x, cVar, 5);
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1288u) {
            case 0:
                return ((y0) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 1:
                return ((y0) create(Integer.valueOf(((Number) obj).intValue()), (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 2:
                return ((y0) create((f1) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 3:
                y0 y0Var = (y0) create((pf.z) obj, (te.c) obj2);
                pe.z zVar = pe.z.f22715a;
                y0Var.invokeSuspend(zVar);
                return zVar;
            case 4:
                y0 y0Var2 = (y0) create((pf.z) obj, (te.c) obj2);
                pe.z zVar2 = pe.z.f22715a;
                y0Var2.invokeSuspend(zVar2);
                return zVar2;
            default:
                return ((y0) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0057 -> B:9:0x006f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x006d -> B:9:0x006f). Please report as a decompilation issue!!! */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.y0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y0(Object obj, int i, te.c cVar, int i10) {
        super(2, cVar);
        this.f1288u = i10;
        this.f1291x = obj;
        this.f1290w = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y0(Object obj, te.c cVar, int i) {
        super(2, cVar);
        this.f1288u = i;
        this.f1291x = obj;
    }
}
