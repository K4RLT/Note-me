package com.google.android.gms.internal.ads;
import k9.c0;

import android.content.SharedPreferences;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class v20 implements u20 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11785a;

    /* renamed from: b, reason: collision with root package name */
    public final c0 f11786b;

    public /* synthetic */ v20(c0 c0Var, int i) {
        this.f11785a = i;
        this.f11786b = c0Var;
    }

    @Override // com.google.android.gms.internal.ads.u20
    public final void a(HashMap hashMap) {
        int intValue;
        int intValue2;
        switch (this.f11785a) {
            case 0:
                boolean parseBoolean = Boolean.parseBoolean((String) hashMap.get("content_url_opted_out"));
                c0 c0Var = this.f11786b;
                c0Var.i();
                synchronized (c0Var.f19642a) {
                    try {
                        if (c0Var.f19660u != parseBoolean) {
                            c0Var.f19660u = parseBoolean;
                            SharedPreferences.Editor editor = c0Var.f19647g;
                            if (editor != null) {
                                editor.putBoolean("content_url_opted_out", parseBoolean);
                                c0Var.f19647g.apply();
                            }
                            c0Var.j();
                            return;
                        }
                        return;
                    } finally {
                    }
                }
            case 1:
                boolean parseBoolean2 = Boolean.parseBoolean((String) hashMap.get("content_vertical_opted_out"));
                c0 c0Var2 = this.f11786b;
                c0Var2.i();
                synchronized (c0Var2.f19642a) {
                    try {
                        if (c0Var2.f19661v != parseBoolean2) {
                            c0Var2.f19661v = parseBoolean2;
                            SharedPreferences.Editor editor2 = c0Var2.f19647g;
                            if (editor2 != null) {
                                editor2.putBoolean("content_vertical_opted_out", parseBoolean2);
                                c0Var2.f19647g.apply();
                            }
                            c0Var2.j();
                            return;
                        }
                        return;
                    } finally {
                    }
                }
            case 2:
                String str = (String) hashMap.get("default_queue_capacity");
                if (str != null && (intValue = Float.valueOf(str).intValue()) > 0) {
                    c0 c0Var3 = this.f11786b;
                    c0Var3.i();
                    synchronized (c0Var3.f19642a) {
                        try {
                            if (c0Var3.G != intValue) {
                                c0Var3.G = intValue;
                                SharedPreferences.Editor editor3 = c0Var3.f19647g;
                                if (editor3 != null) {
                                    editor3.putInt("default_queue_capacity", intValue);
                                    c0Var3.f19647g.apply();
                                }
                                c0Var3.j();
                                return;
                            }
                            return;
                        } finally {
                        }
                    }
                }
                return;
            default:
                String str2 = (String) hashMap.get("total_inflight_ad_limit");
                if (str2 != null && (intValue2 = Float.valueOf(str2).intValue()) > 0) {
                    c0 c0Var4 = this.f11786b;
                    c0Var4.i();
                    synchronized (c0Var4.f19642a) {
                        try {
                            if (c0Var4.F != intValue2) {
                                c0Var4.F = intValue2;
                                SharedPreferences.Editor editor4 = c0Var4.f19647g;
                                if (editor4 != null) {
                                    editor4.putInt("total_inflight_ad_limit", intValue2);
                                    c0Var4.f19647g.apply();
                                }
                                c0Var4.j();
                                return;
                            }
                            return;
                        } finally {
                        }
                    }
                }
                return;
        }
    }
}
