package cg;

import eg.j;
import eg.p0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import pe.n;
import qe.l;
import qe.m;
import qe.s;
import qe.v;
import qe.x;
import wa.z;

/* loaded from: classes.dex */
public final class e implements d, j {

    /* renamed from: a, reason: collision with root package name */
    public final String f4118a;

    /* renamed from: b, reason: collision with root package name */
    public final z f4119b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4120c;

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f4121d;
    public final String[] e;

    /* renamed from: f, reason: collision with root package name */
    public final d[] f4122f;

    /* renamed from: g, reason: collision with root package name */
    public final List[] f4123g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f4124h;
    public final Map i;

    /* renamed from: j, reason: collision with root package name */
    public final d[] f4125j;

    /* renamed from: k, reason: collision with root package name */
    public final n f4126k;

    public e(String str, z zVar, int i, List list, a aVar) {
        this.f4118a = str;
        this.f4119b = zVar;
        this.f4120c = i;
        ArrayList arrayList = aVar.f4106b;
        arrayList.getClass();
        HashSet hashSet = new HashSet(x.b(m.d(arrayList, 12)));
        l.M(arrayList, hashSet);
        this.f4121d = hashSet;
        int i10 = 0;
        this.e = (String[]) arrayList.toArray(new String[0]);
        this.f4122f = p0.c(aVar.f4108d);
        this.f4123g = (List[]) aVar.e.toArray(new List[0]);
        ArrayList arrayList2 = aVar.f4109f;
        arrayList2.getClass();
        boolean[] zArr = new boolean[arrayList2.size()];
        int size = arrayList2.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            zArr[i10] = ((Boolean) obj).booleanValue();
            i10++;
        }
        this.f4124h = zArr;
        String[] strArr = this.e;
        strArr.getClass();
        g gVar = new g(2, new a1.c(24, strArr));
        ArrayList arrayList3 = new ArrayList(m.d(gVar, 10));
        Iterator it = gVar.iterator();
        while (true) {
            f fVar = (f) it;
            if (((Iterator) fVar.f4129w).hasNext()) {
                v vVar = (v) fVar.next();
                arrayList3.add(new pe.j(vVar.f24027b, Integer.valueOf(vVar.f24026a)));
            } else {
                this.i = x.f(arrayList3);
                this.f4125j = p0.c(list);
                this.f4126k = new n(new a1.c(15, this));
                return;
            }
        }
    }

    @Override // cg.d
    public final String a() {
        return this.f4118a;
    }

    @Override // eg.j
    public final Set b() {
        return this.f4121d;
    }

    @Override // cg.d
    public final boolean c() {
        return false;
    }

    @Override // cg.d
    public final int d(String str) {
        str.getClass();
        Integer num = (Integer) this.i.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // cg.d
    public final z e() {
        return this.f4119b;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e) {
                d dVar = (d) obj;
                if (this.f4118a.equals(dVar.a()) && Arrays.equals(this.f4125j, ((e) obj).f4125j)) {
                    int f10 = dVar.f();
                    int i = this.f4120c;
                    if (i == f10) {
                        for (int i10 = 0; i10 < i; i10++) {
                            d[] dVarArr = this.f4122f;
                            if (kotlin.jvm.internal.l.a(dVarArr[i10].a(), dVar.i(i10).a()) && kotlin.jvm.internal.l.a(dVarArr[i10].e(), dVar.i(i10).e())) {
                            }
                        }
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // cg.d
    public final int f() {
        return this.f4120c;
    }

    @Override // cg.d
    public final String g(int i) {
        return this.e[i];
    }

    @Override // cg.d
    public final List getAnnotations() {
        return s.f24023u;
    }

    @Override // cg.d
    public final List h(int i) {
        return this.f4123g[i];
    }

    public final int hashCode() {
        return ((Number) this.f4126k.getValue()).intValue();
    }

    @Override // cg.d
    public final d i(int i) {
        return this.f4122f[i];
    }

    @Override // cg.d
    public final boolean isInline() {
        return false;
    }

    @Override // cg.d
    public final boolean j(int i) {
        return this.f4124h[i];
    }

    public final String toString() {
        return p0.f(this);
    }
}
