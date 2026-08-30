package com.google.android.gms.internal.ads;
import a0.l;
import d9.a;
import f9.k;
import g9.c3;
import g9.g;
import g9.r;
import g9.w2;
import k9.a0;
import k9.c0;
import k9.f0;
import l9.i;
import r.e;
import wa.g9;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ml0 implements pn0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8372a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f8373b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f8374c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f8375d;

    public /* synthetic */ ml0(int i, Object obj, Object obj2, Object obj3) {
        this.f8372a = i;
        this.f8373b = obj;
        this.f8374c = obj2;
        this.f8375d = obj3;
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final void l(Object obj) {
        List<ActivityManager.RunningTaskInfo> runningTasks;
        ActivityManager.RunningTaskInfo runningTaskInfo;
        ComponentName componentName;
        ComponentName componentName2;
        int i;
        JSONObject jSONObject;
        String str;
        JSONArray optJSONArray;
        String str2;
        String str3;
        boolean z3;
        switch (this.f8372a) {
            case 0:
                Bundle bundle = (Bundle) obj;
                if (((Boolean) zm.f13211a.p()).booleanValue()) {
                    Bundle bundle2 = new Bundle();
                    k9.f0 f0Var = f9.k.C.f16813c;
                    String str4 = null;
                    try {
                        ActivityManager activityManager = (ActivityManager) ((Context) this.f8373b).getSystemService("activity");
                        if (activityManager != null && (runningTasks = activityManager.getRunningTasks(1)) != null && !runningTasks.isEmpty() && (runningTaskInfo = runningTasks.get(0)) != null) {
                            componentName = runningTaskInfo.topActivity;
                            if (componentName != null) {
                                componentName2 = runningTaskInfo.topActivity;
                                str4 = componentName2.getClassName();
                            }
                        }
                    } catch (Exception unused) {
                    }
                    bundle2.putString("activity", str4);
                    Bundle bundle3 = new Bundle();
                    g9.c3 c3Var = (g9.c3) this.f8374c;
                    bundle3.putInt("width", c3Var.f17593y);
                    bundle3.putInt("height", c3Var.f17590v);
                    bundle2.putBundle("size", bundle3);
                    ArrayList arrayList = (ArrayList) this.f8375d;
                    if (!arrayList.isEmpty()) {
                        bundle2.putParcelableArray("parents", (Parcelable[]) arrayList.toArray(new Parcelable[arrayList.size()]));
                    }
                    bundle.putBundle("view_hierarchy", bundle2);
                    return;
                }
                return;
            case 1:
                aq0 aq0Var = (aq0) this.f8373b;
                ArrayList<String> arrayList2 = aq0Var.f4584h;
                Bundle bundle4 = (Bundle) obj;
                if (arrayList2 != null) {
                    int i10 = 0;
                    if (arrayList2.isEmpty()) {
                        bundle4.putInt("native_version", 0);
                        return;
                    }
                    bundle4.putInt("native_version", 3);
                    bundle4.putStringArrayList("native_templates", arrayList2);
                    bundle4.putStringArrayList("native_custom_templates", aq0Var.i);
                    rn rnVar = aq0Var.f4585j;
                    if (rnVar != null) {
                        if (rnVar.f10248u > 3) {
                            bundle4.putBoolean("enable_native_media_orientation", true);
                            int i11 = rnVar.B;
                            if (i11 != 1) {
                                if (i11 != 2) {
                                    if (i11 != 3) {
                                        if (i11 != 4) {
                                            str3 = "unknown";
                                        } else {
                                            str3 = "square";
                                        }
                                    } else {
                                        str3 = "portrait";
                                    }
                                } else {
                                    str3 = "landscape";
                                }
                            } else {
                                str3 = "any";
                            }
                            if (!"unknown".equals(str3)) {
                                bundle4.putString("native_media_orientation", str3);
                            }
                        }
                        int i12 = rnVar.f10250w;
                        if (i12 != 0) {
                            if (i12 != 1) {
                                if (i12 != 2) {
                                    str2 = "unknown";
                                } else {
                                    str2 = "landscape";
                                }
                            } else {
                                str2 = "portrait";
                            }
                        } else {
                            str2 = "any";
                        }
                        if (!"unknown".equals(str2)) {
                            bundle4.putString("native_image_orientation", str2);
                        }
                        bundle4.putBoolean("native_multiple_images", rnVar.f10251x);
                        bundle4.putBoolean("use_custom_mute", rnVar.A);
                        int i13 = rnVar.C;
                        if (i13 != 0) {
                            bundle4.putBoolean("sccg_tap", rnVar.D);
                            bundle4.putInt("sccg_dir", i13);
                        }
                    }
                    PackageInfo packageInfo = (PackageInfo) this.f8374c;
                    if (packageInfo != null) {
                        i10 = packageInfo.versionCode;
                    }
                    k9.c0 c0Var = (k9.c0) this.f8375d;
                    c0Var.i();
                    synchronized (c0Var.f19642a) {
                        i = c0Var.f19657r;
                    }
                    if (i10 > i) {
                        c0Var.i();
                        synchronized (c0Var.f19642a) {
                            try {
                                c0Var.f19659t = new JSONObject();
                                SharedPreferences.Editor editor = c0Var.f19647g;
                                if (editor != null) {
                                    editor.remove("native_advanced_settings");
                                    c0Var.f19647g.apply();
                                }
                                c0Var.j();
                            } finally {
                            }
                        }
                        c0Var.i();
                        synchronized (c0Var.f19642a) {
                            try {
                                if (c0Var.f19657r != i10) {
                                    c0Var.f19657r = i10;
                                    SharedPreferences.Editor editor2 = c0Var.f19647g;
                                    if (editor2 != null) {
                                        editor2.putInt("version_code", i10);
                                        c0Var.f19647g.apply();
                                    }
                                    c0Var.j();
                                }
                            } finally {
                            }
                        }
                    }
                    c0Var.i();
                    synchronized (c0Var.f19642a) {
                        jSONObject = c0Var.f19659t;
                    }
                    String str5 = null;
                    if (jSONObject != null && (optJSONArray = jSONObject.optJSONArray(aq0Var.f4583g)) != null) {
                        str5 = optJSONArray.toString();
                    }
                    if (!TextUtils.isEmpty(str5)) {
                        bundle4.putString("native_advanced_settings", str5);
                    }
                    int i14 = aq0Var.f4587l;
                    if (i14 > 1) {
                        bundle4.putInt("max_num_ads", i14);
                    }
                    lq lqVar = aq0Var.f4579b;
                    if (lqVar != null) {
                        String str6 = lqVar.f8103w;
                        if (TextUtils.isEmpty(str6)) {
                            if (lqVar.f8101u >= 2) {
                                int i15 = lqVar.f8104x;
                                if (i15 != 2) {
                                    if (i15 != 3) {
                                        str = "l";
                                    } else {
                                        str = "p";
                                    }
                                } else {
                                    str = "l";
                                }
                            } else {
                                int i16 = lqVar.f8102v;
                                if (i16 != 1) {
                                    if (i16 != 2) {
                                        StringBuilder sb2 = new StringBuilder(String.valueOf(i16).length() + 41);
                                        sb2.append("Instream ad video aspect ratio ");
                                        sb2.append(i16);
                                        sb2.append(" is wrong.");
                                        l9.i.c(sb2.toString());
                                    } else {
                                        str = "p";
                                    }
                                }
                                str = "l";
                            }
                            bundle4.putString("ia_var", str);
                        } else {
                            bundle4.putString("ad_tag", str6);
                        }
                        bundle4.putBoolean("instr", true);
                    }
                    if (((Boolean) g9.r.e.f17698c.a(sl.f10878od)).booleanValue() && rnVar != null) {
                        g9.w2 w2Var = rnVar.f10253z;
                        if (w2Var != null) {
                            Bundle bundle5 = new Bundle();
                            bundle5.putBoolean("startMuted", w2Var.f17710u);
                            bundle5.putBoolean("clickToExpandRequested", w2Var.f17712w);
                            bundle5.putBoolean("customControlsRequested", w2Var.f17711v);
                            bundle4.putBundle("video", bundle5);
                        }
                        bundle4.putBoolean("disable_image_loading", rnVar.f10249v);
                        bundle4.putInt("preferred_ad_choices_position", rnVar.f10252y);
                        return;
                    }
                    return;
                }
                return;
            default:
                try {
                    JSONObject g8 = wa.g9.g("pii", (JSONObject) obj);
                    d9.a aVar = (d9.a) this.f8373b;
                    if (aVar != null) {
                        String str7 = aVar.f15805a;
                        if (!TextUtils.isEmpty(str7)) {
                            g8.put("rdid", str7);
                            g8.put("is_lat", aVar.f15806b);
                            g8.put("idtype", "adid");
                            f3 f3Var = (f3) this.f8375d;
                            long j10 = f3Var.f5899v;
                            String str8 = (String) f3Var.f5900w;
                            if (str8 != null && j10 > 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z3) {
                                g8.put("paidv1_id_android_3p", str8);
                                g8.put("paidv1_creation_time_android_3p", j10);
                            }
                            return;
                        }
                    }
                    String str9 = (String) this.f8374c;
                    if (str9 != null) {
                        g8.put("pdid", str9);
                        g8.put("pdidtype", "ssaid");
                    }
                    return;
                } catch (JSONException e) {
                    k9.a0.l("Failed putting Ad ID.", e);
                    return;
                }
        }
    }
}
