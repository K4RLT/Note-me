package c2;
import b2.w1;
import j2.h;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class l2 implements w1 {

    /* renamed from: u, reason: collision with root package name */
    public final int f3569u;

    /* renamed from: v, reason: collision with root package name */
    public final List f3570v;

    /* renamed from: w, reason: collision with root package name */
    public Float f3571w = null;

    /* renamed from: x, reason: collision with root package name */
    public Float f3572x = null;

    /* renamed from: y, reason: collision with root package name */
    public h f3573y = null;

    /* renamed from: z, reason: collision with root package name */
    public h f3574z = null;

    public l2(int i, ArrayList arrayList) {
        this.f3569u = i;
        this.f3570v = arrayList;
    }

    @Override // w1
    public final boolean r() {
        return this.f3570v.contains(this);
    }
}
