package com.google.android.gms.internal.ads;
import ac.b;
import g9.r;
import k9.c0;
import l9.a;
import r.e;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class h60 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6609a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6610b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6611c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6612d;

    public /* synthetic */ h60(hr0 hr0Var, dv dvVar, hr0 hr0Var2) {
        this.f6609a = 1;
        this.f6610b = hr0Var;
        this.f6611c = dvVar;
        this.f6612d = hr0Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle bundle;
        int i = this.f6609a;
        int i10 = 0;
        Object obj = this.f6612d;
        Object obj2 = this.f6610b;
        Object obj3 = this.f6611c;
        switch (i) {
            case 0:
                i60 i60Var = (i60) obj3;
                Bundle bundle2 = (Bundle) obj;
                Bundle bundle3 = (Bundle) ((hr0) obj2).f6877w.get();
                String str = (String) ((ac.b) ((pr1) i60Var.f7029h).zzb()).get();
                if (((Boolean) g9.r.e.f17698c.a(sl.U7)).booleanValue() && ((k9.c0) i60Var.f7030j).t()) {
                    i10 = 1;
                }
                String str2 = (String) i60Var.e;
                PackageInfo packageInfo = (PackageInfo) i60Var.f7028g;
                ArrayList arrayList = (ArrayList) i60Var.f7027f;
                String str3 = (String) i60Var.f7026d;
                return new dv(bundle3, (l9.a) i60Var.f7024b, (ApplicationInfo) i60Var.f7025c, str3, arrayList, packageInfo, str, str2, null, null, i10, ((aq0) i60Var.f7031k).a(), bundle2);
            case 1:
                ev evVar = (ev) ((hr0) obj2).f6877w.get();
                if (((Boolean) g9.r.e.f17698c.a(sl.J2)).booleanValue() && (bundle = ((dv) obj3).G) != null) {
                    bundle.putLong("get-ad-dictionary-sdkcore-start", evVar.f5822j);
                    bundle.putLong("get-ad-dictionary-sdkcore-end", evVar.f5823k);
                }
                return new hh0((JSONObject) ((hr0) obj).f6877w.get(), evVar);
            case 2:
                vm0 vm0Var = kn0.f7813j;
                JSONArray jSONArray = new JSONArray();
                ArrayList arrayList2 = (ArrayList) obj3;
                int size = arrayList2.size();
                while (i10 < size) {
                    Object obj4 = arrayList2.get(i10);
                    i10++;
                    ac.b bVar = (ac.b) obj4;
                    if (((JSONObject) bVar.get()) != null) {
                        jSONArray.put(bVar.get());
                    }
                }
                String str4 = (String) obj2;
                Bundle bundle4 = (Bundle) obj;
                if (jSONArray.length() == 0) {
                    if (!((Boolean) g9.r.e.f17698c.a(sl.f10680c5)).booleanValue()) {
                        return null;
                    }
                    return new vm0(new JSONArray().toString(), bundle4, str4);
                }
                return new vm0(jSONArray.toString(), bundle4, str4);
            default:
                ((q11) obj3).f9704a.a((vy0) obj2, null, (byte[]) obj);
                return null;
        }
    }

    public /* synthetic */ h60(Object obj, Object obj2, Cloneable cloneable, int i) {
        this.f6609a = i;
        this.f6611c = obj;
        this.f6610b = obj2;
        this.f6612d = cloneable;
    }

    public /* synthetic */ h60(ArrayList arrayList, Bundle bundle, String str) {
        this.f6609a = 2;
        this.f6611c = arrayList;
        this.f6612d = bundle;
        this.f6610b = str;
    }
}
