package com.google.android.gms.internal.ads;
import g5.q;
import q.b;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class j2 {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f7285a;

    /* renamed from: b, reason: collision with root package name */
    public final List f7286b;

    /* renamed from: c, reason: collision with root package name */
    public final d51 f7287c;

    static {
        String str = bq0.f4860a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
    }

    public j2(Uri uri, d51 d51Var) {
        List list = Collections.EMPTY_LIST;
        this.f7285a = uri;
        ArrayList arrayList = ha.f6640a;
        this.f7286b = list;
        this.f7287c = d51Var;
        b51 b51Var = d51.f5314v;
        ed1.u(4, "initialCapacity");
        Object[] objArr = new Object[4];
        if (d51Var.size() <= 0) {
            d51.w(objArr, 0);
        } else {
            d51Var.get(0).getClass();
            g5.q.b();
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j2)) {
            return false;
        }
        j2 j2Var = (j2) obj;
        if (this.f7285a.equals(j2Var.f7285a) && this.f7286b.equals(j2Var.f7286b) && this.f7287c.equals(j2Var.f7287c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (int) ((((this.f7287c.hashCode() + ((this.f7286b.hashCode() + (this.f7285a.hashCode() * 923521)) * 961)) * 31) * 31) - Long.MAX_VALUE);
    }
}
