package k1;
import b.c;

import android.graphics.Shader;
import android.graphics.SweepGradient;
import java.util.ArrayList;
import wa.u8;

/* loaded from: classes.dex */
public final class s0 extends n0 {

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f19526c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f19527d;

    public s0(ArrayList arrayList, ArrayList arrayList2) {
        this.f19526c = arrayList;
        this.f19527d = arrayList2;
    }

    @Override // k1.n0
    public final Shader b(long j10) {
        long b10 = u8.b(j10);
        ArrayList arrayList = this.f19526c;
        ArrayList arrayList2 = this.f19527d;
        l0.L(arrayList, arrayList2);
        int o10 = l0.o(arrayList);
        return new SweepGradient(Float.intBitsToFloat((int) (b10 >> 32)), Float.intBitsToFloat((int) (b10 & 4294967295L)), l0.v(o10, arrayList), l0.w(arrayList2, arrayList, o10));
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof s0) {
                s0 s0Var = (s0) obj;
                if (!j1.c(9205357640488583168L, 9205357640488583168L) || !this.f19526c.equals(s0Var.f19526c) || !this.f19527d.equals(s0Var.f19527d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f19527d.hashCode() + ((this.f19526c.hashCode() + (Long.hashCode(9205357640488583168L) * 31)) * 31);
    }

    public final String toString() {
        return "SweepGradient(colors=" + this.f19526c + ", stops=" + this.f19527d + ')';
    }
}
