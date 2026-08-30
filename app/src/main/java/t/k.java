package t;
import r0.i1;
import t.f1;

/* loaded from: classes.dex */
public final class k implements f1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f25434a;

    public k(l lVar) {
        this.f25434a = lVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.jvm.internal.m, df.l] */
    @Override // f1
    public final float a(float f10) {
        boolean z3;
        if (Float.isNaN(f10)) {
            return 0.0f;
        }
        l lVar = this.f25434a;
        float floatValue = ((Number) lVar.f25445a.invoke(Float.valueOf(f10))).floatValue();
        i1 i1Var = lVar.e;
        boolean z9 = false;
        if (floatValue > 0.0f) {
            z3 = true;
        } else {
            z3 = false;
        }
        i1Var.setValue(Boolean.valueOf(z3));
        i1 i1Var2 = lVar.f25449f;
        if (floatValue < 0.0f) {
            z9 = true;
        }
        i1Var2.setValue(Boolean.valueOf(z9));
        return floatValue;
    }
}
