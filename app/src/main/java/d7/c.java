package d7;

import df.p;
import pe.z;
import ve.i;
import x7.f0;

/* loaded from: classes.dex */
public final class c extends i implements p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f15766u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ float f15767v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i, te.c cVar, int i10) {
        super(i, cVar);
        this.f15766u = i10;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f15766u) {
            case 0:
                c cVar2 = new c(2, cVar, 0);
                cVar2.f15767v = ((Number) obj).floatValue();
                return cVar2;
            case 1:
                c cVar3 = new c(2, cVar, 1);
                cVar3.f15767v = ((Number) obj).floatValue();
                return cVar3;
            case 2:
                c cVar4 = new c(2, cVar, 2);
                cVar4.f15767v = ((Number) obj).floatValue();
                return cVar4;
            case 3:
                c cVar5 = new c(2, cVar, 3);
                cVar5.f15767v = ((Number) obj).floatValue();
                return cVar5;
            case 4:
                c cVar6 = new c(2, cVar, 4);
                cVar6.f15767v = ((Number) obj).floatValue();
                return cVar6;
            case 5:
                c cVar7 = new c(2, cVar, 5);
                cVar7.f15767v = ((Number) obj).floatValue();
                return cVar7;
            case 6:
                c cVar8 = new c(2, cVar, 6);
                cVar8.f15767v = ((Number) obj).floatValue();
                return cVar8;
            default:
                c cVar9 = new c(2, cVar, 7);
                cVar9.f15767v = ((Number) obj).floatValue();
                return cVar9;
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f15766u;
        float floatValue = ((Number) obj).floatValue();
        te.c cVar = (te.c) obj2;
        switch (i) {
            case 0:
                c cVar2 = (c) create(Float.valueOf(floatValue), cVar);
                z zVar = z.f22715a;
                cVar2.invokeSuspend(zVar);
                return zVar;
            case 1:
                return ((c) create(Float.valueOf(floatValue), cVar)).invokeSuspend(z.f22715a);
            case 2:
                c cVar3 = (c) create(Float.valueOf(floatValue), cVar);
                z zVar2 = z.f22715a;
                cVar3.invokeSuspend(zVar2);
                return zVar2;
            case 3:
                c cVar4 = (c) create(Float.valueOf(floatValue), cVar);
                z zVar3 = z.f22715a;
                cVar4.invokeSuspend(zVar3);
                return zVar3;
            case 4:
                c cVar5 = (c) create(Float.valueOf(floatValue), cVar);
                z zVar4 = z.f22715a;
                cVar5.invokeSuspend(zVar4);
                return zVar4;
            case 5:
                c cVar6 = (c) create(Float.valueOf(floatValue), cVar);
                z zVar5 = z.f22715a;
                cVar6.invokeSuspend(zVar5);
                return zVar5;
            case 6:
                c cVar7 = (c) create(Float.valueOf(floatValue), cVar);
                z zVar6 = z.f22715a;
                cVar7.invokeSuspend(zVar6);
                return zVar6;
            default:
                c cVar8 = (c) create(Float.valueOf(floatValue), cVar);
                z zVar7 = z.f22715a;
                cVar8.invokeSuspend(zVar7);
                return zVar7;
        }
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        boolean z3;
        int i = this.f15766u;
        z zVar = z.f22715a;
        switch (i) {
            case 0:
                float f10 = this.f15767v;
                pe.a.e(obj);
                f0.f(f10);
                return zVar;
            case 1:
                pe.a.e(obj);
                if (this.f15767v > 0.0f) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                return Boolean.valueOf(z3);
            case 2:
                float f11 = this.f15767v;
                pe.a.e(obj);
                f0.f(f11);
                return zVar;
            case 3:
                float f12 = this.f15767v;
                pe.a.e(obj);
                f0.f(f12);
                return zVar;
            case 4:
                float f13 = this.f15767v;
                pe.a.e(obj);
                f0.f(f13);
                return zVar;
            case 5:
                float f14 = this.f15767v;
                pe.a.e(obj);
                f0.f(f14);
                return zVar;
            case 6:
                float f15 = this.f15767v;
                pe.a.e(obj);
                f0.f(f15);
                return zVar;
            default:
                float f16 = this.f15767v;
                pe.a.e(obj);
                f0.f(f16);
                return zVar;
        }
    }
}
