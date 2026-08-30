package f0;
import a.a;

import k1.f0;
import k1.g0;
import k1.l0;
import k1.p0;
import kotlin.jvm.internal.l;
import wa.s8;
import y2.m;

/* loaded from: classes.dex */
public final class d implements p0 {

    /* renamed from: a, reason: collision with root package name */
    public final a f16625a;

    /* renamed from: b, reason: collision with root package name */
    public final a f16626b;

    /* renamed from: c, reason: collision with root package name */
    public final a f16627c;

    /* renamed from: d, reason: collision with root package name */
    public final a f16628d;

    public d(a aVar, a aVar2, a aVar3, a aVar4) {
        this.f16625a = aVar;
        this.f16626b = aVar2;
        this.f16627c = aVar3;
        this.f16628d = aVar4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [f0.a] */
    /* JADX WARN: Type inference failed for: r3v2, types: [f0.a] */
    public static d b(d dVar, b bVar, b bVar2, b bVar3, int i) {
        b bVar4 = bVar;
        if ((i & 1) != 0) {
            bVar4 = dVar.f16625a;
        }
        a aVar = dVar.f16626b;
        b bVar5 = bVar2;
        if ((i & 4) != 0) {
            bVar5 = dVar.f16627c;
        }
        dVar.getClass();
        return new d(bVar4, aVar, bVar5, bVar3);
    }

    @Override // k1.p0
    public final l0 a(long j10, m mVar, y2.c cVar) {
        float f10;
        float f11;
        float a10 = this.f16625a.a(j10, cVar);
        float a11 = this.f16626b.a(j10, cVar);
        float a12 = this.f16627c.a(j10, cVar);
        float a13 = this.f16628d.a(j10, cVar);
        float c10 = j1.e.c(j10);
        float f12 = a10 + a13;
        if (f12 > c10) {
            float f13 = c10 / f12;
            a10 *= f13;
            a13 *= f13;
        }
        float f14 = a11 + a12;
        if (f14 > c10) {
            float f15 = c10 / f14;
            a11 *= f15;
            a12 *= f15;
        }
        if (a10 < 0.0f || a11 < 0.0f || a12 < 0.0f || a13 < 0.0f) {
            w.a("Corner size in Px can't be negative(topStart = " + a10 + ", topEnd = " + a11 + ", bottomEnd = " + a12 + ", bottomStart = " + a13 + ")!");
        }
        if (a10 + a11 + a12 + a13 == 0.0f) {
            return new f0(s8.a(0L, j10));
        }
        j1.c a14 = s8.a(0L, j10);
        m mVar2 = m.f30814u;
        if (mVar == mVar2) {
            f10 = a10;
        } else {
            f10 = a11;
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L);
        if (mVar == mVar2) {
            a10 = a11;
        }
        long floatToRawIntBits2 = (Float.floatToRawIntBits(a10) << 32) | (Float.floatToRawIntBits(a10) & 4294967295L);
        if (mVar == mVar2) {
            f11 = a12;
        } else {
            f11 = a13;
        }
        long floatToRawIntBits3 = (Float.floatToRawIntBits(f11) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L);
        if (mVar != mVar2) {
            a13 = a12;
        }
        return new g0(new j1.d(a14.f18763a, a14.f18764b, a14.f18765c, a14.f18766d, floatToRawIntBits, floatToRawIntBits2, floatToRawIntBits3, (Float.floatToRawIntBits(a13) << 32) | (Float.floatToRawIntBits(a13) & 4294967295L)));
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (!l.a(this.f16625a, dVar.f16625a) || !this.f16626b.equals(dVar.f16626b) || !l.a(this.f16627c, dVar.f16627c) || !this.f16628d.equals(dVar.f16628d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f16628d.hashCode() + ((this.f16627c.hashCode() + ((this.f16626b.hashCode() + (this.f16625a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.f16625a + ", topEnd = " + this.f16626b + ", bottomEnd = " + this.f16627c + ", bottomStart = " + this.f16628d + ')';
    }
}
