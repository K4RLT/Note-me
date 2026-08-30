package sg;
import q.f;

import java.util.Arrays;
import ya.bc;

/* loaded from: classes.dex */
public final class q extends h {
    public final transient int[] A;

    /* renamed from: z, reason: collision with root package name */
    public final transient byte[][] f25307z;

    public q(f fVar, int i) {
        super(h.f25276y.f25279w);
        bc.a(fVar.f25274v, 0L, i);
        o oVar = fVar.f25273u;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i11 < i) {
            if (oVar != null) {
                int i13 = oVar.f25300c;
                int i14 = oVar.f25299b;
                if (i13 != i14) {
                    i11 += i13 - i14;
                    i12++;
                    oVar = oVar.f25302f;
                } else {
                    g5.f("s.limit == s.pos");
                    throw null;
                }
            } else {
                kotlin.jvm.internal.l.g();
                throw null;
            }
        }
        byte[][] bArr = new byte[i12];
        this.A = new int[i12 * 2];
        o oVar2 = fVar.f25273u;
        int i15 = 0;
        while (i10 < i) {
            if (oVar2 != null) {
                bArr[i15] = oVar2.f25298a;
                int i16 = oVar2.f25300c;
                int i17 = oVar2.f25299b;
                int i18 = (i16 - i17) + i10;
                if (i18 > i) {
                    i10 = i;
                } else {
                    i10 = i18;
                }
                int[] iArr = this.A;
                iArr[i15] = i10;
                iArr[i15 + i12] = i17;
                oVar2.f25301d = true;
                i15++;
                oVar2 = oVar2.f25302f;
            } else {
                kotlin.jvm.internal.l.g();
                throw null;
            }
        }
        this.f25307z = bArr;
    }

    @Override // sg.h
    public final int b() {
        return this.A[this.f25307z.length - 1];
    }

    @Override // sg.h
    public final String c() {
        return m().c();
    }

    @Override // sg.h
    public final byte[] d() {
        return l();
    }

    @Override // sg.h
    public final byte e(int i) {
        int i10;
        byte[][] bArr = this.f25307z;
        int length = bArr.length - 1;
        int[] iArr = this.A;
        bc.a(iArr[length], i, 1L);
        int k3 = k(i);
        if (k3 == 0) {
            i10 = 0;
        } else {
            i10 = iArr[k3 - 1];
        }
        return bArr[k3][(i - i10) + iArr[bArr.length + k3]];
    }

    @Override // sg.h
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof h) {
                h hVar = (h) obj;
                if (hVar.b() == b() && g(hVar, b())) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // sg.h
    public final boolean f(int i, int i10, int i11, byte[] bArr) {
        int i12;
        bArr.getClass();
        if (i >= 0 && i <= b() - i11 && i10 >= 0 && i10 <= bArr.length - i11) {
            int k3 = k(i);
            while (i11 > 0) {
                int[] iArr = this.A;
                if (k3 == 0) {
                    i12 = 0;
                } else {
                    i12 = iArr[k3 - 1];
                }
                int min = Math.min(i11, ((iArr[k3] - i12) + i12) - i);
                byte[][] bArr2 = this.f25307z;
                int i13 = (i - i12) + iArr[bArr2.length + k3];
                byte[] bArr3 = bArr2[k3];
                bArr3.getClass();
                for (int i14 = 0; i14 < min; i14++) {
                    if (bArr3[i14 + i13] == bArr[i14 + i10]) {
                    }
                }
                i += min;
                i10 += min;
                i11 -= min;
                k3++;
            }
            return true;
        }
        return false;
    }

    @Override // sg.h
    public final boolean g(h hVar, int i) {
        int i10;
        hVar.getClass();
        if (b() - i >= 0) {
            int k3 = k(0);
            int i11 = 0;
            int i12 = 0;
            while (i > 0) {
                int[] iArr = this.A;
                if (k3 == 0) {
                    i10 = 0;
                } else {
                    i10 = iArr[k3 - 1];
                }
                int min = Math.min(i, ((iArr[k3] - i10) + i10) - i11);
                byte[][] bArr = this.f25307z;
                if (hVar.f(i12, (i11 - i10) + iArr[bArr.length + k3], min, bArr[k3])) {
                    i11 += min;
                    i12 += min;
                    i -= min;
                    k3++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // sg.h
    public final h h() {
        return m().h();
    }

    @Override // sg.h
    public final int hashCode() {
        int i = this.f25277u;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.f25307z;
        int length = bArr.length;
        int i10 = 0;
        int i11 = 1;
        int i12 = 0;
        while (i10 < length) {
            byte[] bArr2 = bArr[i10];
            int[] iArr = this.A;
            int i13 = iArr[length + i10];
            int i14 = iArr[i10];
            int i15 = (i14 - i12) + i13;
            while (i13 < i15) {
                i11 = (i11 * 31) + bArr2[i13];
                i13++;
            }
            i10++;
            i12 = i14;
        }
        this.f25277u = i11;
        return i11;
    }

    @Override // sg.h
    public final String i() {
        return m().i();
    }

    @Override // sg.h
    public final void j(f fVar) {
        byte[][] bArr = this.f25307z;
        int length = bArr.length;
        int i = 0;
        int i10 = 0;
        while (i < length) {
            int[] iArr = this.A;
            int i11 = iArr[length + i];
            int i12 = iArr[i];
            o oVar = new o(bArr[i], i11, (i11 + i12) - i10);
            o oVar2 = fVar.f25273u;
            if (oVar2 == null) {
                oVar.f25303g = oVar;
                oVar.f25302f = oVar;
                fVar.f25273u = oVar;
            } else {
                o oVar3 = oVar2.f25303g;
                if (oVar3 != null) {
                    oVar3.b(oVar);
                } else {
                    kotlin.jvm.internal.l.g();
                    throw null;
                }
            }
            i++;
            i10 = i12;
        }
        fVar.f25274v += i10;
    }

    public final int k(int i) {
        int binarySearch = Arrays.binarySearch(this.A, 0, this.f25307z.length, i + 1);
        if (binarySearch >= 0) {
            return binarySearch;
        }
        return ~binarySearch;
    }

    public final byte[] l() {
        byte[][] bArr = this.f25307z;
        int length = bArr.length - 1;
        int[] iArr = this.A;
        byte[] bArr2 = new byte[iArr[length]];
        int length2 = bArr.length;
        int i = 0;
        int i10 = 0;
        while (i < length2) {
            int i11 = iArr[length2 + i];
            int i12 = iArr[i];
            byte[] bArr3 = bArr[i];
            bArr3.getClass();
            System.arraycopy(bArr3, i11, bArr2, i10, i12 - i10);
            i++;
            i10 = i12;
        }
        return bArr2;
    }

    public final h m() {
        return new h(l());
    }

    @Override // sg.h
    public final String toString() {
        return m().toString();
    }
}
