package q1;

import java.util.ArrayList;
import k1.r0;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f23235a;

    /* renamed from: b, reason: collision with root package name */
    public final float f23236b;

    /* renamed from: c, reason: collision with root package name */
    public final float f23237c;

    /* renamed from: d, reason: collision with root package name */
    public final float f23238d;
    public final float e;

    /* renamed from: f, reason: collision with root package name */
    public final long f23239f;

    /* renamed from: g, reason: collision with root package name */
    public final int f23240g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f23241h;
    public final ArrayList i;

    /* renamed from: j, reason: collision with root package name */
    public final c f23242j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f23243k;

    /* JADX WARN: Type inference failed for: r4v1, types: [q1.c, java.lang.Object] */
    public d(String str, float f10, float f11, int i) {
        long j10 = k1.r.f19521l;
        this.f23235a = str;
        this.f23236b = f10;
        this.f23237c = f11;
        this.f23238d = 24.0f;
        this.e = 24.0f;
        this.f23239f = j10;
        this.f23240g = 5;
        this.f23241h = false;
        ArrayList arrayList = new ArrayList();
        this.i = arrayList;
        int i10 = a0.f23216a;
        ArrayList arrayList2 = new ArrayList();
        Object obj = new Object();
        obj.f23228a = qe.s.f24023u;
        obj.f23229b = arrayList2;
        this.f23242j = obj;
        arrayList.add(obj);
    }

    public static void a(d dVar, ArrayList arrayList, int i, r0 r0Var, r0 r0Var2, float f10, int i10, int i11, float f11) {
        if (dVar.f23243k) {
            y1.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        ((c) dVar.i.get(r9.size() - 1)).f23229b.add(new d0(arrayList, i, r0Var, r0Var2, f10, i10, i11, f11));
    }

    public final e b() {
        if (this.f23243k) {
            y1.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        while (true) {
            ArrayList arrayList = this.i;
            if (arrayList.size() > 1) {
                if (this.f23243k) {
                    y1.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                }
                c cVar = (c) arrayList.remove(arrayList.size() - 1);
                ArrayList arrayList2 = ((c) arrayList.get(arrayList.size() - 1)).f23229b;
                cVar.getClass();
                arrayList2.add(new z(cVar.f23228a, cVar.f23229b));
            } else {
                c cVar2 = this.f23242j;
                cVar2.getClass();
                e eVar = new e(this.f23235a, this.f23236b, this.f23237c, this.f23238d, this.e, new z(cVar2.f23228a, cVar2.f23229b), this.f23239f, this.f23240g, this.f23241h);
                this.f23243k = true;
                return eVar;
            }
        }
    }
}