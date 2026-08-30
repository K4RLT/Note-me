package com.google.android.gms.internal.ads;
import g9.r;

import android.content.Context;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class wq0 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f12318a = new HashMap();

    public final vq0 a(pq0 pq0Var, Context context, mq0 mq0Var, hx0 hx0Var) {
        qq0 qq0Var;
        HashMap hashMap = this.f12318a;
        vq0 vq0Var = (vq0) hashMap.get(pq0Var);
        if (vq0Var == null) {
            if (pq0Var == pq0.f9585u) {
                nl nlVar = sl.f10823l7;
                ql qlVar = r.e.f17698c;
                int intValue = ((Integer) qlVar.a(nlVar)).intValue();
                int intValue2 = ((Integer) qlVar.a(sl.f10923r7)).intValue();
                int intValue3 = ((Integer) qlVar.a(sl.f10952t7)).intValue();
                String str = (String) qlVar.a(sl.f10982v7);
                String str2 = (String) qlVar.a(sl.f10855n7);
                qq0Var = new qq0(context, pq0Var, intValue, intValue2, intValue3, str, str2);
            } else if (pq0Var == pq0.f9586v) {
                nl nlVar2 = sl.f10838m7;
                ql qlVar2 = r.e.f17698c;
                int intValue4 = ((Integer) qlVar2.a(nlVar2)).intValue();
                int intValue5 = ((Integer) qlVar2.a(sl.f10938s7)).intValue();
                int intValue6 = ((Integer) qlVar2.a(sl.f10968u7)).intValue();
                String str3 = (String) qlVar2.a(sl.f10998w7);
                String str4 = (String) qlVar2.a(sl.f10872o7);
                qq0Var = new qq0(context, pq0Var, intValue4, intValue5, intValue6, str3, str4);
            } else if (pq0Var == pq0.f9587w) {
                nl nlVar3 = sl.f11046z7;
                ql qlVar3 = r.e.f17698c;
                int intValue7 = ((Integer) qlVar3.a(nlVar3)).intValue();
                int intValue8 = ((Integer) qlVar3.a(sl.B7)).intValue();
                int intValue9 = ((Integer) qlVar3.a(sl.C7)).intValue();
                String str5 = (String) qlVar3.a(sl.f11015x7);
                String str6 = (String) qlVar3.a(sl.f11031y7);
                qq0Var = new qq0(context, pq0Var, intValue7, intValue8, intValue9, str5, str6);
            } else {
                qq0Var = null;
            }
            zd1 zd1Var = new zd1(qq0Var);
            vq0 vq0Var2 = new vq0(zd1Var, new u(zd1Var, mq0Var, hx0Var));
            hashMap.put(pq0Var, vq0Var2);
            return vq0Var2;
        }
        return vq0Var;
    }
}
