package k1;
import b.c;
import l.a;

import android.graphics.RadialGradient;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;
import wa.u8;

/* loaded from: classes.dex */
public final class j0 extends n0 {

    /* renamed from: c, reason: collision with root package name */
    public final List f19489c;

    /* renamed from: d, reason: collision with root package name */
    public final List f19490d;
    public final long e;

    /* renamed from: f, reason: collision with root package name */
    public final float f19491f;

    /* renamed from: g, reason: collision with root package name */
    public final int f19492g;

    public j0(List list, ArrayList arrayList, long j10, float f10, int i) {
        this.f19489c = list;
        this.f19490d = arrayList;
        this.e = j10;
        this.f19491f = f10;
        this.f19492g = i;
    }

    @Override // k1.n0
    public final Shader b(long j10) {
        float intBitsToFloat;
        float intBitsToFloat2;
        long j11 = this.e;
        if ((9223372034707292159L & j11) == 9205357640488583168L) {
            long b10 = u8.b(j10);
            intBitsToFloat = Float.intBitsToFloat((int) (b10 >> 32));
            intBitsToFloat2 = Float.intBitsToFloat((int) (b10 & 4294967295L));
        } else {
            int i = (int) (j11 >> 32);
            if (Float.intBitsToFloat(i) == Float.POSITIVE_INFINITY) {
                i = (int) (j10 >> 32);
            }
            intBitsToFloat = Float.intBitsToFloat(i);
            int i10 = (int) (j11 & 4294967295L);
            if (Float.intBitsToFloat(i10) == Float.POSITIVE_INFINITY) {
                i10 = (int) (j10 & 4294967295L);
            }
            intBitsToFloat2 = Float.intBitsToFloat(i10);
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
        float f10 = this.f19491f;
        if (f10 == Float.POSITIVE_INFINITY) {
            f10 = j1.e.c(j10) / 2;
        }
        float f11 = f10;
        List list = this.f19489c;
        List list2 = this.f19490d;
        l0.L(list, list2);
        int o10 = l0.o(list);
        return new RadialGradient(Float.intBitsToFloat((int) (floatToRawIntBits >> 32)), Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)), f11, l0.v(o10, list), l0.w(list2, list, o10), l0.E(this.f19492g));
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof j0) {
                j0 j0Var = (j0) obj;
                if (this.f19489c.equals(j0Var.f19489c) && kotlin.jvm.internal.a(this.f19490d, j0Var.f19490d) && j1.c(this.e, j0Var.e) && this.f19491f == j0Var.f19491f && this.f19492g == j0Var.f19492g) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.f19489c.hashCode() * 31;
        List list = this.f19490d;
        if (list != null) {
            i = list.hashCode();
        } else {
            i = 0;
        }
        return Integer.hashCode(this.f19492g) + a.a(a.d(this.e, (hashCode + i) * 31, 31), 31, this.f19491f);
    }

    public final String toString() {
        String str;
        String str2;
        long j10 = this.e;
        String str3 = "";
        if ((9223372034707292159L & j10) == 9205357640488583168L) {
            str = "";
        } else {
            str = "center=" + ((Object) j1.b.j(j10)) + ", ";
        }
        float f10 = this.f19491f;
        if ((Float.floatToRawIntBits(f10) & Integer.MAX_VALUE) < 2139095040) {
            str3 = "radius=" + f10 + ", ";
        }
        StringBuilder sb2 = new StringBuilder("RadialGradient(colors=");
        sb2.append(this.f19489c);
        sb2.append(", stops=");
        sb2.append(this.f19490d);
        sb2.append(", ");
        sb2.append(str);
        sb2.append(str3);
        sb2.append("tileMode=");
        int i = this.f19492g;
        if (i == 0) {
            str2 = "Clamp";
        } else if (i == 1) {
            str2 = "Repeated";
        } else if (i == 2) {
            str2 = "Mirror";
        } else if (i == 3) {
            str2 = "Decal";
        } else {
            str2 = "Unknown";
        }
        sb2.append((Object) str2);
        sb2.append(')');
        return sb2.toString();
    }
}
