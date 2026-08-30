package q;
import l.a;
import n.v;
import n.w;
import q.n1;
import q.p1;
import x.l;

/* loaded from: classes.dex */
public final class s1 implements p1 {
    public q A;
    public q B;
    public q C;
    public q D;
    public float[] E;
    public float[] F;
    public k6.i G;

    /* renamed from: u, reason: collision with root package name */
    public final v f22997u;

    /* renamed from: v, reason: collision with root package name */
    public final w f22998v;

    /* renamed from: w, reason: collision with root package name */
    public final int f22999w;

    /* renamed from: x, reason: collision with root package name */
    public final w f23000x;

    /* renamed from: y, reason: collision with root package name */
    public int[] f23001y = o1.f22963a;

    /* renamed from: z, reason: collision with root package name */
    public float[] f23002z;

    public s1(v vVar, w wVar, int i, w wVar2) {
        this.f22997u = vVar;
        this.f22998v = wVar;
        this.f22999w = i;
        this.f23000x = wVar2;
        float[] fArr = o1.f22964b;
        this.f23002z = fArr;
        this.E = fArr;
        this.F = fArr;
        this.G = o1.f22965c;
    }

    public final int b(int i) {
        int i10;
        v vVar = this.f22997u;
        int i11 = vVar.f20953b;
        if (i11 > 0) {
            int i12 = i11 - 1;
            int i13 = 0;
            while (true) {
                if (i13 <= i12) {
                    i10 = (i13 + i12) >>> 1;
                    int i14 = vVar.f20952a[i10];
                    if (i14 < i) {
                        i13 = i10 + 1;
                    } else {
                        if (i14 <= i) {
                            break;
                        }
                        i12 = i10 - 1;
                    }
                } else {
                    i10 = -(i13 + 1);
                    break;
                }
            }
            if (i10 < -1) {
                return -(i10 + 2);
            }
            return i10;
        }
        l("");
        return 0;
    }

    public final float c(int i, int i10, boolean z3) {
        w wVar;
        float f10;
        v vVar = this.f22997u;
        if (i >= vVar.f20953b - 1) {
            f10 = i10;
        } else {
            int c10 = vVar.c(i);
            int c11 = vVar.c(i + 1);
            if (i10 == c10) {
                f10 = c10;
            } else {
                int i11 = c11 - c10;
                r1 r1Var = (r1) this.f22998v.b(c10);
                if (r1Var == null || (wVar = r1Var.f22978b) == null) {
                    wVar = this.f23000x;
                }
                float f11 = i11;
                float a10 = wVar.a((i10 - c10) / f11);
                if (z3) {
                    return a10;
                }
                f10 = (f11 * a10) + c10;
            }
        }
        return f10 / ((float) 1000);
    }

    public final void d(q qVar, q qVar2, q qVar3) {
        boolean z3;
        float[] fArr;
        if (this.G != o1.f22965c) {
            z3 = true;
        } else {
            z3 = false;
        }
        q qVar4 = this.A;
        w wVar = this.f22998v;
        v vVar = this.f22997u;
        if (qVar4 == null) {
            this.A = qVar.c();
            this.B = qVar3.c();
            int i = vVar.f20953b;
            float[] fArr2 = new float[i];
            for (int i10 = 0; i10 < i; i10++) {
                fArr2[i10] = vVar.c(i10) / ((float) 1000);
            }
            this.f23002z = fArr2;
            int i11 = vVar.f20953b;
            int[] iArr = new int[i11];
            for (int i12 = 0; i12 < i11; i12++) {
                iArr[i12] = 0;
            }
            this.f23001y = iArr;
        }
        if (z3) {
            if (this.G != o1.f22965c && kotlin.jvm.internal.a(this.C, qVar) && kotlin.jvm.internal.a(this.D, qVar2)) {
                return;
            }
            this.C = qVar;
            this.D = qVar2;
            int b10 = qVar.b() + (qVar.b() % 2);
            this.E = new float[b10];
            this.F = new float[b10];
            int i13 = vVar.f20953b;
            float[][] fArr3 = new float[i13];
            for (int i14 = 0; i14 < i13; i14++) {
                int c10 = vVar.c(i14);
                r1 r1Var = (r1) wVar.b(c10);
                if (c10 == 0 && r1Var == null) {
                    fArr = new float[b10];
                    for (int i15 = 0; i15 < b10; i15++) {
                        fArr[i15] = qVar.a(i15);
                    }
                } else if (c10 == this.f22999w && r1Var == null) {
                    fArr = new float[b10];
                    for (int i16 = 0; i16 < b10; i16++) {
                        fArr[i16] = qVar2.a(i16);
                    }
                } else {
                    r1Var.getClass();
                    q qVar5 = r1Var.f22977a;
                    float[] fArr4 = new float[b10];
                    for (int i17 = 0; i17 < b10; i17++) {
                        fArr4[i17] = qVar5.a(i17);
                    }
                    fArr = fArr4;
                }
                fArr3[i14] = fArr;
            }
            this.G = new k6.i(this.f23001y, this.f23002z, fArr3);
        }
    }

