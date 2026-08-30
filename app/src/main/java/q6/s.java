package q6;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class s implements c, r6.a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f23557a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f23558b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final int f23559c;

    /* renamed from: d, reason: collision with root package name */
    public final r6.f f23560d;
    public final r6.f e;

    /* renamed from: f, reason: collision with root package name */
    public final r6.f f23561f;

    public s(x6.b bVar, w6.p pVar) {
        this.f23557a = pVar.e;
        this.f23559c = pVar.f27770a;
        r6.f b10 = pVar.f27771b.b();
        this.f23560d = b10;
        r6.f b11 = pVar.f27772c.b();
        this.e = b11;
        r6.f b12 = pVar.f27773d.b();
        this.f23561f = b12;
        bVar.e(b10);
        bVar.e(b11);
        bVar.e(b12);
        b10.a(this);
        b11.a(this);
        b12.a(this);
    }

    @Override // r6.a
    public final void a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f23558b;
            if (i < arrayList.size()) {
                ((r6.a) arrayList.get(i)).a();
                i++;
            } else {
                return;
            }
        }
    }

    public final void e(r6.a aVar) {
        this.f23558b.add(aVar);
    }

    @Override // q6.c
    public final void b(List list, List list2) {
    }
}
