package nf;
import f.d;

import java.io.Serializable;
import kotlin.jvm.internal.l;
import q.x;

/* loaded from: classes.dex */
public final class e implements Comparable, Serializable {

    /* renamed from: w, reason: collision with root package name */
    public static final e f21342w = new e(-31557014167219200L, 0);

    /* renamed from: x, reason: collision with root package name */
    public static final e f21343x = new e(31556889864403199L, 999999999);

    /* renamed from: u, reason: collision with root package name */
    public final long f21344u;

    /* renamed from: v, reason: collision with root package name */
    public final int f21345v;

    public e(long j10, int i) {
        this.f21344u = j10;
        this.f21345v = i;
        if (-31557014167219200L <= j10 && j10 < 31556889864403200L) {
            return;
        }
        x.n("Instant exceeds minimum or maximum instant");
        throw null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        e eVar = (e) obj;
        eVar.getClass();
        int c10 = l.c(this.f21344u, eVar.f21344u);
        if (c10 != 0) {
            return c10;
        }
        return l.b(this.f21345v, eVar.f21345v);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (this.f21344u != eVar.f21344u || this.f21345v != eVar.f21345v) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f21345v * 51) + Long.hashCode(this.f21344u);
    }

    public final String toString() {
        long j10;
        int[] iArr;
        StringBuilder sb2 = new StringBuilder();
        long j11 = this.f21344u;
        long j12 = j11 / 86400;
        long j13 = 0;
        if ((j11 ^ 86400) < 0 && j12 * 86400 != j11) {
            j12--;
        }
        long j14 = j11 % 86400;
        int i = (int) (j14 + (86400 & (((j14 ^ 86400) & ((-j14) | j14)) >> 63)));
        long j15 = (j12 + 719528) - 60;
        if (j15 < 0) {
            long j16 = 146097;
            long j17 = ((j15 + 1) / j16) - 1;
            j10 = 0;
            j13 = 400 * j17;
            j15 += (-j17) * j16;
        } else {
            j10 = 0;
        }
        long j18 = 400;
        long j19 = ((j18 * j15) + 591) / 146097;
        long j20 = 365;
        long j21 = 4;
        long j22 = 100;
        long j23 = j15 - ((j19 / j18) + (((j19 / j21) + (j20 * j19)) - (j19 / j22)));
        if (j23 < j10) {
            j19--;
            j23 = j15 - ((j19 / j18) + (((j19 / j21) + (j20 * j19)) - (j19 / j22)));
        }
        int i10 = (int) j23;
        int i11 = ((i10 * 5) + 2) / 153;
        int i12 = ((i11 + 2) % 12) + 1;
        int i13 = (i10 - (((i11 * 306) + 5) / 10)) + 1;
        int i14 = (int) (j19 + j13 + (i11 / 10));
        int i15 = i / 3600;
        int i16 = i - (i15 * 3600);
        int i17 = i16 / 60;
        int i18 = i16 - (i17 * 60);
        int i19 = 0;
        if (Math.abs(i14) < 1000) {
            StringBuilder sb3 = new StringBuilder();
            if (i14 >= 0) {
                sb3.append(i14 + 10000);
                sb3.deleteCharAt(0).getClass();
            } else {
                sb3.append(i14 - 10000);
                sb3.deleteCharAt(1).getClass();
            }
            sb2.append((CharSequence) sb3);
        } else {
            if (i14 >= 10000) {
                sb2.append('+');
            }
            sb2.append(i14);
        }
        sb2.append('-');
        d(sb2, sb2, i12);
        sb2.append('-');
        d(sb2, sb2, i13);
        sb2.append('T');
        d(sb2, sb2, i15);
        sb2.append(':');
        d(sb2, sb2, i17);
        sb2.append(':');
        d(sb2, sb2, i18);
        int i20 = this.f21345v;
        if (i20 != 0) {
            sb2.append('.');
            while (true) {
                int i21 = i19 + 1;
                iArr = f.f21346a;
                if (i20 % iArr[i21] != 0) {
                    break;
                }
                i19 = i21;
            }
            int i22 = i19 - (i19 % 3);
            String valueOf = String.valueOf((i20 / iArr[i22]) + iArr[9 - i22]);
            valueOf.getClass();
            sb2.append(valueOf.substring(1));
        }
        sb2.append('Z');
        return sb2.toString();
    }
}
