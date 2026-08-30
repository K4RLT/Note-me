package com.google.android.gms.internal.ads;
import g3.a;
import q.x;

import android.text.TextUtils;
import androidx.ink.storage.DecompressedBytes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes.dex */
public final class mw1 {
    public static final /* synthetic */ int R = 0;
    public final int A;
    public final boolean B;
    public final float C;
    public final byte[] D;
    public final int E;
    public final mk1 F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public final int N;
    public final int O;
    public final int P;
    public int Q;

    /* renamed from: a, reason: collision with root package name */
    public final String f8447a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8448b;

    /* renamed from: c, reason: collision with root package name */
    public final d51 f8449c;

    /* renamed from: d, reason: collision with root package name */
    public final String f8450d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final int f8451f;

    /* renamed from: g, reason: collision with root package name */
    public final int f8452g;

    /* renamed from: h, reason: collision with root package name */
    public final int f8453h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final int f8454j;

    /* renamed from: k, reason: collision with root package name */
    public final String f8455k;

    /* renamed from: l, reason: collision with root package name */
    public final m8 f8456l;

    /* renamed from: m, reason: collision with root package name */
    public final String f8457m;

    /* renamed from: n, reason: collision with root package name */
    public final String f8458n;

    /* renamed from: o, reason: collision with root package name */
    public final String f8459o;

    /* renamed from: p, reason: collision with root package name */
    public final int f8460p;

    /* renamed from: q, reason: collision with root package name */
    public final int f8461q;

    /* renamed from: r, reason: collision with root package name */
    public final List f8462r;

    /* renamed from: s, reason: collision with root package name */
    public final nu1 f8463s;

    /* renamed from: t, reason: collision with root package name */
    public final long f8464t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f8465u;

    /* renamed from: v, reason: collision with root package name */
    public final int f8466v;

    /* renamed from: w, reason: collision with root package name */
    public final int f8467w;

    /* renamed from: x, reason: collision with root package name */
    public final int f8468x;

    /* renamed from: y, reason: collision with root package name */
    public final int f8469y;

    /* renamed from: z, reason: collision with root package name */
    public final float f8470z;

    static {
        new mw1(new rv1());
        String str = bq0.f4860a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
        Integer.toString(12, 36);
        Integer.toString(13, 36);
        Integer.toString(14, 36);
        Integer.toString(15, 36);
        Integer.toString(16, 36);
        Integer.toString(17, 36);
        Integer.toString(18, 36);
        Integer.toString(19, 36);
        Integer.toString(20, 36);
        Integer.toString(21, 36);
        Integer.toString(22, 36);
        Integer.toString(23, 36);
        Integer.toString(24, 36);
        Integer.toString(25, 36);
        Integer.toString(26, 36);
        Integer.toString(27, 36);
        Integer.toString(28, 36);
        Integer.toString(29, 36);
        Integer.toString(30, 36);
        Integer.toString(31, 36);
        Integer.toString(32, 36);
        Integer.toString(33, 36);
        Integer.toString(34, 36);
        Integer.toString(35, 36);
        Integer.toString(36, 36);
        Integer.toString(37, 36);
        Integer.toString(38, 36);
        Integer.toString(39, 36);
        Integer.toString(40, 36);
    }

