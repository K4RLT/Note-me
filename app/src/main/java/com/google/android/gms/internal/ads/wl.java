package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

/* loaded from: classes.dex */
public final class wl {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedList f12270a = new LinkedList();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f12271b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f12272c;

    public wl(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f12271b = linkedHashMap;
        this.f12272c = new Object();
        linkedHashMap.put("action", "make_wv");
        linkedHashMap.put("ad_format", str);
    }

    public static final ul d() {
        f9.k.C.f16819k.getClass();
        return new ul(SystemClock.elapsedRealtime(), null, null);
    }

    public final void a(ul ulVar, long j10, String... strArr) {
        synchronized (this.f12272c) {
            this.f12270a.add(new ul(j10, strArr[0], ulVar));
        }
    }

    public final vl b() {
        vl vlVar;
        boolean booleanValue = ((Boolean) g9.r.e.f17698c.a(sl.f11010x2)).booleanValue();
        StringBuilder sb2 = new StringBuilder();
        HashMap hashMap = new HashMap();
        synchronized (this.f12272c) {
            try {
                LinkedList<ul> linkedList = this.f12270a;
                for (ul ulVar : linkedList) {
                    long j10 = ulVar.f11666a;
                    String str = ulVar.f11667b;
                    ul ulVar2 = ulVar.f11668c;
                    if (ulVar2 != null && j10 > 0) {
                        long j11 = j10 - ulVar2.f11666a;
                        sb2.append(str);
                        sb2.append('.');
                        sb2.append(j11);
                        sb2.append(',');
                        if (booleanValue) {
                            boolean containsKey = hashMap.containsKey(Long.valueOf(ulVar2.f11666a));
                            long j12 = ulVar2.f11666a;
                            if (!containsKey) {
                                hashMap.put(Long.valueOf(j12), new StringBuilder(str));
                            } else {
                                StringBuilder sb3 = (StringBuilder) hashMap.get(Long.valueOf(j12));
                                sb3.append('+');
                                sb3.append(str);
                            }
                        }
                    }
                }
                linkedList.clear();
                String str2 = null;
                if (!TextUtils.isEmpty(null)) {
                    sb2.append((String) null);
                } else if (sb2.length() > 0) {
                    sb2.setLength(sb2.length() - 1);
                }
                StringBuilder sb4 = new StringBuilder();
                if (booleanValue) {
                    for (Map.Entry entry : hashMap.entrySet()) {
                        sb4.append((CharSequence) entry.getValue());
                        sb4.append('.');
                        long longValue = ((Long) entry.getKey()).longValue();
                        f9.k kVar = f9.k.C;
                        kVar.f16819k.getClass();
                        long currentTimeMillis = System.currentTimeMillis();
                        kVar.f16819k.getClass();
                        sb4.append((longValue - SystemClock.elapsedRealtime()) + currentTimeMillis);
                        sb4.append(',');
                    }
                    if (sb4.length() > 0) {
                        sb4.setLength(sb4.length() - 1);
                    }
                    str2 = sb4.toString();
                }
                vlVar = new vl(sb2.toString(), str2);
            } catch (Throwable th) {
                throw th;
            }
        }
        return vlVar;
    }

    public final void c(String str, String str2) {
        com.google.android.gms.internal.consent_sdk.c a10;
        if (!TextUtils.isEmpty(str2) && (a10 = f9.k.C.f16817h.a()) != null) {
            synchronized (this.f12272c) {
                tl tlVar = (tl) ((HashMap) a10.f13373x).get(str);
                if (tlVar == null) {
                    tlVar = tl.f11370b;
                }
                LinkedHashMap linkedHashMap = this.f12271b;
                linkedHashMap.put(str, tlVar.a((String) linkedHashMap.get(str), str2));
            }
        }
    }
}
