package og;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import ya.dc;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public final sg.n f21987b;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f21986a = new ArrayList();
    public b[] e = new b[8];

    /* renamed from: f, reason: collision with root package name */
    public int f21990f = 7;

    /* renamed from: g, reason: collision with root package name */
    public int f21991g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f21992h = 0;

    /* renamed from: c, reason: collision with root package name */
    public final int f21988c = 4096;

    /* renamed from: d, reason: collision with root package name */
    public int f21989d = 4096;

    public c(s sVar) {
        this.f21987b = new sg.n(sVar);
    }

    public final int a(int i) {
        int i10;
        int i11 = 0;
        if (i > 0) {
            int length = this.e.length;
            while (true) {
                length--;
                i10 = this.f21990f;
                if (length < i10 || i <= 0) {
                    break;
                }
                int i12 = this.e[length].f21985c;
                i -= i12;
                this.f21992h -= i12;
                this.f21991g--;
                i11++;
            }
            b[] bVarArr = this.e;
            System.arraycopy(bVarArr, i10 + 1, bVarArr, i10 + 1 + i11, this.f21991g);
            this.f21990f += i11;
        }
        return i11;
    }

    public final sg.h b(int i) {
        if (i >= 0) {
            b[] bVarArr = e.f22000a;
            if (i <= bVarArr.length - 1) {
                return bVarArr[i].f21983a;
            }
        }
        int length = this.f21990f + 1 + (i - e.f22000a.length);
        if (length >= 0) {
            b[] bVarArr2 = this.e;
            if (length < bVarArr2.length) {
                return bVarArr2[length].f21983a;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    public final void c(b bVar) {
        this.f21986a.add(bVar);
        int i = bVar.f21985c;
        int i10 = this.f21989d;
        if (i > i10) {
            Arrays.fill(this.e, (Object) null);
            this.f21990f = this.e.length - 1;
            this.f21991g = 0;
            this.f21992h = 0;
            return;
        }
        a((this.f21992h + i) - i10);
        int i11 = this.f21991g + 1;
        b[] bVarArr = this.e;
        if (i11 > bVarArr.length) {
            b[] bVarArr2 = new b[bVarArr.length * 2];
            System.arraycopy(bVarArr, 0, bVarArr2, bVarArr.length, bVarArr.length);
            this.f21990f = this.e.length - 1;
            this.e = bVarArr2;
        }
        int i12 = this.f21990f;
        this.f21990f = i12 - 1;
        this.e[i12] = bVar;
        this.f21991g++;
        this.f21992h += i;
    }

    public final sg.h d() {
        boolean z3;
        sg.n nVar = this.f21987b;
        byte readByte = nVar.readByte();
        int i = readByte & 255;
        if ((readByte & 128) == 128) {
            z3 = true;
        } else {
            z3 = false;
        }
        int e = e(i, 127);
        if (z3) {
            y yVar = y.f22082d;
            long j10 = e;
            nVar.Q(j10);
            byte[] o10 = nVar.f25296v.o(j10);
            yVar.getClass();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ba.r rVar = yVar.f22083a;
            ba.r rVar2 = rVar;
            int i10 = 0;
            int i11 = 0;
            for (byte b10 : o10) {
                i10 = (i10 << 8) | (b10 & 255);
                i11 += 8;
                while (i11 >= 8) {
                    rVar2 = ((ba.r[]) rVar2.f3163w)[(i10 >>> (i11 - 8)) & 255];
                    if (((ba.r[]) rVar2.f3163w) == null) {
                        byteArrayOutputStream.write(rVar2.f3161u);
                        i11 -= rVar2.f3162v;
                        rVar2 = rVar;
                    } else {
                        i11 -= 8;
                    }
                }
            }
            while (i11 > 0) {
                ba.r rVar3 = ((ba.r[]) rVar2.f3163w)[(i10 << (8 - i11)) & 255];
                ba.r[] rVarArr = (ba.r[]) rVar3.f3163w;
                int i12 = rVar3.f3162v;
                if (rVarArr != null || i12 > i11) {
                    break;
                }
                byteArrayOutputStream.write(rVar3.f3161u);
                i11 -= i12;
                rVar2 = rVar;
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            char[] cArr = sg.h.f25275x;
            return dc.b(byteArray);
        }
        return nVar.l(e);
    }

    public final int e(int i, int i10) {
        int i11 = i & i10;
        if (i11 < i10) {
            return i11;
        }
        int i12 = 0;
        while (true) {
            byte readByte = this.f21987b.readByte();
            int i13 = readByte & 255;
            if ((readByte & 128) != 0) {
                i10 += (readByte & Byte.MAX_VALUE) << i12;
                i12 += 7;
            } else {
                return i10 + (i13 << i12);
            }
        }
    }
}
