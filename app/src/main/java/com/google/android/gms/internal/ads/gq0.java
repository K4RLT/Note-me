package com.google.android.gms.internal.ads;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* loaded from: classes.dex */
public final class gq0 {

    /* renamed from: a, reason: collision with root package name */
    public final Pattern f6443a;

    public gq0() {
        Pattern pattern;
        try {
            pattern = Pattern.compile((String) g9.r.e.f17698c.a(sl.L7));
        } catch (PatternSyntaxException unused) {
            pattern = null;
        }
        this.f6443a = pattern;
    }
}