    public mw1(rv1 rv1Var) {
        boolean z3;
        String str;
        boolean z9;
        this.f8447a = rv1Var.f10296a;
        String q10 = bq0.q(rv1Var.f10299d);
        this.f8450d = q10;
        if (rv1Var.f10298c.isEmpty() && rv1Var.f10297b != null) {
            this.f8449c = d51.q(new ox1(q10, rv1Var.f10297b));
            this.f8448b = rv1Var.f10297b;
        } else if (!rv1Var.f10298c.isEmpty() && rv1Var.f10297b == null) {
            d51 d51Var = rv1Var.f10298c;
            this.f8449c = d51Var;
            Iterator it = d51Var.iterator();
            while (true) {
                w31 w31Var = (w31) it;
                if (w31Var.hasNext()) {
                    ox1 ox1Var = (ox1) w31Var.next();
                    if (TextUtils.equals(ox1Var.f9261a, q10)) {
                        str = ox1Var.f9262b;
                        break;
                    }
                } else {
                    str = ((ox1) d51Var.get(0)).f9262b;
                    break;
                }
            }
            this.f8448b = str;
        } else {
            if (!rv1Var.f10298c.isEmpty() || rv1Var.f10297b != null) {
                for (int i = 0; i < rv1Var.f10298c.size(); i++) {
                    if (!((ox1) rv1Var.f10298c.get(i)).f9262b.equals(rv1Var.f10297b)) {
                    }
                }
                z3 = false;
                b80.K(z3);
                this.f8449c = rv1Var.f10298c;
                this.f8448b = rv1Var.f10297b;
            }
            z3 = true;
            b80.K(z3);
            this.f8449c = rv1Var.f10298c;
            this.f8448b = rv1Var.f10297b;
        }
        this.e = rv1Var.e;
        if (rv1Var.f10301g == 0 || (rv1Var.f10300f & DecompressedBytes.DECOMPRESSED_BYTES_INITIAL_CAPACITY) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        b80.L("Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set", z9);
        this.f8451f = rv1Var.f10300f;
        this.f8452g = rv1Var.f10301g;
        int i10 = rv1Var.f10302h;
        this.f8453h = i10;
        int i11 = rv1Var.i;
        this.i = i11;
        this.f8454j = i11 != -1 ? i11 : i10;
        this.f8455k = rv1Var.f10303j;
        this.f8456l = rv1Var.f10304k;
        this.f8457m = rv1Var.f10305l;
        this.f8458n = rv1Var.f10306m;
        this.f8459o = rv1Var.f10307n;
        this.f8460p = rv1Var.f10308o;
        this.f8461q = rv1Var.f10309p;
        List list = rv1Var.f10310q;
        this.f8462r = list == null ? Collections.EMPTY_LIST : list;
        nu1 nu1Var = rv1Var.f10311r;
        this.f8463s = nu1Var;
        this.f8464t = rv1Var.f10312s;
        this.f8465u = rv1Var.f10313t;
        this.f8466v = rv1Var.f10314u;
        this.f8467w = rv1Var.f10315v;
        this.f8468x = rv1Var.f10316w;
        this.f8469y = rv1Var.f10317x;
        this.f8470z = rv1Var.f10318y;
        int i12 = rv1Var.f10319z;
        this.A = i12 == -1 ? 0 : i12;
        this.B = rv1Var.A;
        float f10 = rv1Var.B;
        this.C = f10 == -1.0f ? 1.0f : f10;
        this.D = rv1Var.C;
        this.E = rv1Var.D;
        this.F = rv1Var.E;
        this.G = rv1Var.F;
        int i13 = rv1Var.G;
        this.H = i13;
        int i14 = rv1Var.H;
        this.I = i14;
        if (i13 != -1 && i14 != -1 && Integer.bitCount(i14) != i13) {
            x.o(ay0.B("channelCount and channelMask are inconsistent. channelCount=%s, channelMask=%s", Integer.valueOf(i13), Integer.valueOf(i14)));
            throw null;
        }
        this.J = rv1Var.I;
        this.K = rv1Var.J;
        int i15 = rv1Var.K;
        this.L = i15 == -1 ? 0 : i15;
        int i16 = rv1Var.L;
        this.M = i16 != -1 ? i16 : 0;
        this.N = rv1Var.M;
        this.O = rv1Var.N;
        int i17 = rv1Var.O;
        if (i17 == 0 && nu1Var != null) {
            this.P = 1;
        } else {
            this.P = i17;
        }
    }

    public static String c(mw1 mw1Var) {
        String str;
        String str2;
        String str3;
        int i;
        int i10;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("id=");
        sb2.append(mw1Var.f8447a);
        sb2.append(", mimeType=");
        sb2.append(mw1Var.f8459o);
        String str4 = mw1Var.f8458n;
        if (str4 != null) {
            sb2.append(", container=");
            sb2.append(str4);
        }
        String str5 = mw1Var.f8457m;
        if (str5 != null) {
            sb2.append(", primaryGroupId=");
            sb2.append(str5);
        }
        int i11 = mw1Var.f8454j;
        if (i11 != -1) {
            sb2.append(", bitrate=");
            sb2.append(i11);
        }
        String str6 = mw1Var.f8455k;
        if (str6 != null) {
            sb2.append(", codecs=");
            sb2.append(str6);
        }
        nu1 nu1Var = mw1Var.f8463s;
        if (nu1Var != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i12 = 0; i12 < nu1Var.f8874x; i12++) {
                UUID uuid = nu1Var.f8871u[i12].f7545v;
                if (uuid.equals(yv0.f12976b)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(yv0.f12977c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(yv0.e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(yv0.f12978d)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(yv0.f12975a)) {
                    linkedHashSet.add("universal");
                } else {
                    String obj = uuid.toString();
                    StringBuilder sb3 = new StringBuilder(obj.length() + 10);
                    sb3.append("unknown (");
                    sb3.append(obj);
                    sb3.append(")");
                    linkedHashSet.add(sb3.toString());
                }
            }
            sb2.append(", drm=[");
            ct.t(sb2, linkedHashSet.iterator(), ",");
            sb2.append(']');
        }
        int i13 = mw1Var.f8466v;
        if (i13 != -1 && (i10 = mw1Var.f8467w) != -1) {
            a.r(i13, i10, ", res=", "x", sb2);
        }
        int i14 = mw1Var.f8468x;
        if (i14 != -1 && (i = mw1Var.f8469y) != -1) {
            a.r(i14, i, ", decRes=", "x", sb2);
        }
        float f10 = mw1Var.C;
        int i15 = z61.f13094a;
        double d2 = f10;
        if (Math.copySign((-1.0d) + d2, 1.0d) > 0.001d && d2 != 1.0d && (!Double.isNaN(d2) || !Double.isNaN(1.0d))) {
            sb2.append(", par=");
            Object[] objArr = {Float.valueOf(f10)};
            String str7 = bq0.f4860a;
            sb2.append(String.format(Locale.US, "%.3f", objArr));
        }
        mk1 mk1Var = mw1Var.F;
        if (mk1Var != null) {
            int i16 = mk1Var.f8367f;
            int i17 = mk1Var.e;
            if ((i17 != -1 && i16 != -1) || mk1Var.d()) {
                sb2.append(", color=");
                if (mk1Var.d()) {
                    String e = mk1.e(mk1Var.f8363a);
                    String g8 = mk1.g(mk1Var.f8364b);
                    String f11 = mk1.f(mk1Var.f8365c);
                    String str8 = bq0.f4860a;
                    Locale locale = Locale.US;
                    str2 = e + "/" + g8 + "/" + f11;
                } else {
                    str2 = "NA/NA/NA";
                }
                if (i17 != -1 && i16 != -1) {
                    StringBuilder sb4 = new StringBuilder(a.d(i17, 1) + String.valueOf(i16).length());
                    sb4.append(i17);
                    sb4.append("/");
                    sb4.append(i16);
                    str3 = sb4.toString();
                } else {
                    str3 = "NA/NA";
                }
                StringBuilder sb5 = new StringBuilder(str3.length() + str2.length() + 1);
                sb5.append(str2);
                sb5.append("/");
                sb5.append(str3);
                sb2.append(sb5.toString());
            }
        }
        float f12 = mw1Var.f8470z;
        if (f12 != -1.0f) {
            sb2.append(", fps=");
            sb2.append(f12);
        }
        int i18 = mw1Var.A;
        if (i18 != 0) {
            sb2.append(", rotation=");
            sb2.append(i18);
        }
        if (mw1Var.B) {
            sb2.append(", mirrorHorizontal");
        }
        int i19 = mw1Var.G;
        if (i19 != -1) {
            sb2.append(", maxSubLayers=");
            sb2.append(i19);
        }
        int i20 = mw1Var.H;
        if (i20 != -1) {
            sb2.append(", channels=");
            sb2.append(i20);
        }
        int i21 = mw1Var.I;
        if (i21 != -1) {
            sb2.append(", channel_mask=");
            sb2.append(i21);
        }
        int i22 = mw1Var.J;
        if (i22 != -1) {
            sb2.append(", sample_rate=");
            sb2.append(i22);
        }
        String str9 = mw1Var.f8450d;
        if (str9 != null) {
            sb2.append(", language=");
            sb2.append(str9);
        }
        d51 d51Var = mw1Var.f8449c;
        if (!d51Var.isEmpty()) {
            sb2.append(", labels=[");
            ct.t(sb2, ed1.C(d51Var, b11.f4660d).iterator(), ",");
            sb2.append("]");
        }
        int i23 = mw1Var.e;
        if (i23 != 0) {
            sb2.append(", selectionFlags=[");
            String str10 = bq0.f4860a;
            ArrayList arrayList = new ArrayList();
            if ((i23 & 1) != 0) {
                arrayList.add("default");
            }
            if ((i23 & 2) != 0) {
                arrayList.add("forced");
            }
            ct.t(sb2, arrayList.iterator(), ",");
            sb2.append("]");
        }
        int i24 = mw1Var.f8451f;
        if (i24 != 0) {
            sb2.append(", roleFlags=[");
            int i25 = i24 & DecompressedBytes.DECOMPRESSED_BYTES_INITIAL_CAPACITY;
            String str11 = bq0.f4860a;
            ArrayList arrayList2 = new ArrayList();
            if ((i24 & 1) != 0) {
                arrayList2.add("main");
            }
            if ((i24 & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((i24 & 4) != 0) {
                arrayList2.add("supplementary");
            }
            if ((i24 & 8) != 0) {
                arrayList2.add("commentary");
            }
            if ((i24 & 16) != 0) {
                arrayList2.add("dub");
            }
            if ((i24 & 32) != 0) {
                arrayList2.add("emergency");
            }
            if ((i24 & 64) != 0) {
                arrayList2.add("caption");
            }
            if ((i24 & 128) != 0) {
                arrayList2.add("subtitle");
            }
            if ((i24 & 256) != 0) {
                arrayList2.add("sign");
            }
            if ((i24 & 512) != 0) {
                arrayList2.add("describes-video");
            }
            if ((i24 & 1024) != 0) {
                arrayList2.add("describes-music");
            }
            if ((i24 & 2048) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((i24 & 4096) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((i24 & 8192) != 0) {
                arrayList2.add("easy-read");
            }
            if ((i24 & 16384) != 0) {
                arrayList2.add("trick-play");
            }
            if (i25 != 0) {
                arrayList2.add("auxiliary");
            }
            ct.t(sb2, arrayList2.iterator(), ",");
            sb2.append("]");
        }
        if ((i24 & DecompressedBytes.DECOMPRESSED_BYTES_INITIAL_CAPACITY) != 0) {
            sb2.append(", auxiliaryTrackType=");
            int i26 = mw1Var.f8452g;
            String str12 = bq0.f4860a;
            if (i26 != 0) {
                if (i26 != 1) {
                    if (i26 != 2) {
                        if (i26 != 3) {
                            if (i26 == 4) {
                                str = "depth metadata";
                            } else {
                                x.o("Unsupported auxiliary track type");
                                return null;
                            }
                        } else {
                            str = "depth-inverse";
                        }
                    } else {
                        str = "depth-linear";
                    }
                } else {
                    str = "original";
                }
            } else {
                str = "undefined";
            }
            sb2.append(str);
        }
        return sb2.toString();
    }

    public final rv1 a() {
        return new rv1(this);
    }

    public final boolean b(mw1 mw1Var) {
        List list = this.f8462r;
        int size = list.size();
        List list2 = mw1Var.f8462r;
        if (size != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals((byte[]) list.get(i), (byte[]) list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this != obj) {
            if (obj != null && mw1.class == obj.getClass()) {
                mw1 mw1Var = (mw1) obj;
                int i10 = this.Q;
                if ((i10 == 0 || (i = mw1Var.Q) == 0 || i10 == i) && this.e == mw1Var.e && this.f8451f == mw1Var.f8451f && this.f8452g == mw1Var.f8452g && this.f8453h == mw1Var.f8453h && this.i == mw1Var.i && this.f8460p == mw1Var.f8460p && this.f8464t == mw1Var.f8464t && this.f8466v == mw1Var.f8466v && this.f8467w == mw1Var.f8467w && this.f8468x == mw1Var.f8468x && this.f8469y == mw1Var.f8469y && this.A == mw1Var.A && this.B == mw1Var.B && this.E == mw1Var.E && this.G == mw1Var.G && this.H == mw1Var.H && this.I == mw1Var.I && this.J == mw1Var.J && this.K == mw1Var.K && this.L == mw1Var.L && this.M == mw1Var.M && this.N == mw1Var.N && this.P == mw1Var.P && Float.compare(this.f8470z, mw1Var.f8470z) == 0 && Float.compare(this.C, mw1Var.C) == 0 && Objects.equals(this.f8447a, mw1Var.f8447a) && Objects.equals(this.f8448b, mw1Var.f8448b) && this.f8449c.equals(mw1Var.f8449c) && Objects.equals(this.f8455k, mw1Var.f8455k) && Objects.equals(this.f8457m, mw1Var.f8457m) && Objects.equals(this.f8458n, mw1Var.f8458n) && Objects.equals(this.f8459o, mw1Var.f8459o) && Objects.equals(this.f8450d, mw1Var.f8450d) && Arrays.equals(this.D, mw1Var.D) && Objects.equals(this.f8456l, mw1Var.f8456l) && Objects.equals(this.F, mw1Var.F) && Objects.equals(this.f8463s, mw1Var.f8463s) && b(mw1Var)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int i = this.Q;
        if (i == 0) {
            int i10 = 0;
            String str = this.f8447a;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            String str2 = this.f8448b;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int hashCode8 = this.f8449c.hashCode() + ((((hashCode + 527) * 31) + hashCode2) * 31);
            String str3 = this.f8450d;
            if (str3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str3.hashCode();
            }
            int i11 = ((((((((((((hashCode8 * 31) + hashCode3) * 31) + this.e) * 31) + this.f8451f) * 31) + this.f8452g) * 31) + this.f8453h) * 31) + this.i) * 31;
            String str4 = this.f8455k;
            if (str4 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = str4.hashCode();
            }
            int i12 = (i11 + hashCode4) * 31;
            m8 m8Var = this.f8456l;
            if (m8Var == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = m8Var.hashCode();
            }
            int i13 = i12 + hashCode5;
            String str5 = this.f8457m;
            if (str5 == null) {
                hashCode6 = 0;
            } else {
                hashCode6 = str5.hashCode();
            }
            int i14 = ((i13 * 961) + hashCode6) * 31;
            String str6 = this.f8458n;
            if (str6 == null) {
                hashCode7 = 0;
            } else {
                hashCode7 = str6.hashCode();
            }
            int i15 = (i14 + hashCode7) * 31;
            String str7 = this.f8459o;
            if (str7 != null) {
                i10 = str7.hashCode();
            }
            int floatToIntBits = ((((((((((((((((((((((((Float.floatToIntBits(this.C) + ((((((Float.floatToIntBits(this.f8470z) + ((((((((((((((((i15 + i10) * 31) + this.f8460p) * 31) + ((int) this.f8464t)) * 31) + this.f8466v) * 31) + this.f8467w) * 31) - 1) * 31) + this.f8468x) * 31) + this.f8469y) * 31)) * 31) + this.A) * 31) + (this.B ? 1 : 0)) * 31)) * 31) + this.E) * 31) + this.G) * 31) + this.H) * 31) + this.I) * 31) + this.J) * 31) + this.K) * 31) + this.L) * 31) + this.M) * 31) + this.N) * 31) - 1) * 31) - 1) * 31) + this.P;
            this.Q = floatToIntBits;
            return floatToIntBits;
        }
        return i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.F);
        String str = this.f8447a;
        int length = String.valueOf(str).length();
        String str2 = this.f8448b;
        int length2 = String.valueOf(str2).length();
        String str3 = this.f8458n;
        int length3 = String.valueOf(str3).length();
        String str4 = this.f8459o;
        int length4 = String.valueOf(str4).length();
        String str5 = this.f8455k;
        int length5 = String.valueOf(str5).length();
        int i = this.f8454j;
        int length6 = String.valueOf(i).length();
        String str6 = this.f8450d;
        int length7 = String.valueOf(str6).length();
        int i10 = this.f8466v;
        int length8 = String.valueOf(i10).length();
        int i11 = this.f8467w;
        int length9 = String.valueOf(i11).length();
        float f10 = this.f8470z;
        int length10 = String.valueOf(f10).length();
        int length11 = valueOf.length();
        int i12 = this.H;
        int length12 = String.valueOf(i12).length();
        int i13 = this.I;
        int length13 = String.valueOf(i13).length();
        int i14 = this.J;
        StringBuilder sb2 = new StringBuilder(length + 9 + length2 + 2 + length3 + 2 + length4 + 2 + length5 + 2 + length6 + 2 + length7 + 3 + length8 + 2 + length9 + 2 + length10 + 2 + length11 + 4 + length12 + 2 + length13 + 2 + String.valueOf(i14).length() + 2);
        a.t(sb2, "Format(", str, ", ", str2);
        a.t(sb2, ", ", str3, ", ", str4);
        sb2.append(", ");
        sb2.append(str5);
        sb2.append(", ");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(str6);
        sb2.append(", [");
        sb2.append(i10);
        sb2.append(", ");
        sb2.append(i11);
        sb2.append(", ");
        sb2.append(f10);
        sb2.append(", ");
        sb2.append(valueOf);
        sb2.append("], [");
        sb2.append(i12);
        a.r(i13, i14, ", ", ", ", sb2);
        sb2.append("])");
        return sb2.toString();
    }
}
