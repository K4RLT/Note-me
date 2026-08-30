package com.google.android.gms.internal.ads;

import java.util.HashSet;

/* loaded from: classes.dex */
public abstract class t5 {

    /* renamed from: a, reason: collision with root package name */
    public static final HashSet f11251a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public static String f11252b = "media3.common";

    public static synchronized void a(String str) {
        synchronized (t5.class) {
            if (f11251a.add(str)) {
                String str2 = f11252b;
                StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 2 + str.length());
                sb2.append(str2);
                sb2.append(", ");
                sb2.append(str);
                f11252b = sb2.toString();
            }
        }
    }
}
