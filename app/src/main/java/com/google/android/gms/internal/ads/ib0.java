package com.google.android.gms.internal.ads;
import c3.a;
import g9.c3;
import k9.a0;
import l9.i;

import android.text.TextUtils;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes.dex */
public final class ib0 {

    /* renamed from: a, reason: collision with root package name */
    public final gd0 f7076a;

    /* renamed from: b, reason: collision with root package name */
    public final rc0 f7077b;

    /* renamed from: c, reason: collision with root package name */
    public final x30 f7078c;

    /* renamed from: d, reason: collision with root package name */
    public final ca0 f7079d;

    public ib0(gd0 gd0Var, rc0 rc0Var, x30 x30Var, ca0 ca0Var) {
        this.f7076a = gd0Var;
        this.f7077b = rc0Var;
        this.f7078c = x30Var;
        this.f7079d = ca0Var;
    }

    public final View a() {
        h00 a10 = this.f7076a.a(g9.c3.a(), null, null);
        a10.U().setVisibility(8);
        final int i = 4;
        a10.h1("/sendMessageToSdk", new mp(this) { // from class: com.google.android.gms.internal.ads.gb0

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ ib0 f6360v;

            {
                this.f6360v = this;
            }

            @Override // com.google.android.gms.internal.ads.mp
            public final void d(Object obj, Map map) {
                int i10 = i;
                ib0 ib0Var = this.f6360v;
                switch (i10) {
                    case 0:
                        ib0Var.f7079d.D();
                        return;
                    case 1:
                        h00 h00Var = (h00) obj;
                        h00Var.j0().A = new com.google.android.gms.internal.mlkit_vision_digital_ink.pw(ib0Var, 6, map);
                        String str = (String) map.get("overlayHtml");
                        String str2 = (String) map.get("baseUrl");
                        if (TextUtils.isEmpty(str2)) {
                            h00Var.loadData(str, "text/html", "UTF-8");
                            return;
                        } else {
                            h00Var.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                            return;
                        }
                    case 2:
                        int i11 = k9.a0.f19634b;
                        l9.i.e("Showing native ads overlay.");
                        ((h00) obj).U().setVisibility(0);
                        ib0Var.f7078c.f12462z = true;
                        return;
                    case 3:
                        int i12 = k9.a0.f19634b;
                        l9.i.e("Hiding native ads overlay.");
                        ((h00) obj).U().setVisibility(8);
                        ib0Var.f7078c.f12462z = false;
                        return;
                    default:
                        ib0Var.f7077b.d(map);
                        return;
                }
            }
        });
        final int i10 = 0;
        a10.h1("/adMuted", new mp(this) { // from class: com.google.android.gms.internal.ads.gb0

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ ib0 f6360v;

            {
                this.f6360v = this;
            }

            @Override // com.google.android.gms.internal.ads.mp
            public final void d(Object obj, Map map) {
                int i102 = i10;
                ib0 ib0Var = this.f6360v;
                switch (i102) {
                    case 0:
                        ib0Var.f7079d.D();
                        return;
                    case 1:
                        h00 h00Var = (h00) obj;
                        h00Var.j0().A = new com.google.android.gms.internal.mlkit_vision_digital_ink.pw(ib0Var, 6, map);
                        String str = (String) map.get("overlayHtml");
                        String str2 = (String) map.get("baseUrl");
                        if (TextUtils.isEmpty(str2)) {
                            h00Var.loadData(str, "text/html", "UTF-8");
                            return;
                        } else {
                            h00Var.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                            return;
                        }
                    case 2:
                        int i11 = k9.a0.f19634b;
                        l9.i.e("Showing native ads overlay.");
                        ((h00) obj).U().setVisibility(0);
                        ib0Var.f7078c.f12462z = true;
                        return;
                    case 3:
                        int i12 = k9.a0.f19634b;
                        l9.i.e("Hiding native ads overlay.");
                        ((h00) obj).U().setVisibility(8);
                        ib0Var.f7078c.f12462z = false;
                        return;
                    default:
                        ib0Var.f7077b.d(map);
                        return;
                }
            }
        });
        WeakReference weakReference = new WeakReference(a10);
        final int i11 = 1;
        mp mpVar = new mp(this) { // from class: com.google.android.gms.internal.ads.gb0

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ ib0 f6360v;

            {
                this.f6360v = this;
            }

            @Override // com.google.android.gms.internal.ads.mp
            public final void d(Object obj, Map map) {
                int i102 = i11;
                ib0 ib0Var = this.f6360v;
                switch (i102) {
                    case 0:
                        ib0Var.f7079d.D();
                        return;
                    case 1:
                        h00 h00Var = (h00) obj;
                        h00Var.j0().A = new com.google.android.gms.internal.mlkit_vision_digital_ink.pw(ib0Var, 6, map);
                        String str = (String) map.get("overlayHtml");
                        String str2 = (String) map.get("baseUrl");
                        if (TextUtils.isEmpty(str2)) {
                            h00Var.loadData(str, "text/html", "UTF-8");
                            return;
                        } else {
                            h00Var.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                            return;
                        }
                    case 2:
                        int i112 = k9.a0.f19634b;
                        l9.i.e("Showing native ads overlay.");
                        ((h00) obj).U().setVisibility(0);
                        ib0Var.f7078c.f12462z = true;
                        return;
                    case 3:
                        int i12 = k9.a0.f19634b;
                        l9.i.e("Hiding native ads overlay.");
                        ((h00) obj).U().setVisibility(8);
                        ib0Var.f7078c.f12462z = false;
                        return;
                    default:
                        ib0Var.f7077b.d(map);
                        return;
                }
            }
        };
        rc0 rc0Var = this.f7077b;
        rc0Var.b("/loadHtml", new ba0(rc0Var, weakReference, "/loadHtml", mpVar));
        final int i12 = 2;
        rc0Var.b("/showOverlay", new ba0(rc0Var, new WeakReference(a10), "/showOverlay", new mp(this) { // from class: com.google.android.gms.internal.ads.gb0

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ ib0 f6360v;

            {
                this.f6360v = this;
            }

            @Override // com.google.android.gms.internal.ads.mp
            public final void d(Object obj, Map map) {
                int i102 = i12;
                ib0 ib0Var = this.f6360v;
                switch (i102) {
                    case 0:
                        ib0Var.f7079d.D();
                        return;
                    case 1:
                        h00 h00Var = (h00) obj;
                        h00Var.j0().A = new com.google.android.gms.internal.mlkit_vision_digital_ink.pw(ib0Var, 6, map);
                        String str = (String) map.get("overlayHtml");
                        String str2 = (String) map.get("baseUrl");
                        if (TextUtils.isEmpty(str2)) {
                            h00Var.loadData(str, "text/html", "UTF-8");
                            return;
                        } else {
                            h00Var.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                            return;
                        }
                    case 2:
                        int i112 = k9.a0.f19634b;
                        l9.i.e("Showing native ads overlay.");
                        ((h00) obj).U().setVisibility(0);
                        ib0Var.f7078c.f12462z = true;
                        return;
                    case 3:
                        int i122 = k9.a0.f19634b;
                        l9.i.e("Hiding native ads overlay.");
                        ((h00) obj).U().setVisibility(8);
                        ib0Var.f7078c.f12462z = false;
                        return;
                    default:
                        ib0Var.f7077b.d(map);
                        return;
                }
            }
        }));
        final int i13 = 3;
        rc0Var.b("/hideOverlay", new ba0(rc0Var, new WeakReference(a10), "/hideOverlay", new mp(this) { // from class: com.google.android.gms.internal.ads.gb0

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ ib0 f6360v;

            {
                this.f6360v = this;
            }

            @Override // com.google.android.gms.internal.ads.mp
            public final void d(Object obj, Map map) {
                int i102 = i13;
                ib0 ib0Var = this.f6360v;
                switch (i102) {
                    case 0:
                        ib0Var.f7079d.D();
                        return;
                    case 1:
                        h00 h00Var = (h00) obj;
                        h00Var.j0().A = new com.google.android.gms.internal.mlkit_vision_digital_ink.pw(ib0Var, 6, map);
                        String str = (String) map.get("overlayHtml");
                        String str2 = (String) map.get("baseUrl");
                        if (TextUtils.isEmpty(str2)) {
                            h00Var.loadData(str, "text/html", "UTF-8");
                            return;
                        } else {
                            h00Var.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                            return;
                        }
                    case 2:
                        int i112 = k9.a0.f19634b;
                        l9.i.e("Showing native ads overlay.");
                        ((h00) obj).U().setVisibility(0);
                        ib0Var.f7078c.f12462z = true;
                        return;
                    case 3:
                        int i122 = k9.a0.f19634b;
                        l9.i.e("Hiding native ads overlay.");
                        ((h00) obj).U().setVisibility(8);
                        ib0Var.f7078c.f12462z = false;
                        return;
                    default:
                        ib0Var.f7077b.d(map);
                        return;
                }
            }
        }));
        return a10.U();
    }
}
