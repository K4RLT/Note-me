package s6;

import r0.i1;

/* loaded from: classes.dex */
public final class e extends kotlin.jvm.internal.m implements df.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f24942u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ g f24943v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(g gVar, int i) {
        super(0);
        this.f24942u = i;
        this.f24943v = gVar;
    }

    @Override // df.a
    public final Object invoke() {
        float floatValue;
        boolean z3;
        switch (this.f24942u) {
            case 0:
                g gVar = this.f24943v;
                float f10 = 0.0f;
                if (((o6.a) gVar.C.getValue()) != null) {
                    float floatValue2 = ((Number) gVar.f24953z.getValue()).floatValue();
                    i1 i1Var = gVar.f24952y;
                    if (floatValue2 < 0.0f) {
                        l lVar = (l) i1Var.getValue();
                        if (lVar != null) {
                            f10 = lVar.f24966a;
                        }
                    } else {
                        l lVar2 = (l) i1Var.getValue();
                        f10 = lVar2 != null ? lVar2.f24967b : 1.0f;
                    }
                }
                return Float.valueOf(f10);
            case 1:
                g gVar2 = this.f24943v;
                i1 i1Var2 = gVar2.f24953z;
                if (((Boolean) gVar2.f24951x.getValue()).booleanValue() && gVar2.f() % 2 == 0) {
                    floatValue = -((Number) i1Var2.getValue()).floatValue();
                } else {
                    floatValue = ((Number) i1Var2.getValue()).floatValue();
                }
                return Float.valueOf(floatValue);
            default:
                g gVar3 = this.f24943v;
                if (gVar3.f() == ((Number) gVar3.f24950w.getValue()).intValue() && ((Number) gVar3.E.getValue()).floatValue() == gVar3.e()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                return Boolean.valueOf(z3);
        }
    }
}
