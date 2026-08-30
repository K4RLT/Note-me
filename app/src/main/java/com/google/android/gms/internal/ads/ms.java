package com.google.android.gms.internal.ads;
import c9.g;
import g5.q;
import g9.z1;
import j8.c;
import j8.e;
import n9.z;
import oa.a;
import oa.b;
import q.b;
import q9.c;
import q9.d;
import z8.s;

import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdOptionsViewPosition;
import com.facebook.ads.NativeBannerAd;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class ms extends ph implements gs {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f8406u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f8407v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ms(int i, Object obj) {
        super("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
        this.f8406u = i;
        this.f8407v = obj;
    }

    @Override // com.google.android.gms.internal.ads.gs
    public final void A0() {
        switch (this.f8406u) {
            case 0:
                ((n9.z) this.f8407v).getClass();
                return;
            default:
                ((com.google.ads.mediation.a) this.f8407v).getClass();
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.gs
    public final boolean H1() {
        switch (this.f8406u) {
            case 0:
                return ((n9.z) this.f8407v).i;
            default:
                return ((com.google.ads.mediation.a) this.f8407v).f4202n;
        }
    }

    @Override // com.google.android.gms.internal.ads.gs
    public final float L() {
        switch (this.f8406u) {
            case 0:
                ((n9.z) this.f8407v).getClass();
                return 0.0f;
            default:
                ((com.google.ads.mediation.a) this.f8407v).getClass();
                return 0.0f;
        }
    }

    @Override // com.google.android.gms.internal.ads.gs
    public final Bundle L3() {
        switch (this.f8406u) {
            case 0:
                return ((n9.z) this.f8407v).f21219h;
            default:
                return ((com.google.ads.mediation.a) this.f8407v).f4200l;
        }
    }

    @Override // com.google.android.gms.internal.ads.gs
    public final boolean M() {
        switch (this.f8406u) {
            case 0:
                ((n9.z) this.f8407v).getClass();
                return false;
            default:
                return ((com.google.ads.mediation.a) this.f8407v).f4201m;
        }
    }

    @Override // com.google.android.gms.internal.ads.gs
    public final void V(oa.a aVar) {
        switch (this.f8406u) {
            case 0:
                ((n9.z) this.f8407v).getClass();
                return;
            default:
                ((com.google.ads.mediation.a) this.f8407v).getClass();
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.gs
    public final void V2(oa.a aVar, oa.a aVar2, oa.a aVar3) {
        switch (this.f8406u) {
            case 0:
                HashMap hashMap = (HashMap) oa.b.z1(aVar2);
                View view = (View) oa.b.z1(aVar);
                j8.e eVar = (j8.e) ((n9.z) this.f8407v);
                eVar.i = true;
                ArrayList arrayList = new ArrayList(hashMap.values());
                View view2 = (View) hashMap.get("3003");
                NativeAdBase nativeAdBase = eVar.f19050k;
                if (nativeAdBase instanceof NativeBannerAd) {
                    if (view2 == null) {
                        Log.w(FacebookMediationAdapter.TAG, "Missing or invalid native ad icon asset. Meta Audience Network impression recording might be impacted for this ad.");
                        return;
                    }
                    if (!(view2 instanceof ImageView)) {
                        Log.w(FacebookMediationAdapter.TAG, "Native ad icon asset is rendered with an incompatible class type. Meta Audience Network impression recording might be impacted for this ad. Expected: ImageView, actual: " + view2.getClass() + ".");
                        return;
                    }
                    NativeBannerAd nativeBannerAd = (NativeBannerAd) nativeAdBase;
                    q9.d dVar = eVar.f19053n;
                    if (dVar != null) {
                        int i = dVar.f23614d;
                        if (i != 0) {
                            if (i != 1) {
                                if (i != 2) {
                                    if (i == 3) {
                                        nativeBannerAd.setPreferredAdOptionsViewPosition(NativeAdOptionsViewPosition.BOTTOM_LEFT);
                                    }
                                } else {
                                    nativeBannerAd.setPreferredAdOptionsViewPosition(NativeAdOptionsViewPosition.BOTTOM_RIGHT);
                                }
                            } else {
                                nativeBannerAd.setPreferredAdOptionsViewPosition(NativeAdOptionsViewPosition.TOP_RIGHT);
                            }
                        } else {
                            nativeBannerAd.setPreferredAdOptionsViewPosition(NativeAdOptionsViewPosition.TOP_LEFT);
                        }
                    }
                    nativeBannerAd.registerViewForInteraction(view, (ImageView) view2, arrayList);
                    return;
                }
                if (nativeAdBase instanceof NativeAd) {
                    NativeAd nativeAd = (NativeAd) nativeAdBase;
                    q9.d dVar2 = eVar.f19053n;
                    if (dVar2 != null) {
                        int i10 = dVar2.f23614d;
                        if (i10 != 0) {
                            if (i10 != 1) {
                                if (i10 != 2) {
                                    if (i10 == 3) {
                                        nativeAd.setPreferredAdOptionsViewPosition(NativeAdOptionsViewPosition.BOTTOM_LEFT);
                                    }
                                } else {
                                    nativeAd.setPreferredAdOptionsViewPosition(NativeAdOptionsViewPosition.BOTTOM_RIGHT);
                                }
                            } else {
                                nativeAd.setPreferredAdOptionsViewPosition(NativeAdOptionsViewPosition.TOP_RIGHT);
                            }
                        } else {
                            nativeAd.setPreferredAdOptionsViewPosition(NativeAdOptionsViewPosition.TOP_LEFT);
                        }
                    }
                    if (view2 instanceof ImageView) {
                        nativeAd.registerViewForInteraction(view, eVar.f19052m, (ImageView) view2, arrayList);
                        return;
                    } else {
                        Log.w(FacebookMediationAdapter.TAG, "Native icon asset is not of type ImageView. Calling registerViewForInteraction() without a reference to the icon view.");
                        nativeAd.registerViewForInteraction(view, eVar.f19052m, arrayList);
                        return;
                    }
                }
                Log.w(FacebookMediationAdapter.TAG, "Native ad type is not of type NativeAd or NativeBannerAd. It is not currently supported by the Meta Audience Network Adapter. Meta Audience Network impression recording might be impacted for this ad.");
                return;
            default:
                View view3 = (View) oa.b.z1(aVar);
                ((com.google.ads.mediation.a) this.f8407v).getClass();
                if (c9.g.f4017a.get(view3) != null) {
                    g5.q.b();
                    return;
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.gs
    public final String a() {
        switch (this.f8406u) {
            case 0:
                return ((n9.z) this.f8407v).f21213a;
            default:
                return ((com.google.ads.mediation.a) this.f8407v).f4191a;
        }
    }

    @Override // com.google.android.gms.internal.ads.gs
    public final void a3() {
        switch (this.f8406u) {
            case 0:
                ((n9.z) this.f8407v).getClass();
                return;
            default:
                ((com.google.ads.mediation.a) this.f8407v).getClass();
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.gs
    public final List b() {
        switch (this.f8406u) {
            case 0:
                ArrayList arrayList = ((n9.z) this.f8407v).f21214b;
                ArrayList arrayList2 = new ArrayList();
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        q9.c cVar = (q9.c) obj;
                        arrayList2.add(new pn(cVar.a(), cVar.c(), cVar.b(), cVar.d(), cVar.e(), null));
                    }
                }
                return arrayList2;
            default:
                List<ao> list = ((com.google.ads.mediation.a) this.f8407v).f4192b;
                ArrayList arrayList3 = new ArrayList();
                if (list != null) {
                    for (ao aoVar : list) {
                        arrayList3.add(new pn(aoVar.f4561b, aoVar.f4562c, aoVar.f4563d, aoVar.e, aoVar.f4564f, null));
                    }
                }
                return arrayList3;
        }
    }

    @Override // com.google.android.gms.internal.ads.gs
    public final zn d() {
        switch (this.f8406u) {
            case 0:
                j8.c cVar = ((n9.z) this.f8407v).f21216d;
                if (cVar != null) {
                    return new pn(cVar.f19045a, cVar.f19046b, 1.0d, -1, -1, null);
                }
                return null;
            default:
                ao aoVar = ((com.google.ads.mediation.a) this.f8407v).f4194d;
                if (aoVar != null) {
                    return new pn(aoVar.f4561b, aoVar.f4562c, aoVar.f4563d, aoVar.e, aoVar.f4564f, null);
                }
                return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.gs
    public final float d0() {
        switch (this.f8406u) {
            case 0:
                ((n9.z) this.f8407v).getClass();
                return 0.0f;
            default:
                ((com.google.ads.mediation.a) this.f8407v).getClass();
                return 0.0f;
        }
    }

    @Override // com.google.android.gms.internal.ads.gs
    public final String e() {
        switch (this.f8406u) {
            case 0:
                return ((n9.z) this.f8407v).f21215c;
            default:
                return ((com.google.ads.mediation.a) this.f8407v).f4193c;
        }
    }

    @Override // com.google.android.gms.internal.ads.gs
    public final String f() {
        switch (this.f8406u) {
            case 0:
                return ((n9.z) this.f8407v).f21217f;
            default:
                return ((com.google.ads.mediation.a) this.f8407v).f4195f;
        }
    }

    @Override // com.google.android.gms.internal.ads.gs
    public final String g() {
        switch (this.f8406u) {
            case 0:
                return ((n9.z) this.f8407v).e;
            default:
                return ((com.google.ads.mediation.a) this.f8407v).e;
        }
    }

    @Override // com.google.android.gms.internal.ads.gs
    public final String h() {
        switch (this.f8406u) {
            case 0:
                ((n9.z) this.f8407v).getClass();
                return null;
            default:
                return ((com.google.ads.mediation.a) this.f8407v).f4197h;
        }
    }

    @Override // com.google.android.gms.internal.ads.gs
    public final double i() {
        switch (this.f8406u) {
            case 0:
                ((n9.z) this.f8407v).getClass();
                return -1.0d;
            default:
                Double d2 = ((com.google.ads.mediation.a) this.f8407v).f4196g;
                if (d2 != null) {
                    return d2.doubleValue();
                }
                return -1.0d;
        }
    }

    @Override // com.google.android.gms.internal.ads.gs
    public final oa.a j() {
        switch (this.f8406u) {
            case 0:
                View view = ((n9.z) this.f8407v).f21218g;
                if (view == null) {
                    return null;
                }
                return new oa.b(view);
            default:
                ((com.google.ads.mediation.a) this.f8407v).getClass();
                return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.gs
    public final String m() {
        switch (this.f8406u) {
            case 0:
                ((n9.z) this.f8407v).getClass();
                return null;
            default:
                return ((com.google.ads.mediation.a) this.f8407v).i;
        }
    }

    @Override // com.google.android.gms.internal.ads.gs
    public final g9.z1 n() {
        g9.z1 z1Var;
        switch (this.f8406u) {
            case 0:
                return null;
            default:
                z8.s sVar = ((com.google.ads.mediation.a) this.f8407v).f4198j;
                if (sVar != null) {
                    synchronized (sVar.f32003a) {
                        z1Var = sVar.f32004b;
                    }
                    return z1Var;
                }
                return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.gs
    public final un p() {
        switch (this.f8406u) {
            case 0:
                return null;
            default:
                return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.gs
    public final void p1(oa.a aVar) {
        switch (this.f8406u) {
            case 0:
                j8.e eVar = (j8.e) ((n9.z) this.f8407v);
                NativeAdBase nativeAdBase = eVar.f19050k;
                if (nativeAdBase != null) {
                    nativeAdBase.unregisterView();
                    eVar.f19050k.destroy();
                    eVar.f19050k = null;
                }
                MediaView mediaView = eVar.f19052m;
                if (mediaView != null) {
                    mediaView.destroy();
                    eVar.f19052m = null;
                    return;
                }
                return;
            default:
                ((com.google.ads.mediation.a) this.f8407v).getClass();
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.gs
    public final oa.a q() {
        switch (this.f8406u) {
            case 0:
                ((n9.z) this.f8407v).getClass();
                return null;
            default:
                ((com.google.ads.mediation.a) this.f8407v).getClass();
                return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.gs
    public final float s() {
        switch (this.f8406u) {
            case 0:
                ((n9.z) this.f8407v).getClass();
                return 0.0f;
            default:
                ((com.google.ads.mediation.a) this.f8407v).getClass();
                return 0.0f;
        }
    }

    @Override // com.google.android.gms.internal.ads.ph
    public final boolean u4(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 2:
                String a10 = a();
                parcel2.writeNoException();
                parcel2.writeString(a10);
                return true;
            case 3:
                List b10 = b();
                parcel2.writeNoException();
                parcel2.writeList(b10);
                return true;
            case 4:
                String e = e();
                parcel2.writeNoException();
                parcel2.writeString(e);
                return true;
            case 5:
                zn d2 = d();
                parcel2.writeNoException();
                qh.e(parcel2, d2);
                return true;
            case 6:
                String g8 = g();
                parcel2.writeNoException();
                parcel2.writeString(g8);
                return true;
            case 7:
                String f10 = f();
                parcel2.writeNoException();
                parcel2.writeString(f10);
                return true;
            case 8:
                double i10 = i();
                parcel2.writeNoException();
                parcel2.writeDouble(i10);
                return true;
            case 9:
                String h3 = h();
                parcel2.writeNoException();
                parcel2.writeString(h3);
                return true;
            case 10:
                String m4 = m();
                parcel2.writeNoException();
                parcel2.writeString(m4);
                return true;
            case 11:
                g9.z1 n10 = n();
                parcel2.writeNoException();
                qh.e(parcel2, n10);
                return true;
            case 12:
                parcel2.writeNoException();
                ClassLoader classLoader = qh.f9846a;
                parcel2.writeStrongBinder(null);
                return true;
            case 13:
                oa.a q10 = q();
                parcel2.writeNoException();
                qh.e(parcel2, q10);
                return true;
            case 14:
                oa.a j10 = j();
                parcel2.writeNoException();
                qh.e(parcel2, j10);
                return true;
            case 15:
                oa.a v2 = v();
                parcel2.writeNoException();
                qh.e(parcel2, v2);
                return true;
            case 16:
                Bundle L3 = L3();
                parcel2.writeNoException();
                qh.d(parcel2, L3);
                return true;
            case 17:
                boolean M = M();
                parcel2.writeNoException();
                ClassLoader classLoader2 = qh.f9846a;
                parcel2.writeInt(M ? 1 : 0);
                return true;
            case 18:
                boolean H1 = H1();
                parcel2.writeNoException();
                ClassLoader classLoader3 = qh.f9846a;
                parcel2.writeInt(H1 ? 1 : 0);
                return true;
            case 19:
                A0();
                parcel2.writeNoException();
                return true;
            case 20:
                oa.a v12 = oa.b.v1(parcel.readStrongBinder());
                qh.f(parcel);
                V(v12);
                parcel2.writeNoException();
                return true;
            case gl.zzm /* 21 */:
                oa.a v13 = oa.b.v1(parcel.readStrongBinder());
                oa.a v14 = oa.b.v1(parcel.readStrongBinder());
                oa.a v15 = oa.b.v1(parcel.readStrongBinder());
                qh.f(parcel);
                V2(v13, v14, v15);
                parcel2.writeNoException();
                return true;
            case 22:
                oa.a v16 = oa.b.v1(parcel.readStrongBinder());
                qh.f(parcel);
                p1(v16);
                parcel2.writeNoException();
                return true;
            case 23:
                float s10 = s();
                parcel2.writeNoException();
                parcel2.writeFloat(s10);
                return true;
            case 24:
                float L = L();
                parcel2.writeNoException();
                parcel2.writeFloat(L);
                return true;
            case 25:
                float d02 = d0();
                parcel2.writeNoException();
                parcel2.writeFloat(d02);
                return true;
            case 26:
                a3();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.gs
    public final oa.a v() {
        switch (this.f8406u) {
            case 0:
                return null;
            default:
                Object obj = ((com.google.ads.mediation.a) this.f8407v).f4199k;
                if (obj == null) {
                    return null;
                }
                return new oa.b(obj);
        }
    }
}
