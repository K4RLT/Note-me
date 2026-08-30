package b1;
import g.a;
import l.c;
import m.d;
import n.z;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class m implements Iterable, ef.a {

    /* renamed from: y, reason: collision with root package name */
    public static final m f1366y = new m(0, 0, 0, null);

    /* renamed from: u, reason: collision with root package name */
    public final long f1367u;

    /* renamed from: v, reason: collision with root package name */
    public final long f1368v;

    /* renamed from: w, reason: collision with root package name */
    public final long f1369w;

    /* renamed from: x, reason: collision with root package name */
    public final long[] f1370x;

    public m(long j10, long j11, long j12, long[] jArr) {
        this.f1367u = j10;
        this.f1368v = j11;
        this.f1369w = j12;
        this.f1370x = jArr;
    }

    public final m a(m mVar) {
        m mVar2;
        long j10;
        long[] jArr;
        m mVar3 = f1366y;
        if (mVar == mVar3) {
            return this;
        }
        if (this == mVar3) {
            return mVar3;
        }
        long j11 = mVar.f1369w;
        long j12 = mVar.f1369w;
        long[] jArr2 = mVar.f1370x;
        long j13 = mVar.f1368v;
        long j14 = mVar.f1367u;
        long j15 = this.f1369w;
        if (j11 == j15 && jArr2 == (jArr = this.f1370x)) {
            return new m(this.f1367u & (~j14), this.f1368v & (~j13), j15, jArr);
        }
        if (jArr2 != null) {
            mVar2 = this;
            for (long j16 : jArr2) {
                mVar2 = mVar2.b(j16);
            }
        } else {
            mVar2 = this;
        }
        long j17 = 0;
        if (j13 != 0) {
            int i = 0;
            while (i < 64) {
                if (((1 << i) & j13) != j17) {
                    j10 = j17;
                    mVar2 = mVar2.b(i + j12);
                } else {
                    j10 = j17;
                }
                i++;
                j17 = j10;
            }
        }
        long j18 = j17;
        if (j14 != j18) {
            for (int i10 = 0; i10 < 64; i10++) {
                if (((1 << i10) & j14) != j18) {
                    mVar2 = mVar2.b(i10 + j12 + 64);
                }
            }
        }
        return mVar2;
    }

    public final m b(long j10) {
        long[] jArr;
        int c10;
        long[] jArr2;
        long j11 = j10 - this.f1369w;
        long j12 = 0;
        if (kotlin.jvm.internal.c(j11, j12) >= 0 && kotlin.jvm.internal.c(j11, 64) < 0) {
            long j13 = 1 << ((int) j11);
            long j14 = this.f1368v;
            if ((j14 & j13) != 0) {
                return new m(this.f1367u, j14 & (~j13), this.f1369w, this.f1370x);
            }
        } else if (kotlin.jvm.internal.c(j11, 64) >= 0 && kotlin.jvm.internal.c(j11, 128) < 0) {
            long j15 = 1 << (((int) j11) - 64);
            long j16 = this.f1367u;
            if ((j16 & j15) != 0) {
                return new m(j16 & (~j15), this.f1368v, this.f1369w, this.f1370x);
            }
        } else if (kotlin.jvm.internal.c(j11, j12) < 0 && (jArr = this.f1370x) != null && (c10 = w.c(j10, jArr)) >= 0) {
            int length = jArr.length;
            int i = length - 1;
            if (i == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i];
                if (c10 > 0) {
                    qe.k.e(jArr, jArr3, 0, 0, c10);
                }
                if (c10 < i) {
                    qe.k.e(jArr, jArr3, c10, c10 + 1, length);
                }
                jArr2 = jArr3;
            }
            return new m(this.f1367u, this.f1368v, this.f1369w, jArr2);
        }
        return this;
    }

    public final boolean g(long j10) {
        long[] jArr;
        long j11 = j10 - this.f1369w;
        long j12 = 0;
        if (kotlin.jvm.internal.c(j11, j12) >= 0 && kotlin.jvm.internal.c(j11, 64) < 0) {
            if (((1 << ((int) j11)) & this.f1368v) == 0) {
                return false;
            }
            return true;
        }
        if (kotlin.jvm.internal.c(j11, 64) >= 0 && kotlin.jvm.internal.c(j11, 128) < 0) {
            if (((1 << (((int) j11) - 64)) & this.f1367u) == 0) {
                return false;
            }
            return true;
        }
        if (kotlin.jvm.internal.c(j11, j12) > 0 || (jArr = this.f1370x) == null || w.c(j10, jArr) < 0) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return lf.a(new l(this, null));
    }

    public final m k(m mVar) {
        m mVar2;
        m mVar3;
        long[] jArr;
        m mVar4 = f1366y;
        if (mVar == mVar4) {
            return this;
        }
        if (this == mVar4) {
            return mVar;
        }
        long j10 = mVar.f1369w;
        long j11 = mVar.f1369w;
        long[] jArr2 = mVar.f1370x;
        long j12 = mVar.f1368v;
        long j13 = mVar.f1367u;
        long j14 = this.f1369w;
        long j15 = this.f1368v;
        long j16 = this.f1367u;
        if (j10 == j14 && jArr2 == (jArr = this.f1370x)) {
            return new m(j16 | j13, j15 | j12, j14, jArr);
        }
        int i = 0;
        long[] jArr3 = this.f1370x;
        if (jArr3 == null) {
            if (jArr3 != null) {
                mVar3 = mVar;
                for (long j17 : jArr3) {
                    mVar3 = mVar3.n(j17);
                }
            } else {
                mVar3 = mVar;
            }
            long j18 = this.f1369w;
            if (j15 != 0) {
                for (int i10 = 0; i10 < 64; i10++) {
                    if (((1 << i10) & j15) != 0) {
                        mVar3 = mVar3.n(i10 + j18);
                    }
                }
            }
            if (j16 != 0) {
                while (i < 64) {
                    if (((1 << i) & j16) != 0) {
                        mVar3 = mVar3.n(i + j18 + 64);
                    }
                    i++;
                }
            }
            return mVar3;
        }
        if (jArr2 != null) {
            mVar2 = this;
            for (long j19 : jArr2) {
                mVar2 = mVar2.n(j19);
            }
        } else {
            mVar2 = this;
        }
        if (j12 != 0) {
            for (int i11 = 0; i11 < 64; i11++) {
                if (((1 << i11) & j12) != 0) {
                    mVar2 = mVar2.n(i11 + j11);
                }
            }
        }
        if (j13 != 0) {
            while (i < 64) {
                if (((1 << i) & j13) != 0) {
                    mVar2 = mVar2.n(i + j11 + 64);
                }
                i++;
            }
        }
        return mVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0150, code lost:
    
        if (r9 == null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0152, code lost:
    
        r4 = (z) r9.f22681u;
        r5 = r4.f20965b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0158, code lost:
    
        if (r5 != 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x015a, code lost:
    
        r5 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x016a, code lost:
    
        if (r5 != null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x016d, code lost:
    
        r28 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x017b, code lost:
    
        return new b1.m(r22, r24, r26, r28).n(r30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x015c, code lost:
    
        r3 = new long[r5];
        r4 = r4.f20964a;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0161, code lost:
    
        if (r7 >= r5) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0163, code lost:
    
        r3[r7] = r4[r7];
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0170, code lost:
    
        r28 = r6;
     */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.lang.Object, pd.c] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final b1.m n(long r30) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.m.n(long):b1.m");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(" [");
        ArrayList arrayList = new ArrayList(qe.d(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).longValue()));
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append((CharSequence) "");
        int size = arrayList.size();
        int i = 0;
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = arrayList.get(i10);
            boolean z3 = true;
            i++;
            if (i > 1) {
                sb3.append((CharSequence) ", ");
            }
            if (obj != null) {
                z3 = obj instanceof CharSequence;
            }
            if (z3) {
                sb3.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb3.append(((Character) obj).charValue());
            } else {
                sb3.append((CharSequence) obj.toString());
            }
        }
        sb3.append((CharSequence) "");
        sb2.append(sb3.toString());
        sb2.append(']');
        return sb2.toString();
    }
}
