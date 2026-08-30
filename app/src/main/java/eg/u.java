package eg;
import a1.c;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class u implements ag.a {

    /* renamed from: a, reason: collision with root package name */
    public final Enum[] f16585a;

    /* renamed from: b, reason: collision with root package name */
    public final pe.n f16586b = new pe.n(new c(16, this));

    public u(Enum[] enumArr) {
        this.f16585a = enumArr;
    }

    @Override // ag.a
    public final void a(gg.t tVar, Object obj) {
        Enum r52 = (Enum) obj;
        r52.getClass();
        Enum[] enumArr = this.f16585a;
        int p10 = qe.k.p(r52, enumArr);
        if (p10 != -1) {
            cg.d d2 = d();
            tVar.getClass();
            d2.getClass();
            tVar.u(d2.g(p10));
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(r52);
        String a10 = d().a();
        String arrays = Arrays.toString(enumArr);
        arrays.getClass();
        sb2.append(" is not a valid enum ");
        sb2.append(a10);
        sb2.append(", must be one of ");
        sb2.append(arrays);
        throw new IllegalArgumentException(sb2.toString());
    }

    @Override // ag.a
    public final Object b(dg.b bVar) {
        int l10 = bVar.l(d());
        Enum[] enumArr = this.f16585a;
        if (l10 >= 0 && l10 < enumArr.length) {
            return enumArr[l10];
        }
        throw new IllegalArgumentException(l10 + " is not among valid " + d().a() + " enum values, values size is " + enumArr.length);
    }

    @Override // ag.a
    public final cg.d d() {
        return (cg.d) this.f16586b.getValue();
    }

    public final String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + d().a() + '>';
    }
}
