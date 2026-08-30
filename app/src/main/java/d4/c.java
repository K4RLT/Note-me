package d4;

import ed.e;
import java.nio.ByteBuffer;
import q.x;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: u, reason: collision with root package name */
    public int f15724u;

    /* renamed from: v, reason: collision with root package name */
    public int f15725v;

    /* renamed from: w, reason: collision with root package name */
    public int f15726w;

    /* renamed from: x, reason: collision with root package name */
    public Object f15727x;

    public c() {
        if (e.f16486v == null) {
            e.f16486v = new e(11);
        }
    }

    public int a(int i) {
        if (i < this.f15726w) {
            return ((ByteBuffer) this.f15727x).getShort(this.f15725v + i);
        }
        return 0;
    }

    public void b() {
        if (((re.e) this.f15727x).B == this.f15726w) {
            return;
        }
        l4.a.m();
    }

    public void c() {
        while (true) {
            int i = this.f15724u;
            re.e eVar = (re.e) this.f15727x;
            if (i < eVar.f24762z && eVar.f24759w[i] < 0) {
                this.f15724u = i + 1;
            } else {
                return;
            }
        }
    }

    public boolean hasNext() {
        if (this.f15724u < ((re.e) this.f15727x).f24762z) {
            return true;
        }
        return false;
    }

    public void remove() {
        re.e eVar = (re.e) this.f15727x;
        b();
        if (this.f15725v != -1) {
            eVar.c();
            eVar.l(this.f15725v);
            this.f15725v = -1;
            this.f15726w = eVar.B;
            return;
        }
        x.o("Call next() before removing element from the iterator.");
    }
}
