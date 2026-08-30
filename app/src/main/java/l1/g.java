package l1;
import b.a;
import j.a;
import j.e;
import r.d;
import r.e;
import r.g;
import r.h;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final c f19838a;

    /* renamed from: b, reason: collision with root package name */
    public final c f19839b;

    /* renamed from: c, reason: collision with root package name */
    public final c f19840c;

    /* renamed from: d, reason: collision with root package name */
    public final float[] f19841d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public g(l1.c r9, l1.c r10, int r11) {
        /*
            r8 = this;
            long r0 = r9.f19811b
            long r2 = l1.b.f19806a
            boolean r0 = l1.a(r0, r2)
            if (r0 == 0) goto Lf
            l1.c r0 = l1.a(r9)
            goto L10
        Lf:
            r0 = r9
        L10:
            long r4 = r10.f19811b
            boolean r1 = l1.a(r4, r2)
            if (r1 == 0) goto L1d
            l1.c r1 = l1.a(r10)
            goto L1e
        L1d:
            r1 = r10
        L1e:
            r4 = 3
            if (r11 != r4) goto L69
            long r5 = r9.f19811b
            boolean r11 = l1.a(r5, r2)
            long r5 = r10.f19811b
            boolean r2 = l1.a(r5, r2)
            if (r11 == 0) goto L32
            if (r2 == 0) goto L32
            goto L69
        L32:
            if (r11 != 0) goto L36
            if (r2 == 0) goto L69
        L36:
            if (r11 == 0) goto L39
            goto L3a
        L39:
            r9 = r10
        L3a:
            l1.q r9 = (l1.q) r9
            l1.s r9 = r9.f19860d
            float[] r3 = l1.e
            if (r11 == 0) goto L47
            float[] r11 = r9.a()
            goto L48
        L47:
            r11 = r3
        L48:
            if (r2 == 0) goto L4e
            float[] r3 = r9.a()
        L4e:
            r9 = 0
            r2 = r11[r9]
            r5 = r3[r9]
            float r2 = r2 / r5
            r5 = 1
            r6 = r11[r5]
            r7 = r3[r5]
            float r6 = r6 / r7
            r7 = 2
            r11 = r11[r7]
            r3 = r3[r7]
            float r11 = r11 / r3
            float[] r3 = new float[r4]
            r3[r9] = r2
            r3[r5] = r6
            r3[r7] = r11
            goto L6a
        L69:
            r3 = 0
        L6a:
            r8.<init>(r10, r0, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l1.g.<init>(l1.c, l1.c, int):void");
    }

    public long a(long j10) {
        float h3 = k1.h(j10);
        float g8 = k1.r.g(j10);
        float e = k1.e(j10);
        float d2 = k1.d(j10);
        c cVar = this.f19839b;
        long d10 = cVar.d(h3, g8, e);
        float intBitsToFloat = Float.intBitsToFloat((int) (d10 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (d10 & 4294967295L));
        float e8 = cVar.e(h3, g8, e);
        float[] fArr = this.f19841d;
        if (fArr != null) {
            intBitsToFloat *= fArr[0];
            intBitsToFloat2 *= fArr[1];
            e8 *= fArr[2];
        }
        float f10 = intBitsToFloat;
        float f11 = intBitsToFloat2;
        return this.f19840c.f(f10, f11, e8, d2, this.f19838a);
    }

    public g(c cVar, c cVar2, c cVar3, float[] fArr) {
        this.f19838a = cVar;
        this.f19839b = cVar2;
        this.f19840c = cVar3;
        this.f19841d = fArr;
    }
}
