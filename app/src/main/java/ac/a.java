package ac;
import b.a;

import android.app.Application;
import android.content.Context;
import android.media.MediaFormat;
import android.media.MediaPlayer;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackMetrics;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import androidx.work.Worker;
import b2.d2;
import ba.n;
import c0.z;
import c7.c;
import c7.e0;
import c7.f;
import c7.k;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.internal.ads.af0;
import com.google.android.gms.internal.ads.at0;
import com.google.android.gms.internal.ads.bj0;
import com.google.android.gms.internal.ads.bq0;
import com.google.android.gms.internal.ads.ct;
import com.google.android.gms.internal.ads.dt0;
import com.google.android.gms.internal.ads.e40;
import com.google.android.gms.internal.ads.fe0;
import com.google.android.gms.internal.ads.fi;
import com.google.android.gms.internal.ads.g30;
import com.google.android.gms.internal.ads.gi;
import com.google.android.gms.internal.ads.gl;
import com.google.android.gms.internal.ads.gu1;
import com.google.android.gms.internal.ads.h00;
import com.google.android.gms.internal.ads.hg;
import com.google.android.gms.internal.ads.hr0;
import com.google.android.gms.internal.ads.hs1;
import com.google.android.gms.internal.ads.hy;
import com.google.android.gms.internal.ads.ik0;
import com.google.android.gms.internal.ads.io0;
import com.google.android.gms.internal.ads.k60;
import com.google.android.gms.internal.ads.ki;
import com.google.android.gms.internal.ads.kp0;
import com.google.android.gms.internal.ads.kr0;
import com.google.android.gms.internal.ads.ku1;
import com.google.android.gms.internal.ads.ly;
import com.google.android.gms.internal.ads.mf;
import com.google.android.gms.internal.ads.na0;
import com.google.android.gms.internal.ads.nb;
import com.google.android.gms.internal.ads.oo0;
import com.google.android.gms.internal.ads.p20;
import com.google.android.gms.internal.ads.p8;
import com.google.android.gms.internal.ads.pu;
import com.google.android.gms.internal.ads.qh;
import com.google.android.gms.internal.ads.qh0;
import com.google.android.gms.internal.ads.qs1;
import com.google.android.gms.internal.ads.rs1;
import com.google.android.gms.internal.ads.s00;
import com.google.android.gms.internal.ads.sl;
import com.google.android.gms.internal.ads.su1;
import com.google.android.gms.internal.ads.t81;
import com.google.android.gms.internal.ads.to0;
import com.google.android.gms.internal.ads.tt0;
import com.google.android.gms.internal.ads.uv0;
import com.google.android.gms.internal.ads.vt0;
import com.google.android.gms.internal.ads.vy;
import com.google.android.gms.internal.ads.w91;
import com.google.android.gms.internal.ads.xt0;
import com.google.android.gms.internal.ads.xx;
import com.google.android.gms.internal.ads.y01;
import com.google.android.gms.internal.ads.y51;
import com.google.android.gms.internal.ads.yx;
import com.google.android.gms.internal.ads.yx1;
import com.google.android.gms.internal.mlkit_vision_digital_ink.ra;
import com.google.android.gms.internal.play_billing.p;
import com.google.android.gms.internal.play_billing.r;
import com.google.android.gms.internal.play_billing.t;
import eb.b3;
import eb.d1;
import eb.t1;
import eb.v;
import g9.p0;
import g9.y1;
import i0.m;
import j6.l;
import j6.s;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import k9.a0;
import l6.j;
import l9.i;
import org.json.JSONObject;
import ya.y;

