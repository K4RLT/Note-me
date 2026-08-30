package eg;
import l.a;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class z extends r0 {

    /* renamed from: l, reason: collision with root package name */
    public final boolean f16601l;

    public z(String str, a0 a0Var) {
        super(str, a0Var, 1);
        this.f16601l = true;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, pe.g] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, pe.g] */
    @Override // eg.r0
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof z) {
                cg.d dVar = (cg.d) obj;
                if (this.f16569a.equals(dVar.a())) {
                    z zVar = (z) obj;
                    if (zVar.f16601l && Arrays.equals((cg.d[]) this.f16576j.getValue(), (cg.d[]) zVar.f16576j.getValue())) {
                        int f10 = dVar.f();
                        int i = this.f16571c;
                        if (i == f10) {
                            for (int i10 = 0; i10 < i; i10++) {
                                if (kotlin.jvm.internal.a(i(i10).a(), dVar.i(i10).a()) && kotlin.jvm.internal.a(i(i10).e(), dVar.i(i10).e())) {
                                }
                            }
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // eg.r0
    public final int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // eg.r0, cg.d
    public final boolean isInline() {
        return this.f16601l;
    }
}
