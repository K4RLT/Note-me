package p0;
import g.a;
import l.a;
import m.h;
import p.a;

import c3.a0;
import java.util.List;
import o0.e0;

/* loaded from: classes.dex */
public final class d implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f22306a;

    /* renamed from: b, reason: collision with root package name */
    public final y2.c f22307b;

    /* renamed from: c, reason: collision with root package name */
    public final int f22308c;

    /* renamed from: d, reason: collision with root package name */
    public final c3.d f22309d;
    public final a e;

    /* renamed from: f, reason: collision with root package name */
    public final a f22310f;

    /* renamed from: g, reason: collision with root package name */
    public final q f22311g;

    /* renamed from: h, reason: collision with root package name */
    public final q f22312h;
    public final b i;

    /* renamed from: j, reason: collision with root package name */
    public final b f22313j;

    /* renamed from: k, reason: collision with root package name */
    public final b f22314k;

    /* renamed from: l, reason: collision with root package name */
    public final r f22315l;

    /* renamed from: m, reason: collision with root package name */
    public final r f22316m;

    public d(long j10, y2.c cVar, c3.d dVar) {
        int t02 = cVar.t0(e0.f21456a);
        this.f22306a = j10;
        this.f22307b = cVar;
        this.f22308c = t02;
        this.f22309d = dVar;
        int t03 = cVar.t0(Float.intBitsToFloat((int) (j10 >> 32)));
        d1.h hVar = d1.c.G;
        this.e = new a(hVar, hVar, t03);
        d1.h hVar2 = d1.c.I;
        this.f22310f = new a(hVar2, hVar2, t03);
        this.f22311g = new q(d1.a.f15667c);
        this.f22312h = new q(d1.a.f15668d);
        int t04 = cVar.t0(Float.intBitsToFloat((int) (j10 & 4294967295L)));
        d1.i iVar = d1.c.D;
        d1.i iVar2 = d1.c.F;
        this.i = new b(iVar, iVar2, t04);
        this.f22313j = new b(iVar2, iVar, t04);
        this.f22314k = new b(d1.c.E, iVar, t04);
        this.f22315l = new r(iVar, t02);
        this.f22316m = new r(iVar2, t02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v2, types: [long] */
    /* JADX WARN: Type inference failed for: r20v5 */
    @Override // c3.a0
    public final long a(y2.k kVar, long j10, y2.m mVar, long j11) {
        q qVar;
        y2.k kVar2;
        long j12;
        int i;
        r rVar;
        Object r20;
        int i10;
        int i11 = (int) (j10 >> 32);
        if (((int) (kVar.a() >> 32)) < i11 / 2) {
            qVar = this.f22311g;
        } else {
            qVar = this.f22312h;
        }
        int i12 = 0;
        List h3 = qe.h(this.e, this.f22310f, qVar);
        int size = h3.size();
        int i13 = 0;
        while (true) {
            if (i13 < size) {
                int i14 = (int) (j11 >> 32);
                kVar2 = kVar;
                j12 = j10;
                i = ((f) h3.get(i13)).a(kVar2, j12, i14, mVar);
                if (i13 == h3.size() - 1 || (i >= 0 && i14 + i <= i11)) {
                    break;
                }
                i13++;
            } else {
                kVar2 = kVar;
                j12 = j10;
                i = 0;
                break;
            }
        }
        boolean z3 = 32;
        int i15 = (int) (j12 & 4294967295L);
        if (((int) (kVar2.a() & 4294967295L)) < i15 / 2) {
            rVar = this.f22315l;
        } else {
            rVar = this.f22316m;
        }
        List h10 = qe.h(this.i, this.f22313j, this.f22314k, rVar);
        int size2 = h10.size();
        int i16 = 0;
        while (i16 < size2) {
            boolean z9 = z3;
            int i17 = i15;
            int i18 = (int) (j11 & 4294967295L);
            int a10 = ((g) h10.get(i16)).a(kVar2, j12, i18);
            if (i16 != h10.size() - 1 && (a10 < (i10 = this.f22308c) || i18 + a10 > i17 - i10)) {
                i16++;
                z3 = z9 ? 1 : 0;
                i15 = i17;
            } else {
                i12 = a10;
                r20 = z9;
                break;
            }
        }
        r20 = z3;
        long j13 = (i << r20) | (i12 & 4294967295L);
        int i19 = (int) (j13 >> r20);
        int i20 = (int) (j13 & 4294967295L);
        this.f22309d.invoke(kVar2, new y2.k(i19, i20, ((int) (j11 >> r20)) + i19, ((int) (j11 & 4294967295L)) + i20));
        return j13;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (this.f22306a == dVar.f22306a && kotlin.jvm.internal.a(this.f22307b, dVar.f22307b) && this.f22308c == dVar.f22308c && kotlin.jvm.internal.a(this.f22309d, dVar.f22309d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f22309d.hashCode() + a.b(this.f22308c, (this.f22307b.hashCode() + (Long.hashCode(this.f22306a) * 31)) * 31, 31);
    }

    public final String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + ((Object) y2.a(this.f22306a)) + ", density=" + this.f22307b + ", verticalMargin=" + this.f22308c + ", onPositionCalculated=" + this.f22309d + ')';
    }
}