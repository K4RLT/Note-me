package og;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final sg.f f21993a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f21995c;

    /* renamed from: b, reason: collision with root package name */
    public int f21994b = Integer.MAX_VALUE;
    public b[] e = new b[8];

    /* renamed from: f, reason: collision with root package name */
    public int f21997f = 7;

    /* renamed from: g, reason: collision with root package name */
    public int f21998g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f21999h = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f21996d = 4096;

    public d(sg.f fVar) {
        this.f21993a = fVar;
    }

    public final void a(int i) {
        int i10;
        if (i > 0) {
            int length = this.e.length - 1;
            int i11 = 0;
            while (true) {
                i10 = this.f21997f;
                if (length < i10 || i <= 0) {
                    break;
                }
                int i12 = this.e[length].f21985c;
                i -= i12;
                this.f21999h -= i12;
                this.f21998g--;
                i11++;
                length--;
            }
            b[] bVarArr = this.e;
            int i13 = i10 + 1;
            System.arraycopy(bVarArr, i13, bVarArr, i13 + i11, this.f21998g);
            b[] bVarArr2 = this.e;
            int i14 = this.f21997f + 1;
            Arrays.fill(bVarArr2, i14, i14 + i11, (Object) null);
            this.f21997f += i11;
        }
    }

    public final void b(b bVar) {
        int i = bVar.f21985c;
        int i10 = this.f21996d;
        if (i > i10) {
            Arrays.fill(this.e, (Object) null);
            this.f21997f = this.e.length - 1;
            this.f21998g = 0;
            this.f21999h = 0;
            return;
        }
        a((this.f21999h + i) - i10);
        int i11 = this.f21998g + 1;
        b[] bVarArr = this.e;
        if (i11 > bVarArr.length) {
            b[] bVarArr2 = new b[bVarArr.length * 2];
            System.arraycopy(bVarArr, 0, bVarArr2, bVarArr.length, bVarArr.length);
            this.f21997f = this.e.length - 1;
            this.e = bVarArr2;
        }
        int i12 = this.f21997f;
        this.f21997f = i12 - 1;
        this.e[i12] = bVar;
        this.f21998g++;
        this.f21999h += i;
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [sg.f, java.lang.Object] */
    public final void c(sg.h hVar) {
        y.f22082d.getClass();
        long j10 = 0;
        long j11 = 0;
        for (int i = 0; i < hVar.b(); i++) {
            j11 += y.f22081c[hVar.e(i) & 255];
        }
        int i10 = (int) ((j11 + 7) >> 3);
        int b10 = hVar.b();
        sg.f fVar = this.f21993a;
        if (i10 < b10) {
            Object obj = new Object();
            y.f22082d.getClass();
            int i11 = 0;
            for (int i12 = 0; i12 < hVar.b(); i12++) {
                int e = hVar.e(i12) & 255;
                int i13 = y.f22080b[e];
                byte b11 = y.f22081c[e];
                j10 = (j10 << b11) | i13;
                i11 += b11;
                while (i11 >= 8) {
                    i11 -= 8;
                    obj.H((int) (j10 >> i11));
                }
            }
            if (i11 > 0) {
                obj.H((int) ((j10 << (8 - i11)) | (255 >>> i11)));
            }
            byte[] o10 = obj.o(obj.f25274v);
            char[] cArr = tg.a.f25759a;
            d(o10.length, 127, 128);
            fVar.m228write(o10, 0, o10.length);
            return;
        }
        d(hVar.b(), 127, 0);
        hVar.j(fVar);
    }

    public final void d(int i, int i10, int i11) {
        sg.f fVar = this.f21993a;
        if (i < i10) {
            fVar.H(i | i11);
            return;
        }
        fVar.H(i11 | i10);
        int i12 = i - i10;
        while (i12 >= 128) {
            fVar.H(128 | (i12 & 127));
            i12 >>>= 7;
        }
        fVar.H(i12);
    }
}