package com.google.android.gms.internal.mlkit_vision_digital_ink;
import pa.h;

import android.accounts.Account;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f14581a = Pattern.compile("[a-z]+(_[a-z]+)*");

    /* renamed from: b, reason: collision with root package name */
    public static final Account f14582b = j.f14493a;

    /* renamed from: c, reason: collision with root package name */
    public static final Set f14583c = Collections.unmodifiableSet(new HashSet(Arrays.asList("default", "unused", "special", "reserved", "shared", "virtual", "managed")));

    /* renamed from: d, reason: collision with root package name */
    public static final Set f14584d = Collections.unmodifiableSet(new HashSet(Arrays.asList("files", "cache", "managed", "directboot-files", "directboot-cache", "external")));

    public static void a(String str) {
        Set set = f14584d;
        h(set.contains(str), "The only supported locations are %s: %s", set, str);
    }

    public static void b(String str) {
        h(f14581a.matcher(str).matches(), "Module must match [a-z]+(_[a-z]+)*: %s", str);
        h(!f14583c.contains(str), "Module name is reserved and cannot be used: %s", str);
    }
}
