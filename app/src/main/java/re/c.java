package re;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class c extends d4.c implements Iterator, ef.a {

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f24753y;

    public c(e eVar, int i) {
        this.f24753y = i;
        eVar.getClass();
        this.f15727x = eVar;
        this.f15725v = -1;
        this.f15726w = eVar.B;
        c();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f24753y) {
            case 0:
                b();
                int i = this.f15724u;
                e eVar = (e) this.f15727x;
                if (i < eVar.f24762z) {
                    this.f15724u = i + 1;
                    this.f15725v = i;
                    d dVar = new d(eVar, i);
                    c();
                    return dVar;
                }
                l4.a.c();
                return null;
            case 1:
                b();
                int i10 = this.f15724u;
                e eVar2 = (e) this.f15727x;
                if (i10 < eVar2.f24762z) {
                    this.f15724u = i10 + 1;
                    this.f15725v = i10;
                    Object obj = eVar2.f24757u[i10];
                    c();
                    return obj;
                }
                l4.a.c();
                return null;
            default:
                b();
                int i11 = this.f15724u;
                e eVar3 = (e) this.f15727x;
                if (i11 < eVar3.f24762z) {
                    this.f15724u = i11 + 1;
                    this.f15725v = i11;
                    Object[] objArr = eVar3.f24758v;
                    objArr.getClass();
                    Object obj2 = objArr[this.f15725v];
                    c();
                    return obj2;
                }
                l4.a.c();
                return null;
        }
    }
}
