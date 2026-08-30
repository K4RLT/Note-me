package m2;
import h.a;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class d implements Appendable {

    /* renamed from: u, reason: collision with root package name */
    public final StringBuilder f20446u;

    /* renamed from: v, reason: collision with root package name */
    public final ArrayList f20447v;

    /* renamed from: w, reason: collision with root package name */
    public final ArrayList f20448w;

    public d() {
        this.f20446u = new StringBuilder(16);
        this.f20447v = new ArrayList();
        this.f20448w = new ArrayList();
        new ArrayList();
    }

    public final void a(g gVar) {
        StringBuilder sb2 = this.f20446u;
        int length = sb2.length();
        sb2.append(gVar.f20477v);
        List list = gVar.f20476u;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                e eVar = (e) list.get(i);
                this.f20448w.add(new c(eVar.f20451a, eVar.f20452b + length, eVar.f20453c + length, eVar.f20454d));
            }
        }
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i10) {
        boolean z3 = charSequence instanceof g;
        StringBuilder sb2 = this.f20446u;
        if (z3) {
            g gVar = (g) charSequence;
            int length = sb2.length();
            sb2.append((CharSequence) gVar.f20477v, i, i10);
            List a10 = a(gVar, i, i10, null);
            if (a10 != null) {
                int size = a10.size();
                for (int i11 = 0; i11 < size; i11++) {
                    e eVar = (e) a10.get(i11);
                    this.f20448w.add(new c(eVar.f20451a, eVar.f20452b + length, eVar.f20453c + length, eVar.f20454d));
                }
            }
            return this;
        }
        sb2.append(charSequence, i, i10);
        return this;
    }

    public final void b(int i) {
        ArrayList arrayList = this.f20447v;
        if (i >= arrayList.size()) {
            s2.a.b(i + " should be less than " + arrayList.size());
        }
        while (arrayList.size() - 1 >= i) {
            if (arrayList.isEmpty()) {
                s2.a.b("Nothing to pop.");
            }
            ((c) arrayList.remove(arrayList.size() - 1)).f20443c = this.f20446u.length();
        }
    }

    public final g c() {
        StringBuilder sb2 = this.f20446u;
        String sb3 = sb2.toString();
        ArrayList arrayList = this.f20448w;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(((c) arrayList.get(i)).a(sb2.length()));
        }
        return new g(sb3, arrayList2);
    }

    public d(g gVar) {
        this();
        a(gVar);
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence instanceof g) {
            a((g) charSequence);
            return this;
        }
        this.f20446u.append(charSequence);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c10) {
        this.f20446u.append(c10);
        return this;
    }
}