    @Override // n1
    public final q i(long j10, q qVar, q qVar2, q qVar3) {
        q qVar4;
        q qVar5;
        float f10;
        s[][] sVarArr;
        boolean z3;
        q qVar6 = qVar;
        q qVar7 = qVar2;
        int[] iArr = o1.f22963a;
        int i = 0;
        long j11 = (j10 / 1000000) - 0;
        int i10 = this.f22999w;
        long j12 = i10;
        if (j11 < 0) {
            j11 = 0;
        }
        if (j11 <= j12) {
            j12 = j11;
        }
        int i11 = (int) j12;
        w wVar = this.f22998v;
        r1 r1Var = (r1) wVar.b(i11);
        if (r1Var != null) {
            return r1Var.f22977a;
        }
        if (i11 >= i10) {
            return qVar7;
        }
        if (i11 <= 0) {
            return qVar6;
        }
        d(qVar6, qVar7, qVar3);
        q qVar8 = this.A;
        qVar8.getClass();
        boolean z9 = true;
        if (this.G != o1.f22965c) {
            float c10 = c(b(i11), i11, false);
            float[] fArr = this.E;
            s[][] sVarArr2 = (s[][]) this.G.f19569v;
            int length = sVarArr2.length - 1;
            float f11 = sVarArr2[0][0].f22979a;
            float f12 = sVarArr2[length][0].f22980b;
            int length2 = fArr.length;
            if (c10 >= f11 && c10 <= f12) {
                int length3 = sVarArr2.length;
                int i12 = 0;
                boolean z10 = false;
                while (i12 < length3) {
                    int i13 = i;
                    int i14 = i13;
                    while (i13 < length2 - 1) {
                        s sVar = sVarArr2[i12][i14];
                        if (c10 <= sVar.f22980b) {
                            if (sVar.f22992p) {
                                float f13 = sVar.f22979a;
                                float f14 = sVar.f22987k;
                                float f15 = sVar.f22981c;
                                z3 = z9;
                                fArr[i13] = g3.a.x(sVar.e, f15, (c10 - f13) * f14, f15);
                                float f16 = sVar.f22982d;
                                fArr[i13 + 1] = g3.a.x(sVar.f22983f, f16, (c10 - f13) * f14, f16);
                            } else {
                                z3 = z9;
                                sVar.c(c10);
                                fArr[i13] = (sVar.f22990n * sVar.f22985h) + sVar.f22993q;
                                fArr[i13 + 1] = (sVar.f22991o * sVar.i) + sVar.f22994r;
                            }
                            z10 = z3;
                        } else {
                            z3 = z9;
                        }
                        i13 += 2;
                        i14++;
                        z9 = z3;
                    }
                    boolean z11 = z9;
                    if (z10) {
                        break;
                    }
                    i12++;
                    z9 = z11;
                    i = 0;
                }
            } else {
                if (c10 > f12) {
                    f11 = f12;
                } else {
                    length = 0;
                }
                float f17 = c10 - f11;
                int i15 = 0;
                int i16 = 0;
                while (i15 < length2 - 1) {
                    s sVar2 = sVarArr2[length][i16];
                    boolean z12 = sVar2.f22992p;
                    float f18 = sVar2.f22994r;
                    float f19 = sVar2.f22993q;
                    if (z12) {
                        float f20 = sVar2.f22979a;
                        float f21 = sVar2.f22987k;
                        f10 = f17;
                        float f22 = sVar2.f22981c;
                        sVarArr = sVarArr2;
                        fArr[i15] = (f10 * f19) + g3.a.x(sVar2.e, f22, (f11 - f20) * f21, f22);
                        float f23 = (f11 - f20) * f21;
                        float f24 = sVar2.f22982d;
                        fArr[i15 + 1] = (f10 * f18) + g3.a.x(sVar2.f22983f, f24, f23, f24);
                    } else {
                        f10 = f17;
                        sVarArr = sVarArr2;
                        sVar2.c(f11);
                        fArr[i15] = (sVar2.a() * f10) + (sVar2.f22990n * sVar2.f22985h) + f19;
                        fArr[i15 + 1] = (sVar2.b() * f10) + (sVar2.f22991o * sVar2.i) + f18;
                    }
                    i15 += 2;
                    i16++;
                    f17 = f10;
                    sVarArr2 = sVarArr;
                }
            }
            int length4 = fArr.length;
            for (int i17 = 0; i17 < length4; i17++) {
                qVar8.e(i17, fArr[i17]);
            }
        } else {
            int b10 = b(i11);
            float c11 = c(b10, i11, true);
            v vVar = this.f22997u;
            r1 r1Var2 = (r1) wVar.b(vVar.c(b10));
            if (r1Var2 != null && (qVar5 = r1Var2.f22977a) != null) {
                qVar6 = qVar5;
            }
            r1 r1Var3 = (r1) wVar.b(vVar.c(b10 + 1));
            if (r1Var3 != null && (qVar4 = r1Var3.f22977a) != null) {
                qVar7 = qVar4;
            }
            int b11 = qVar8.b();
            for (int i18 = 0; i18 < b11; i18++) {
                qVar8.e(i18, (qVar7.a(i18) * c11) + ((1 - c11) * qVar6.a(i18)));
            }
        }
        return qVar8;
    }

