package q1;
import x.e;

import r0.i1;

/* loaded from: classes.dex */
public final class x extends v {

    /* renamed from: b, reason: collision with root package name */
    public final b f23309b;

    /* renamed from: c, reason: collision with root package name */
    public String f23310c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f23311d;
    public final a e;

    /* renamed from: f, reason: collision with root package name */
    public kotlin.jvm.internal.m f23312f;

    /* renamed from: g, reason: collision with root package name */
    public final i1 f23313g;

    /* renamed from: h, reason: collision with root package name */
    public k1.l f23314h;
    public final i1 i;

    /* renamed from: j, reason: collision with root package name */
    public long f23315j;

    /* renamed from: k, reason: collision with root package name */
    public float f23316k;

    /* renamed from: l, reason: collision with root package name */
    public float f23317l;

    /* renamed from: m, reason: collision with root package name */
    public final w f23318m;

    public x(b bVar) {
        this.f23309b = bVar;
        bVar.i = new w(this, 0);
        this.f23310c = "";
        this.f23311d = true;
        this.e = new a();
        this.f23312f = g.f23262w;
        this.f23313g = r0.y.B(null);
        this.i = r0.y.B(new j1.e(0L));
        this.f23315j = 9205357640488583168L;
        this.f23316k = 1.0f;
        this.f23317l = 1.0f;
        this.f23318m = new w(this, 1);
    }

    @Override // q1.v
    public final void a(m1.d dVar) {
        e(dVar, 1.0f, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005f, code lost:
    
        if (r3 != r8) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00fc, code lost:
    
        if (r9.f23215d == r3) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(m1.d r38, float r39, k1.s r40) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.e(m1.d, float, k1.s):void");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Params: \tname: ");
        sb2.append(this.f23310c);
        sb2.append("\n\tviewportWidth: ");
        i1 i1Var = this.i;
        sb2.append(Float.intBitsToFloat((int) (((j1.e) i1Var.getValue()).f18774a >> 32)));
        sb2.append("\n\tviewportHeight: ");
        sb2.append(Float.intBitsToFloat((int) (((j1.e) i1Var.getValue()).f18774a & 4294967295L)));
        sb2.append("\n");
        return sb2.toString();
    }
}
