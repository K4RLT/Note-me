package com.google.android.gms.internal.ads;
import f9.b;
import f9.k;
import k9.v;
import k9.w;
import la.a;
import wa.f9;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class xw implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12640a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f12641b;

    /* renamed from: c, reason: collision with root package name */
    public Object f12642c;

    public xw() {
        this.f12640a = 2;
        this.f12641b = new JSONObject();
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        switch (this.f12640a) {
            case 0:
                zw zwVar = (zw) this.f12642c;
                synchronized (zwVar) {
                    try {
                        ArrayList arrayList = zwVar.f13285b;
                        int size = arrayList.size();
                        int i = 0;
                        while (i < size) {
                            Object obj = arrayList.get(i);
                            i++;
                            yw ywVar = (yw) obj;
                            String str2 = (String) this.f12641b;
                            zw zwVar2 = ywVar.f12985a;
                            HashMap hashMap = ywVar.f12986b;
                            zwVar2.getClass();
                            if (hashMap.containsKey(str2) && ((Set) hashMap.get(str2)).contains(str)) {
                                x90 x90Var = zwVar2.f13287d;
                                ((la.a) x90Var.f12502v).getClass();
                                ((qw) x90Var.f12503w).a(-1, System.currentTimeMillis());
                            }
                        }
                    } finally {
                    }
                }
                return;
            case 1:
                fe0 fe0Var = (fe0) this.f12642c;
                fe0Var.i.set(wa.f9.b(fe0Var.f6046b, (String) this.f12641b));
                return;
            case 2:
                if (str != null && ((List) this.f12642c).contains(str)) {
                    try {
                        Object obj2 = sharedPreferences.getAll().get(str);
                        JSONObject jSONObject = (JSONObject) this.f12641b;
                        if (obj2 == null) {
                            jSONObject.remove(str);
                        } else {
                            jSONObject.put(str, obj2);
                        }
                        return;
                    } catch (JSONException e) {
                        f9.k.C.f16817h.e("InspectorSharedPreferenceCollector.onSharedPreferenceChanged", e);
                        return;
                    }
                }
                return;
            default:
                k9.w wVar = (k9.w) this.f12642c;
                synchronized (wVar) {
                    try {
                        ArrayList arrayList2 = wVar.f19724b;
                        int size2 = arrayList2.size();
                        int i10 = 0;
                        while (i10 < size2) {
                            Object obj3 = arrayList2.get(i10);
                            i10++;
                            String str3 = (String) this.f12641b;
                            HashMap hashMap2 = ((k9.v) obj3).f19722a;
                            if (hashMap2.containsKey(str3) && ((Set) hashMap2.get(str3)).contains(str)) {
                                f9.k.C.f16817h.g().u(false);
                            }
                        }
                    } finally {
                    }
                }
                return;
        }
    }

    public /* synthetic */ xw(fe0 fe0Var, String str) {
        this.f12640a = 1;
        this.f12642c = fe0Var;
        this.f12641b = str;
    }

    public xw(zw zwVar, String str) {
        this.f12640a = 0;
        Objects.requireNonNull(zwVar);
        this.f12642c = zwVar;
        this.f12641b = str;
    }

    public xw(k9.w wVar, String str) {
        this.f12640a = 3;
        Objects.requireNonNull(wVar);
        this.f12642c = wVar;
        this.f12641b = str;
    }
}
