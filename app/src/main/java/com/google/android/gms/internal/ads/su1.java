package com.google.android.gms.internal.ads;
import ac.a;
import j6.c;
import j6.s;

import android.content.Context;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class su1 implements hu1 {
    public String D;
    public PlaybackMetrics.Builder E;
    public ns1 H;
    public j6.s I;
    public j6.s J;
    public j6.s K;
    public mw1 L;
    public mw1 M;
    public mw1 N;
    public boolean O;
    public boolean P;
    public int Q;
    public int R;
    public int S;
    public boolean T;

    /* renamed from: u, reason: collision with root package name */
    public final Context f11169u;

    /* renamed from: w, reason: collision with root package name */
    public final mu1 f11171w;

    /* renamed from: x, reason: collision with root package name */
    public final PlaybackSession f11172x;

    /* renamed from: v, reason: collision with root package name */
    public final Executor f11170v = b80.h();

    /* renamed from: z, reason: collision with root package name */
    public final ah f11174z = new ah();
    public final qg A = new qg();
    public final HashMap C = new HashMap();
    public final HashMap B = new HashMap();

    /* renamed from: y, reason: collision with root package name */
    public final long f11173y = SystemClock.elapsedRealtime();
    public int F = 0;
    public int G = 0;

    public su1(Context context, PlaybackSession playbackSession) {
        this.f11169u = context.getApplicationContext();
        this.f11172x = playbackSession;
        mu1 mu1Var = new mu1();
        this.f11171w = mu1Var;
        mu1Var.f8432d = this;
    }

    @Override // com.google.android.gms.internal.ads.hu1
    public final void a(int i) {
        if (i == 1) {
            this.O = true;
        }
    }

    public final void c(int i, long j10, mw1 mw1Var, int i10) {
        TrackChangeEvent.Builder timeSinceCreatedMillis;
        TrackChangeEvent build;
        int i11;
        String str;
        timeSinceCreatedMillis = ru1.q(i).setTimeSinceCreatedMillis(j10 - this.f11173y);
        int i12 = 0;
        if (mw1Var != null) {
            timeSinceCreatedMillis.setTrackState(1);
            if (i10 != 1) {
                i11 = 1;
            } else {
                i11 = 2;
            }
            timeSinceCreatedMillis.setTrackChangeReason(i11);
            String str2 = mw1Var.f8458n;
            if (str2 != null) {
                timeSinceCreatedMillis.setContainerMimeType(str2);
            }
            String str3 = mw1Var.f8459o;
            if (str3 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str3);
            }
            String str4 = mw1Var.f8455k;
            if (str4 != null) {
                timeSinceCreatedMillis.setCodecName(str4);
            }
            int i13 = mw1Var.f8454j;
            if (i13 != -1) {
                timeSinceCreatedMillis.setBitrate(i13);
            }
            int i14 = mw1Var.f8466v;
            if (i14 != -1) {
                timeSinceCreatedMillis.setWidth(i14);
            }
            int i15 = mw1Var.f8467w;
            if (i15 != -1) {
                timeSinceCreatedMillis.setHeight(i15);
            }
            int i16 = mw1Var.H;
            if (i16 != -1) {
                timeSinceCreatedMillis.setChannelCount(i16);
            }
            int i17 = mw1Var.J;
            if (i17 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i17);
            }
            String str5 = mw1Var.f8450d;
            if (str5 != null) {
                String str6 = bq0.f4860a;
                String[] split = str5.split("-", -1);
                String str7 = split[0];
                if (split.length >= 2) {
                    str = split[1];
                } else {
                    str = null;
                }
                Pair create = Pair.create(str7, str);
                timeSinceCreatedMillis.setLanguage((String) create.first);
                Object obj = create.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f10 = mw1Var.f8470z;
            if (f10 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f10);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.T = true;
        build = timeSinceCreatedMillis.build();
        this.f11170v.execute(new pu1(this, i12, build));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0079, code lost:
    
        if (r4.equals("isml") != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008e, code lost:
    
        r4 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008c, code lost:
    
        if (r4.equals("ism") != false) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(com.google.android.gms.internal.ads.uh r9, com.google.android.gms.internal.ads.yx1 r10) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.su1.e(com.google.android.gms.internal.ads.uh, com.google.android.gms.internal.ads.yx1):void");
    }

    @Override // com.google.android.gms.internal.ads.hu1
    public final void f(gu1 gu1Var, int i, long j10) {
        long longValue;
        yx1 yx1Var = gu1Var.f6462d;
        if (yx1Var != null) {
            String a10 = this.f11171w.a(gu1Var.f6460b, yx1Var);
            HashMap hashMap = this.C;
            Long l10 = (Long) hashMap.get(a10);
            HashMap hashMap2 = this.B;
            Long l11 = (Long) hashMap2.get(a10);
            long j11 = 0;
            if (l10 == null) {
                longValue = 0;
            } else {
                longValue = l10.longValue();
            }
            hashMap.put(a10, Long.valueOf(longValue + j10));
            if (l11 != null) {
                j11 = l11.longValue();
            }
            hashMap2.put(a10, Long.valueOf(j11 + i));
        }
    }

    @Override // com.google.android.gms.internal.ads.hu1
    public final void g(hs1 hs1Var) {
        this.Q += hs1Var.f6885g;
        this.R += hs1Var.e;
    }

    @Override // com.google.android.gms.internal.ads.hu1
    public final void h(ir irVar) {
        j6.s sVar = this.I;
        if (sVar != null) {
            mw1 mw1Var = (mw1) sVar.f18981v;
            if (mw1Var.f8467w == -1) {
                rv1 rv1Var = new rv1(mw1Var);
                rv1Var.f10314u = irVar.f7194a;
                rv1Var.f10315v = irVar.f7195b;
                this.I = new j6.s(new mw1(rv1Var), 9, (String) sVar.f18982w);
            }
        }
    }

    public final void k() {
        long longValue;
        long longValue2;
        int i;
        PlaybackMetrics build;
        PlaybackMetrics.Builder builder = this.E;
        if (builder != null && this.T) {
            builder.setAudioUnderrunCount(this.S);
            this.E.setVideoFramesDropped(this.Q);
            this.E.setVideoFramesPlayed(this.R);
            Long l10 = (Long) this.B.get(this.D);
            PlaybackMetrics.Builder builder2 = this.E;
            if (l10 == null) {
                longValue = 0;
            } else {
                longValue = l10.longValue();
            }
            builder2.setNetworkTransferDurationMillis(longValue);
            Long l11 = (Long) this.C.get(this.D);
            PlaybackMetrics.Builder builder3 = this.E;
            if (l11 == null) {
                longValue2 = 0;
            } else {
                longValue2 = l11.longValue();
            }
            builder3.setNetworkBytesRead(longValue2);
            PlaybackMetrics.Builder builder4 = this.E;
            if (l11 != null && l11.longValue() > 0) {
                i = 1;
            } else {
                i = 0;
            }
            builder4.setStreamSource(i);
            build = this.E.build();
            this.f11170v.execute(new ac.a(this, 29, build));
        }
        this.E = null;
        this.D = null;
        this.S = 0;
        this.Q = 0;
        this.R = 0;
        this.L = null;
        this.M = null;
        this.N = null;
        this.T = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:208:0x02a7, code lost:
    
        if (r15 != 1) goto L183;
     */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0214 A[PHI: r6
      0x0214: PHI (r6v48 int) = (r6v30 int), (r6v79 int) binds: [B:231:0x0300, B:161:0x0210] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0217 A[PHI: r6
      0x0217: PHI (r6v47 int) = (r6v30 int), (r6v79 int) binds: [B:231:0x0300, B:161:0x0210] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x021a A[PHI: r6
      0x021a: PHI (r6v46 int) = (r6v30 int), (r6v79 int) binds: [B:231:0x0300, B:161:0x0210] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x021d A[PHI: r6
      0x021d: PHI (r6v45 int) = (r6v30 int), (r6v79 int) binds: [B:231:0x0300, B:161:0x0210] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:267:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0561 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x043d  */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Throwable, j6.s] */
    /* JADX WARN: Type inference failed for: r8v4 */
    @Override // com.google.android.gms.internal.ads.hu1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(com.google.android.gms.internal.ads.eu1 r25, j6.c r26) {
        /*
            Method dump skipped, instructions count: 1428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.su1.l(com.google.android.gms.internal.ads.eu1, j6.c):void");
    }

    @Override // com.google.android.gms.internal.ads.hu1
    public final void m(gu1 gu1Var, vx1 vx1Var) {
        yx1 yx1Var = gu1Var.f6462d;
        if (yx1Var != null) {
            mw1 mw1Var = vx1Var.f12064b;
            mw1Var.getClass();
            j6.s sVar = new j6.s(mw1Var, 9, this.f11171w.a(gu1Var.f6460b, yx1Var));
            int i = vx1Var.f12063a;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            return;
                        }
                        this.K = sVar;
                        return;
                    }
                } else {
                    this.J = sVar;
                    return;
                }
            }
            this.I = sVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.hu1
    public final void o(ns1 ns1Var) {
        this.H = ns1Var;
    }

    public final void q(gu1 gu1Var, String str) {
        yx1 yx1Var = gu1Var.f6462d;
        if ((yx1Var == null || !yx1Var.b()) && str.equals(this.D)) {
            k();
        }
        this.B.remove(str);
        this.C.remove(str);
    }

    public final boolean r(j6.s sVar) {
        String str;
        if (sVar != null) {
            mu1 mu1Var = this.f11171w;
            String str2 = (String) sVar.f18982w;
            synchronized (mu1Var) {
                str = mu1Var.f8433f;
            }
            if (str2.equals(str)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.hu1
    public final void n(IOException iOException) {
    }
}