/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f363u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f364v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f365w;

    public a(dt0 dt0Var, y1 y1Var) {
        this.f363u = 25;
        this.f364v = y1Var;
        Objects.requireNonNull(dt0Var);
        this.f365w = dt0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MediaPlayer.TrackInfo[] trackInfoArr;
        String str;
        MediaFormat format;
        int i = 3;
        int i10 = 9;
        int i11 = 0;
        int i12 = 1;
        Application application = null;
        switch (this.f363u) {
            case 0:
                m mVar = (m) this.f365w;
                try {
                    jb.b.a((b) this.f364v);
                    b3 b3Var = (b3) mVar.f18055w;
                    String str2 = b3Var.f16070u;
                    t1 t1Var = (t1) mVar.f18054v;
                    t1Var.u();
                    if (((d1) t1Var.f3443v).A.F(null, v.E0)) {
                        SparseArray E = t1Var.s().E();
                        E.put(b3Var.f16072w, Long.valueOf(b3Var.f16071v));
                        t1Var.s().y(E);
                        t1Var.D = false;
                        t1Var.E = 1;
                        t1Var.f().H.f(str2, "Successfully registered trigger URI");
                        t1Var.Y();
                        return;
                    }
                    t1Var.D = false;
                    t1Var.Y();
                    t1Var.f().H.f(str2, "registerTriggerAsync ran. uri");
                    return;
                } catch (Error e) {
                    e = e;
                    mVar.l(e);
                    return;
                } catch (RuntimeException e8) {
                    e = e8;
                    mVar.l(e);
                    return;
                } catch (ExecutionException e10) {
                    mVar.l(e10.getCause());
                    return;
                }
            case 1:
                j jVar = (j) this.f364v;
                try {
                    jVar.j(((Worker) this.f365w).getForegroundInfo());
                    return;
                } catch (Throwable th) {
                    jVar.l(th);
                    return;
                }
            case 2:
                n nVar = (n) this.f364v;
                IBinder iBinder = (IBinder) this.f365w;
                synchronized (nVar) {
                    if (iBinder == null) {
                        nVar.a("Null service connection");
                    } else {
                        try {
                            nVar.f3147w = new l(iBinder);
                            nVar.f3145u = 2;
                            ((ScheduledExecutorService) nVar.f3150z.f3159w).execute(new ba.l(nVar, i11));
                        } catch (RemoteException e11) {
                            nVar.a(e11.getMessage());
                        }
                    }
                }
                return;
            case 3:
                c cVar = (c) this.f364v;
                f fVar = (f) this.f365w;
                c7.l lVar = (c7.l) cVar.f3907f.f3438w;
                z zVar = cVar.f3907f;
                if (lVar != null) {
                    ((c7.l) zVar.f3438w).d(fVar, null);
                    return;
                } else {
                    t.h("BillingClient", "No valid listener is set in BroadcastManager");
                    return;
                }
            case 4:
                c cVar2 = (c) this.f364v;
                k kVar = (k) this.f365w;
                f fVar2 = e0.f3938k;
                cVar2.B(24, 9, fVar2);
                p pVar = r.f15518v;
                kVar.c(fVar2, com.google.android.gms.internal.play_billing.v.f15535y);
                return;
            case 5:
                s sVar = (s) this.f364v;
                hs1 hs1Var = (hs1) this.f365w;
                synchronized (hs1Var) {
                }
                String str3 = bq0.f4860a;
                ku1 ku1Var = ((rs1) sVar.f18982w).f10282u.L;
                gu1 t3 = ku1Var.t((yx1) ku1Var.f7884d.e);
                ku1Var.p(t3, 1020, new to0(t3, hs1Var, 12));
                return;
            case 6:
                ki kiVar = (ki) this.f365w;
                View view = (View) this.f364v;
                kiVar.getClass();
                try {
                    fi fiVar = new fi(kiVar.f7760z, kiVar.A, kiVar.B, kiVar.C, kiVar.D, kiVar.E, kiVar.F, kiVar.I);
                    mf mfVar = f9.k.C.f16816g;
                    synchronized (mfVar.f8337v) {
                        try {
                            gi giVar = (gi) mfVar.f8338w;
                            if (giVar != null) {
                                application = giVar.f6401v;
                            }
                        } finally {
                        }
                    }
                    if (application != null) {
                        String str4 = kiVar.G;
                        if (!TextUtils.isEmpty(str4)) {
                            String str5 = (String) view.getTag(application.getResources().getIdentifier((String) g9.r.e.f17698c.a(sl.F0), FacebookMediationAdapter.KEY_ID, application.getPackageName()));
                            if (str5 != null && str5.equals(str4)) {
                                return;
                            }
                        }
                    }
                    com.google.android.filament.k a10 = kiVar.a(view, fiVar);
                    fiVar.b();
                    if (a10.f4254a != 0 || a10.f4255b != 0) {
                        int i13 = a10.f4255b;
                        if (i13 != 0 || fiVar.f6074k != 0) {
                            if (i13 == 0) {
                                nb nbVar = kiVar.f7758x;
                                synchronized (nbVar.f8635v) {
                                    try {
                                        if (((LinkedList) nbVar.f8636w).contains(fiVar)) {
                                            return;
                                        }
                                    } finally {
                                    }
                                }
                            }
                            kiVar.f7758x.o(fiVar);
                            return;
                        }
                        return;
                    }
                    return;
                } catch (Exception e12) {
                    int i14 = a0.f19634b;
                    i.d("Exception in fetchContentOnUIThread", e12);
                    f9.k.C.f16817h.d("ContentFetchTask.fetchContent", e12);
                    return;
                }
            case 7:
                ((l9.l) this.f364v).a(null, (String) this.f365w);
                return;
            case 8:
                hy hyVar = (hy) this.f365w;
                MediaPlayer mediaPlayer = (MediaPlayer) this.f364v;
                String str6 = "height";
                h00 h00Var = hyVar.f6922w;
                if (((Boolean) g9.r.e.f17698c.a(sl.f11010x2)).booleanValue() && h00Var != null && mediaPlayer != null) {
                    try {
                        MediaPlayer.TrackInfo[] trackInfo = mediaPlayer.getTrackInfo();
                        if (trackInfo != null) {
                            HashMap hashMap = new HashMap();
                            while (i11 < trackInfo.length) {
                                MediaPlayer.TrackInfo trackInfo2 = trackInfo[i11];
                                if (trackInfo2 == null) {
                                    trackInfoArr = trackInfo;
                                } else {
                                    int trackType = trackInfo2.getTrackType();
                                    trackInfoArr = trackInfo;
                                    if (trackType != i12) {
                                        if (trackType == 2 && (format = trackInfo2.getFormat()) != null) {
                                            if (format.containsKey("mime")) {
                                                hashMap.put("audioMime", format.getString("mime"));
                                            }
                                            if (Build.VERSION.SDK_INT >= 30 && format.containsKey("codecs-string")) {
                                                hashMap.put("audioCodec", format.getString("codecs-string"));
                                            }
                                        }
                                    } else {
                                        MediaFormat format2 = trackInfo2.getFormat();
                                        if (format2 != null) {
                                            if (format2.containsKey("frame-rate")) {
                                                try {
                                                    hashMap.put("frameRate", String.valueOf(format2.getFloat("frame-rate")));
                                                } catch (ClassCastException unused) {
                                                    hashMap.put("frameRate", String.valueOf(format2.getInteger("frame-rate")));
                                                }
                                            }
                                            if (format2.containsKey("bitrate")) {
                                                Integer valueOf = Integer.valueOf(format2.getInteger("bitrate"));
                                                hyVar.M = valueOf;
                                                hashMap.put("bitRate", String.valueOf(valueOf));
                                            }
                                            if (format2.containsKey("width") && format2.containsKey(str6)) {
                                                int integer = format2.getInteger("width");
                                                int integer2 = format2.getInteger(str6);
                                                str = str6;
                                                StringBuilder sb2 = new StringBuilder(g3.a.d(integer, 1) + String.valueOf(integer2).length());
                                                sb2.append(integer);
                                                sb2.append("x");
                                                sb2.append(integer2);
                                                hashMap.put("resolution", sb2.toString());
                                            } else {
                                                str = str6;
                                            }
                                            if (format2.containsKey("mime")) {
                                                hashMap.put("videoMime", format2.getString("mime"));
                                            }
                                            if (Build.VERSION.SDK_INT >= 30 && format2.containsKey("codecs-string")) {
                                                hashMap.put("videoCodec", format2.getString("codecs-string"));
                                            }
                                            i11++;
                                            trackInfo = trackInfoArr;
                                            str6 = str;
                                            i12 = 1;
                                        }
                                    }
                                }
                                str = str6;
                                i11++;
                                trackInfo = trackInfoArr;
                                str6 = str;
                                i12 = 1;
                            }
                            if (!hashMap.isEmpty()) {
                                h00Var.b("onMetadataEvent", hashMap);
                            }
                        }
                    } catch (RuntimeException e13) {
                        f9.k.C.f16817h.d("AdMediaPlayerView.reportMetadata", e13);
                    }
                }
                ly lyVar = hyVar.K;
                if (lyVar != null) {
                    lyVar.e();
                    return;
                }
                return;
            case 9:
                vy vyVar = (vy) this.f364v;
                String str7 = (String) this.f365w;
                ly lyVar2 = vyVar.A;
                if (lyVar2 != null) {
                    lyVar2.c("error", "what", "ExoPlayerAdapter error", "extra", str7);
                    return;
                }
                return;
            case 10:
                ((s00) this.f364v).C((String) this.f365w);
                return;
            case 11:
                xx.f12655f.execute(new t81((p20) this.f364v, 13, (Runnable) this.f365w));
                return;
            case 12:
                g30 g30Var = (g30) this.f364v;
                Throwable th2 = (Throwable) this.f365w;
                boolean booleanValue = ((Boolean) g9.r.e.f17698c.a(sl.Jb)).booleanValue();
                Context context = g30Var.f6280a;
                if (booleanValue) {
                    pu.e(context).c("AttributionReporting.getUpdatedUrlAndRegisterSource", th2);
                    return;
                } else {
                    pu.a(context).c("AttributionReportingSampled.getUpdatedUrlAndRegisterSource", th2);
                    return;
                }
            case 13:
                d2 d2Var = (d2) this.f364v;
                Integer num = (Integer) this.f365w;
                if (d2Var.f1436a == 0) {
                    d2Var.f(num);
                    return;
                }
                return;
            case 14:
                d2 d2Var2 = (d2) this.f364v;
                Object apply = ((qs1) this.f365w).apply(d2Var2.f1440f);
                d2Var2.f1440f = apply;
                ra raVar = new ra(d2Var2, 15, apply);
                io0 io0Var = (io0) d2Var2.f1438c;
                if (io0Var.f7185a.getLooper().getThread().isAlive()) {
                    io0Var.e(raVar);
                    return;
                }
                return;
            case 15:
                y51 y51Var = na0.J;
                ((h00) this.f364v).c("onVideoEvent", (JSONObject) this.f365w);
                return;
            case 16:
                ((fe0) this.f364v).f6048d.a(null, (String) this.f365w);
                return;
            case 17:
                ((af0) this.f364v).i.execute(new e40(i10, (yx) this.f365w));
                return;
            case 18:
                if (((Boolean) g9.r.e.f17698c.a(sl.f10760h6)).booleanValue() && ct.D.f8992v) {
                    View view2 = (View) this.f365w;
                    tt0 tt0Var = (tt0) this.f364v;
                    vt0 vt0Var = vt0.f11982u;
                    if (!tt0Var.f11441f) {
                        tt0Var.f11438b.a(view2, vt0Var);
                        return;
                    }
                    return;
                }
                return;
            case 19:
                xt0 xt0Var = (xt0) this.f364v;
                View view3 = (View) this.f365w;
                vt0 vt0Var2 = vt0.f11982u;
                for (tt0 tt0Var2 : xt0Var.f12623d.values()) {
                    if (!tt0Var2.f11441f) {
                        tt0Var2.f11438b.a(view3, vt0Var2);
                    }
                }
                xt0Var.e.a(view3, vt0Var2);
                return;
            case 20:
                ik0 ik0Var = (ik0) ((hg) this.f364v).f6806b;
                Context context2 = (Context) this.f365w;
                ik0Var.getClass();
                ConnectivityManager connectivityManager = (ConnectivityManager) context2.getSystemService("connectivity");
                if (connectivityManager != null) {
                    try {
                        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                            i = 1;
                        } else {
                            int type = activeNetworkInfo.getType();
                            if (type != 0) {
                                if (type != 1) {
                                    if (type != 4 && type != 5) {
                                        if (type != 6) {
                                            if (type != 9) {
                                                i = 8;
                                            } else {
                                                i = 7;
                                            }
                                        }
                                        i = 5;
                                    }
                                }
                                i = 2;
                            }
                            switch (activeNetworkInfo.getSubtype()) {
                                case 1:
                                case 2:
                                    break;
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 14:
                                case 15:
                                case 17:
                                    i = 4;
                                    break;
                                case 13:
                                    i = 5;
                                    break;
                                case 16:
                                case 19:
                                default:
                                    i = 6;
                                    break;
                                case 18:
                                    i = 2;
                                    break;
                                case 20:
                                    if (Build.VERSION.SDK_INT >= 29) {
                                        i = 9;
                                        break;
                                    }
                                    break;
                            }
                        }
                    } catch (SecurityException unused2) {
                    }
                    if (Build.VERSION.SDK_INT < 31 && i == 5) {
                        try {
                            TelephonyManager telephonyManager = (TelephonyManager) context2.getSystemService("phone");
                            if (telephonyManager != null) {
                                qh0 qh0Var = new qh0(ik0Var);
                                telephonyManager.registerTelephonyCallback(ik0Var.f7154a, qh0Var);
                                telephonyManager.unregisterTelephonyCallback(qh0Var);
                                return;
                            }
                            throw null;
                        } catch (RuntimeException unused3) {
                            ik0Var.c(5);
                            return;
                        }
                    }
                    ik0Var.c(i);
                    return;
                }
                i = 0;
                if (Build.VERSION.SDK_INT < 31) {
                }
                ik0Var.c(i);
                return;
            case gl.zzm /* 21 */:
                ((oo0) this.f364v).f9175d.x((y1) this.f365w);
                return;
            case 22:
                ((kp0) ((p8) this.f364v).f9423z).f7837d.x((y1) this.f365w);
                return;
            case 23:
                ((kr0) ((k60) this.f364v).f7670f).f7853c.P1(new to0(i12, (hr0) this.f365w));
                return;
            case 24:
                ((at0) this.f364v).n((dt0) this.f365w, 1);
                return;
            case 25:
                dt0 dt0Var = (dt0) this.f365w;
                y1 y1Var = (y1) this.f364v;
                p0 p0Var = dt0Var.i;
                if (p0Var != null) {
                    try {
                        String str8 = dt0Var.f5503l;
                        Parcel g22 = p0Var.g2();
                        g22.writeString(str8);
                        qh.c(g22, y1Var);
                        p0Var.v2(g22, 3);
                        return;
                    } catch (RemoteException unused4) {
                        int i15 = a0.f19634b;
                        i.f("Failed to call onAdFailedToPreload");
                        return;
                    }
                }
                return;
            case 26:
                y01 y01Var = (y01) this.f364v;
                uv0 uv0Var = (uv0) this.f365w;
                if (y01Var.f12702a.a(uv0Var)) {
                    y01Var.f12706f.set("2.904631200.".concat(String.valueOf(uv0Var.f11729a.z())));
                    return;
                }
                throw new ab.b(2);
            case 27:
                bj0 bj0Var = (bj0) this.f364v;
                try {
                    ((Runnable) this.f365w).run();
                    return;
                } catch (RuntimeException e14) {
                    ((w91) bj0Var.f4807x).d("error caused by ", e14);
                    return;
                }
            case 28:
                ((su1) this.f364v).f11172x.reportNetworkEvent((NetworkEvent) this.f365w);
                return;
            default:
                ((su1) this.f364v).f11172x.reportPlaybackMetrics((PlaybackMetrics) this.f365w);
                return;
        }
    }

    public String toString() {
        switch (this.f363u) {
            case 0:
                y yVar = new y(a.class.getSimpleName());
                m mVar = (m) this.f365w;
                j6.c cVar = new j6.c(18);
                ((j6.c) yVar.f31593x).f18915w = cVar;
                yVar.f31593x = cVar;
                cVar.f18914v = mVar;
                return yVar.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ a(Object obj, int i, Object obj2) {
        this.f363u = i;
        this.f364v = obj;
        this.f365w = obj2;
    }

    public /* synthetic */ a(int i, Object obj, Object obj2, boolean z3) {
        this.f363u = i;
        this.f365w = obj;
        this.f364v = obj2;
    }
}
