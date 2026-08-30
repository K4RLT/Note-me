package w1;

import com.facebook.ads.AdError;
import q.x;
import ya.ed;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f27693a;

    /* renamed from: b, reason: collision with root package name */
    public final b f27694b;

    /* renamed from: c, reason: collision with root package name */
    public final int f27695c;

    /* renamed from: d, reason: collision with root package name */
    public final a[] f27696d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public final float[] f27697f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f27698g;

    /* renamed from: h, reason: collision with root package name */
    public final float[] f27699h;

    public c(boolean z3, b bVar) {
        int i;
        this.f27693a = z3;
        this.f27694b = bVar;
        if (z3 && bVar.equals(b.f27690u)) {
            x.o("Lsq2 not (yet) supported for differential axes");
            throw null;
        }
        int ordinal = bVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                i = 2;
            } else {
                l4.a.o();
                throw null;
            }
        } else {
            i = 3;
        }
        this.f27695c = i;
        this.f27696d = new a[20];
        this.f27697f = new float[20];
        this.f27698g = new float[20];
        this.f27699h = new float[3];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, w1.a] */
    public final void a(long j10, float f10) {
        int i = (this.e + 1) % 20;
        this.e = i;
        a[] aVarArr = this.f27696d;
        a aVar = aVarArr[i];
        if (aVar == 0) {
            Object obj = new Object();
            obj.f27688a = j10;
            obj.f27689b = f10;
            aVarArr[i] = obj;
            return;
        }
        aVar.f27688a = j10;
        aVar.f27689b = f10;
    }

    public final float b(float f10) {
        b bVar;
        float[] fArr;
        float[] fArr2;
        float f11;
        boolean z3;
        int i;
        float f12;
        float f13;
        int i10;
        float f14 = f10;
        float f15 = 0.0f;
        if (f14 <= 0.0f) {
            y1.a.b("maximumVelocity should be a positive value. You specified=" + f14);
        }
        int i11 = this.e;
        a[] aVarArr = this.f27696d;
        a aVar = aVarArr[i11];
        if (aVar == null) {
            f11 = 0.0f;
        } else {
            int i12 = 0;
            a aVar2 = aVar;
            while (true) {
                a aVar3 = aVarArr[i11];
                boolean z9 = this.f27693a;
                bVar = this.f27694b;
                fArr = this.f27697f;
                fArr2 = this.f27698g;
                if (aVar3 == null) {
                    f11 = f15;
                    z3 = z9;
                    i = 1;
                    break;
                }
                long j10 = aVar.f27688a;
                f11 = f15;
                int i13 = i11;
                long j11 = aVar3.f27688a;
                float f16 = (float) (j10 - j11);
                z3 = z9;
                i = 1;
                float abs = (float) Math.abs(j11 - aVar2.f27688a);
                if (bVar != b.f27690u && !z3) {
                    aVar2 = aVar;
                } else {
                    aVar2 = aVar3;
                }
                if (f16 > 100.0f || abs > 40.0f) {
                    break;
                }
                fArr[i12] = aVar3.f27689b;
                fArr2[i12] = -f16;
                if (i13 == 0) {
                    i10 = 20;
                } else {
                    i10 = i13;
                }
                i11 = i10 - 1;
                i12++;
                if (i12 >= 20) {
                    break;
                }
                f15 = f11;
            }
            if (i12 >= this.f27695c) {
                int ordinal = bVar.ordinal();
                if (ordinal != 0) {
                    if (ordinal == i) {
                        int i14 = i12 - i;
                        float f17 = fArr2[i14];
                        int i15 = i14;
                        float f18 = f11;
                        while (i15 > 0) {
                            int i16 = i15 - 1;
                            float f19 = fArr2[i16];
                            if (f17 != f19) {
                                if (z3) {
                                    f13 = -fArr[i16];
                                } else {
                                    f13 = fArr[i15] - fArr[i16];
                                }
                                float f20 = f13 / (f17 - f19);
                                f18 += Math.abs(f20) * (f20 - (Math.signum(f18) * ((float) Math.sqrt(Math.abs(f18) * 2))));
                                if (i15 == i14) {
                                    f18 *= 0.5f;
                                }
                            }
                            i15--;
                            f17 = f19;
                        }
                        f12 = Math.signum(f18) * ((float) Math.sqrt(Math.abs(f18) * 2));
                    } else {
                        l4.a.o();
                        return 0.0f;
                    }
                } else {
                    try {
                        float[] fArr3 = this.f27699h;
                        ed.c(fArr2, fArr, i12, fArr3);
                        f12 = fArr3[1];
                    } catch (IllegalArgumentException unused) {
                        f12 = f11;
                    }
                }
                f15 = f12 * AdError.NETWORK_ERROR_CODE;
            } else {
                f15 = f11;
            }
        }
        if (f15 == f11 || Float.isNaN(f15)) {
            return f11;
        }
        if (f15 > f11) {
            if (f15 <= f14) {
                f14 = f15;
            }
        } else {
            f14 = -f14;
            if (f15 >= f14) {
                return f15;
            }
        }
        return f14;
    }

    public /* synthetic */ c() {
        this(false, b.f27690u);
    }

    public c(int i) {
        this(true, b.f27691v);
    }
}