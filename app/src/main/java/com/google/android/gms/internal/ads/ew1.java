package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.LoudnessCodecController;
import android.media.MediaFormat;
import android.media.Spatializer;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import androidx.ink.storage.DecompressedBytes;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ew1 extends zw1 implements kt1 {
    public final Context Y0;
    public final mu Z0;

    /* renamed from: a1, reason: collision with root package name */
    public final cw1 f5834a1;

    /* renamed from: b1, reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.e4 f5835b1;

    /* renamed from: c1, reason: collision with root package name */
    public int f5836c1;

    /* renamed from: d1, reason: collision with root package name */
    public boolean f5837d1;

    /* renamed from: e1, reason: collision with root package name */
    public mw1 f5838e1;

    /* renamed from: f1, reason: collision with root package name */
    public mw1 f5839f1;

    /* renamed from: g1, reason: collision with root package name */
    public long f5840g1;

    /* renamed from: h1, reason: collision with root package name */
    public boolean f5841h1;

    /* renamed from: i1, reason: collision with root package name */
    public boolean f5842i1;

    /* renamed from: j1, reason: collision with root package name */
    public boolean f5843j1;

    /* renamed from: k1, reason: collision with root package name */
    public boolean f5844k1;

    /* renamed from: l1, reason: collision with root package name */
    public int f5845l1;

    /* renamed from: m1, reason: collision with root package name */
    public boolean f5846m1;

    /* renamed from: n1, reason: collision with root package name */
    public long f5847n1;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ew1(android.content.Context r5, com.google.android.gms.internal.ads.rl r6, android.os.Handler r7, com.google.android.gms.internal.ads.rs1 r8, com.google.android.gms.internal.ads.cw1 r9) {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.bx1 r0 = com.google.android.gms.internal.ads.bx1.f4903u
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 35
            if (r1 < r2) goto L10
            com.google.android.gms.internal.measurement.e4 r1 = new com.google.android.gms.internal.measurement.e4
            r2 = 11
            r1.<init>(r2)
            goto L11
        L10:
            r1 = 0
        L11:
            android.content.Context r2 = r5.getApplicationContext()
            r3 = 1
            r4.<init>(r2, r3, r6, r0)
            android.content.Context r5 = r5.getApplicationContext()
            r4.Y0 = r5
            r4.f5834a1 = r9
            r4.f5835b1 = r1
            r5 = -1000(0xfffffffffffffc18, float:NaN)
            r4.f5845l1 = r5
            com.google.android.gms.internal.ads.mu r5 = new com.google.android.gms.internal.ads.mu
            r6 = 11
            r5.<init>(r7, r6, r8)
            r4.Z0 = r5
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r4.f5847n1 = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ew1.<init>(android.content.Context, com.google.android.gms.internal.ads.rl, android.os.Handler, com.google.android.gms.internal.ads.rs1, com.google.android.gms.internal.ads.cw1):void");
    }

    @Override // com.google.android.gms.internal.ads.zw1
    public final boolean I() {
        return this.f5834a1.t();
    }

    @Override // com.google.android.gms.internal.ads.zw1
    public final boolean J() {
        if (this.L0) {
            cw1 cw1Var = this.f5834a1;
            if (cw1Var.l()) {
                if (cw1Var.K && !cw1Var.t()) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        if (r1 != null) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009e  */
    /* JADX WARN: Type inference failed for: r9v3, types: [com.google.android.gms.internal.ads.f6, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.zw1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int M(com.google.android.gms.internal.ads.bx1 r12, com.google.android.gms.internal.ads.mw1 r13) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ew1.M(com.google.android.gms.internal.ads.bx1, com.google.android.gms.internal.ads.mw1):int");
    }

    @Override // com.google.android.gms.internal.ads.zw1
    public final ArrayList O(bx1 bx1Var, mw1 mw1Var) {
        y51 b10;
        ww1 ww1Var;
        if (mw1Var.f8459o == null) {
            b10 = y51.f12781y;
        } else {
            if (this.f5834a1.p(mw1Var) != 0) {
                List a10 = gx1.a("audio/raw", false, false);
                if (a10.isEmpty()) {
                    ww1Var = null;
                } else {
                    ww1Var = (ww1) a10.get(0);
                }
                if (ww1Var != null) {
                    b10 = d51.q(ww1Var);
                }
            }
            b10 = gx1.b(bx1Var, mw1Var, false, false);
        }
        HashMap hashMap = gx1.f6499a;
        ArrayList arrayList = new ArrayList(b10);
        Collections.sort(arrayList, new ex1(new com.google.android.gms.internal.mlkit_vision_digital_ink.gw(this.Y0, 11, mw1Var)));
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zw1
    public final boolean Q(mw1 mw1Var) {
        l();
        if (this.f5834a1.p(mw1Var) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zw1
    public final p8 R(ww1 ww1Var, mw1 mw1Var, float f10) {
        boolean z3;
        vu1 vu1Var;
        int i;
        mw1[] mw1VarArr = this.D;
        mw1VarArr.getClass();
        int length = mw1VarArr.length;
        String str = ww1Var.f12352a;
        "OMX.google.raw.decoder".equals(str);
        int i10 = mw1Var.f8460p;
        int i11 = 0;
        if (length != 1) {
            for (mw1 mw1Var2 : mw1VarArr) {
                if (ww1Var.d(mw1Var, mw1Var2).f7212d != 0) {
                    "OMX.google.raw.decoder".equals(str);
                    i10 = Math.max(i10, mw1Var2.f8460p);
                }
            }
        }
        this.f5836c1 = i10;
        if (str.equals("OMX.google.opus.decoder") || str.equals("c2.android.opus.decoder") || str.equals("OMX.google.vorbis.decoder") || str.equals("c2.android.vorbis.decoder")) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f5837d1 = z3;
        String str2 = ww1Var.f12354c;
        int i12 = this.f5836c1;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str2);
        int i13 = mw1Var.H;
        mediaFormat.setInteger("channel-count", i13);
        int i14 = mw1Var.J;
        mediaFormat.setInteger("sample-rate", i14);
        x21.j(mediaFormat, mw1Var.f8462r);
        x21.C(mediaFormat, "max-input-size", i12);
        mediaFormat.setInteger("priority", 0);
        if (f10 != -1.0f) {
            mediaFormat.setFloat("operating-rate", f10);
        }
        String str3 = mw1Var.f8459o;
        if ("audio/ac4".equals(str3)) {
            Pair b10 = va0.b(mw1Var);
            if (b10 != null) {
                x21.C(mediaFormat, "profile", ((Integer) b10.first).intValue());
                x21.C(mediaFormat, "level", ((Integer) b10.second).intValue());
            }
            if (Build.VERSION.SDK_INT <= 28) {
                mediaFormat.setInteger("ac4-is-sync", 1);
            }
        }
        rv1 rv1Var = new rv1();
        rv1Var.e("audio/raw");
        rv1Var.G = i13;
        rv1Var.I = i14;
        rv1Var.J = 4;
        mw1 mw1Var3 = new mw1(rv1Var);
        cw1 cw1Var = this.f5834a1;
        if (cw1Var.p(mw1Var3) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        int i15 = Build.VERSION.SDK_INT;
        if (i15 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (i15 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.f5845l1));
        }
        mw1 mw1Var4 = null;
        if (Objects.equals(str3, "audio/iamf")) {
            com.google.android.gms.internal.mlkit_vision_digital_ink.lw lwVar = cw1Var.f5201p;
            if (lwVar != null) {
                vu1Var = (vu1) lwVar.f14647y;
            } else {
                vu1Var = null;
            }
            int i16 = 12;
            if (vu1Var == null) {
                x21.F("MediaCodecAudioRenderer", "AudioCapabilities from the AudioSink are null, using default stereo output layout.");
                mediaFormat.setInteger("channel-mask", 12);
                mediaFormat.setInteger("max-output-channel-count", 2);
            } else {
                j51 j51Var = dw1.f5543a;
                Iterator it = vu1Var.f12016d.iterator();
                while (true) {
                    w31 w31Var = (w31) it;
                    if (w31Var.hasNext()) {
                        Integer num = (Integer) w31Var.next();
                        i = num.intValue();
                        if (dw1.f5543a.contains(num)) {
                            break;
                        }
                    } else {
                        i = 0;
                        break;
                    }
                }
                if (i != 0) {
                    i16 = i;
                } else {
                    Iterator it2 = vu1Var.f12015c.iterator();
                    while (true) {
                        w31 w31Var2 = (w31) it2;
                        if (!w31Var2.hasNext()) {
                            break;
                        }
                        Integer num2 = (Integer) w31Var2.next();
                        int intValue = num2.intValue();
                        if (dw1.f5543a.contains(num2)) {
                            i11 = intValue;
                            break;
                        }
                    }
                    if (i11 != 0) {
                        i16 = i11;
                    }
                }
                int bitCount = Integer.bitCount(i16);
                mediaFormat.setInteger("channel-mask", i16);
                mediaFormat.setInteger("max-output-channel-count", bitCount);
            }
        }
        i0(mediaFormat);
        if ("audio/raw".equals(ww1Var.f12353b) && !"audio/raw".equals(str3)) {
            mw1Var4 = mw1Var;
        }
        this.f5839f1 = mw1Var4;
        return new p8(ww1Var, mediaFormat, mw1Var, null, this.f5835b1, 11);
    }

    @Override // com.google.android.gms.internal.ads.zw1
    public final is1 S(ww1 ww1Var, mw1 mw1Var, mw1 mw1Var2, boolean z3) {
        int i;
        int i10;
        is1 d2 = ww1Var.d(mw1Var, mw1Var2);
        int i11 = d2.e;
        if (this.f13295b0 == null && Q(mw1Var2)) {
            i11 |= DecompressedBytes.DECOMPRESSED_BYTES_INITIAL_CAPACITY;
        }
        "OMX.google.raw.decoder".equals(ww1Var.f12352a);
        if (mw1Var2.f8460p > this.f5836c1) {
            i11 |= 64;
        }
        String str = ww1Var.f12352a;
        if (i11 != 0) {
            i10 = 0;
            i = i11;
        } else {
            i = 0;
            i10 = d2.f7212d;
        }
        return new is1(str, mw1Var, mw1Var2, i10, i);
    }

    @Override // com.google.android.gms.internal.ads.zw1
    public final long T(long j10) {
        boolean z3;
        long w10;
        float f10;
        cw1 cw1Var = this.f5834a1;
        boolean z9 = true;
        if (cw1Var.t() && this.f5847n1 != -9223372036854775807L) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!this.f5846m1) {
            if (z3 || this.L0) {
                return 1000000L;
            }
        } else {
            if (!cw1Var.l()) {
                w10 = -9223372036854775807L;
            } else if (cw1Var.f5199n.c()) {
                w10 = bq0.v(((gv1) cw1Var.f5199n.e).f6482b, cw1Var.f5203r.f11456a.getBufferSizeInFrames());
            } else {
                long bufferSizeInFrames = cw1Var.f5203r.f11456a.getBufferSizeInFrames();
                int O = x21.O(((gv1) cw1Var.f5199n.e).f6481a);
                if (O == -2147483647) {
                    z9 = false;
                }
                b80.K(z9);
                w10 = bq0.w(bufferSizeInFrames, 1000000L, O, RoundingMode.DOWN);
            }
            if (this.f5844k1 && z3 && w10 != -9223372036854775807L) {
                float min = (float) Math.min(w10, this.f5847n1 - j10);
                vb vbVar = cw1Var.f5207v;
                if (vbVar != null) {
                    f10 = vbVar.f11870a;
                } else {
                    f10 = 1.0f;
                }
                return Math.max(10000L, (min / f10) / 2.0f);
            }
        }
        return 10000L;
    }

    @Override // com.google.android.gms.internal.ads.zw1
    public final float U(float f10, mw1 mw1Var, mw1[] mw1VarArr) {
        int i = -1;
        for (mw1 mw1Var2 : mw1VarArr) {
            int i10 = mw1Var2.J;
            if (i10 != -1) {
                i = Math.max(i, i10);
            }
        }
        if (i == -1) {
            MediaFormat mediaFormat = this.f13302i0;
            if (mediaFormat != null && mediaFormat.containsKey("sample-rate")) {
                i = mediaFormat.getInteger("sample-rate");
            } else {
                i = -1;
            }
        }
        if (i == -1) {
            return -1.0f;
        }
        return i * f10;
    }

    @Override // com.google.android.gms.internal.ads.zw1
    public final void V(long j10, long j11, String str) {
        mu muVar = this.Z0;
        Handler handler = (Handler) muVar.f8422v;
        if (handler != null) {
            handler.post(new hv1(muVar, str, j10, j11));
        }
    }

    @Override // com.google.android.gms.internal.ads.zw1
    public final void W(String str) {
        mu muVar = this.Z0;
        Handler handler = (Handler) muVar.f8422v;
        if (handler != null) {
            handler.post(new hv1(muVar, str, 4));
        }
    }

    @Override // com.google.android.gms.internal.ads.zw1
    public final void X(Exception exc) {
        x21.P("MediaCodecAudioRenderer", "Audio codec error", exc);
        mu muVar = this.Z0;
        Handler handler = (Handler) muVar.f8422v;
        if (handler != null) {
            handler.post(new hv1(muVar, exc, 6));
        }
    }

    @Override // com.google.android.gms.internal.ads.zw1
    public final is1 Y(i0.m mVar) {
        mw1 mw1Var = (mw1) mVar.f18054v;
        mw1Var.getClass();
        this.f5838e1 = mw1Var;
        is1 Y = super.Y(mVar);
        mu muVar = this.Z0;
        Handler handler = (Handler) muVar.f8422v;
        if (handler != null) {
            handler.post(new r1(15, muVar, mw1Var, Y));
        }
        return Y;
    }

    @Override // com.google.android.gms.internal.ads.zw1
    public final void Z(mw1 mw1Var, MediaFormat mediaFormat) {
        int i;
        int integer;
        yx1 yx1Var;
        boolean z3;
        mw1 mw1Var2 = this.f5839f1;
        d71 d71Var = null;
        if (mw1Var2 != null) {
            mw1Var = mw1Var2;
        } else if (this.f13300g0 != null) {
            mediaFormat.getClass();
            if ("audio/raw".equals(mw1Var.f8459o)) {
                i = mw1Var.K;
            } else if (mediaFormat.containsKey("pcm-encoding")) {
                i = mediaFormat.getInteger("pcm-encoding");
            } else if (mediaFormat.containsKey("v-bits-per-sample")) {
                i = bq0.b(mediaFormat.getInteger("v-bits-per-sample"), ByteOrder.LITTLE_ENDIAN);
            } else {
                i = 2;
            }
            int integer2 = mediaFormat.getInteger("channel-count");
            int i10 = mw1Var.I;
            if (i10 == -1 || mw1Var.H != integer2) {
                i10 = -1;
            }
            if (mediaFormat.containsKey("channel-mask") && (integer = mediaFormat.getInteger("channel-mask")) != 0 && Integer.bitCount(integer) == integer2) {
                i10 = integer;
            }
            rv1 rv1Var = new rv1();
            rv1Var.e("audio/raw");
            rv1Var.J = i;
            rv1Var.K = mw1Var.L;
            rv1Var.L = mw1Var.M;
            rv1Var.f10304k = mw1Var.f8456l;
            rv1Var.f10296a = mw1Var.f8447a;
            rv1Var.f10297b = mw1Var.f8448b;
            rv1Var.f10298c = d51.u(mw1Var.f8449c);
            rv1Var.f10299d = mw1Var.f8450d;
            rv1Var.e = mw1Var.e;
            rv1Var.f10300f = mw1Var.f8451f;
            rv1Var.G = integer2;
            rv1Var.H = i10;
            rv1Var.I = mediaFormat.getInteger("sample-rate");
            mw1Var = new mw1(rv1Var);
            if (this.f5837d1) {
                int i11 = mw1Var.H;
                if (i11 != 3) {
                    if (i11 != 5) {
                        if (i11 != 6) {
                            if (i11 != 7) {
                                if (i11 != 8) {
                                    d71 d71Var2 = k3.f7635a;
                                } else {
                                    d71Var = k3.e;
                                }
                            } else {
                                d71Var = k3.f7638d;
                            }
                        } else {
                            d71Var = k3.f7637c;
                        }
                    } else {
                        d71Var = k3.f7636b;
                    }
                } else {
                    d71Var = k3.f7635a;
                }
            }
        }
        try {
            int i12 = Build.VERSION.SDK_INT;
            boolean z9 = true;
            if (i12 >= 29) {
                if (this.f13321y0) {
                    l();
                }
                if (i12 >= 29) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                b80.K(z3);
            }
            cw1 cw1Var = this.f5834a1;
            na1 na1Var = new na1(mw1Var);
            na1Var.f8631c = d71Var;
            uh uhVar = this.J;
            na1Var.f8632d = uhVar;
            na1Var.e = this.K;
            if (!uhVar.g() && (yx1Var = (yx1) na1Var.e) != null) {
                if (((uh) na1Var.f8632d).e(yx1Var.f13003a) == -1) {
                    z9 = false;
                }
                b80.l(z9);
            }
            cw1Var.q(new kv1(na1Var));
            j0(this.f13301h0);
        } catch (lv1 e) {
            throw n(e, e.f8161u, false, 5001);
        }
    }

    @Override // com.google.android.gms.internal.ads.kt1
    public final void a(vb vbVar) {
        cw1 cw1Var = this.f5834a1;
        cw1Var.getClass();
        float f10 = vbVar.f11870a;
        String str = bq0.f4860a;
        vb vbVar2 = new vb(Math.max(0.1f, Math.min(f10, 8.0f)), Math.max(0.1f, Math.min(vbVar.f11871b, 8.0f)));
        cw1Var.f5207v = vbVar2;
        bw1 bw1Var = new bw1(vbVar2, -9223372036854775807L, -9223372036854775807L);
        if (cw1Var.l()) {
            cw1Var.f5205t = bw1Var;
        } else {
            cw1Var.f5206u = bw1Var;
        }
    }

    @Override // com.google.android.gms.internal.ads.zw1
    public final void a0() {
        this.f5834a1.C = true;
    }

    @Override // com.google.android.gms.internal.ads.wt1
    public final void b(int i, Object obj) {
        com.google.android.gms.internal.measurement.e4 e4Var;
        cw1 cw1Var = this.f5834a1;
        if (i != 2) {
            if (i != 3) {
                if (i != 6) {
                    if (i != 12) {
                        if (i != 16) {
                            if (i != 19) {
                                if (i != 9) {
                                    if (i != 10) {
                                        if (i == 11) {
                                            zs1 zs1Var = (zs1) obj;
                                            zs1Var.getClass();
                                            this.f13296c0 = zs1Var;
                                            return;
                                        }
                                        return;
                                    }
                                    obj.getClass();
                                    int intValue = ((Integer) obj).intValue();
                                    if (cw1Var.P) {
                                        if (cw1Var.O == intValue) {
                                            cw1Var.P = false;
                                        }
                                        if (Build.VERSION.SDK_INT < 35 && (e4Var = this.f5835b1) != null) {
                                            e4Var.g(intValue);
                                            return;
                                        }
                                        return;
                                    }
                                    if (cw1Var.O != intValue) {
                                        cw1Var.O = intValue;
                                        cw1Var.j();
                                    }
                                    if (Build.VERSION.SDK_INT < 35) {
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                obj.getClass();
                                cw1Var.f5208w = ((Boolean) obj).booleanValue();
                                bw1 bw1Var = new bw1(cw1Var.f5207v, -9223372036854775807L, -9223372036854775807L);
                                if (cw1Var.l()) {
                                    cw1Var.f5205t = bw1Var;
                                    return;
                                } else {
                                    cw1Var.f5206u = bw1Var;
                                    return;
                                }
                            }
                            obj.getClass();
                            int intValue2 = ((Integer) obj).intValue();
                            int i10 = cw1Var.S;
                            if (intValue2 == 0 || intValue2 == -1) {
                                intValue2 = -1;
                            }
                            if (i10 != intValue2) {
                                cw1Var.S = intValue2;
                                cw1Var.j();
                                return;
                            }
                            return;
                        }
                        obj.getClass();
                        this.f5845l1 = ((Integer) obj).intValue();
                        tw1 tw1Var = this.f13300g0;
                        if (tw1Var != null && Build.VERSION.SDK_INT >= 35) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("importance", Math.max(0, -this.f5845l1));
                            tw1Var.j(bundle);
                            return;
                        }
                        return;
                    }
                    AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
                    cw1Var.R = audioDeviceInfo;
                    tv1 tv1Var = cw1Var.f5203r;
                    if (tv1Var != null) {
                        tv1Var.f11456a.setPreferredDevice(audioDeviceInfo);
                        return;
                    }
                    return;
                }
                yd0 yd0Var = (yd0) obj;
                yd0Var.getClass();
                if (!cw1Var.Q.equals(yd0Var)) {
                    if (cw1Var.f5203r != null) {
                        cw1Var.Q.getClass();
                    }
                    cw1Var.Q = yd0Var;
                    return;
                }
                return;
            }
            l50 l50Var = (l50) obj;
            l50Var.getClass();
            if (!cw1Var.f5204s.equals(l50Var)) {
                cw1Var.f5204s = l50Var;
                cw1Var.j();
                return;
            }
            return;
        }
        obj.getClass();
        float floatValue = ((Float) obj).floatValue();
        if (cw1Var.G != floatValue) {
            cw1Var.G = floatValue;
            if (cw1Var.l()) {
                cw1Var.f5203r.f11456a.setVolume(cw1Var.G);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zw1
    public final boolean b0(long j10, long j11, tw1 tw1Var, ByteBuffer byteBuffer, int i, int i10, int i11, long j12, boolean z3, boolean z9, mw1 mw1Var) {
        byteBuffer.getClass();
        this.f5847n1 = -9223372036854775807L;
        if (this.f5839f1 != null && (i10 & 2) != 0) {
            tw1Var.getClass();
            tw1Var.m(i);
            return true;
        }
        cw1 cw1Var = this.f5834a1;
        if (z3) {
            if (tw1Var != null) {
                tw1Var.m(i);
            }
            this.N0.f6884f += i11;
            cw1Var.C = true;
            return true;
        }
        try {
            if (cw1Var.s(i11, j12, byteBuffer)) {
                if (tw1Var != null) {
                    tw1Var.m(i);
                }
                this.N0.e += i11;
                return true;
            }
            this.f5847n1 = j12;
            return false;
        } catch (mv1 e) {
            mw1 mw1Var2 = this.f5838e1;
            if (this.f13321y0) {
                l();
            }
            throw n(e, mw1Var2, false, 5001);
        } catch (nv1 e8) {
            if (this.f13321y0) {
                l();
            }
            throw n(e8, mw1Var, e8.f8876v, 5002);
        }
    }

    @Override // com.google.android.gms.internal.ads.zw1
    public final void c(long j10, boolean z3, boolean z9) {
        super.c(j10, z3, z9);
        this.f5834a1.a();
        this.f5840g1 = j10;
        this.f5847n1 = -9223372036854775807L;
        this.f5843j1 = false;
        this.f5844k1 = false;
        this.f5841h1 = true;
    }

    @Override // com.google.android.gms.internal.ads.zw1
    public final void c0(gs1 gs1Var) {
        mu muVar = this.Z0;
        Handler handler = (Handler) muVar.f8422v;
        if (handler != null) {
            handler.post(new pu1(muVar, 1, gs1Var));
        }
    }

    @Override // com.google.android.gms.internal.ads.kt1
    public final boolean d() {
        boolean z3 = this.f5843j1;
        this.f5843j1 = false;
        return z3;
    }

    @Override // com.google.android.gms.internal.ads.zw1
    public final void d0() {
        int i;
        try {
            cw1 cw1Var = this.f5834a1;
            if (!cw1Var.K && cw1Var.l() && cw1Var.g()) {
                cw1Var.o();
                cw1Var.K = true;
            }
            long j10 = this.O0.f12997f;
            if (j10 != -9223372036854775807L) {
                this.f5847n1 = j10;
            }
        } catch (nv1 e) {
            if (true != this.f13321y0) {
                i = 5002;
            } else {
                i = 5003;
            }
            throw n(e, e.f8877w, e.f8876v, i);
        }
    }

    @Override // com.google.android.gms.internal.ads.kt1
    public final long e() {
        if (this.B == 2) {
            w0();
        }
        return this.f5840g1;
    }

    @Override // com.google.android.gms.internal.ads.zw1
    public final void e0(long j10) {
        this.f5834a1.F = j10;
    }

    @Override // com.google.android.gms.internal.ads.kt1
    public final vb f() {
        return this.f5834a1.f5207v;
    }

    @Override // com.google.android.gms.internal.ads.zw1
    public final void f0(es1 es1Var) {
        mw1 mw1Var;
        if (Build.VERSION.SDK_INT >= 29 && (mw1Var = es1Var.f5765b) != null && Objects.equals(mw1Var.f8459o, "audio/opus") && this.f13321y0) {
            ByteBuffer byteBuffer = es1Var.f5768f;
            byteBuffer.getClass();
            es1Var.f5765b.getClass();
            if (byteBuffer.remaining() == 8) {
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong();
                tv1 tv1Var = this.f5834a1.f5203r;
                if (tv1Var != null) {
                    tv1Var.b();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zw1
    public final void g() {
        this.f5834a1.r();
        this.f5846m1 = true;
    }

    @Override // com.google.android.gms.internal.ads.zw1
    public final void h() {
        w0();
        this.f5846m1 = false;
        cw1 cw1Var = this.f5834a1;
        cw1Var.N = false;
        if (cw1Var.l()) {
            tv1 tv1Var = cw1Var.f5203r;
            vv1 vv1Var = tv1Var.e;
            vv1Var.f12037k = 0L;
            vv1Var.f12046t = 0;
            vv1Var.f12045s = 0;
            vv1Var.f12038l = 0L;
            vv1Var.f12051y = -9223372036854775807L;
            vv1Var.f12052z = -9223372036854775807L;
            if (vv1Var.f12047u == -9223372036854775807L) {
                vv1Var.f12035h.a(0);
            }
            vv1Var.f12049w = vv1Var.c();
            if (!tv1Var.f11463j || tv1Var.b()) {
                tv1Var.f11456a.pause();
            }
        }
        this.f5844k1 = false;
    }

    @Override // com.google.android.gms.internal.ads.zw1
    public final void i() {
        mu muVar = this.Z0;
        this.f5842i1 = true;
        this.f5838e1 = null;
        this.f5847n1 = -9223372036854775807L;
        this.f5844k1 = false;
        try {
            try {
                this.f5834a1.a();
                super.i();
                hs1 hs1Var = this.N0;
                muVar.getClass();
                synchronized (hs1Var) {
                }
                Handler handler = (Handler) muVar.f8422v;
                if (handler != null) {
                    handler.post(new iv1(muVar, 0, hs1Var));
                }
            } catch (Throwable th) {
                super.i();
                hs1 hs1Var2 = this.N0;
                muVar.getClass();
                synchronized (hs1Var2) {
                    Handler handler2 = (Handler) muVar.f8422v;
                    if (handler2 != null) {
                        handler2.post(new iv1(muVar, 0, hs1Var2));
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            hs1 hs1Var3 = this.N0;
            muVar.getClass();
            synchronized (hs1Var3) {
                Handler handler3 = (Handler) muVar.f8422v;
                if (handler3 != null) {
                    handler3.post(new iv1(muVar, 0, hs1Var3));
                }
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zw1
    public final void j() {
        cw1 cw1Var = this.f5834a1;
        this.f5843j1 = false;
        this.f5844k1 = false;
        this.f5847n1 = -9223372036854775807L;
        try {
            try {
                this.f13321y0 = false;
                g0();
                x();
                if (this.f5842i1) {
                    this.f5842i1 = false;
                    cw1Var.b();
                }
            } finally {
                this.f13295b0 = null;
            }
        } catch (Throwable th) {
            if (this.f5842i1) {
                this.f5842i1 = false;
                cw1Var.b();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zw1
    public final void k() {
        com.google.android.gms.internal.measurement.e4 e4Var;
        d dVar;
        j0 j0Var;
        Handler handler;
        com.google.android.gms.internal.mlkit_vision_digital_ink.lw lwVar = this.f5834a1.f5201p;
        ig0 ig0Var = (ig0) lwVar.f14645w;
        if (ig0Var != null) {
            ig0Var.e();
        }
        pu puVar = (pu) lwVar.f14648z;
        if (puVar != null && puVar.f9607v) {
            puVar.C = null;
            Context context = puVar.f9606u;
            xy.p(context).unregisterAudioDeviceCallback((wu1) puVar.f9610y);
            if (Build.VERSION.SDK_INT >= 32 && (dVar = (d) puVar.B) != null) {
                Spatializer spatializer = (Spatializer) dVar.f5230v;
                if (spatializer != null && (j0Var = (j0) dVar.f5232x) != null && (handler = (Handler) dVar.f5231w) != null) {
                    spatializer.removeOnSpatializerStateChangedListener(j0Var);
                    handler.removeCallbacksAndMessages(null);
                }
                puVar.B = null;
            }
            context.unregisterReceiver((hg) puVar.f9611z);
            xu1 xu1Var = (xu1) puVar.A;
            if (xu1Var != null) {
                xu1Var.f12629a.unregisterContentObserver(xu1Var);
            }
            puVar.f9607v = false;
        }
        if (Build.VERSION.SDK_INT >= 35 && (e4Var = this.f5835b1) != null) {
            ((HashSet) e4Var.f13728v).clear();
            LoudnessCodecController loudnessCodecController = (LoudnessCodecController) e4Var.f13729w;
            if (loudnessCodecController != null) {
                loudnessCodecController.close();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zw1
    public final String p() {
        return "MediaCodecAudioRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zw1
    public final kt1 s0() {
        return this;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [com.google.android.gms.internal.ads.hs1, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.zw1
    public final void u0(boolean z3, boolean z9) {
        ?? obj = new Object();
        this.N0 = obj;
        mu muVar = this.Z0;
        Handler handler = (Handler) muVar.f8422v;
        if (handler != null) {
            handler.post(new hv1(muVar, obj, 8));
        }
        l();
        tu1 tu1Var = this.f13322z;
        tu1Var.getClass();
        cw1 cw1Var = this.f5834a1;
        cw1Var.f5196k = tu1Var;
        s6 s6Var = this.A;
        s6Var.getClass();
        cw1Var.f5201p.f14646x = s6Var;
        cw1Var.f5197l = new lt0(13, this);
    }

    public final void w0() {
        long j10;
        long j11;
        ArrayDeque arrayDeque;
        long j12;
        J();
        cw1 cw1Var = this.f5834a1;
        hq0 hq0Var = cw1Var.X;
        if (!cw1Var.l() || cw1Var.D) {
            j10 = Long.MIN_VALUE;
            j11 = Long.MIN_VALUE;
        } else {
            long min = Math.min(cw1Var.f5203r.c(), bq0.v(((gv1) cw1Var.f5199n.e).f6482b, cw1Var.m()));
            while (true) {
                arrayDeque = cw1Var.f5193g;
                if (arrayDeque.isEmpty() || min < ((bw1) arrayDeque.getFirst()).f4898c) {
                    break;
                } else {
                    cw1Var.f5206u = (bw1) arrayDeque.remove();
                }
            }
            bw1 bw1Var = cw1Var.f5206u;
            long j13 = min - bw1Var.f4898c;
            long y10 = bq0.y(j13, bw1Var.f4896a.f11870a);
            if (arrayDeque.isEmpty()) {
                w30 w30Var = (w30) hq0Var.f6874x;
                if (w30Var.c()) {
                    if (w30Var.f12125n >= 1024) {
                        long j14 = w30Var.f12124m;
                        w30Var.f12121j.getClass();
                        long zza = j14 - (r10.i.zza() * (r10.f5908j * r10.f5902b));
                        int i = w30Var.f12120h.f4299a;
                        int i10 = w30Var.f12119g.f4299a;
                        j10 = Long.MIN_VALUE;
                        long j15 = w30Var.f12125n;
                        if (i == i10) {
                            j13 = bq0.w(j13, zza, j15, RoundingMode.DOWN);
                        } else {
                            j13 = bq0.w(j13, zza * i, j15 * i10, RoundingMode.DOWN);
                        }
                    } else {
                        j10 = Long.MIN_VALUE;
                        j13 = (long) (w30Var.f12116c * j13);
                    }
                } else {
                    j10 = Long.MIN_VALUE;
                }
                bw1 bw1Var2 = cw1Var.f5206u;
                j12 = bw1Var2.f4897b + j13;
                bw1Var2.f4899d = j13 - y10;
            } else {
                j10 = Long.MIN_VALUE;
                bw1 bw1Var3 = cw1Var.f5206u;
                j12 = bw1Var3.f4897b + y10 + bw1Var3.f4899d;
            }
            long j16 = ((fw1) hq0Var.f6873w).f6195l;
            j11 = bq0.v(((gv1) cw1Var.f5199n.e).f6482b, j16) + j12;
            long j17 = cw1Var.U;
            if (j16 > j17) {
                long v2 = bq0.v(((gv1) cw1Var.f5199n.e).f6482b, j16 - j17);
                cw1Var.U = j16;
                cw1Var.V += v2;
                if (cw1Var.W == null) {
                    cw1Var.W = new Handler(Looper.myLooper());
                }
                cw1Var.W.removeCallbacksAndMessages(null);
                cw1Var.W.postDelayed(new qu0(17, cw1Var), 100L);
            }
        }
        if (j11 != j10) {
            if (!this.f5841h1) {
                j11 = Math.max(this.f5840g1, j11);
            }
            this.f5840g1 = j11;
            this.f5841h1 = false;
        }
    }
}