    @Override // n1
    public final q m(long j10, q qVar, q qVar2, q qVar3) {
        long j11;
        int[] iArr = o1.f22963a;
        int i = 0;
        long j12 = (j10 / 1000000) - 0;
        long j13 = this.f22999w;
        if (j12 < 0) {
            j12 = 0;
        }
        if (j12 > j13) {
            j11 = j13;
        } else {
            j11 = j12;
        }
        if (j11 < 0) {
            return qVar3;
        }
        d(qVar, qVar2, qVar3);
        q qVar4 = this.B;
        qVar4.getClass();
        if (this.G != o1.f22965c) {
            int i10 = (int) j11;
            float c10 = c(b(i10), i10, false);
            float[] fArr = this.F;
            s[][] sVarArr = (s[][]) this.G.f19569v;
            float f10 = sVarArr[0][0].f22979a;
            float f11 = sVarArr[sVarArr.length - 1][0].f22980b;
            if (c10 < f10) {
                c10 = f10;
            }
            if (c10 <= f11) {
                f11 = c10;
            }
            int length = fArr.length;
            boolean z3 = false;
            for (s[] sVarArr2 : sVarArr) {
                int i11 = 0;
                int i12 = 0;
                while (i11 < length - 1) {
                    s sVar = sVarArr2[i12];
                    if (f11 <= sVar.f22980b) {
                        if (sVar.f22992p) {
                            fArr[i11] = sVar.f22993q;
                            fArr[i11 + 1] = sVar.f22994r;
                        } else {
                            sVar.c(f11);
                            fArr[i11] = sVar.a();
                            fArr[i11 + 1] = sVar.b();
                        }
                        z3 = true;
                    }
                    i11 += 2;
                    i12++;
                }
                if (z3) {
                    break;
                }
            }
            int length2 = fArr.length;
            while (i < length2) {
                qVar4.e(i, fArr[i]);
                i++;
            }
        } else {
            q i13 = i((j11 - 1) * 1000000, qVar, qVar2, qVar3);
            q i14 = i(j11 * 1000000, qVar, qVar2, qVar3);
            int b10 = i13.b();
            while (i < b10) {
                qVar4.e(i, (i13.a(i) - i14.a(i)) * 1000.0f);
                i++;
            }
        }
        return qVar4;
    }

    @Override // p1
    public final int q() {
        return 0;
    }

    @Override // p1
    public final int s() {
        return this.f22999w;
    }
}
