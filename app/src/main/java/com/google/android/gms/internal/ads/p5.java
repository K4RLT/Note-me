package com.google.android.gms.internal.ads;
import a5.a;
import b0.a;
import c7.x;
import r3.a;
import va.a;

import android.util.LongSparseArray;
import android.util.SparseArray;
import com.facebook.ads.AdError;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public final class p5 implements n2 {
    public static final byte[] m0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: n0, reason: collision with root package name */
    public static final byte[] f9363n0;

    /* renamed from: o0, reason: collision with root package name */
    public static final byte[] f9364o0;

    /* renamed from: p0, reason: collision with root package name */
    public static final byte[] f9365p0;

    /* renamed from: q0, reason: collision with root package name */
    public static final UUID f9366q0;

    /* renamed from: r0, reason: collision with root package name */
    public static final Map f9367r0;
    public boolean A;
    public int B;
    public long C;
    public final SparseArray D;
    public boolean E;
    public long F;
    public int G;
    public long H;
    public long I;
    public int J;
    public boolean K;
    public long L;
    public long M;
    public long N;
    public boolean O;
    public int P;
    public long Q;
    public long R;
    public int S;
    public int T;
    public int[] U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public boolean Z;

    /* renamed from: a, reason: collision with root package name */
    public final q5 f9368a;

    /* renamed from: a0, reason: collision with root package name */
    public long f9369a0;

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray f9370b;

    /* renamed from: b0, reason: collision with root package name */
    public int f9371b0;

    /* renamed from: c, reason: collision with root package name */
    public final LongSparseArray f9372c;

    /* renamed from: c0, reason: collision with root package name */
    public int f9373c0;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f9374d;

    /* renamed from: d0, reason: collision with root package name */
    public int f9375d0;
    public final boolean e;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f9376e0;

    /* renamed from: f, reason: collision with root package name */
    public final o7 f9377f;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f9378f0;

    /* renamed from: g, reason: collision with root package name */
    public final xk0 f9379g;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f9380g0;

    /* renamed from: h, reason: collision with root package name */
    public final xk0 f9381h;

    /* renamed from: h0, reason: collision with root package name */
    public int f9382h0;
    public final xk0 i;

    /* renamed from: i0, reason: collision with root package name */
    public byte f9383i0;

    /* renamed from: j, reason: collision with root package name */
    public final xk0 f9384j;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f9385j0;

    /* renamed from: k, reason: collision with root package name */
    public final xk0 f9386k;

    /* renamed from: k0, reason: collision with root package name */
    public p2 f9387k0;

    /* renamed from: l, reason: collision with root package name */
    public final xk0 f9388l;
    public final k5 l0;

    /* renamed from: m, reason: collision with root package name */
    public final xk0 f9389m;

    /* renamed from: n, reason: collision with root package name */
    public final xk0 f9390n;

    /* renamed from: o, reason: collision with root package name */
    public final xk0 f9391o;

    /* renamed from: p, reason: collision with root package name */
    public final xk0 f9392p;

    /* renamed from: q, reason: collision with root package name */
    public ByteBuffer f9393q;

    /* renamed from: r, reason: collision with root package name */
    public long f9394r;

    /* renamed from: s, reason: collision with root package name */
    public long f9395s;

    /* renamed from: t, reason: collision with root package name */
    public long f9396t;

    /* renamed from: u, reason: collision with root package name */
    public long f9397u;

    /* renamed from: v, reason: collision with root package name */
    public long f9398v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f9399w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f9400x;

    /* renamed from: y, reason: collision with root package name */
    public l5 f9401y;

    /* renamed from: z, reason: collision with root package name */
    public o5 f9402z;

    static {
        String str = bq0.f4860a;
        f9363n0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        f9364o0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        f9365p0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        f9366q0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap hashMap = new HashMap();
        a5.a.o(0, hashMap, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        a5.a.o(180, hashMap, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        f9367r0 = Collections.unmodifiableMap(hashMap);
    }

    public p5(k5 k5Var, int i, o7 o7Var) {
        boolean z3;
        this.f9395s = -1L;
        this.f9396t = -9223372036854775807L;
        this.f9397u = -9223372036854775807L;
        this.f9398v = -9223372036854775807L;
        this.F = -9223372036854775807L;
        this.G = -1;
        this.H = -1L;
        this.I = -1L;
        this.J = -1;
        this.L = -1L;
        this.M = -1L;
        this.N = -9223372036854775807L;
        this.l0 = k5Var;
        k5Var.f7654d = new tf(3, this);
        this.f9377f = o7Var;
        this.D = new SparseArray();
        this.f9374d = true;
        if ((i & 2) == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.e = z3;
        this.f9368a = new q5(0);
        this.f9372c = new LongSparseArray();
        this.f9370b = new SparseArray();
        this.i = new xk0(4);
        this.f9384j = new xk0(ByteBuffer.allocate(4).putInt(-1).array());
        this.f9386k = new xk0(4);
        this.f9379g = new xk0(xy.I);
        this.f9381h = new xk0(4);
        this.f9388l = new xk0();
        this.f9389m = new xk0();
        this.f9390n = new xk0(8);
        this.f9391o = new xk0();
        this.f9392p = new xk0();
        this.U = new int[1];
        this.f9400x = true;
    }

    public static byte[] r(long j10, long j11, String str) {
        boolean z3;
        if (j10 != -9223372036854775807L) {
            z3 = true;
        } else {
            z3 = false;
        }
        b80.l(z3);
        Locale locale = Locale.US;
        int i = (int) (j10 / 3600000000L);
        Integer valueOf = Integer.valueOf(i);
        long j12 = j10 - (i * 3600000000L);
        int i10 = (int) (j12 / 60000000);
        Integer valueOf2 = Integer.valueOf(i10);
        long j13 = j12 - (i10 * 60000000);
        int i11 = (int) (j13 / 1000000);
        String format = String.format(locale, str, valueOf, valueOf2, Integer.valueOf(i11), Integer.valueOf((int) ((j13 - (i11 * 1000000)) / j11)));
        String str2 = bq0.f4860a;
        return format.getBytes(StandardCharsets.UTF_8);
    }

    public final long a(long j10) {
        long j11 = this.f9396t;
        if (j11 != -9223372036854775807L) {
            return bq0.w(j10, j11, 1000L, RoundingMode.DOWN);
        }
        throw va.a(null, "Can't scale timecode prior to timecodeScale being set.");
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final void b() {
    }

    public final void c() {
        if (this.f9400x) {
            int i = 0;
            while (true) {
                SparseArray sparseArray = this.f9370b;
                if (i < sparseArray.size()) {
                    if (!((o5) sparseArray.valueAt(i)).X) {
                        i++;
                    } else {
                        return;
                    }
                } else {
                    p2 p2Var = this.f9387k0;
                    p2Var.getClass();
                    p2Var.z();
                    this.f9400x = false;
                    return;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object, com.google.android.gms.internal.ads.l5] */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.google.android.gms.internal.ads.o5, java.lang.Object] */
    public final void d(long j10, int i, long j11) {
        p2 p2Var = this.f9387k0;
        p2Var.getClass();
        if (i != 128) {
            if (i != 160) {
                if (i != 174) {
                    if (i != 187) {
                        if (i != 19899) {
                            if (i != 20533) {
                                if (i != 408125543) {
                                    if (i != 475249515) {
                                        if (i != 524531317) {
                                            if (i != 182) {
                                                if (i == 183 && !this.A) {
                                                    l(i);
                                                    this.G = -1;
                                                    this.H = -1L;
                                                    this.I = -1L;
                                                    return;
                                                }
                                                return;
                                            }
                                            Object obj = new Object();
                                            obj.f7942b = -9223372036854775807L;
                                            obj.f7943c = -9223372036854775807L;
                                            this.f9401y = obj;
                                            return;
                                        }
                                        if (!this.A) {
                                            if (this.f9374d && this.L != -1) {
                                                this.K = true;
                                                return;
                                            } else {
                                                p2Var.B(new r2(this.f9398v, 0L));
                                                this.A = true;
                                                return;
                                            }
                                        }
                                        return;
                                    }
                                    if (!this.A) {
                                        this.E = true;
                                        return;
                                    }
                                    return;
                                }
                                long j12 = this.f9395s;
                                if (j12 != -1 && j12 != j10) {
                                    throw va.a(null, "Multiple Segment elements not supported");
                                }
                                this.f9395s = j10;
                                this.f9394r = j11;
                                return;
                            }
                            k(i);
                            this.f9402z.f8968j = true;
                            return;
                        }
                        this.B = -1;
                        this.C = -1L;
                        return;
                    }
                    if (!this.A) {
                        l(i);
                        this.F = -9223372036854775807L;
                        return;
                    }
                    return;
                }
                Object obj2 = new Object();
                obj2.f8973o = -1;
                obj2.f8974p = -1;
                obj2.f8975q = -1;
                obj2.f8976r = -1;
                obj2.f8977s = -1;
                obj2.f8978t = 0;
                obj2.f8979u = -1;
                obj2.f8980v = 0.0f;
                obj2.f8981w = 0.0f;
                obj2.f8982x = 0.0f;
                obj2.f8983y = null;
                obj2.f8984z = -1;
                obj2.A = -1;
                obj2.B = -1;
                obj2.C = -1;
                obj2.D = AdError.NETWORK_ERROR_CODE;
                obj2.E = 200;
                obj2.F = -1.0f;
                obj2.G = -1.0f;
                obj2.H = -1.0f;
                obj2.I = -1.0f;
                obj2.J = -1.0f;
                obj2.K = -1.0f;
                obj2.L = -1.0f;
                obj2.M = -1.0f;
                obj2.N = -1.0f;
                obj2.O = -1.0f;
                obj2.Q = 1;
                obj2.R = -1;
                obj2.S = -1;
                obj2.T = 8000;
                obj2.U = 0L;
                obj2.V = 0L;
                obj2.X = false;
                obj2.Z = true;
                obj2.f8958a0 = "eng";
                this.f9402z = obj2;
                obj2.f8957a = this.f9399w;
                return;
            }
            this.Z = false;
            this.f9369a0 = 0L;
            return;
        }
        j(i);
        this.f9401y.f7947h = null;
        j(i);
        this.f9401y.i = null;
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final boolean e(o2 o2Var) {
        c7.x xVar = new c7.x(2, (byte) 0);
        i2 i2Var = (i2) o2Var;
        long j10 = i2Var.f6964w;
        long j11 = 1024;
        if (j10 != -1 && j10 <= 1024) {
            j11 = j10;
        }
        xk0 xk0Var = (xk0) xVar.f4003w;
        i2Var.E(xk0Var.f12580a, 0, 4, false);
        long P = xk0Var.P();
        xVar.f4002v = 4;
        while (true) {
            if (P != 440786851) {
                int i = (int) j11;
                int i10 = xVar.f4002v + 1;
                xVar.f4002v = i10;
                if (i10 == i) {
                    break;
                }
                i2Var.E(xk0Var.f12580a, 0, 1, false);
                P = ((P << 8) & (-256)) | (xk0Var.f12580a[0] & 255);
            } else {
                long q10 = xVar.q(i2Var);
                long j12 = xVar.f4002v;
                if (q10 != Long.MIN_VALUE) {
                    long j13 = j12 + q10;
                    if (j10 == -1 || j13 < j10) {
                        while (true) {
                            long j14 = xVar.f4002v;
                            if (j14 < j13) {
                                if (xVar.q(i2Var) != Long.MIN_VALUE) {
                                    long q11 = xVar.q(i2Var);
                                    if (q11 < 0) {
                                        break;
                                    }
                                    if (q11 != 0) {
                                        int i11 = (int) q11;
                                        i2Var.d(i11, false);
                                        xVar.f4002v += i11;
                                    }
                                } else {
                                    break;
                                }
                            } else if (j14 == j13) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final void f(p2 p2Var) {
        if (this.e) {
            p2Var = new d(p2Var, this.f9377f);
        }
        this.f9387k0 = p2Var;
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final void g(long j10, long j11) {
        this.N = -9223372036854775807L;
        this.P = 0;
        k5 k5Var = this.l0;
        k5Var.e = 0;
        k5Var.f7652b.clear();
        q5 q5Var = k5Var.f7653c;
        q5Var.f9751u = 0;
        q5Var.f9752v = 0;
        q5 q5Var2 = this.f9368a;
        q5Var2.f9751u = 0;
        q5Var2.f9752v = 0;
        p();
        this.E = false;
        this.F = -9223372036854775807L;
        this.G = -1;
        this.H = -1L;
        this.I = -1L;
        if (!this.A) {
            this.D.clear();
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.f9370b;
            if (i < sparseArray.size()) {
                j3 j3Var = ((o5) sparseArray.valueAt(i)).W;
                if (j3Var != null) {
                    j3Var.f7302b = false;
                    j3Var.f7303c = 0;
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:280:0x0435, code lost:
    
        if (r5.equals("A_OPUS") != false) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x0575, code lost:
    
        r3.a(r3.f8963d);
        r3.f8960b0 = r4.f9387k0.A(r3.f8963d, r3.f8965f);
        r9.put(r3.f8963d, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x043f, code lost:
    
        if (r5.equals("A_FLAC") != false) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x0449, code lost:
    
        if (r5.equals("A_EAC3") != false) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x0453, code lost:
    
        if (r5.equals("V_MPEG2") != false) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x045d, code lost:
    
        if (r5.equals("S_TEXT/UTF8") != false) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x0467, code lost:
    
        if (r5.equals("S_TEXT/WEBVTT") != false) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x0471, code lost:
    
        if (r5.equals("V_MPEGH/ISO/HEVC") != false) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x047b, code lost:
    
        if (r5.equals("S_TEXT/SSA") != false) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x0485, code lost:
    
        if (r5.equals("S_TEXT/ASS") != false) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x048f, code lost:
    
        if (r5.equals("A_PCM/INT/LIT") != false) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x0499, code lost:
    
        if (r5.equals("A_PCM/INT/BIG") != false) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x04a3, code lost:
    
        if (r5.equals("A_PCM/FLOAT/IEEE") != false) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x04ad, code lost:
    
        if (r5.equals("A_DTS/EXPRESS") != false) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x04b7, code lost:
    
        if (r5.equals("V_THEORA") != false) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x04c1, code lost:
    
        if (r5.equals("S_HDMV/PGS") != false) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x04c9, code lost:
    
        if (r5.equals("V_VP9") != false) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x04d3, code lost:
    
        if (r5.equals("V_VP8") != false) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x04dd, code lost:
    
        if (r5.equals("V_AV1") != false) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x04e7, code lost:
    
        if (r5.equals("A_DTS") != false) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x04f1, code lost:
    
        if (r5.equals("A_AC3") != false) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x04fb, code lost:
    
        if (r5.equals("A_AAC") != false) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x0505, code lost:
    
        if (r5.equals("A_DTS/LOSSLESS") != false) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x050f, code lost:
    
        if (r5.equals("S_VOBSUB") != false) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x0519, code lost:
    
        if (r5.equals("V_MPEG4/ISO/AVC") != false) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x0522, code lost:
    
        if (r5.equals("V_MPEG4/ISO/ASP") != false) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x052b, code lost:
    
        if (r5.equals("S_DVBSUB") != false) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x0534, code lost:
    
        if (r5.equals("V_MS/VFW/FOURCC") != false) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x053d, code lost:
    
        if (r5.equals("A_MPEG/L3") != false) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x0546, code lost:
    
        if (r5.equals("A_MPEG/L2") != false) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x054f, code lost:
    
        if (r5.equals("A_VORBIS") != false) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x0558, code lost:
    
        if (r5.equals("A_TRUEHD") != false) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x0561, code lost:
    
        if (r5.equals("A_MS/ACM") != false) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x056a, code lost:
    
        if (r5.equals("V_MPEG4/ISO/SP") != false) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x0573, code lost:
    
        if (r5.equals("V_MPEG4/ISO/AP") != false) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x062f, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:592:0x0a48, code lost:
    
        throw com.google.android.gms.internal.ads.va.a(null, "EBML lacing sample size out of range.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:674:0x06c6, code lost:
    
        if (r7 == 1) goto L401;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:278:0x042c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:420:0x06dc. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0c1a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0c67 A[LOOP:0: B:2:0x0009->B:60:0x0c67, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0c42 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.n2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(com.google.android.gms.internal.ads.o2 r48, b0.a r49) {
        /*
            Method dump skipped, instructions count: 3788
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.p5.h(com.google.android.gms.internal.ads.o2, b0.a):int");
    }

    public final void i(int i, long j10) {
        boolean z3 = false;
        if (i != 136) {
            if (i != 137) {
                if (i != 145) {
                    if (i != 146) {
                        if (i != 240) {
                            if (i != 241) {
                                if (i != 20529) {
                                    if (i != 20530) {
                                        if (i != 29636) {
                                            if (i != 29637) {
                                                switch (i) {
                                                    case 131:
                                                        int i10 = (int) j10;
                                                        if (i10 != 1) {
                                                            if (i10 != 2) {
                                                                if (i10 != 17) {
                                                                    if (i10 != 33) {
                                                                        k(i);
                                                                        this.f9402z.f8965f = -1;
                                                                        return;
                                                                    } else {
                                                                        k(i);
                                                                        this.f9402z.f8965f = 5;
                                                                        return;
                                                                    }
                                                                }
                                                                k(i);
                                                                this.f9402z.f8965f = 3;
                                                                return;
                                                            }
                                                            k(i);
                                                            this.f9402z.f8965f = 1;
                                                            return;
                                                        }
                                                        k(i);
                                                        this.f9402z.f8965f = 2;
                                                        return;
                                                    case 152:
                                                        if (j10 == 1) {
                                                            z3 = true;
                                                        }
                                                        j(i);
                                                        this.f9401y.f7944d = z3;
                                                        return;
                                                    case 155:
                                                        this.R = a(j10);
                                                        return;
                                                    case 159:
                                                        k(i);
                                                        this.f9402z.Q = (int) j10;
                                                        return;
                                                    case 176:
                                                        k(i);
                                                        this.f9402z.f8973o = (int) j10;
                                                        return;
                                                    case 179:
                                                        if (!this.A) {
                                                            l(i);
                                                            this.F = a(j10);
                                                            return;
                                                        }
                                                        return;
                                                    case 186:
                                                        k(i);
                                                        this.f9402z.f8974p = (int) j10;
                                                        return;
                                                    case 215:
                                                        k(i);
                                                        this.f9402z.f8963d = (int) j10;
                                                        return;
                                                    case 231:
                                                        this.N = a(j10);
                                                        return;
                                                    case 238:
                                                        this.Y = (int) j10;
                                                        return;
                                                    case 247:
                                                        if (!this.A) {
                                                            l(i);
                                                            this.G = (int) j10;
                                                            return;
                                                        }
                                                        return;
                                                    case 251:
                                                        this.Z = true;
                                                        return;
                                                    case 16871:
                                                        k(i);
                                                        this.f9402z.i = (int) j10;
                                                        return;
                                                    case 16980:
                                                        if (j10 != 3) {
                                                            StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + 30);
                                                            sb2.append("ContentCompAlgo ");
                                                            sb2.append(j10);
                                                            sb2.append(" not supported");
                                                            throw va.a(null, sb2.toString());
                                                        }
                                                        return;
                                                    case 17029:
                                                        if (j10 < 1 || j10 > 2) {
                                                            StringBuilder sb3 = new StringBuilder(String.valueOf(j10).length() + 33);
                                                            sb3.append("DocTypeReadVersion ");
                                                            sb3.append(j10);
                                                            sb3.append(" not supported");
                                                            throw va.a(null, sb3.toString());
                                                        }
                                                        return;
                                                    case 17143:
                                                        if (j10 != 1) {
                                                            StringBuilder sb4 = new StringBuilder(String.valueOf(j10).length() + 30);
                                                            sb4.append("EBMLReadVersion ");
                                                            sb4.append(j10);
                                                            sb4.append(" not supported");
                                                            throw va.a(null, sb4.toString());
                                                        }
                                                        return;
                                                    case 18401:
                                                        if (j10 != 5) {
                                                            StringBuilder sb5 = new StringBuilder(String.valueOf(j10).length() + 29);
                                                            sb5.append("ContentEncAlgo ");
                                                            sb5.append(j10);
                                                            sb5.append(" not supported");
                                                            throw va.a(null, sb5.toString());
                                                        }
                                                        return;
                                                    case 18408:
                                                        if (j10 != 1) {
                                                            StringBuilder sb6 = new StringBuilder(String.valueOf(j10).length() + 36);
                                                            sb6.append("AESSettingsCipherMode ");
                                                            sb6.append(j10);
                                                            sb6.append(" not supported");
                                                            throw va.a(null, sb6.toString());
                                                        }
                                                        return;
                                                    case 21420:
                                                        this.C = j10 + this.f9395s;
                                                        return;
                                                    case 21432:
                                                        int i11 = (int) j10;
                                                        k(i);
                                                        if (i11 != 0) {
                                                            if (i11 != 1) {
                                                                if (i11 != 3) {
                                                                    if (i11 == 15) {
                                                                        this.f9402z.f8984z = 3;
                                                                        return;
                                                                    }
                                                                    return;
                                                                }
                                                                this.f9402z.f8984z = 1;
                                                                return;
                                                            }
                                                            this.f9402z.f8984z = 2;
                                                            return;
                                                        }
                                                        this.f9402z.f8984z = 0;
                                                        return;
                                                    case 21680:
                                                        k(i);
                                                        this.f9402z.f8976r = (int) j10;
                                                        return;
                                                    case 21682:
                                                        k(i);
                                                        this.f9402z.f8978t = (int) j10;
                                                        return;
                                                    case 21690:
                                                        k(i);
                                                        this.f9402z.f8977s = (int) j10;
                                                        return;
                                                    case 21930:
                                                        if (j10 == 1) {
                                                            z3 = true;
                                                        }
                                                        k(i);
                                                        this.f9402z.Y = z3;
                                                        return;
                                                    case 21938:
                                                        k(i);
                                                        this.f9402z.f8975q = (int) j10;
                                                        return;
                                                    case 21998:
                                                        k(i);
                                                        this.f9402z.f8967h = (int) j10;
                                                        return;
                                                    case 22186:
                                                        k(i);
                                                        this.f9402z.U = j10;
                                                        return;
                                                    case 22203:
                                                        k(i);
                                                        this.f9402z.V = j10;
                                                        return;
                                                    case 25188:
                                                        k(i);
                                                        this.f9402z.R = (int) j10;
                                                        return;
                                                    case 30114:
                                                        this.f9369a0 = j10;
                                                        return;
                                                    case 30321:
                                                        int i12 = (int) j10;
                                                        k(i);
                                                        if (i12 != 0) {
                                                            if (i12 != 1) {
                                                                if (i12 != 2) {
                                                                    if (i12 == 3) {
                                                                        this.f9402z.f8979u = 3;
                                                                        return;
                                                                    }
                                                                    return;
                                                                }
                                                                this.f9402z.f8979u = 2;
                                                                return;
                                                            }
                                                            this.f9402z.f8979u = 1;
                                                            return;
                                                        }
                                                        this.f9402z.f8979u = 0;
                                                        return;
                                                    case 2352003:
                                                        k(i);
                                                        this.f9402z.f8966g = (int) j10;
                                                        return;
                                                    case 2807729:
                                                        this.f9396t = j10;
                                                        return;
                                                    default:
                                                        switch (i) {
                                                            case 21945:
                                                                int i13 = (int) j10;
                                                                k(i);
                                                                if (i13 != 1) {
                                                                    if (i13 == 2) {
                                                                        this.f9402z.C = 1;
                                                                        return;
                                                                    }
                                                                    return;
                                                                }
                                                                this.f9402z.C = 2;
                                                                return;
                                                            case 21946:
                                                                k(i);
                                                                int c10 = mk1.c((int) j10);
                                                                if (c10 != -1) {
                                                                    this.f9402z.B = c10;
                                                                    return;
                                                                }
                                                                return;
                                                            case 21947:
                                                                k(i);
                                                                int b10 = mk1.b((int) j10);
                                                                if (b10 != -1) {
                                                                    this.f9402z.A = b10;
                                                                    return;
                                                                }
                                                                return;
                                                            case 21948:
                                                                k(i);
                                                                this.f9402z.D = (int) j10;
                                                                return;
                                                            case 21949:
                                                                k(i);
                                                                this.f9402z.E = (int) j10;
                                                                return;
                                                            default:
                                                                return;
                                                        }
                                                }
                                            }
                                            k(i);
                                            this.f9402z.e = j10;
                                            return;
                                        }
                                        j(i);
                                        this.f9401y.f7941a = j10;
                                        return;
                                    }
                                    if (j10 != 1) {
                                        StringBuilder sb7 = new StringBuilder(String.valueOf(j10).length() + 35);
                                        sb7.append("ContentEncodingScope ");
                                        sb7.append(j10);
                                        sb7.append(" not supported");
                                        throw va.a(null, sb7.toString());
                                    }
                                    return;
                                }
                                if (j10 != 0) {
                                    StringBuilder sb8 = new StringBuilder(String.valueOf(j10).length() + 35);
                                    sb8.append("ContentEncodingOrder ");
                                    sb8.append(j10);
                                    sb8.append(" not supported");
                                    throw va.a(null, sb8.toString());
                                }
                                return;
                            }
                            if (!this.A) {
                                l(i);
                                if (this.H == -1) {
                                    this.H = j10;
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        if (!this.A) {
                            l(i);
                            if (this.I == -1) {
                                this.I = j10;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    j(i);
                    this.f9401y.f7943c = j10;
                    return;
                }
                j(i);
                this.f9401y.f7942b = j10;
                return;
            }
            j(i);
            this.f9401y.e = j10;
            return;
        }
        if (j10 == 1) {
            z3 = true;
        }
        k(i);
        this.f9402z.Z = z3;
    }

    public final void j(int i) {
        if (this.f9401y != null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 35);
        sb2.append("Element ");
        sb2.append(i);
        sb2.append(" must be in an EditionEntry");
        throw va.a(null, sb2.toString());
    }

    public final void k(int i) {
        if (this.f9402z != null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 32);
        sb2.append("Element ");
        sb2.append(i);
        sb2.append(" must be in a TrackEntry");
        throw va.a(null, sb2.toString());
    }

    public final void l(int i) {
        if (this.E) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 26);
        sb2.append("Element ");
        sb2.append(i);
        sb2.append(" must be in a Cues");
        throw va.a(null, sb2.toString());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x008f, code lost:
    
        if (r2.equals("S_TEXT/SSA") != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0098, code lost:
    
        r2 = r(r11, 10000, "%01d:%02d:%02d:%02d");
        r3 = 21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0096, code lost:
    
        if (r2.equals("S_TEXT/ASS") != false) goto L34;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x0068. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b9 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(com.google.android.gms.internal.ads.o5 r18, long r19, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.p5.m(com.google.android.gms.internal.ads.o5, long, int, int, int):void");
    }

    public final void n(o2 o2Var, int i) {
        xk0 xk0Var = this.i;
        if (xk0Var.f12582c >= i) {
            return;
        }
        byte[] bArr = xk0Var.f12580a;
        if (bArr.length < i) {
            int length = bArr.length;
            xk0Var.A(Math.max(length + length, i));
        }
        byte[] bArr2 = xk0Var.f12580a;
        int i10 = xk0Var.f12582c;
        o2Var.v(bArr2, i10, i - i10);
        xk0Var.C(i);
    }

    public final int o(o2 o2Var, o5 o5Var, int i, boolean z3) {
        int d2;
        int d10;
        int i10;
        int i11;
        String str = o5Var.f8961c;
        if ("S_TEXT/UTF8".equals(str)) {
            q(o2Var, m0, i);
            int i12 = this.f9373c0;
            p();
            return i12;
        }
        if (!"S_TEXT/ASS".equals(str) && !"S_TEXT/SSA".equals(str)) {
            if ("S_TEXT/WEBVTT".equals(str)) {
                q(o2Var, f9365p0, i);
                int i13 = this.f9373c0;
                p();
                return i13;
            }
            if (o5Var.X) {
                mw1 mw1Var = o5Var.f8962c0;
                mw1Var.getClass();
                mw1 R = x21.R(o2Var, i, mw1Var);
                o5Var.f8962c0 = R;
                o5Var.f8960b0.e(R);
                o5Var.X = false;
                c();
            }
            i3 i3Var = o5Var.f8960b0;
            boolean z9 = this.f9376e0;
            xk0 xk0Var = this.f9388l;
            int i14 = 2;
            boolean z10 = true;
            if (!z9) {
                boolean z11 = o5Var.f8968j;
                xk0 xk0Var2 = this.i;
                if (z11) {
                    this.X &= -1073741825;
                    int i15 = 128;
                    if (!this.f9378f0) {
                        o2Var.v(xk0Var2.f12580a, 0, 1);
                        this.f9371b0++;
                        byte b10 = xk0Var2.f12580a[0];
                        if ((b10 & 128) != 128) {
                            this.f9383i0 = b10;
                            this.f9378f0 = true;
                        } else {
                            throw va.a(null, "Extension bit is set in signal byte");
                        }
                    }
                    byte b11 = this.f9383i0;
                    if ((b11 & 1) == 1) {
                        int i16 = b11 & 2;
                        this.X |= 1073741824;
                        if (!this.f9385j0) {
                            xk0 xk0Var3 = this.f9390n;
                            o2Var.v(xk0Var3.f12580a, 0, 8);
                            this.f9371b0 += 8;
                            this.f9385j0 = true;
                            if (i16 != 2) {
                                i15 = 0;
                            }
                            xk0Var2.f12580a[0] = (byte) (i15 | 8);
                            xk0Var2.E(0);
                            i3Var.f(xk0Var2, 1, 1);
                            this.f9373c0++;
                            xk0Var3.E(0);
                            i3Var.f(xk0Var3, 8, 1);
                            this.f9373c0 += 8;
                        }
                        if (i16 == 2) {
                            if (!this.f9380g0) {
                                o2Var.v(xk0Var2.f12580a, 0, 1);
                                this.f9371b0++;
                                xk0Var2.E(0);
                                this.f9382h0 = xk0Var2.K();
                                this.f9380g0 = true;
                            }
                            int i17 = this.f9382h0 * 4;
                            xk0Var2.y(i17);
                            o2Var.v(xk0Var2.f12580a, 0, i17);
                            this.f9371b0 += i17;
                            int i18 = (this.f9382h0 >> 1) + 1;
                            int i19 = (i18 * 6) + 2;
                            ByteBuffer byteBuffer = this.f9393q;
                            if (byteBuffer == null || byteBuffer.capacity() < i19) {
                                this.f9393q = ByteBuffer.allocate(i19);
                            }
                            this.f9393q.position(0);
                            this.f9393q.putShort((short) i18);
                            int i20 = 0;
                            int i21 = 0;
                            while (true) {
                                i11 = this.f9382h0;
                                if (i20 >= i11) {
                                    break;
                                }
                                int h3 = xk0Var2.h();
                                int i22 = h3 - i21;
                                int i23 = i20 % 2;
                                int i24 = i14;
                                ByteBuffer byteBuffer2 = this.f9393q;
                                if (i23 == 0) {
                                    byteBuffer2.putShort((short) i22);
                                } else {
                                    byteBuffer2.putInt(i22);
                                }
                                i20++;
                                i21 = h3;
                                i14 = i24;
                            }
                            i10 = i14;
                            int i25 = (i - this.f9371b0) - i21;
                            int i26 = i11 & 1;
                            ByteBuffer byteBuffer3 = this.f9393q;
                            if (i26 == 1) {
                                byteBuffer3.putInt(i25);
                            } else {
                                byteBuffer3.putShort((short) i25);
                                this.f9393q.putInt(0);
                            }
                            byte[] array = this.f9393q.array();
                            xk0 xk0Var4 = this.f9391o;
                            xk0Var4.z(array, i19);
                            i3Var.f(xk0Var4, i19, 1);
                            this.f9373c0 += i19;
                        }
                    }
                    i10 = 2;
                } else {
                    i10 = 2;
                    byte[] bArr = o5Var.f8969k;
                    if (bArr != null) {
                        xk0Var.z(bArr, bArr.length);
                    }
                }
                if (!"A_OPUS".equals(o5Var.f8961c) ? o5Var.f8967h > 0 : z3) {
                    this.X |= 268435456;
                    this.f9392p.y(0);
                    int i27 = (xk0Var.f12582c + i) - this.f9371b0;
                    xk0Var2.y(4);
                    byte[] bArr2 = xk0Var2.f12580a;
                    bArr2[0] = (byte) ((i27 >> 24) & 255);
                    bArr2[1] = (byte) ((i27 >> 16) & 255);
                    bArr2[i10] = (byte) ((i27 >> 8) & 255);
                    bArr2[3] = (byte) (i27 & 255);
                    i3Var.f(xk0Var2, 4, i10);
                    this.f9373c0 += 4;
                }
                this.f9376e0 = true;
            }
            int i28 = i + xk0Var.f12582c;
            String str2 = o5Var.f8961c;
            if (!"V_MPEG4/ISO/AVC".equals(str2) && !"V_MPEGH/ISO/HEVC".equals(str2)) {
                if (o5Var.W != null) {
                    if (xk0Var.f12582c != 0) {
                        z10 = false;
                    }
                    b80.K(z10);
                    o5Var.W.a(o2Var);
                }
                while (true) {
                    int i29 = this.f9371b0;
                    if (i29 >= i28) {
                        break;
                    }
                    int i30 = i28 - i29;
                    int B = xk0Var.B();
                    if (B > 0) {
                        d10 = Math.min(i30, B);
                        i3Var.a(d10, xk0Var);
                    } else {
                        d10 = i3Var.d(o2Var, i30, false);
                    }
                    this.f9371b0 += d10;
                    this.f9373c0 += d10;
                }
            } else {
                xk0 xk0Var5 = this.f9381h;
                byte[] bArr3 = xk0Var5.f12580a;
                bArr3[0] = 0;
                bArr3[1] = 0;
                bArr3[2] = 0;
                int i31 = o5Var.f8964d0;
                int i32 = 4 - i31;
                while (this.f9371b0 < i28) {
                    int i33 = this.f9375d0;
                    if (i33 == 0) {
                        int min = Math.min(i31, xk0Var.B());
                        o2Var.v(bArr3, i32 + min, i31 - min);
                        if (min > 0) {
                            xk0Var.H(bArr3, i32, min);
                        }
                        this.f9371b0 += i31;
                        xk0Var5.E(0);
                        this.f9375d0 = xk0Var5.h();
                        xk0 xk0Var6 = this.f9379g;
                        xk0Var6.E(0);
                        i3Var.a(4, xk0Var6);
                        this.f9373c0 += 4;
                    } else {
                        int B2 = xk0Var.B();
                        if (B2 > 0) {
                            d2 = Math.min(i33, B2);
                            i3Var.a(d2, xk0Var);
                        } else {
                            d2 = i3Var.d(o2Var, i33, false);
                        }
                        this.f9371b0 += d2;
                        this.f9373c0 += d2;
                        this.f9375d0 -= d2;
                    }
                }
            }
            if ("A_VORBIS".equals(o5Var.f8961c)) {
                xk0 xk0Var7 = this.f9384j;
                xk0Var7.E(0);
                i3Var.a(4, xk0Var7);
                this.f9373c0 += 4;
            }
            int i34 = this.f9373c0;
            p();
            return i34;
        }
        q(o2Var, f9364o0, i);
        int i35 = this.f9373c0;
        p();
        return i35;
    }

    public final void p() {
        this.f9371b0 = 0;
        this.f9373c0 = 0;
        this.f9375d0 = 0;
        this.f9376e0 = false;
        this.f9378f0 = false;
        this.f9380g0 = false;
        this.f9382h0 = 0;
        this.f9383i0 = (byte) 0;
        this.f9385j0 = false;
        this.f9388l.y(0);
    }

    public final void q(o2 o2Var, byte[] bArr, int i) {
        int length = bArr.length;
        int i10 = length + i;
        xk0 xk0Var = this.f9389m;
        byte[] bArr2 = xk0Var.f12580a;
        if (bArr2.length < i10) {
            byte[] copyOf = Arrays.copyOf(bArr, i10 + i);
            xk0Var.z(copyOf, copyOf.length);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, length);
        }
        o2Var.v(xk0Var.f12580a, length, i);
        xk0Var.E(0);
        xk0Var.C(i10);
    }

    public p5() {
        this(new k5(), 2, o7.f8995g);
    }
}
