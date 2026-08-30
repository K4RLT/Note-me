package com.google.android.gms.internal.ads;
import j6.e;
import j6.l;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.WeakHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class vu0 {

    /* renamed from: f, reason: collision with root package name */
    public static final vu0 f12002f = new vu0();

    /* renamed from: g, reason: collision with root package name */
    public static final Handler f12003g = new Handler(Looper.getMainLooper());

    /* renamed from: h, reason: collision with root package name */
    public static Handler f12004h = null;
    public static final af i = new af(7);

    /* renamed from: j, reason: collision with root package name */
    public static final af f12005j = new af(8);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f12006a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f12007b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final bj0 f12009d = new bj0(1);

    /* renamed from: c, reason: collision with root package name */
    public final j6.e f12008c = new j6.e(8);
    public final j6.l e = new j6.l(8, new zd1());

    public static void b() {
        if (f12004h == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f12004h = handler;
            handler.post(i);
            f12004h.postDelayed(f12005j, 200L);
        }
    }

    public final void a(View view, lt0 lt0Var, JSONObject jSONObject, boolean z3) {
        char c10;
        Object obj;
        boolean z9;
        boolean z10;
        int i10;
        if (ay0.e(view) == null) {
            bj0 bj0Var = this.f12009d;
            boolean z11 = true;
            if (((HashSet) bj0Var.f4808y).contains(view)) {
                c10 = 1;
            } else if (bj0Var.f4804u) {
                c10 = 2;
            } else {
                c10 = 3;
            }
            if (c10 != 3) {
                JSONObject g8 = lt0Var.g(view);
                su0.c(jSONObject, g8);
                HashMap hashMap = (HashMap) bj0Var.f4805v;
                if (hashMap.size() == 0) {
                    obj = null;
                } else {
                    Object obj2 = (String) hashMap.get(view);
                    if (obj2 != null) {
                        hashMap.remove(view);
                    }
                    obj = obj2;
                }
                boolean z12 = false;
                if (obj != null) {
                    try {
                        g8.put("adSessionId", obj);
                    } catch (JSONException e) {
                        xy.v(e, "Error with setting ad session id");
                    }
                    WeakHashMap weakHashMap = (WeakHashMap) bj0Var.D;
                    if (weakHashMap.containsKey(view)) {
                        weakHashMap.put(view, Boolean.TRUE);
                    } else {
                        z12 = true;
                    }
                    try {
                        g8.put("hasWindowFocus", Boolean.valueOf(z12));
                    } catch (JSONException e8) {
                        xy.v(e8, "Error with setting has window focus");
                    }
                    boolean contains = ((HashSet) bj0Var.C).contains(obj);
                    Object valueOf = Boolean.valueOf(contains);
                    if (contains) {
                        try {
                            g8.put("isPipActive", valueOf);
                        } catch (JSONException e10) {
                            xy.v(e10, "Error with setting is picture-in-picture active");
                        }
                    }
                    bj0Var.f4804u = true;
                    return;
                }
                HashMap hashMap2 = (HashMap) bj0Var.f4806w;
                uu0 uu0Var = (uu0) hashMap2.get(view);
                if (uu0Var != null) {
                    hashMap2.remove(view);
                }
                if (uu0Var != null) {
                    hu0 hu0Var = uu0Var.f11722a;
                    JSONArray jSONArray = new JSONArray();
                    ArrayList arrayList = uu0Var.f11723b;
                    int size = arrayList.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        jSONArray.put((String) arrayList.get(i11));
                    }
                    try {
                        g8.put("isFriendlyObstructionFor", jSONArray);
                        g8.put("friendlyObstructionClass", hu0Var.f6895b);
                        g8.put("friendlyObstructionPurpose", hu0Var.f6896c);
                        g8.put("friendlyObstructionReason", hu0Var.f6897d);
                    } catch (JSONException e11) {
                        xy.v(e11, "Error with setting friendly obstruction");
                    }
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z3 || z9) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c10 != 1) {
                    z11 = false;
                }
                lt0Var.getClass();
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    if (z11) {
                        HashMap hashMap3 = new HashMap();
                        for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                            View childAt = viewGroup.getChildAt(i12);
                            ArrayList arrayList2 = (ArrayList) hashMap3.get(Float.valueOf(childAt.getZ()));
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                                hashMap3.put(Float.valueOf(childAt.getZ()), arrayList2);
                            }
                            arrayList2.add(childAt);
                        }
                        ArrayList arrayList3 = new ArrayList(hashMap3.keySet());
                        Collections.sort(arrayList3);
                        int size2 = arrayList3.size();
                        int i13 = 0;
                        while (i13 < size2) {
                            ArrayList arrayList4 = (ArrayList) hashMap3.get((Float) arrayList3.get(i13));
                            int size3 = arrayList4.size();
                            int i14 = 0;
                            while (true) {
                                i10 = i13 + 1;
                                if (i14 < size3) {
                                    a((View) arrayList4.get(i14), lt0Var, g8, z10);
                                    i14++;
                                }
                            }
                            i13 = i10;
                        }
                        return;
                    }
                    for (int i15 = 0; i15 < viewGroup.getChildCount(); i15++) {
                        a(viewGroup.getChildAt(i15), lt0Var, g8, z10);
                    }
                }
            }
        }
    }
}
