package x6;

import com.google.android.gms.internal.mlkit_vision_digital_ink.u0;
import j6.s;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final List f30115a;

    /* renamed from: b, reason: collision with root package name */
    public final o6.a f30116b;

    /* renamed from: c, reason: collision with root package name */
    public final String f30117c;

    /* renamed from: d, reason: collision with root package name */
    public final long f30118d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final long f30119f;

    /* renamed from: g, reason: collision with root package name */
    public final String f30120g;

    /* renamed from: h, reason: collision with root package name */
    public final List f30121h;
    public final v6.d i;

    /* renamed from: j, reason: collision with root package name */
    public final int f30122j;

    /* renamed from: k, reason: collision with root package name */
    public final int f30123k;

    /* renamed from: l, reason: collision with root package name */
    public final int f30124l;

    /* renamed from: m, reason: collision with root package name */
    public final float f30125m;

    /* renamed from: n, reason: collision with root package name */
    public final float f30126n;

    /* renamed from: o, reason: collision with root package name */
    public final float f30127o;

    /* renamed from: p, reason: collision with root package name */
    public final float f30128p;

    /* renamed from: q, reason: collision with root package name */
    public final v6.a f30129q;

    /* renamed from: r, reason: collision with root package name */
    public final s f30130r;

    /* renamed from: s, reason: collision with root package name */
    public final v6.b f30131s;

    /* renamed from: t, reason: collision with root package name */
    public final List f30132t;

    /* renamed from: u, reason: collision with root package name */
    public final int f30133u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f30134v;

    /* renamed from: w, reason: collision with root package name */
    public final u.c f30135w;

    /* renamed from: x, reason: collision with root package name */
    public final u0 f30136x;

    /* renamed from: y, reason: collision with root package name */
    public final int f30137y;

    public e(List list, o6.a aVar, String str, long j10, int i, long j11, String str2, List list2, v6.d dVar, int i10, int i11, int i12, float f10, float f11, float f12, float f13, v6.a aVar2, s sVar, List list3, int i13, v6.b bVar, boolean z3, u.c cVar, u0 u0Var, int i14) {
        this.f30115a = list;
        this.f30116b = aVar;
        this.f30117c = str;
        this.f30118d = j10;
        this.e = i;
        this.f30119f = j11;
        this.f30120g = str2;
        this.f30121h = list2;
        this.i = dVar;
        this.f30122j = i10;
        this.f30123k = i11;
        this.f30124l = i12;
        this.f30125m = f10;
        this.f30126n = f11;
        this.f30127o = f12;
        this.f30128p = f13;
        this.f30129q = aVar2;
        this.f30130r = sVar;
        this.f30132t = list3;
        this.f30133u = i13;
        this.f30131s = bVar;
        this.f30134v = z3;
        this.f30135w = cVar;
        this.f30136x = u0Var;
        this.f30137y = i14;
    }

    public final String a(String str) {
        int i;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(this.f30117c);
        sb2.append("\n");
        long j10 = this.f30119f;
        o6.a aVar = this.f30116b;
        e eVar = (e) aVar.i.b(j10);
        if (eVar != null) {
            sb2.append("\t\tParents: ");
            sb2.append(eVar.f30117c);
            for (e eVar2 = (e) aVar.i.b(eVar.f30119f); eVar2 != null; eVar2 = (e) aVar.i.b(eVar2.f30119f)) {
                sb2.append("->");
                sb2.append(eVar2.f30117c);
            }
            sb2.append(str);
            sb2.append("\n");
        }
        List list = this.f30121h;
        if (!list.isEmpty()) {
            sb2.append(str);
            sb2.append("\tMasks: ");
            sb2.append(list.size());
            sb2.append("\n");
        }
        int i10 = this.f30122j;
        if (i10 != 0 && (i = this.f30123k) != 0) {
            sb2.append(str);
            sb2.append("\tBackground: ");
            sb2.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(i10), Integer.valueOf(i), Integer.valueOf(this.f30124l)));
        }
        List list2 = this.f30115a;
        if (!list2.isEmpty()) {
            sb2.append(str);
            sb2.append("\tShapes:\n");
            for (Object obj : list2) {
                sb2.append(str);
                sb2.append("\t\t");
                sb2.append(obj);
                sb2.append("\n");
            }
        }
        return sb2.toString();
    }

    public final String toString() {
        return a("");
    }
}
