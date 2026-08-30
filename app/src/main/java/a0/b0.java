package a0;

import com.google.android.gms.internal.ads.mu;
import java.util.List;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f20a;

    /* renamed from: b, reason: collision with root package name */
    public final a0[] f21b;

    /* renamed from: c, reason: collision with root package name */
    public final mu f22c;

    /* renamed from: d, reason: collision with root package name */
    public final List f23d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final int f24f;

    /* renamed from: g, reason: collision with root package name */
    public final int f25g;

    public b0(int i, a0[] a0VarArr, mu muVar, List list, int i10) {
        this.f20a = i;
        this.f21b = a0VarArr;
        this.f22c = muVar;
        this.f23d = list;
        this.e = i10;
        int i11 = 0;
        for (a0 a0Var : a0VarArr) {
            i11 = Math.max(i11, a0Var.f11k);
        }
        this.f24f = i11;
        int i12 = i11 + this.e;
        this.f25g = i12 >= 0 ? i12 : 0;
    }

    public final a0[] a(int i, int i10, int i11) {
        a0[] a0VarArr = this.f21b;
        int length = a0VarArr.length;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i12 < length) {
            a0 a0Var = a0VarArr[i12];
            int i15 = i13 + 1;
            int i16 = (int) ((c) this.f23d.get(i13)).f26a;
            a0Var.k(i, ((int[]) this.f22c.f8423w)[i14], i10, i11, this.f20a, i14);
            i14 += i16;
            i12++;
            i13 = i15;
        }
        return a0VarArr;
    }
}
