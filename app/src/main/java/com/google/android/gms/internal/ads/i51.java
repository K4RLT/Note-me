package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public final class i51 extends y41 {

    /* renamed from: d, reason: collision with root package name */
    public Object[] f6998d;
    public int e;

    @Override // com.google.android.gms.internal.ads.y41
    public final /* bridge */ /* synthetic */ y41 c(Object obj) {
        f(obj);
        return this;
    }

    public final void f(Object obj) {
        obj.getClass();
        if (this.f6998d != null) {
            int q10 = j51.q(this.f12775b);
            Object[] objArr = this.f6998d;
            if (q10 <= objArr.length) {
                int length = objArr.length - 1;
                int hashCode = obj.hashCode();
                int p10 = b80.p(hashCode);
                while (true) {
                    int i = p10 & length;
                    Object[] objArr2 = this.f6998d;
                    Object obj2 = objArr2[i];
                    if (obj2 == null) {
                        objArr2[i] = obj;
                        this.e += hashCode;
                        a(obj);
                        return;
                    } else if (!obj2.equals(obj)) {
                        p10 = i + 1;
                    } else {
                        return;
                    }
                }
            }
        }
        this.f6998d = null;
        a(obj);
    }

    public final void g(Iterable iterable) {
        iterable.getClass();
        if (this.f6998d != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                f(it.next());
            }
            return;
        }
        b(iterable);
    }

    public final j51 h() {
        j51 v2;
        int i = this.f12775b;
        if (i != 0) {
            if (i != 1) {
                if (this.f6998d != null && j51.q(i) == this.f6998d.length) {
                    int i10 = this.f12775b;
                    Object[] objArr = this.f12774a;
                    int length = objArr.length;
                    if (i10 < (length >> 1) + (length >> 2)) {
                        objArr = Arrays.copyOf(objArr, i10);
                    }
                    v2 = new e61(this.e, r8.length - 1, this.f12775b, objArr, this.f6998d);
                } else {
                    v2 = j51.v(this.f12774a, this.f12775b);
                    this.f12775b = v2.size();
                }
                this.f12776c = true;
                this.f6998d = null;
                return v2;
            }
            Object obj = this.f12774a[0];
            Objects.requireNonNull(obj);
            return new k51(obj);
        }
        return e61.D;
    }
}
