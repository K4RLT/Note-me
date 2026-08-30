package eg;

import ya.g9;

/* loaded from: classes.dex */
public final class p1 implements ag.a {

    /* renamed from: a, reason: collision with root package name */
    public static final p1 f16561a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final v0 f16562b = new v0("kotlin.uuid.Uuid", cg.c.f4117j);

    @Override // ag.a
    public final void a(gg.t tVar, Object obj) {
        of.a aVar = (of.a) obj;
        aVar.getClass();
        tVar.u(aVar.toString());
    }

    @Override // ag.a
    public final Object b(dg.b bVar) {
        String concat;
        String j10 = bVar.j();
        j10.getClass();
        int length = j10.length();
        int i = 0;
        if (length != 32) {
            if (length != 36) {
                StringBuilder sb2 = new StringBuilder("Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \"");
                if (j10.length() <= 64) {
                    concat = j10;
                } else {
                    concat = j10.substring(0, 64).concat("...");
                }
                sb2.append(concat);
                sb2.append("\" of length ");
                sb2.append(j10.length());
                throw new IllegalArgumentException(sb2.toString());
            }
            long j11 = 0;
            while (i < 8) {
                long j12 = j11 << 4;
                char charAt = j10.charAt(i);
                if ((charAt >>> '\b') == 0) {
                    long j13 = mf.c.f20806b[charAt];
                    if (j13 >= 0) {
                        j11 = j12 | j13;
                        i++;
                    }
                }
                g9.b(j10, i, "a hexadecimal digit");
                throw null;
            }
            if (j10.charAt(8) == '-') {
                long j14 = 0;
                for (int i10 = 9; i10 < 13; i10++) {
                    long j15 = j14 << 4;
                    char charAt2 = j10.charAt(i10);
                    if ((charAt2 >>> '\b') == 0) {
                        long j16 = mf.c.f20806b[charAt2];
                        if (j16 >= 0) {
                            j14 = j15 | j16;
                        }
                    }
                    g9.b(j10, i10, "a hexadecimal digit");
                    throw null;
                }
                if (j10.charAt(13) == '-') {
                    long j17 = 0;
                    for (int i11 = 14; i11 < 18; i11++) {
                        long j18 = j17 << 4;
                        char charAt3 = j10.charAt(i11);
                        if ((charAt3 >>> '\b') == 0) {
                            long j19 = mf.c.f20806b[charAt3];
                            if (j19 >= 0) {
                                j17 = j18 | j19;
                            }
                        }
                        g9.b(j10, i11, "a hexadecimal digit");
                        throw null;
                    }
                    if (j10.charAt(18) == '-') {
                        long j20 = 0;
                        for (int i12 = 19; i12 < 23; i12++) {
                            long j21 = j20 << 4;
                            char charAt4 = j10.charAt(i12);
                            if ((charAt4 >>> '\b') == 0) {
                                long j22 = mf.c.f20806b[charAt4];
                                if (j22 >= 0) {
                                    j20 = j21 | j22;
                                }
                            }
                            g9.b(j10, i12, "a hexadecimal digit");
                            throw null;
                        }
                        if (j10.charAt(23) == '-') {
                            long j23 = 0;
                            for (int i13 = 24; i13 < 36; i13++) {
                                long j24 = j23 << 4;
                                char charAt5 = j10.charAt(i13);
                                if ((charAt5 >>> '\b') == 0) {
                                    long j25 = mf.c.f20806b[charAt5];
                                    if (j25 >= 0) {
                                        j23 = j24 | j25;
                                    }
                                }
                                g9.b(j10, i13, "a hexadecimal digit");
                                throw null;
                            }
                            long j26 = (j11 << 32) | (j14 << 16) | j17;
                            long j27 = (j20 << 48) | j23;
                            if (j26 != 0 || j27 != 0) {
                                return new of.a(j26, j27);
                            }
                        } else {
                            g9.b(j10, 23, "'-' (hyphen)");
                            throw null;
                        }
                    } else {
                        g9.b(j10, 18, "'-' (hyphen)");
                        throw null;
                    }
                } else {
                    g9.b(j10, 13, "'-' (hyphen)");
                    throw null;
                }
            } else {
                g9.b(j10, 8, "'-' (hyphen)");
                throw null;
            }
        } else {
            long j28 = 0;
            while (i < 16) {
                long j29 = j28 << 4;
                char charAt6 = j10.charAt(i);
                if ((charAt6 >>> '\b') == 0) {
                    long j30 = mf.c.f20806b[charAt6];
                    if (j30 >= 0) {
                        j28 = j29 | j30;
                        i++;
                    }
                }
                g9.b(j10, i, "a hexadecimal digit");
                throw null;
            }
            long j31 = 0;
            for (int i14 = 16; i14 < 32; i14++) {
                long j32 = j31 << 4;
                char charAt7 = j10.charAt(i14);
                if ((charAt7 >>> '\b') == 0) {
                    long j33 = mf.c.f20806b[charAt7];
                    if (j33 >= 0) {
                        j31 = j32 | j33;
                    }
                }
                g9.b(j10, i14, "a hexadecimal digit");
                throw null;
            }
            if (j28 != 0 || j31 != 0) {
                return new of.a(j28, j31);
            }
        }
        return of.a.f21975w;
    }

    @Override // ag.a
    public final cg.d d() {
        return f16562b;
    }
}
