package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class hd1 {

    /* renamed from: b, reason: collision with root package name */
    public static final hd1 f6699b = new hd1();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f6700a = new HashMap();

    public final synchronized void a(String str, v91 v91Var) {
        try {
            HashMap hashMap = this.f6700a;
            if (hashMap.containsKey(str)) {
                if (((v91) hashMap.get(str)).equals(v91Var)) {
                    return;
                }
                String valueOf = String.valueOf(hashMap.get(str));
                String valueOf2 = String.valueOf(v91Var);
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 45 + valueOf.length() + 17 + valueOf2.length());
                sb2.append("Parameters object with name ");
                sb2.append(str);
                sb2.append(" already exists (");
                sb2.append(valueOf);
                sb2.append("), cannot insert ");
                sb2.append(valueOf2);
                throw new GeneralSecurityException(sb2.toString());
            }
            hashMap.put(str, v91Var);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            a((String) entry.getKey(), (v91) entry.getValue());
        }
    }
}
