package com.google.android.gms.internal.mlkit_vision_digital_ink;
import ba.j;
import c.b;
import g5.q;
import q.f;

import android.content.Context;
import android.util.Log;
import android.util.Pair;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class ul {

    /* renamed from: a, reason: collision with root package name */
    public final Context f15058a;

    /* renamed from: b, reason: collision with root package name */
    public final c f15059b;

    /* renamed from: c, reason: collision with root package name */
    public final i f15060c;

    public ul(Context context, c cVar, i iVar) {
        this.f15058a = context;
        this.f15059b = cVar;
        this.f15060c = iVar;
    }

    public static String a(ul ulVar, ft ftVar, File file, String str, com.google.android.gms.internal.measurement.e4 e4Var, fm fmVar) {
        ox oxVar = new ox(ulVar.f15059b, ftVar.f14316b, file, str, new s5(11, fmVar), e4Var);
        et etVar = et.f14273d;
        et etVar2 = ftVar.f14317c;
        boolean z3 = oxVar.f14775h;
        if (etVar == etVar2) {
            nx nxVar = nx.f14725v;
            if (!z3 && !oxVar.f14774g) {
                oxVar.f14777k = nxVar;
            }
        } else {
            nx nxVar2 = nx.f14724u;
            if (!z3 && !oxVar.f14774g) {
                oxVar.f14777k = nxVar2;
            }
        }
        int i = ftVar.f14318d;
        if (i > 0) {
            oxVar.f14778l = i;
        }
        z4 z4Var = ftVar.e;
        int i10 = z4Var.f15327x;
        for (int i11 = 0; i11 < i10; i11++) {
            Pair pair = (Pair) z4Var.get(i11);
            String str2 = (String) pair.first;
            String str3 = (String) pair.second;
            w3 w3Var = oxVar.f14773f.f14542w;
            Collection collection = (Collection) w3Var.get(str2);
            if (collection == null) {
                ArrayList arrayList = new ArrayList(3);
                if (arrayList.add(str3)) {
                    w3Var.put(str2, arrayList);
                } else {
                    g5.q.f("New Collection violated the Collection spec");
                    return null;
                }
            } else {
                collection.add(str3);
            }
        }
        ba.j jVar = new ba.j(9, ulVar, file, str);
        ia iaVar = ia.f14473u;
        im imVar = fmVar.f14308c;
        if (imVar != null) {
            imVar.g(jVar, iaVar);
        }
        c cVar = oxVar.f14772d;
        synchronized (cVar) {
            String b10 = c.b(oxVar.f14770b, oxVar.f14771c);
            HashMap hashMap = cVar.f14134f;
            if (hashMap.containsKey(b10)) {
                Log.i("c", "Request is already being executed for key: ".concat(b10));
            } else {
                hashMap.put(b10, oxVar);
                cVar.h(oxVar);
            }
        }
        Log.d("OffroadFileDownloader", "Data download scheduled for file: " + ftVar.f14316b);
        return "Data download scheduled for file ".concat(ftVar.f14316b);
    }
}
