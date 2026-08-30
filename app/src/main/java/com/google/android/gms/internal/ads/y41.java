package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class y41 {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f12774a;

    /* renamed from: b, reason: collision with root package name */
    public int f12775b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f12776c;

    public y41(int i) {
        ed1.u(i, "initialCapacity");
        this.f12774a = new Object[i];
        this.f12775b = 0;
    }

    public static int d(int i, int i10) {
        if (i10 >= 0) {
            if (i10 <= i) {
                return i;
            }
            int i11 = i + (i >> 1) + 1;
            if (i11 < i10) {
                int highestOneBit = Integer.highestOneBit(i10 - 1);
                i11 = highestOneBit + highestOneBit;
            }
            if (i11 < 0) {
                return Integer.MAX_VALUE;
            }
            return i11;
        }
        q.x.n("cannot store more than Integer.MAX_VALUE elements");
        return 0;
    }

    public final void a(Object obj) {
        obj.getClass();
        e(1);
        Object[] objArr = this.f12774a;
        int i = this.f12775b;
        this.f12775b = i + 1;
        objArr[i] = obj;
    }

    public final void b(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            e(collection.size());
            if (collection instanceof z41) {
                this.f12775b = ((z41) collection).o(this.f12774a, this.f12775b);
                return;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            c(it.next());
        }
    }

    public abstract y41 c(Object obj);

    public final void e(int i) {
        int length = this.f12774a.length;
        int d2 = d(length, this.f12775b + i);
        if (d2 <= length && !this.f12776c) {
            return;
        }
        this.f12774a = Arrays.copyOf(this.f12774a, d2);
        this.f12776c = false;
    }
}
