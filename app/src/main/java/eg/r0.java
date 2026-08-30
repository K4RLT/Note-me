package eg;
import l.a;
import p0.c;
import p0.d;
import p0.f;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public class r0 implements cg.d, j {

    /* renamed from: a, reason: collision with root package name */
    public final String f16569a;

    /* renamed from: b, reason: collision with root package name */
    public final y f16570b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16571c;

    /* renamed from: d, reason: collision with root package name */
    public int f16572d = -1;
    public final String[] e;

    /* renamed from: f, reason: collision with root package name */
    public final List[] f16573f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f16574g;

    /* renamed from: h, reason: collision with root package name */
    public Object f16575h;
    public final Object i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f16576j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f16577k;

    public r0(String str, y yVar, int i) {
        this.f16569a = str;
        this.f16570b = yVar;
        this.f16571c = i;
        String[] strArr = new String[i];
        for (int i10 = 0; i10 < i; i10++) {
            strArr[i10] = "[UNINITIALIZED]";
        }
        this.e = strArr;
        int i11 = this.f16571c;
        this.f16573f = new List[i11];
        this.f16574g = new boolean[i11];
        this.f16575h = qe.t.f24024u;
        final int i12 = 0;
        df.a aVar = new df.a(this) { // from class: eg.q0

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ r0 f16566v;

            {
                this.f16566v = this;
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, pe.g] */
            @Override // df.a
            public final Object invoke() {
                ArrayList arrayList;
                switch (i12) {
                    case 0:
                        y yVar2 = this.f16566v.f16570b;
                        if (yVar2 != null) {
                            return yVar2.c();
                        }
                        return p0.f16560b;
                    case 1:
                        if (this.f16566v.f16570b != null) {
                            arrayList = new ArrayList(0);
                        } else {
                            arrayList = null;
                        }
                        return c(arrayList);
                    default:
                        r0 r0Var = this.f16566v;
                        return Integer.valueOf(d(r0Var, (cg.d[]) r0Var.f16576j.getValue()));
                }
            }
        };
        pe.h hVar = pe.h.f22690u;
        this.i = pe.a.c(hVar, aVar);
        final int i13 = 1;
        this.f16576j = pe.a.c(hVar, new df.a(this) { // from class: eg.q0

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ r0 f16566v;

            {
                this.f16566v = this;
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, pe.g] */
            @Override // df.a
            public final Object invoke() {
                ArrayList arrayList;
                switch (i13) {
                    case 0:
                        y yVar2 = this.f16566v.f16570b;
                        if (yVar2 != null) {
                            return yVar2.c();
                        }
                        return p0.f16560b;
                    case 1:
                        if (this.f16566v.f16570b != null) {
                            arrayList = new ArrayList(0);
                        } else {
                            arrayList = null;
                        }
                        return c(arrayList);
                    default:
                        r0 r0Var = this.f16566v;
                        return Integer.valueOf(d(r0Var, (cg.d[]) r0Var.f16576j.getValue()));
                }
            }
        });
        final int i14 = 2;
        this.f16577k = pe.a.c(hVar, new df.a(this) { // from class: eg.q0

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ r0 f16566v;

            {
                this.f16566v = this;
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, pe.g] */
            @Override // df.a
            public final Object invoke() {
                ArrayList arrayList;
                switch (i14) {
                    case 0:
                        y yVar2 = this.f16566v.f16570b;
                        if (yVar2 != null) {
                            return yVar2.c();
                        }
                        return p0.f16560b;
                    case 1:
                        if (this.f16566v.f16570b != null) {
                            arrayList = new ArrayList(0);
                        } else {
                            arrayList = null;
                        }
                        return c(arrayList);
                    default:
                        r0 r0Var = this.f16566v;
                        return Integer.valueOf(d(r0Var, (cg.d[]) r0Var.f16576j.getValue()));
                }
            }
        });
    }

    @Override // cg.d
    public final String a() {
        return this.f16569a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    @Override // eg.j
    public final Set b() {
        return this.f16575h.keySet();
    }

    @Override // cg.d
    public final boolean c() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    @Override // cg.d
    public final int d(String str) {
        str.getClass();
        Integer num = (Integer) this.f16575h.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // cg.d
    public wa.z e() {
        return cg.i.f4134b;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, pe.g] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, pe.g] */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof r0) {
                cg.d dVar = (cg.d) obj;
                if (this.f16569a.equals(dVar.a()) && Arrays.equals((cg.d[]) this.f16576j.getValue(), (cg.d[]) ((r0) obj).f16576j.getValue())) {
                    int f10 = dVar.f();
                    int i = this.f16571c;
                    if (i == f10) {
                        for (int i10 = 0; i10 < i; i10++) {
                            if (kotlin.jvm.internal.a(i(i10).a(), dVar.i(i10).a()) && kotlin.jvm.internal.a(i(i10).e(), dVar.i(i10).e())) {
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
        return this.f16571c;
    }

    @Override // cg.d
    public final String g(int i) {
        return this.e[i];
    }

    @Override // cg.d
    public final List getAnnotations() {
        return qe.s.f24023u;
    }

    @Override // cg.d
    public final List h(int i) {
        List list = this.f16573f[i];
        if (list == null) {
            return qe.s.f24023u;
        }
        return list;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, pe.g] */
    public int hashCode() {
        return ((Number) this.f16577k.getValue()).intValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, pe.g] */
    @Override // cg.d
    public cg.d i(int i) {
        return ((ag.a[]) this.i.getValue())[i].d();
    }

    @Override // cg.d
    public boolean isInline() {
        return false;
    }

    @Override // cg.d
    public final boolean j(int i) {
        return this.f16574g[i];
    }

    public final void k(String str, boolean z3) {
        str.getClass();
        int i = this.f16572d + 1;
        this.f16572d = i;
        String[] strArr = this.e;
        strArr[i] = str;
        this.f16574g[i] = z3;
        this.f16573f[i] = null;
        if (i == this.f16571c - 1) {
            HashMap hashMap = new HashMap();
            int length = strArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                hashMap.put(strArr[i10], Integer.valueOf(i10));
            }
            this.f16575h = hashMap;
        }
    }

    public String toString() {
        return f(this);
    }
}
