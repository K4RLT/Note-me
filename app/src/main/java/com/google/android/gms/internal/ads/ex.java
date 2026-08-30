package com.google.android.gms.internal.ads;
import f9.k;
import g9.r;
import k9.a0;
import l9.i;
import m.a;
import m.f;
import m.j;
import oa.a;
import oa.b;
import q.x;
import r.e;
import s9.a;
import s9.b;
import s9.i;
import s9.n;
import s9.o;
import s9.p;
import ya.zb;
import zb.d;

import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class ex extends ph implements fx {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f5848u = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.google.android.gms.internal.ads.oh] */
    @Override // com.google.android.gms.internal.ads.ph
    public final boolean u4(int i, Parcel parcel, Parcel parcel2) {
        oa.b bVar;
        int i10 = 1;
        cx cxVar = null;
        View view = null;
        switch (i) {
            case 1:
                oa.a v12 = oa.b.v1(parcel.readStrongBinder());
                jx jxVar = (jx) qh.b(parcel, jx.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalCallback");
                    if (queryLocalInterface instanceof cx) {
                        cxVar = (cx) queryLocalInterface;
                    } else {
                        cxVar = new oh(readStrongBinder, "com.google.android.gms.ads.internal.signals.ISignalCallback", 0);
                    }
                }
                qh.f(parcel);
                ((s9.i) this).Q3(v12, jxVar, cxVar);
                parcel2.writeNoException();
                return true;
            case 2:
                oa.a v13 = oa.b.v1(parcel.readStrongBinder());
                qh.f(parcel);
                s9.i iVar = (s9.i) this;
                if (((Boolean) g9.r.e.f17698c.a(sl.f11016x8)).booleanValue()) {
                    MotionEvent motionEvent = (MotionEvent) oa.b.z1(v13);
                    nu nuVar = iVar.C;
                    if (nuVar != null) {
                        view = nuVar.f8865u;
                    }
                    int[] iArr = new int[2];
                    if (view != null) {
                        view.getLocationOnScreen(iArr);
                    }
                    iVar.D = new Point(((int) motionEvent.getRawX()) - iArr[0], ((int) motionEvent.getRawY()) - iArr[1]);
                    if (motionEvent.getAction() == 0) {
                        iVar.E = iVar.D;
                    }
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    Point point = iVar.D;
                    obtain.setLocation(point.x, point.y);
                    iVar.f25072x.f9103b.b(obtain);
                    obtain.recycle();
                }
                parcel2.writeNoException();
                return true;
            case 3:
                oa.b.v1(parcel.readStrongBinder());
                oa.b.v1(parcel.readStrongBinder());
                qh.f(parcel);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(null);
                return true;
            case 4:
                oa.b.v1(parcel.readStrongBinder());
                qh.f(parcel);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(null);
                return true;
            case 5:
                ArrayList createTypedArrayList = parcel.createTypedArrayList(Uri.CREATOR);
                oa.a v14 = oa.b.v1(parcel.readStrongBinder());
                ku v4 = ju.v4(parcel.readStrongBinder());
                qh.f(parcel);
                ((s9.i) this).v4(createTypedArrayList, v14, v4, false);
                parcel2.writeNoException();
                return true;
            case 6:
                ArrayList createTypedArrayList2 = parcel.createTypedArrayList(Uri.CREATOR);
                oa.a v15 = oa.b.v1(parcel.readStrongBinder());
                ku v42 = ju.v4(parcel.readStrongBinder());
                qh.f(parcel);
                ((s9.i) this).w4(createTypedArrayList2, v15, v42, false);
                parcel2.writeNoException();
                return true;
            case 7:
                nu nuVar2 = (nu) qh.b(parcel, nu.CREATOR);
                qh.f(parcel);
                s9.i iVar2 = (s9.i) this;
                iVar2.C = nuVar2;
                iVar2.f25074z.a(1);
                parcel2.writeNoException();
                return true;
            case 8:
                oa.a v16 = oa.b.v1(parcel.readStrongBinder());
                qh.f(parcel);
                s9.i iVar3 = (s9.i) this;
                nl nlVar = sl.Wa;
                ql qlVar = g9.r.e.f17698c;
                if (((Boolean) qlVar.a(nlVar)).booleanValue()) {
                    nl nlVar2 = sl.f10983v8;
                    if (!((Boolean) qlVar.a(nlVar2)).booleanValue()) {
                        iVar3.x4();
                    }
                    WebView webView = (WebView) oa.b.z1(v16);
                    if (webView == null) {
                        int i11 = k9.a0.f19634b;
                        l9.i.c("The webView cannot be null.");
                    } else {
                        s9.b bVar2 = iVar3.f25069a0;
                        s9.o oVar = new s9.o(webView, bVar2, xx.f12655f);
                        webView.addJavascriptInterface(new s9.a(webView, iVar3.f25072x, iVar3.F, iVar3.G, iVar3.f25073y, iVar3.Z, bVar2, oVar), "gmaSdk");
                        if (((Boolean) qlVar.a(sl.f10749gb)).booleanValue()) {
                            f9.k.C.f16817h.f9641l.incrementAndGet();
                        }
                        if (((Boolean) bn.f4838c.p()).booleanValue()) {
                            bVar2.a(webView);
                            if (((Boolean) bn.f4839d.p()).booleanValue()) {
                                oVar.f25093d = xx.f12654d.scheduleWithFixedDelay(new s9.n(oVar, i10), 0L, ((Integer) qlVar.a(sl.f10765hb)).intValue(), TimeUnit.MILLISECONDS);
                            }
                        }
                        if (((Boolean) qlVar.a(nlVar2)).booleanValue()) {
                            iVar3.x4();
                        }
                    }
                }
                parcel2.writeNoException();
                return true;
            case 9:
                ArrayList createTypedArrayList3 = parcel.createTypedArrayList(Uri.CREATOR);
                oa.a v17 = oa.b.v1(parcel.readStrongBinder());
                ku v43 = ju.v4(parcel.readStrongBinder());
                qh.f(parcel);
                ((s9.i) this).v4(createTypedArrayList3, v17, v43, true);
                parcel2.writeNoException();
                return true;
            case 10:
                ArrayList createTypedArrayList4 = parcel.createTypedArrayList(Uri.CREATOR);
                oa.a v18 = oa.b.v1(parcel.readStrongBinder());
                ku v44 = ju.v4(parcel.readStrongBinder());
                qh.f(parcel);
                ((s9.i) this).w4(createTypedArrayList4, v18, v44, true);
                parcel2.writeNoException();
                return true;
            case 11:
                oa.a v19 = oa.b.v1(parcel.readStrongBinder());
                oa.a v110 = oa.b.v1(parcel.readStrongBinder());
                String readString = parcel.readString();
                oa.a v111 = oa.b.v1(parcel.readStrongBinder());
                qh.f(parcel);
                s9.i iVar4 = (s9.i) this;
                if (!((Boolean) g9.r.e.f17698c.a(sl.f10812kb)).booleanValue()) {
                    bVar = new oa.b(null);
                } else {
                    Context context = (Context) oa.b.z1(v19);
                    m.f fVar = (m.f) oa.b.z1(v110);
                    m.a aVar = (m.a) oa.b.z1(v111);
                    fm fmVar = iVar4.Y;
                    fmVar.getClass();
                    if (context != null) {
                        if (!TextUtils.isEmpty(readString)) {
                            if (fVar != null) {
                                fmVar.f6116l = context;
                                fmVar.f6113h = readString;
                                fe0 fe0Var = fmVar.f6110d;
                                dm dmVar = new dm(fmVar, aVar, fe0Var);
                                fmVar.f6111f = dmVar;
                                m.j c10 = fVar.c(dmVar);
                                fmVar.f6112g = c10;
                                if (c10 == null) {
                                    int i12 = k9.a0.f19634b;
                                    l9.i.c("CustomTabsClient failed to create new session.");
                                }
                                ya.zb.d(fe0Var, "pact_action", new Pair("pe", "pact_init"));
                                if (((Boolean) bn.e.p()).booleanValue()) {
                                    s9.p pVar = iVar4.Z;
                                    synchronized (pVar) {
                                        pVar.c(true);
                                        pVar.c(false);
                                    }
                                }
                                if (((Boolean) bn.f4838c.p()).booleanValue()) {
                                    iVar4.f25069a0.a(null);
                                }
                                bVar = new oa.b(fmVar.f6112g);
                            } else {
                                q.x.n("CustomTabsClient parameter is null");
                                return false;
                            }
                        } else {
                            q.x.n("Origin parameter is empty or null");
                            return false;
                        }
                    } else {
                        q.x.n("App Context parameter is null");
                        return false;
                    }
                }
                parcel2.writeNoException();
                qh.e(parcel2, bVar);
                return true;
            default:
                return false;
        }
    }
}
