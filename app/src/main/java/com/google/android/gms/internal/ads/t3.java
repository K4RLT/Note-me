package com.google.android.gms.internal.ads;
import a5.a;

import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class t3 implements n3 {

    /* renamed from: a, reason: collision with root package name */
    public final d51 f11231a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11232b;

    public t3(int i, y51 y51Var) {
        this.f11232b = i;
        this.f11231a = y51Var;
    }

    public static t3 a(int i, xk0 xk0Var) {
        String str;
        String str2;
        int i10;
        n3 u3Var;
        String str3;
        ed1.u(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i11 = xk0Var.f12582c;
        int i12 = -2;
        int i13 = 0;
        while (xk0Var.B() > 8) {
            int c10 = xk0Var.c();
            int c11 = xk0Var.f12581b + xk0Var.c();
            xk0Var.C(c11);
            if (c10 == 1414744396) {
                u3Var = a(xk0Var.c(), xk0Var);
            } else {
                r3 r3Var = null;
                switch (c10) {
                    case 1718776947:
                        if (i12 == 2) {
                            xk0Var.G(4);
                            int c12 = xk0Var.c();
                            int c13 = xk0Var.c();
                            xk0Var.G(4);
                            int c14 = xk0Var.c();
                            switch (c14) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str3 = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str3 = "video/avc";
                                    break;
                                case 842289229:
                                    str3 = "video/mp42";
                                    break;
                                case 859066445:
                                    str3 = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str3 = "video/mjpeg";
                                    break;
                                default:
                                    str3 = null;
                                    break;
                            }
                            if (str3 == null) {
                                a5.a.t(new StringBuilder(String.valueOf(c14).length() + 44), "Ignoring track with unsupported compression ", c14, "StreamFormatChunk");
                                break;
                            } else {
                                rv1 rv1Var = new rv1();
                                rv1Var.f10314u = c12;
                                rv1Var.f10315v = c13;
                                rv1Var.e(str3);
                                u3Var = new u3(new mw1(rv1Var));
                                break;
                            }
                        } else if (i12 == 1) {
                            int M = xk0Var.M();
                            if (M == 1) {
                                str2 = "audio/raw";
                            } else if (M != 85) {
                                if (M == 255) {
                                    str2 = "audio/mp4a-latm";
                                } else if (M != 8192) {
                                    if (M != 8193) {
                                        str2 = null;
                                    } else {
                                        str2 = "audio/vnd.dts";
                                    }
                                } else {
                                    str2 = "audio/ac3";
                                }
                            } else {
                                str2 = "audio/mpeg";
                            }
                            if (str2 == null) {
                                a5.a.t(new StringBuilder(String.valueOf(M).length() + 43), "Ignoring track with unsupported format tag ", M, "StreamFormatChunk");
                                break;
                            } else {
                                int M2 = xk0Var.M();
                                int c15 = xk0Var.c();
                                xk0Var.G(6);
                                int b10 = bq0.b(xk0Var.M(), ByteOrder.LITTLE_ENDIAN);
                                if (xk0Var.B() > 0) {
                                    i10 = xk0Var.M();
                                } else {
                                    i10 = 0;
                                }
                                rv1 rv1Var2 = new rv1();
                                rv1Var2.e(str2);
                                rv1Var2.G = M2;
                                rv1Var2.I = c15;
                                if (str2.equals("audio/raw") && b10 != 0) {
                                    rv1Var2.J = b10;
                                }
                                if (str2.equals("audio/mp4a-latm") && i10 > 0) {
                                    byte[] bArr = new byte[i10];
                                    xk0Var.H(bArr, 0, i10);
                                    rv1Var2.f10310q = d51.q(bArr);
                                }
                                u3Var = new u3(new mw1(rv1Var2));
                                break;
                            }
                        } else {
                            String str4 = bq0.f4860a;
                            switch (i12) {
                                case -2:
                                    str = "none";
                                    break;
                                case -1:
                                    str = "unknown";
                                    break;
                                case 0:
                                    str = "default";
                                    break;
                                case 1:
                                    str = "audio";
                                    break;
                                case 2:
                                    str = "video";
                                    break;
                                case 3:
                                    str = "text";
                                    break;
                                case 4:
                                    str = "image";
                                    break;
                                case 5:
                                    str = "metadata";
                                    break;
                                default:
                                    str = "camera motion";
                                    break;
                            }
                            x21.F("StreamFormatChunk", "Ignoring strf box for unsupported track type: ".concat(str));
                            break;
                        }
                    case 1751742049:
                        int c16 = xk0Var.c();
                        xk0Var.G(8);
                        int c17 = xk0Var.c();
                        int c18 = xk0Var.c();
                        xk0Var.G(4);
                        xk0Var.c();
                        xk0Var.G(12);
                        u3Var = new q3(c16, c17, c18);
                        break;
                    case 1752331379:
                        int c19 = xk0Var.c();
                        xk0Var.G(12);
                        xk0Var.c();
                        int c20 = xk0Var.c();
                        int c21 = xk0Var.c();
                        xk0Var.G(4);
                        int c22 = xk0Var.c();
                        int c23 = xk0Var.c();
                        xk0Var.G(4);
                        r3Var = new r3(c19, c20, c21, c22, c23, xk0Var.c());
                        break;
                    case 1852994675:
                        u3Var = new v3(xk0Var.k(xk0Var.B(), StandardCharsets.UTF_8));
                        break;
                }
                u3Var = r3Var;
            }
            if (u3Var != null) {
                if (u3Var.zza() == 1752331379) {
                    i12 = ((r3) u3Var).a();
                }
                int length = objArr.length;
                int i14 = i13 + 1;
                int d2 = y41.d(length, i14);
                if (d2 > length) {
                    objArr = Arrays.copyOf(objArr, d2);
                }
                objArr[i13] = u3Var;
                i13 = i14;
            }
            xk0Var.E(c11);
            xk0Var.C(i11);
        }
        return new t3(i, d51.w(objArr, i13));
    }

    public final n3 b(Class cls) {
        d51 d51Var = this.f11231a;
        int size = d51Var.size();
        int i = 0;
        while (i < size) {
            n3 n3Var = (n3) d51Var.get(i);
            i++;
            if (n3Var.getClass() == cls) {
                return n3Var;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.n3
    public final int zza() {
        return this.f11232b;
    }
}
