package gg;

import c7.f0;
import c7.x;

/* loaded from: classes.dex */
public final class f extends f0 {

    /* renamed from: w, reason: collision with root package name */
    public final boolean f17767w;

    public f(x xVar, boolean z3) {
        super(xVar);
        this.f17767w = z3;
    }

    @Override // c7.f0
    public final void e(byte b10) {
        if (this.f17767w) {
            k(String.valueOf(b10 & 255));
            return;
        }
        String valueOf = String.valueOf(b10 & 255);
        valueOf.getClass();
        ((x) this.f3950v).m(valueOf);
    }

    @Override // c7.f0
    public final void g(int i) {
        if (this.f17767w) {
            k(Long.toString(i & 4294967295L, 10));
            return;
        }
        String l10 = Long.toString(i & 4294967295L, 10);
        l10.getClass();
        ((x) this.f3950v).m(l10);
    }

    @Override // c7.f0
    public final void h(long j10) {
        int i = 63;
        String str = "0";
        if (this.f17767w) {
            if (j10 != 0) {
                if (j10 > 0) {
                    str = Long.toString(j10, 10);
                } else {
                    char[] cArr = new char[64];
                    long j11 = (j10 >>> 1) / 5;
                    long j12 = 10;
                    cArr[63] = Character.forDigit((int) (j10 - (j11 * j12)), 10);
                    while (j11 > 0) {
                        i--;
                        cArr[i] = Character.forDigit((int) (j11 % j12), 10);
                        j11 /= j12;
                    }
                    str = new String(cArr, i, 64 - i);
                }
            }
            k(str);
            return;
        }
        if (j10 != 0) {
            if (j10 > 0) {
                str = Long.toString(j10, 10);
            } else {
                char[] cArr2 = new char[64];
                long j13 = (j10 >>> 1) / 5;
                long j14 = 10;
                cArr2[63] = Character.forDigit((int) (j10 - (j13 * j14)), 10);
                while (j13 > 0) {
                    i--;
                    cArr2[i] = Character.forDigit((int) (j13 % j14), 10);
                    j13 /= j14;
                }
                str = new String(cArr2, i, 64 - i);
            }
        }
        str.getClass();
        ((x) this.f3950v).m(str);
    }

    @Override // c7.f0
    public final void j(short s10) {
        if (this.f17767w) {
            k(String.valueOf(s10 & 65535));
            return;
        }
        String valueOf = String.valueOf(s10 & 65535);
        valueOf.getClass();
        ((x) this.f3950v).m(valueOf);
    }
}
