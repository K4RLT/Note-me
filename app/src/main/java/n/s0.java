package n;
import o.a;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class s0 implements Cloneable {

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ int[] f20938u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object[] f20939v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ int f20940w;

    public s0(int i) {
        int i10;
        int i11 = 4;
        while (true) {
            i10 = 40;
            if (i11 >= 32) {
                break;
            }
            int i12 = (1 << i11) - 12;
            if (40 <= i12) {
                i10 = i12;
                break;
            }
            i11++;
        }
        int i13 = i10 / 4;
        this.f20938u = new int[i13];
        this.f20939v = new Object[i13];
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final s0 clone() {
        Object clone = super.clone();
        clone.getClass();
        s0 s0Var = (s0) clone;
        s0Var.f20938u = (int[]) this.f20938u.clone();
        s0Var.f20939v = (Object[]) this.f20939v.clone();
        return s0Var;
    }

    public final Object b(int i) {
        Object obj;
        int a10 = a.a(this.f20938u, this.f20940w, i);
        if (a10 >= 0 && (obj = this.f20939v[a10]) != r.f20931c) {
            return obj;
        }
        return null;
    }

    public final void c(int i, Object obj) {
        int a10 = a.a(this.f20938u, this.f20940w, i);
        if (a10 >= 0) {
            this.f20939v[a10] = obj;
            return;
        }
        int i10 = ~a10;
        int i11 = this.f20940w;
        if (i10 < i11) {
            Object[] objArr = this.f20939v;
            if (objArr[i10] == r.f20931c) {
                this.f20938u[i10] = i;
                objArr[i10] = obj;
                return;
            }
        }
        if (i11 >= this.f20938u.length) {
            int i12 = (i11 + 1) * 4;
            int i13 = 4;
            while (true) {
                if (i13 >= 32) {
                    break;
                }
                int i14 = (1 << i13) - 12;
                if (i12 <= i14) {
                    i12 = i14;
                    break;
                }
                i13++;
            }
            int i15 = i12 / 4;
            this.f20938u = Arrays.copyOf(this.f20938u, i15);
            this.f20939v = Arrays.copyOf(this.f20939v, i15);
        }
        int i16 = this.f20940w;
        if (i16 - i10 != 0) {
            int[] iArr = this.f20938u;
            int i17 = i10 + 1;
            qe.k.c(i17, i10, i16, iArr, iArr);
            Object[] objArr2 = this.f20939v;
            qe.k.d(i17, i10, this.f20940w, objArr2, objArr2);
        }
        this.f20938u[i10] = i;
        this.f20939v[i10] = obj;
        this.f20940w++;
    }

    public final Object d(int i) {
        Object[] objArr = this.f20939v;
        if (i < objArr.length) {
            return objArr[i];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public final String toString() {
        int i = this.f20940w;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(i * 28);
        sb2.append('{');
        int i10 = this.f20940w;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            sb2.append(this.f20938u[i11]);
            sb2.append('=');
            Object d2 = d(i11);
            if (d2 != this) {
                sb2.append(d2);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }
}
