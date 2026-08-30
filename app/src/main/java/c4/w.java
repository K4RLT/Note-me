package c4;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f3871a;

    /* renamed from: b, reason: collision with root package name */
    public z f3872b;

    public w(int i) {
        this.f3871a = new SparseArray(i);
    }

    public final void a(z zVar, int i, int i10) {
        w wVar;
        int a10 = zVar.a(i);
        SparseArray sparseArray = this.f3871a;
        if (sparseArray == null) {
            wVar = null;
        } else {
            wVar = (w) sparseArray.get(a10);
        }
        if (wVar == null) {
            wVar = new w(1);
            sparseArray.put(zVar.a(i), wVar);
        }
        if (i10 > i) {
            wVar.a(zVar, i + 1, i10);
        } else {
            wVar.f3872b = zVar;
        }
    }
}
