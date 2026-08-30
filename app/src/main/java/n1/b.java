package n1;
import b.c;

import a0.f0;
import a0.k0;
import android.graphics.Outline;
import android.graphics.RectF;
import android.os.Build;
import androidx.datastore.preferences.protobuf.s1;
import java.util.Locale;
import k1.e0;
import k1.g0;
import k1.i0;
import k1.l0;
import n.j0;
import n.q0;
import n0.o;
import wa.t8;
import y2.m;
import ya.vd;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final d f21013a;

    /* renamed from: f, reason: collision with root package name */
    public Outline f21017f;

    /* renamed from: j, reason: collision with root package name */
    public float f21020j;

    /* renamed from: k, reason: collision with root package name */
    public l0 f21021k;

    /* renamed from: l, reason: collision with root package name */
    public i0 f21022l;

    /* renamed from: m, reason: collision with root package name */
    public k1.h f21023m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f21024n;

    /* renamed from: o, reason: collision with root package name */
    public m1.b f21025o;

    /* renamed from: p, reason: collision with root package name */
    public f0 f21026p;

    /* renamed from: q, reason: collision with root package name */
    public int f21027q;

    /* renamed from: s, reason: collision with root package name */
    public boolean f21029s;

    /* renamed from: t, reason: collision with root package name */
    public long f21030t;

    /* renamed from: u, reason: collision with root package name */
    public long f21031u;

    /* renamed from: v, reason: collision with root package name */
    public long f21032v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f21033w;

    /* renamed from: x, reason: collision with root package name */
    public RectF f21034x;

    /* renamed from: b, reason: collision with root package name */
    public y2.c f21014b = m1.c.f20427a;

    /* renamed from: c, reason: collision with root package name */
    public m f21015c = m.f30814u;

    /* renamed from: d, reason: collision with root package name */
    public df.l f21016d = a.f21010v;
    public final k0 e = new k0(28, this);

    /* renamed from: g, reason: collision with root package name */
    public boolean f21018g = true;

    /* renamed from: h, reason: collision with root package name */
    public long f21019h = 0;
    public long i = 9205357640488583168L;

    /* renamed from: r, reason: collision with root package name */
    public final o f21028r = new Object();

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        lowerCase.equals("robolectric");
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [n0.o, java.lang.Object] */
    public b(d dVar) {
        this.f21013a = dVar;
        dVar.C(false);
        this.f21030t = 0L;
        this.f21031u = 0L;
        this.f21032v = 9205357640488583168L;
    }

    public final void a() {
        long j10;
        Outline outline;
        if (this.f21018g) {
            boolean z3 = this.f21033w;
            Outline outline2 = null;
            d dVar = this.f21013a;
            if (!z3 && dVar.J() <= 0.0f) {
                dVar.C(false);
                dVar.g(null, 0L);
            } else {
                i0 i0Var = this.f21022l;
                if (i0Var != null) {
                    RectF rectF = this.f21034x;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.f21034x = rectF;
                    }
                    boolean z9 = i0Var instanceof k1.h;
                    if (z9) {
                        ((k1.h) i0Var).f19481a.computeBounds(rectF, false);
                        int i = Build.VERSION.SDK_INT;
                        if (i <= 28 && !((k1.h) i0Var).f19481a.isConvex()) {
                            Outline outline3 = this.f21017f;
                            if (outline3 != null) {
                                outline3.setEmpty();
                            }
                            this.f21024n = true;
                            outline = null;
                        } else {
                            outline = this.f21017f;
                            if (outline == null) {
                                outline = new Outline();
                                this.f21017f = outline;
                            }
                            if (i >= 30) {
                                if (z9) {
                                    outline.setPath(((k1.h) i0Var).f19481a);
                                } else {
                                    s1.k("Unable to obtain android.graphics.Path");
                                    return;
                                }
                            } else if (z9) {
                                outline.setConvexPath(((k1.h) i0Var).f19481a);
                            } else {
                                s1.k("Unable to obtain android.graphics.Path");
                                return;
                            }
                            this.f21024n = !outline.canClip();
                        }
                        this.f21022l = i0Var;
                        if (outline != null) {
                            outline.setAlpha(dVar.a());
                            outline2 = outline;
                        }
                        dVar.g(outline2, (4294967295L & Math.round(rectF.height())) | (Math.round(rectF.width()) << 32));
                        if (this.f21024n && this.f21033w) {
                            dVar.C(false);
                            dVar.i();
                        } else {
                            dVar.C(this.f21033w);
                        }
                    } else {
                        s1.k("Unable to obtain android.graphics.Path");
                        return;
                    }
                } else {
                    dVar.C(this.f21033w);
                    Outline outline4 = this.f21017f;
                    if (outline4 == null) {
                        outline4 = new Outline();
                        this.f21017f = outline4;
                    }
                    Outline outline5 = outline4;
                    long c10 = vd.c(this.f21031u);
                    long j11 = this.f21019h;
                    long j12 = this.i;
                    if (j12 == 9205357640488583168L) {
                        j10 = c10;
                    } else {
                        j10 = j12;
                    }
                    int i10 = (int) (j11 >> 32);
                    int i11 = (int) (j11 & 4294967295L);
                    outline5.setRoundRect(Math.round(Float.intBitsToFloat(i10)), Math.round(Float.intBitsToFloat(i11)), Math.round(Float.intBitsToFloat((int) (j10 >> 32)) + Float.intBitsToFloat(i10)), Math.round(Float.intBitsToFloat((int) (4294967295L & j10)) + Float.intBitsToFloat(i11)), this.f21020j);
                    outline5.setAlpha(dVar.a());
                    dVar.g(outline5, vd.b(j10));
                }
            }
        }
        this.f21018g = false;
    }

    public final void b() {
        if (this.f21029s && this.f21027q == 0) {
            o oVar = this.f21028r;
            b bVar = (b) oVar.f21003b;
            if (bVar != null) {
                bVar.f21027q--;
                bVar.b();
                oVar.f21003b = null;
            }
            j0 j0Var = (j0) oVar.f21005d;
            if (j0Var != null) {
                Object[] objArr = j0Var.f20899b;
                long[] jArr = j0Var.f20898a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j10 = jArr[i];
                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i10 = 8 - ((~(i - length)) >>> 31);
                            for (int i11 = 0; i11 < i10; i11++) {
                                if ((255 & j10) < 128) {
                                    r11.f21027q--;
                                    ((b) objArr[(i << 3) + i11]).b();
                                }
                                j10 >>= 8;
                            }
                            if (i10 != 8) {
                                break;
                            }
                        }
                        if (i == length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                j0Var.b();
            }
            this.f21013a.i();
        }
    }

    public final void c(m1.d dVar) {
        o oVar = this.f21028r;
        oVar.f21004c = (b) oVar.f21003b;
        j0 j0Var = (j0) oVar.f21005d;
        if (j0Var != null && j0Var.h()) {
            j0 j0Var2 = (j0) oVar.e;
            if (j0Var2 == null) {
                int i = q0.f20928a;
                j0Var2 = new j0();
                oVar.e = j0Var2;
            }
            j0Var2.k(j0Var);
            j0Var.b();
        }
        oVar.f21002a = true;
        this.f21016d.invoke(dVar);
        oVar.f21002a = false;
        b bVar = (b) oVar.f21004c;
        if (bVar != null) {
            bVar.f21027q--;
            bVar.b();
        }
        j0 j0Var3 = (j0) oVar.e;
        if (j0Var3 != null && j0Var3.h()) {
            Object[] objArr = j0Var3.f20899b;
            long[] jArr = j0Var3.f20898a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i10 = 0;
                while (true) {
                    long j10 = jArr[i10];
                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i11 = 8 - ((~(i10 - length)) >>> 31);
                        for (int i12 = 0; i12 < i11; i12++) {
                            if ((255 & j10) < 128) {
                                r10.f21027q--;
                                ((b) objArr[(i10 << 3) + i12]).b();
                            }
                            j10 >>= 8;
                        }
                        if (i11 != 8) {
                            break;
                        }
                    }
                    if (i10 == length) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            j0Var3.b();
        }
    }

    public final l0 d() {
        l0 f0Var;
        l0 l0Var = this.f21021k;
        i0 i0Var = this.f21022l;
        if (l0Var != null) {
            return l0Var;
        }
        if (i0Var != null) {
            e0 e0Var = new e0(i0Var);
            this.f21021k = e0Var;
            return e0Var;
        }
        long c10 = vd.c(this.f21031u);
        long j10 = this.f21019h;
        long j11 = this.i;
        if (j11 != 9205357640488583168L) {
            c10 = j11;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (c10 >> 32)) + intBitsToFloat;
        float intBitsToFloat4 = Float.intBitsToFloat((int) (c10 & 4294967295L)) + intBitsToFloat2;
        if (this.f21020j > 0.0f) {
            f0Var = new g0(t8.a((Float.floatToRawIntBits(r0) << 32) | (Float.floatToRawIntBits(r0) & 4294967295L), intBitsToFloat, intBitsToFloat2, intBitsToFloat3, intBitsToFloat4));
        } else {
            f0Var = new k1.f0(new j1.c(intBitsToFloat, intBitsToFloat2, intBitsToFloat3, intBitsToFloat4));
        }
        this.f21021k = f0Var;
        return f0Var;
    }

    public final void e(y2.c cVar, m mVar, long j10, df.l lVar) {
        boolean c10 = y2.c(this.f21031u, j10);
        d dVar = this.f21013a;
        if (!c10) {
            this.f21031u = j10;
            long j11 = this.f21030t;
            dVar.A(j10, (int) (j11 >> 32), (int) (j11 & 4294967295L));
            if (this.i == 9205357640488583168L) {
                this.f21018g = true;
                a();
            }
        }
        this.f21014b = cVar;
        this.f21015c = mVar;
        this.f21016d = lVar;
        dVar.L(cVar, mVar, this, this.e);
    }

    public final void f(long j10, long j11, float f10) {
        if (j1.c(this.f21019h, j10) && j1.e.a(this.i, j11) && this.f21020j == f10 && this.f21022l == null) {
            return;
        }
        this.f21021k = null;
        this.f21022l = null;
        this.f21018g = true;
        this.f21024n = false;
        this.f21019h = j10;
        this.i = j11;
        this.f21020j = f10;
        a();
    }
}
