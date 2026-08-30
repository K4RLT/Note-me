package q6;

import java.util.List;

/* loaded from: classes.dex */
public final class p implements r6.a, c {

    /* renamed from: a, reason: collision with root package name */
    public final o6.j f23547a;

    /* renamed from: b, reason: collision with root package name */
    public final r6.e f23548b;

    /* renamed from: c, reason: collision with root package name */
    public w6.k f23549c;

    public p(o6.j jVar, x6.b bVar, w6.j jVar2) {
        this.f23547a = jVar;
        r6.e b10 = jVar2.f27748a.b();
        this.f23548b = b10;
        bVar.e(b10);
        b10.a(this);
    }

    public static int e(int i, int i10) {
        int i11 = i / i10;
        if ((i ^ i10) < 0 && i11 * i10 != i) {
            i11--;
        }
        return i - (i11 * i10);
    }

    @Override // r6.a
    public final void a() {
        this.f23547a.invalidateSelf();
    }

    @Override // q6.c
    public final void b(List list, List list2) {
    }
}
