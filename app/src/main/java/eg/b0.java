package eg;
import f.f;
import f.g;
import f.h;
import l.b;

import com.google.android.gms.internal.ads.mu;

/* loaded from: classes.dex */
public final class b0 implements ag.a {

    /* renamed from: a, reason: collision with root package name */
    public static final b0 f16492a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final v0 f16493b = new v0("kotlin.time.Instant", cg.c.f4117j);

    @Override // ag.a
    public final void a(gg.t tVar, Object obj) {
        nf.e eVar = (nf.e) obj;
        eVar.getClass();
        tVar.u(eVar.toString());
    }

    @Override // ag.a
    public final Object b(dg.b bVar) {
        int i;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        nf.g g8;
        int i15;
        int i16;
        boolean z3;
        int i17;
        int i18;
        int i19;
        long j10;
        char charAt;
        char charAt2;
        nf.e eVar = nf.e.f21342w;
        String j11 = bVar.j();
        j11.getClass();
        if (j11.length() == 0) {
            g8 = new mu("An empty string is not a valid Instant", 18, j11);
        } else {
            char charAt3 = j11.charAt(0);
            if (charAt3 != '+' && charAt3 != '-') {
                i = 0;
                charAt3 = ' ';
            } else {
                i = 1;
            }
            int i20 = 0;
            int i21 = i;
            while (i21 < j11.length() && '0' <= (charAt2 = j11.charAt(i21)) && charAt2 < ':') {
                i20 = (i20 * 10) + (j11.charAt(i21) - '0');
                i21++;
            }
            int i22 = i21 - i;
            if (i22 > 10) {
                g8 = nf.g(j11, "Expected at most 10 digits for the year number, got " + i22 + " digits");
            } else if (i22 == 10 && kotlin.jvm.internal.b(j11.charAt(i), 50) >= 0) {
                g8 = nf.g(j11, "Expected at most 9 digits for the year number or year 1000000000, got " + i22 + " digits");
            } else if (i22 < 4) {
                g8 = nf.g(j11, "The year number must be padded to 4 digits, got " + i22 + " digits");
            } else if (charAt3 == '+' && i22 == 4) {
                g8 = nf.g(j11, "The '+' sign at the start is only valid for year numbers longer than 4 digits");
            } else if (charAt3 == ' ' && i22 != 4) {
                g8 = nf.g(j11, "A '+' or '-' sign is required for year numbers longer than 4 digits");
            } else {
                if (charAt3 == '-') {
                    i20 = -i20;
                }
                int i23 = i21 + 16;
                if (j11.length() < i23) {
                    g8 = nf.g(j11, "The input string is too short");
                } else {
                    mu f10 = nf.f(j11, "'-'", i21, new m2.f0(2));
                    if (f10 == null) {
                        mu f11 = nf.f(j11, "'-'", i21 + 3, new m2.f0(3));
                        if (f11 != null || (f11 = nf.f(j11, "'T' or 't'", i21 + 6, new m2.f0(4))) != null || (f11 = nf.f(j11, "':'", i21 + 9, new m2.f0(5))) != null || (f11 = nf.f(j11, "':'", i21 + 12, new m2.f0(6))) != null) {
                            g8 = f11;
                        } else {
                            for (int i24 = 0; i24 < 10; i24++) {
                                f10 = nf.f(j11, "an ASCII digit", nf.f.f21347b[i24] + i21, new m2.f0(7));
                                if (f10 == null) {
                                }
                            }
                            int h3 = nf.h(i21 + 1, j11);
                            int h10 = nf.h(i21 + 4, j11);
                            int h11 = nf.h(i21 + 7, j11);
                            int h12 = nf.h(i21 + 10, j11);
                            int h13 = nf.h(i21 + 13, j11);
                            int i25 = i21 + 15;
                            if (j11.charAt(i25) == '.') {
                                i25 = i23;
                                int i26 = 0;
                                while (i25 < j11.length() && '0' <= (charAt = j11.charAt(i25)) && charAt < ':') {
                                    i26 = (i26 * 10) + (j11.charAt(i25) - '0');
                                    i25++;
                                }
                                int i27 = i25 - i23;
                                if (1 <= i27 && i27 < 10) {
                                    i10 = i26 * nf.f.f21346a[9 - i27];
                                } else {
                                    g8 = nf.g(j11, "1..9 digits are supported for the fraction of the second, got " + i27 + " digits");
                                }
                            } else {
                                i10 = 0;
                            }
                            if (i25 >= j11.length()) {
                                g8 = nf.g(j11, "The UTC offset at the end of the string is missing");
                            } else {
                                char charAt4 = j11.charAt(i25);
                                if (charAt4 != '+' && charAt4 != '-') {
                                    if (charAt4 != 'Z' && charAt4 != 'z') {
                                        g8 = nf.g(j11, "Expected the UTC offset at position " + i25 + ", got '" + charAt4 + '\'');
                                    } else {
                                        int i28 = i25 + 1;
                                        if (j11.length() == i28) {
                                            i14 = 0;
                                            if (1 > h3) {
                                            }
                                            g8 = nf.g(j11, "Expected a month number in 1..12, got " + h3);
                                        } else {
                                            g8 = nf.g(j11, "Extra text after the instant at position " + i28);
                                        }
                                    }
                                } else {
                                    int length = j11.length() - i25;
                                    if (length > 9) {
                                        g8 = nf.g(j11, "The UTC offset string \"" + nf.f.k(16, j11.subSequence(i25, j11.length()).toString()) + "\" is too long");
                                    } else if (length % 3 != 0) {
                                        g8 = nf.g(j11, "Invalid UTC offset string \"" + j11.subSequence(i25, j11.length()).toString() + '\"');
                                    } else {
                                        for (int i29 = 0; i29 < 2 && (i16 = nf.f.f21348c[i29] + i25) < j11.length(); i29++) {
                                            if (j11.charAt(i16) != ':') {
                                                StringBuilder m4 = g3.a.m("Expected ':' at index ", i16, ", got '");
                                                m4.append(j11.charAt(i16));
                                                m4.append('\'');
                                                g8 = nf.g(j11, m4.toString());
                                                break;
                                            }
                                        }
                                        int i30 = 0;
                                        while (i30 < 6 && (i15 = nf.f.f21349d[i30] + i25) < j11.length()) {
                                            char charAt5 = j11.charAt(i15);
                                            int i31 = i30;
                                            if ('0' <= charAt5 && charAt5 < ':') {
                                                i30 = i31 + 1;
                                            } else {
                                                StringBuilder m10 = g3.a.m("Expected an ASCII digit at index ", i15, ", got '");
                                                m10.append(j11.charAt(i15));
                                                m10.append('\'');
                                                g8 = nf.g(j11, m10.toString());
                                                break;
                                            }
                                        }
                                        int h14 = nf.h(i25 + 1, j11);
                                        if (length > 3) {
                                            i11 = nf.h(i25 + 4, j11);
                                        } else {
                                            i11 = 0;
                                        }
                                        if (length > 6) {
                                            i12 = nf.h(i25 + 7, j11);
                                        } else {
                                            i12 = 0;
                                        }
                                        if (i11 > 59) {
                                            g8 = nf.g(j11, "Expected offset-minute-of-hour in 0..59, got " + i11);
                                        } else if (i12 > 59) {
                                            g8 = nf.g(j11, "Expected offset-second-of-minute in 0..59, got " + i12);
                                        } else if (h14 > 17 && (h14 != 18 || i11 != 0 || i12 != 0)) {
                                            g8 = nf.g(j11, "Expected an offset in -18:00..+18:00, got " + j11.subSequence(i25, j11.length()).toString());
                                        } else {
                                            int i32 = (i11 * 60) + (h14 * 3600) + i12;
                                            if (charAt4 == '-') {
                                                i13 = -1;
                                            } else {
                                                i13 = 1;
                                            }
                                            i14 = i32 * i13;
                                            if (1 > h3 && h3 < 13) {
                                                if (1 <= h10) {
                                                    int i33 = i20 & 3;
                                                    if (i33 == 0 && (i20 % 100 != 0 || i20 % 400 == 0)) {
                                                        z3 = true;
                                                    } else {
                                                        z3 = false;
                                                    }
                                                    if (h3 != 2) {
                                                        if (h3 != 4 && h3 != 6 && h3 != 9 && h3 != 11) {
                                                            i17 = 31;
                                                        } else {
                                                            i17 = 30;
                                                        }
                                                    } else if (z3) {
                                                        i17 = 29;
                                                    } else {
                                                        i17 = 28;
                                                    }
                                                    if (h10 <= i17) {
                                                        if (h11 > 23) {
                                                            g8 = nf.g(j11, "Expected hour in 0..23, got " + h11);
                                                        } else if (h12 > 59) {
                                                            g8 = nf.g(j11, "Expected minute-of-hour in 0..59, got " + h12);
                                                        } else if (h13 > 59) {
                                                            g8 = nf.g(j11, "Expected second-of-minute in 0..59, got " + h13);
                                                        } else {
                                                            long j12 = i20;
                                                            long j13 = 365 * j12;
                                                            if (j12 >= 0) {
                                                                i19 = i20;
                                                                i18 = h13;
                                                                j10 = ((j12 + 399) / 400) + (((3 + j12) / 4) - ((99 + j12) / 100)) + j13;
                                                            } else {
                                                                i18 = h13;
                                                                i19 = i20;
                                                                j10 = j13 - ((j12 / (-400)) + ((j12 / (-4)) - (j12 / (-100))));
                                                            }
                                                            long j14 = j10 + (((h3 * 367) - 362) / 12) + (h10 - 1);
                                                            if (h3 > 2) {
                                                                j14 = (i33 == 0 && (i19 % 100 != 0 || i19 % 400 == 0)) ? (-1) + j14 : j14 - 2;
                                                            }
                                                            g8 = new com.google.android.gms.internal.ads.c0((((j14 - 719528) * 86400) + (((h12 * 60) + (h11 * 3600)) + i18)) - i14, i10);
                                                        }
                                                    }
                                                }
                                                StringBuilder n10 = g3.a.n("Expected a valid day-of-month for month ", h3, " of year ", ", got ", i20);
                                                n10.append(h10);
                                                g8 = nf.g(j11, n10.toString());
                                            } else {
                                                g8 = nf.g(j11, "Expected a month number in 1..12, got " + h3);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    g8 = f10;
                    break;
                }
            }
        }
        return g8.toInstant();
    }

    @Override // ag.a
    public final cg.d d() {
        return f16493b;
    }
}
