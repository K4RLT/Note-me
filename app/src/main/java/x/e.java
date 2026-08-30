package x;
import f.a;
import f.b;
import x.d;
import x.f;

/* loaded from: classes.dex */
public final class e implements d, f {

    /* renamed from: a, reason: collision with root package name */
    public final float f29955a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f29956b;

    /* renamed from: c, reason: collision with root package name */
    public final df.p f29957c;

    /* renamed from: d, reason: collision with root package name */
    public final float f29958d;

    public e(float f10, boolean z3, df.p pVar) {
        this.f29955a = f10;
        this.f29956b = z3;
        this.f29957c = pVar;
        this.f29958d = f10;
    }

    @Override // d, f
    public final float a() {
        return this.f29958d;
    }

    @Override // f
    public final void b(y2.c cVar, int i, int[] iArr, int[] iArr2) {
        c(cVar, i, iArr, y2.m.f30814u, iArr2);
    }

    @Override // d
    public final void c(y2.c cVar, int i, int[] iArr, y2.m mVar, int[] iArr2) {
        boolean z3;
        int i10;
        int i11;
        if (iArr.length != 0) {
            int t02 = cVar.t0(this.f29955a);
            if (this.f29956b && mVar == y2.m.f30815v) {
                z3 = true;
            } else {
                z3 = false;
            }
            q0 q0Var = h.f29961a;
            if (!z3) {
                int length = iArr.length;
                int i12 = 0;
                i10 = 0;
                i11 = 0;
                int i13 = 0;
                while (i12 < length) {
                    int i14 = iArr[i12];
                    int min = Math.min(i10, i - i14);
                    iArr2[i13] = min;
                    int min2 = Math.min(t02, (i - min) - i14);
                    int i15 = iArr2[i13] + i14 + min2;
                    i12++;
                    i11 = min2;
                    i10 = i15;
                    i13++;
                }
            } else {
                i10 = 0;
                i11 = 0;
                for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                    int i16 = iArr[length2];
                    int min3 = Math.min(i10, i - i16);
                    iArr2[length2] = min3;
                    i11 = Math.min(t02, (i - min3) - i16);
                    i10 = iArr2[length2] + i16 + i11;
                }
            }
            int i17 = i10 - i11;
            df.p pVar = this.f29957c;
            if (pVar != null && i17 < i) {
                int intValue = ((Number) pVar.invoke(Integer.valueOf(i - i17), mVar)).intValue();
                int length3 = iArr2.length;
                for (int i18 = 0; i18 < length3; i18++) {
                    iArr2[i18] = iArr2[i18] + intValue;
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (!y2.a(this.f29955a, eVar.f29955a) || this.f29956b != eVar.f29956b || !kotlin.jvm.internal.a(this.f29957c, eVar.f29957c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int c10 = a.c(Float.hashCode(this.f29955a) * 31, 31, this.f29956b);
        df.p pVar = this.f29957c;
        if (pVar == null) {
            hashCode = 0;
        } else {
            hashCode = pVar.hashCode();
        }
        return c10 + hashCode;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        if (this.f29956b) {
            str = "";
        } else {
            str = "Absolute";
        }
        sb2.append(str);
        sb2.append("Arrangement#spacedAligned(");
        sb2.append((Object) y2.b(this.f29955a));
        sb2.append(", ");
        sb2.append(this.f29957c);
        sb2.append(')');
        return sb2.toString();
    }
}
