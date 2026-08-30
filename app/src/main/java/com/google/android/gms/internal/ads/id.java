package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class id {

    /* renamed from: a, reason: collision with root package name */
    public Object f7107a;

    /* renamed from: b, reason: collision with root package name */
    public long f7108b;

    /* renamed from: c, reason: collision with root package name */
    public double f7109c;

    /* renamed from: d, reason: collision with root package name */
    public oc f7110d;
    public ArrayList e;

    /* renamed from: f, reason: collision with root package name */
    public bd f7111f;

    /* renamed from: g, reason: collision with root package name */
    public int f7112g = 1;

    public static id a(Object obj) {
        id idVar = new id();
        int[] iArr = {572660336, 1963204074, 810270723, 1168973800, 12304897, -1027511958, 1433925857, 2084420925, 1937477084};
        int i = iArr[0];
        int i10 = iArr[1];
        int i11 = iArr[2];
        int i12 = iArr[3];
        int i13 = iArr[4];
        int i14 = iArr[5];
        int i15 = iArr[6];
        int i16 = iArr[7];
        int w10 = a5.a.w((i10 & (~i)) | i11, (i & i12) | i13, i14, i15);
        idVar.r();
        idVar.f7112g = (i16 % 1937477084) ^ w10;
        idVar.f7107a = obj;
        return idVar;
    }

    public static id b(long j10) {
        id idVar = new id();
        int[] iArr = {269455306, 1628467785, 508432336, 1769894153, 149815616, -1737813993, 468055906, 524872353, 327254586};
        int i = iArr[0];
        int i10 = iArr[1];
        int i11 = iArr[2];
        int i12 = iArr[3];
        int i13 = iArr[4];
        int i14 = iArr[5];
        int i15 = iArr[6];
        int i16 = iArr[7];
        int w10 = a5.a.w((i10 & (~i)) | i11, (i & i12) | i13, i14, i15);
        idVar.r();
        idVar.f7112g = (i16 % 327254586) ^ w10;
        idVar.f7108b = j10;
        return idVar;
    }

    public static id c(double d2) {
        id idVar = new id();
        int[] iArr = {76065818, 1629326670, 912768099, 1092092300, 784816880, -1349977414, 434065736, 1884661237, 1605908235};
        int i = iArr[0];
        int i10 = iArr[1];
        int i11 = iArr[2];
        int i12 = iArr[3];
        int i13 = iArr[4];
        int i14 = iArr[5];
        int i15 = iArr[6];
        int i16 = iArr[7];
        int w10 = a5.a.w((i10 & (~i)) | i11, (i & i12) | i13, i14, i15);
        idVar.r();
        idVar.f7112g = (i16 % 1605908235) ^ w10;
        idVar.f7109c = d2;
        return idVar;
    }

    public static id d(oc ocVar) {
        id idVar = new id();
        int[] iArr = {1143408282, 544368152, 1884037077, 79323401, 1472762119, -801477845, 201305624, 1470503465, 1402586708};
        int i = iArr[0];
        int i10 = iArr[1];
        int i11 = iArr[2];
        int i12 = iArr[3];
        int i13 = iArr[4];
        int i14 = iArr[5];
        int i15 = iArr[6];
        int i16 = iArr[7];
        int w10 = a5.a.w((i10 & (~i)) | i11, (i & i12) | i13, i14, i15);
        idVar.r();
        idVar.f7112g = (i16 % 1402586708) ^ w10;
        idVar.f7110d = ocVar;
        return idVar;
    }

    public static id e(ArrayList arrayList) {
        id idVar = new id();
        int[] iArr = {231602422, 370241669, 619070592, 319896591, 694865338, 1425770340, 39950860, 555996658, 324763920};
        int i = iArr[0];
        int i10 = iArr[1];
        int i11 = iArr[2];
        int i12 = iArr[3];
        int i13 = iArr[4];
        int i14 = iArr[5];
        int i15 = iArr[6];
        int i16 = iArr[7];
        int w10 = a5.a.w((i10 & (~i)) | i11, (i & i12) | i13, i14, i15);
        idVar.r();
        idVar.f7112g = (i16 % 324763920) ^ w10;
        idVar.e = arrayList;
        return idVar;
    }

    public static id f(bd bdVar) {
        id idVar = new id();
        int[] iArr = {1315209188, 67133601, 1612794668, 612376713, 2023183116, -774012042, 5007439, 661761152, 474613996};
        int i = iArr[0];
        int i10 = iArr[1];
        int i11 = iArr[2];
        int i12 = iArr[3];
        int i13 = iArr[4];
        int i14 = iArr[5];
        int i15 = iArr[6];
        int i16 = iArr[7];
        int w10 = a5.a.w((i10 & (~i)) | i11, (i & i12) | i13, i14, i15);
        idVar.r();
        idVar.f7112g = (i16 % 474613996) ^ w10;
        idVar.f7111f = bdVar;
        return idVar;
    }

    public static id g(Object obj) {
        long j10;
        if (obj instanceof Long) {
            return b(((Long) obj).longValue());
        }
        if (obj instanceof Boolean) {
            if (true != ((Boolean) obj).booleanValue()) {
                j10 = 0;
            } else {
                j10 = 1;
            }
            return b(j10);
        }
        if (obj instanceof Integer) {
            return b(((Integer) obj).intValue());
        }
        if (obj instanceof Double) {
            return c(((Double) obj).doubleValue());
        }
        if (obj instanceof Float) {
            return c(((Float) obj).floatValue());
        }
        if (obj instanceof Short) {
            return b(((Short) obj).shortValue());
        }
        if (obj instanceof Byte) {
            return b(((Byte) obj).byteValue());
        }
        if (obj instanceof oc) {
            return d((oc) obj);
        }
        if (obj instanceof String) {
            return d(oc.e(((String) obj).getBytes(Charset.forName(nc.a("Hn2H4l0=")))));
        }
        if (obj instanceof ArrayList) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) obj;
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(g(arrayList2.get(i)));
            }
            return e(arrayList);
        }
        return a(obj);
    }

    public static id j(id idVar) {
        int[] iArr = {1154349542, 1365661854, 772762753, -35647458, -1399059520, 905919471, 65677639, 1759726503, 552812661};
        int i = 0;
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        int i17 = iArr[7];
        int w10 = a5.a.w((i11 & (~i10)) | i12, (i10 & i13) | i14, i15, i16);
        int i18 = i17 % 552812661;
        try {
            int i19 = idVar.f7112g;
            int i20 = (i18 ^ w10) + i19;
            if (i19 == 0) {
                throw null;
            }
            switch (i20) {
                case 0:
                    return new id();
                case 1:
                    return a(idVar.l());
                case 2:
                    return b(idVar.m());
                case 3:
                    return d(idVar.n());
                case 4:
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = (ArrayList) idVar.o();
                    int size = arrayList2.size();
                    while (i < size) {
                        Object obj = arrayList2.get(i);
                        i++;
                        arrayList.add(j((id) obj));
                    }
                    return e(arrayList);
                case 5:
                    return f(idVar.p());
                case 6:
                    return c(idVar.q());
                default:
                    g5.q.f(nc.a("HkezqgQcPni/TE/NwjgYPC5H6Q2JRdEp275wOg=="));
                    return null;
            }
        } catch (fd e) {
            throw new AssertionError(nc.a("CEiv6BFfPnitUE+D"), e);
        }
    }

    public final Object h() {
        int[] iArr = {172154289, 1050326876, 843682288, -858640882, -228026365, 881347074, 13857144, 514820752, 473891334};
        int i = 0;
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        int i17 = iArr[7];
        int w10 = a5.a.w((i11 & (~i10)) | i12, (i10 & i13) | i14, i15, i16);
        int i18 = this.f7112g;
        int i19 = ((i17 % 473891334) ^ w10) + i18;
        if (i18 != 0) {
            switch (i19) {
                case 0:
                case 5:
                    throw new Exception();
                case 1:
                    return l();
                case 2:
                    return Long.valueOf(m());
                case 3:
                    return n().a();
                case 4:
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = (ArrayList) o();
                    int size = arrayList2.size();
                    while (i < size) {
                        Object obj = arrayList2.get(i);
                        i++;
                        arrayList.add(((id) obj).h());
                    }
                    return arrayList;
                case 6:
                    return Double.valueOf(q());
                default:
                    g5.q.f(nc.a("HkezqgQcPni/TE/NwjgYPC5H6Q2JRdEp275wOg=="));
                    return null;
            }
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x01f3, code lost:
    
        if (r18.equals(java.lang.Object.class) != false) goto L150;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.lang.Class r18) {
        /*
            Method dump skipped, instructions count: 596
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.id.i(java.lang.Class):java.lang.Object");
    }

    public final void k(ByteArrayOutputStream byteArrayOutputStream) {
        long[] jArr = {1269833163, 1628598594, 308676977, 1629286434, 15633520, 3337700125L, 1402923307, 613197917, 297598514};
        int i = 0;
        long j10 = jArr[0];
        long j11 = jArr[1];
        long j12 = jArr[2];
        long j13 = jArr[3];
        long j14 = jArr[4];
        int i10 = 5;
        long j15 = jArr[5];
        long j16 = jArr[6];
        long j17 = jArr[7];
        long j18 = (((((~j10) & j11) | j12) + ((j10 & j13) | j14)) - j15) + j16;
        long j19 = j17 % 297598514;
        int i11 = this.f7112g;
        int i12 = i11 - 1;
        if (i11 != 0) {
            switch (i12) {
                case 0:
                case 1:
                case 5:
                    throw new Exception();
                case 2:
                    s6.u(m(), new hx0(i10, byteArrayOutputStream), true);
                    return;
                case 3:
                    byte[] bArr = n().f9089a;
                    s6.u(bArr.length * (j18 ^ j19), new hx0(i10, byteArrayOutputStream), true);
                    byteArrayOutputStream.write(bArr);
                    return;
                case 4:
                    ArrayList arrayList = (ArrayList) o();
                    s6.u(arrayList.size(), new hx0(i10, byteArrayOutputStream), true);
                    int size = arrayList.size();
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((id) obj).k(byteArrayOutputStream);
                    }
                    return;
                case 6:
                    long doubleToRawLongBits = Double.doubleToRawLongBits(q());
                    ByteBuffer allocate = ByteBuffer.allocate(8);
                    allocate.order(ByteOrder.LITTLE_ENDIAN);
                    allocate.putLong(doubleToRawLongBits);
                    byte[] array = allocate.array();
                    int length = array.length;
                    while (i < length) {
                        byteArrayOutputStream.write(array[i]);
                        i++;
                    }
                    int length2 = allocate.array().length;
                    return;
                default:
                    return;
            }
        }
        throw null;
    }

    public final Object l() {
        int[] iArr = {427355115, 404248040, 1318670750, 874677346, 1819730563, -970011213, 126401947, 1858504292, 235745791};
        int i = iArr[0];
        int i10 = iArr[1];
        int i11 = iArr[2];
        int i12 = iArr[3];
        int i13 = iArr[4];
        int i14 = iArr[5];
        int i15 = iArr[6];
        s((iArr[7] % 235745791) ^ a5.a.w((i10 & (~i)) | i11, (i & i12) | i13, i14, i15));
        return this.f7107a;
    }

    public final long m() {
        int[] iArr = {1646478179, 763209928, 1529626135, 609321208, 1403807536, -1382063087, 25624641, 1388803074, 733327814};
        int i = iArr[0];
        int i10 = iArr[1];
        int i11 = iArr[2];
        int i12 = iArr[3];
        int i13 = iArr[4];
        int i14 = iArr[5];
        int i15 = iArr[6];
        s((iArr[7] % 733327814) ^ a5.a.w((i10 & (~i)) | i11, (i & i12) | i13, i14, i15));
        return this.f7108b;
    }

    public final oc n() {
        int[] iArr = {2059344234, 1917530355, 739411611, 1399403104, 95815174, 2094390031, 51245830, 1312994984, 1140384172};
        int i = iArr[0];
        int i10 = iArr[1];
        int i11 = iArr[2];
        int i12 = iArr[3];
        int i13 = iArr[4];
        int i14 = iArr[5];
        int i15 = iArr[6];
        s((iArr[7] % 1140384172) ^ a5.a.w((i10 & (~i)) | i11, (i & i12) | i13, i14, i15));
        return this.f7110d;
    }

    public final List o() {
        int[] iArr = {1435218189, 1093276829, 949583962, 1092752517, 575966040, -2054938211, 262178224, 1891252715, 1250801052};
        int i = iArr[0];
        int i10 = iArr[1];
        int i11 = iArr[2];
        int i12 = iArr[3];
        int i13 = iArr[4];
        int i14 = iArr[5];
        int i15 = iArr[6];
        s((iArr[7] % 1250801052) ^ a5.a.w((i10 & (~i)) | i11, (i & i12) | i13, i14, i15));
        return this.e;
    }

    public final bd p() {
        int[] iArr = {672139932, 1821026951, 1629321417, 214090246, 828986457, -1439766056, 580508860, 1579068977, 395191309};
        int i = iArr[0];
        int i10 = iArr[1];
        int i11 = iArr[2];
        int i12 = iArr[3];
        int i13 = iArr[4];
        int i14 = iArr[5];
        int i15 = iArr[6];
        s((iArr[7] % 395191309) ^ a5.a.w((i10 & (~i)) | i11, (i & i12) | i13, i14, i15));
        return this.f7111f;
    }

    public final double q() {
        int[] iArr = {1714636915, 1758565445, 174653454, 1653642817, 38095532, -1976041400, 596516649, 1804289383, 846930886};
        int i = iArr[0];
        int i10 = iArr[1];
        int i11 = iArr[2];
        int i12 = iArr[3];
        int i13 = iArr[4];
        int i14 = iArr[5];
        int i15 = iArr[6];
        s((iArr[7] % 846930886) ^ a5.a.w((i10 & (~i)) | i11, (i & i12) | i13, i14, i15));
        return this.f7109c;
    }

    public final void r() {
        this.f7112g = 1;
        this.f7108b = 0L;
        this.f7107a = null;
        this.f7110d = null;
        this.e = null;
        this.f7111f = null;
    }

    public final void s(int i) {
        if (i == this.f7112g) {
        } else {
            throw new Exception();
        }
    }
}
