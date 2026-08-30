package l1;
import l.a;

import java.util.Arrays;
import k1.l0;

/* loaded from: classes.dex */
public final class q extends c {

    /* renamed from: r, reason: collision with root package name */
    public static final g5.q f19859r = new g5.q(28);

    /* renamed from: d, reason: collision with root package name */
    public final s f19860d;
    public final float e;

    /* renamed from: f, reason: collision with root package name */
    public final float f19861f;

    /* renamed from: g, reason: collision with root package name */
    public final r f19862g;

    /* renamed from: h, reason: collision with root package name */
    public final float[] f19863h;
    public final float[] i;

    /* renamed from: j, reason: collision with root package name */
    public final float[] f19864j;

    /* renamed from: k, reason: collision with root package name */
    public final i f19865k;

    /* renamed from: l, reason: collision with root package name */
    public final p f19866l;

    /* renamed from: m, reason: collision with root package name */
    public final m f19867m;

    /* renamed from: n, reason: collision with root package name */
    public final i f19868n;

    /* renamed from: o, reason: collision with root package name */
    public final p f19869o;

    /* renamed from: p, reason: collision with root package name */
    public final m f19870p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f19871q;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x01dc, code lost:
    
        if ((((r24 - r11) * r3) - ((r1 - r13) * r10)) >= 0.0f) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r26v0 */
    /* JADX WARN: Type inference failed for: r26v1 */
    /* JADX WARN: Type inference failed for: r26v4 */
    /* JADX WARN: Type inference failed for: r41v1 */
    /* JADX WARN: Type inference failed for: r41v2 */
    /* JADX WARN: Type inference failed for: r41v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public q(java.lang.String r33, float[] r34, l1.s r35, float[] r36, l1.i r37, l1.i r38, float r39, float r40, l1.r r41, int r42) {
        /*
            Method dump skipped, instructions count: 644
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l1.q.<init>(java.lang.String, float[], l1.s, float[], l1.i, l1.i, float, float, l1.r, int):void");
    }

    @Override // l1.c
    public final float a(int i) {
        return this.f19861f;
    }

    @Override // l1.c
    public final float b(int i) {
        return this.e;
    }

    @Override // l1.c
    public final boolean c() {
        return this.f19871q;
    }

    @Override // l1.c
    public final long d(float f10, float f11, float f12) {
        double d2 = f10;
        m mVar = this.f19870p;
        float invoke = (float) mVar.invoke(d2);
        float invoke2 = (float) mVar.invoke(f11);
        float invoke3 = (float) mVar.invoke(f12);
        float[] fArr = this.i;
        if (fArr.length < 9) {
            return 0L;
        }
        float f13 = (fArr[6] * invoke3) + (fArr[3] * invoke2) + (fArr[0] * invoke);
        float f14 = (fArr[7] * invoke3) + (fArr[4] * invoke2) + (fArr[1] * invoke);
        return (Float.floatToRawIntBits(f14) & 4294967295L) | (Float.floatToRawIntBits(f13) << 32);
    }

    @Override // l1.c
    public final float e(float f10, float f11, float f12) {
        double d2 = f10;
        m mVar = this.f19870p;
        float invoke = (float) mVar.invoke(d2);
        float invoke2 = (float) mVar.invoke(f11);
        float invoke3 = (float) mVar.invoke(f12);
        float[] fArr = this.i;
        return (fArr[8] * invoke3) + (fArr[5] * invoke2) + (fArr[2] * invoke);
    }

    @Override // l1.c
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        q qVar = (q) obj;
        if (Float.compare(qVar.e, this.e) != 0 || Float.compare(qVar.f19861f, this.f19861f) != 0 || !kotlin.jvm.internal.a(this.f19860d, qVar.f19860d) || !Arrays.equals(this.f19863h, qVar.f19863h)) {
            return false;
        }
        r rVar = qVar.f19862g;
        r rVar2 = this.f19862g;
        if (rVar2 != null) {
            return kotlin.jvm.internal.a(rVar2, rVar);
        }
        if (rVar == null) {
            return true;
        }
        if (!kotlin.jvm.internal.a(this.f19865k, qVar.f19865k)) {
            return false;
        }
        return kotlin.jvm.internal.a(this.f19868n, qVar.f19868n);
    }

    @Override // l1.c
    public final long f(float f10, float f11, float f12, float f13, c cVar) {
        float[] fArr = this.f19864j;
        float f14 = (fArr[6] * f12) + (fArr[3] * f11) + (fArr[0] * f10);
        float f15 = (fArr[7] * f12) + (fArr[4] * f11) + (fArr[1] * f10);
        float f16 = (fArr[8] * f12) + (fArr[5] * f11) + (fArr[2] * f10);
        m mVar = this.f19867m;
        return l0.b((float) mVar.invoke(f14), (float) mVar.invoke(f15), (float) mVar.invoke(f16), f13, cVar);
    }

    @Override // l1.c
    public final int hashCode() {
        int floatToIntBits;
        int floatToIntBits2;
        int hashCode = (Arrays.hashCode(this.f19863h) + ((this.f19860d.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f10 = this.e;
        int i = 0;
        if (f10 == 0.0f) {
            floatToIntBits = 0;
        } else {
            floatToIntBits = Float.floatToIntBits(f10);
        }
        int i10 = (hashCode + floatToIntBits) * 31;
        float f11 = this.f19861f;
        if (f11 == 0.0f) {
            floatToIntBits2 = 0;
        } else {
            floatToIntBits2 = Float.floatToIntBits(f11);
        }
        int i11 = (i10 + floatToIntBits2) * 31;
        r rVar = this.f19862g;
        if (rVar != null) {
            i = rVar.hashCode();
        }
        int i12 = i11 + i;
        if (rVar == null) {
            return this.f19868n.hashCode() + ((this.f19865k.hashCode() + (i12 * 31)) * 31);
        }
        return i12;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public q(java.lang.String r16, float[] r17, l1.s r18, final l1.r r19, int r20) {
        /*
            r15 = this;
            r9 = r19
            double r0 = r9.f19872a
            r2 = -4609434218613702656(0xc008000000000000, double:-3.0)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Lc
            r4 = 1
            goto Ld
        Lc:
            r4 = 0
        Ld:
            double r5 = r9.f19877g
            double r7 = r9.f19876f
            r10 = -4611686018427387904(0xc000000000000000, double:-2.0)
            r12 = 0
            if (r4 == 0) goto L1e
            l1.o r4 = new l1.o
            r14 = 4
            r4.<init>()
            goto L3e
        L1e:
            int r4 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r4 != 0) goto L29
            l1.o r4 = new l1.o
            r14 = 5
            r4.<init>()
            goto L3e
        L29:
            int r4 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r4 != 0) goto L38
            int r4 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r4 != 0) goto L38
            l1.o r4 = new l1.o
            r14 = 6
            r4.<init>()
            goto L3e
        L38:
            l1.o r4 = new l1.o
            r14 = 7
            r4.<init>()
        L3e:
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto L4a
            l1.o r0 = new l1.o
            r1 = 0
            r0.<init>()
        L48:
            r6 = r0
            goto L6b
        L4a:
            int r0 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r0 != 0) goto L55
            l1.o r0 = new l1.o
            r1 = 1
            r0.<init>()
            goto L48
        L55:
            int r0 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r0 != 0) goto L64
            int r0 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r0 != 0) goto L64
            l1.o r0 = new l1.o
            r1 = 2
            r0.<init>()
            goto L48
        L64:
            l1.o r0 = new l1.o
            r1 = 3
            r0.<init>()
            goto L48
        L6b:
            r7 = 0
            r8 = 1065353216(0x3f800000, float:1.0)
            r5 = r4
            r4 = 0
            r0 = r15
            r1 = r16
            r2 = r17
            r3 = r18
            r10 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l1.q.<init>(java.lang.String, float[], l1.s, l1.r, int):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public q(java.lang.String r18, float[] r19, l1.s r20, double r21, float r23, float r24, int r25) {
        /*
            r17 = this;
            r1 = r21
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            g5.q r3 = l1.q.f19859r
            if (r0 != 0) goto Lc
            r11 = r3
            goto L13
        Lc:
            l1.n r4 = new l1.n
            r5 = 0
            r4.<init>(r1, r5)
            r11 = r4
        L13:
            if (r0 != 0) goto L17
        L15:
            r12 = r3
            goto L1e
        L17:
            l1.n r3 = new l1.n
            r0 = 1
            r3.<init>(r1, r0)
            goto L15
        L1e:
            l1.r r15 = new l1.r
            r7 = 0
            r9 = 0
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r5 = 0
            r0 = r15
            r0.<init>(r1, r3, r5, r7, r9)
            r10 = 0
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = r20
            r13 = r23
            r14 = r24
            r16 = r25
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l1.q.<init>(java.lang.String, float[], l1.s, double, float, float, int):void");
    }
}
