package va;

import java.util.Objects;
import ya.xc;

/* loaded from: classes.dex */
public final class k extends d {

    /* renamed from: w, reason: collision with root package name */
    public final transient Object[] f27491w;

    /* renamed from: x, reason: collision with root package name */
    public final transient int f27492x;

    /* renamed from: y, reason: collision with root package name */
    public final transient int f27493y;

    public k(Object[] objArr, int i, int i10) {
        this.f27491w = objArr;
        this.f27492x = i;
        this.f27493y = i10;
    }

    @Override // java.util.List
    public final Object get(int i) {
        xc.a(i, this.f27493y);
        Object obj = this.f27491w[i + i + this.f27492x];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f27493y;
    }
}
