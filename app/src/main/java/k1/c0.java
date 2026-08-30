package k1;
import b.c;
import l.a;
import p.a;

import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class c0 extends n0 {

    /* renamed from: c, reason: collision with root package name */
    public final List f19468c;

    /* renamed from: d, reason: collision with root package name */
    public final List f19469d;
    public final long e;

    /* renamed from: f, reason: collision with root package name */
    public final long f19470f;

    public c0(List list, ArrayList arrayList, long j10, long j11) {
        this.f19468c = list;
        this.f19469d = arrayList;
        this.e = j10;
        this.f19470f = j11;
    }

    @Override // k1.n0
    public final Shader b(long j10) {
        long j11 = this.e;
        int i = (int) (j11 >> 32);
        if (Float.intBitsToFloat(i) == Float.POSITIVE_INFINITY) {
            i = (int) (j10 >> 32);
        }
        float intBitsToFloat = Float.intBitsToFloat(i);
        int i10 = (int) (j11 & 4294967295L);
        if (Float.intBitsToFloat(i10) == Float.POSITIVE_INFINITY) {
            i10 = (int) (j10 & 4294967295L);
        }
        float intBitsToFloat2 = Float.intBitsToFloat(i10);
        long j12 = this.f19470f;
        int i11 = (int) (j12 >> 32);
        if (Float.intBitsToFloat(i11) == Float.POSITIVE_INFINITY) {
            i11 = (int) (j10 >> 32);
        }
        float intBitsToFloat3 = Float.intBitsToFloat(i11);
        int i12 = (int) (j12 & 4294967295L);
        if (Float.intBitsToFloat(i12) == Float.POSITIVE_INFINITY) {
            i12 = (int) (j10 & 4294967295L);
        }
        float intBitsToFloat4 = Float.intBitsToFloat(i12);
        return l0.h((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L), (Float.floatToRawIntBits(intBitsToFloat3) << 32) | (Float.floatToRawIntBits(intBitsToFloat4) & 4294967295L), this.f19468c, this.f19469d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c0) {
            c0 c0Var = (c0) obj;
            if (kotlin.jvm.internal.a(this.f19468c, c0Var.f19468c) && kotlin.jvm.internal.a(this.f19469d, c0Var.f19469d) && j1.c(this.e, c0Var.e) && j1.c(this.f19470f, c0Var.f19470f)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.f19468c.hashCode() * 31;
        List list = this.f19469d;
        if (list != null) {
            i = list.hashCode();
        } else {
            i = 0;
        }
        return Integer.hashCode(0) + a.d(this.f19470f, a.d(this.e, (hashCode + i) * 31, 31), 31);
    }

    public final String toString() {
        String str;
        long j10 = this.e;
        String str2 = "";
        if (((((j10 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) != 0) {
            str = "";
        } else {
            str = "start=" + ((Object) j1.b.j(j10)) + ", ";
        }
        long j11 = this.f19470f;
        if (((((j11 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str2 = "end=" + ((Object) j1.b.j(j11)) + ", ";
        }
        return "LinearGradient(colors=" + this.f19468c + ", stops=" + this.f19469d + ", " + str + str2 + "tileMode=" + ((Object) "Clamp") + ')';
    }
}
